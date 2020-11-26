package com.sw.banca.jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sw.banca.jpa.inter.ITipoCuentaService;
import com.sw.banca.model.TbTipoCuenta;
import com.sw.banca.repository.ITipoCuentaRepo;

@Service
public class TipoCuentaService implements ITipoCuentaService{

	@Autowired
	private ITipoCuentaRepo repo;
	
	@Override
	public TbTipoCuenta registrar(TbTipoCuenta obj) {
		return repo.save(obj);
	}

	@Override
	public TbTipoCuenta modificar(TbTipoCuenta obj) {
		return repo.save(obj);
	}

	@Override
	public List<TbTipoCuenta> listar() {
		return repo.findAll();
	}

	@Override
	public TbTipoCuenta listarPorId(Integer v) { 
		Optional<TbTipoCuenta> op = repo.findById(v);
		return op.isPresent() ? op.get() : new TbTipoCuenta();
	}

	@Override
	public void eliminar(Integer v) {
		repo.deleteById(v);
	}

}
