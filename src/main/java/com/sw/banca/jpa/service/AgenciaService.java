package com.sw.banca.jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sw.banca.jpa.inter.IAgenciaService;
import com.sw.banca.model.TbAgencia;
import com.sw.banca.repository.IAgenciaRepo;

@Service
public class AgenciaService implements IAgenciaService{

	@Autowired
	private IAgenciaRepo repo;
	
	@Override
	public TbAgencia registrar(TbAgencia obj) {
		return repo.save(obj);
	}

	@Override
	public TbAgencia modificar(TbAgencia obj) {
		return repo.save(obj);
	}

	@Override
	public List<TbAgencia> listar() {
		return repo.findAll();
	}

	@Override
	public TbAgencia listarPorId(Integer v) { 
		Optional<TbAgencia> op = repo.findById(v);
		return op.isPresent() ? op.get() : new TbAgencia();
	}

	@Override
	public void eliminar(Integer v) {
		repo.deleteById(v);
	}

}
