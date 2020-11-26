package com.sw.banca.jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sw.banca.jpa.inter.IRolService;
import com.sw.banca.model.TbRol;
import com.sw.banca.repository.IRolRepo;

@Service
public class RolService implements IRolService {

	@Autowired
	private IRolRepo repo;
	
	@Override
	public TbRol registrar(TbRol obj) {
		return repo.save(obj);
	}

	@Override
	public TbRol modificar(TbRol obj) {
		return repo.save(obj);
	}

	@Override
	public List<TbRol> listar() {
		return repo.findAll();
	}

	@Override
	public TbRol listarPorId(Integer v) { 
		Optional<TbRol> op = repo.findById(v);
		return op.isPresent() ? op.get() : new TbRol();
	}

	@Override
	public void eliminar(Integer v) {
		repo.deleteById(v);
	}

}
