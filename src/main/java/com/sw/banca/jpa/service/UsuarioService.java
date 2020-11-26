package com.sw.banca.jpa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sw.banca.jpa.inter.IUsuarioService;
import com.sw.banca.model.TbUsuario;
import com.sw.banca.repository.IUsuarioRepo;

@Service
public class UsuarioService implements UserDetailsService ,IUsuarioService {
	
	@Autowired
	private IUsuarioRepo userRepo;
	
	@Value("${banca.default-rol}")
	private Integer DEFAULT_ROL;
		
	@Transactional
	@Override
	public TbUsuario registrarTransaccional(TbUsuario TbUsuario) {	
		TbUsuario u;
		try {
			u = userRepo.save(TbUsuario);
			userRepo.registrarRolPorDefecto(u.getUsuId(), DEFAULT_ROL);	
		}catch(Exception e) {
			throw e;
		}
		
		return u;
		
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		TbUsuario user = userRepo.findOneByUsuNombre(username);
		
		if (user == null) {
			throw new UsernameNotFoundException(String.format("Usuario no existe", username));
		}
		
		List<GrantedAuthority> roles = new ArrayList<>();
		
		user.getRoles().forEach( rol -> {
			roles.add(new SimpleGrantedAuthority(rol.getRolTitulo()));
		});
		
		UserDetails userDetails = new User(user.getUsuNombre(), user.getUsuClave(), roles);
		
		return userDetails;
	}

}
