package com.sw.banca.jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sw.banca.jpa.inter.IClienteService;
import com.sw.banca.model.TbCliente;
import com.sw.banca.repository.IClienteRepo;

@Service
public class ClienteService implements IClienteService {

	@Autowired
	private IClienteRepo repo;
	
	@Override
	public TbCliente registrar(TbCliente obj) {
		return repo.save(obj);
	}

	@Override
	public TbCliente modificar(TbCliente obj) {
		return repo.save(obj);
	}

	@Override
	public List<TbCliente> listar() {
		return repo.findAll();
	}

	@Override
	public TbCliente listarPorId(Integer v) { 
		Optional<TbCliente> op = repo.findById(v);
		return op.isPresent() ? op.get() : new TbCliente();
	}

	@Override
	public void eliminar(Integer v) {
		repo.deleteById(v);	
	}

}
