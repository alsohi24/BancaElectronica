package com.sw.banca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sw.banca.dto.EmailDto;
import com.sw.banca.dto.Response;
import com.sw.banca.jpa.inter.IUsuarioService;
import com.sw.banca.model.TbUsuario;
import com.sw.banca.service.NotificacionService;

@RestController
@RequestMapping("api/usuario")
public class UsuarioController {
	@Autowired
	private IUsuarioService service;
	
	@Autowired
	private BCryptPasswordEncoder bcrypt;
	
	@Autowired
	private NotificacionService notificacionService;
	
	//@PreAuthorize("@autorizeService.letAccess()")
	@PostMapping(produces = "application/json", consumes = "application/json")
	private ResponseEntity<?> registrar(@RequestBody TbUsuario usuario){	
		Response<?> response =  null;
		EmailDto emailDto = null;
		

		emailDto = new EmailDto();
		emailDto.setUsuario(usuario.getUsuNombre());
		emailDto.setClave(usuario.getUsuClave());
		emailDto.setNroPlantilla(1);
		emailDto.setSubject("NOTIFICACION DE AFILIACION");
		emailDto.setSendTo(usuario.getCliente().getCliCorrreo());
	
		
		usuario.setUsuClave(bcrypt.encode(usuario.getUsuClave()));
		
		service.registrarTransaccional(usuario);
		
		response =  notificacionService.envioCorreo(emailDto);
		
		return new ResponseEntity<>( response,HttpStatus.OK);
	}
	
}
