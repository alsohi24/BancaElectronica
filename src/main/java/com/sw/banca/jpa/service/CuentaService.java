package com.sw.banca.jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sw.banca.jpa.inter.ICuentaService;
import com.sw.banca.model.TbCuenta;
import com.sw.banca.repository.ICuentaRepo;

@Service
public class CuentaService implements ICuentaService {

	@Autowired
	private ICuentaRepo repo;
	
	@Override
	public TbCuenta registrar(TbCuenta obj) {
		return repo.save(obj);
	}

	@Override
	public TbCuenta modificar(TbCuenta obj) {
		return repo.save(obj);
	}

	@Override
	public List<TbCuenta> listar() {
		return repo.findAll();
	}

	@Override
	public TbCuenta listarPorId(Integer v) { 
		Optional<TbCuenta> op = repo.findById(v);
		return op.isPresent() ? op.get() : new TbCuenta();
	}

	@Override
	public void eliminar(Integer v) {
		repo.deleteById(v);
	}

	@Override
	public List<TbCuenta> listarPorUsuarioId(Integer usuId) {
		// TODO Auto-generated method stub
		return listarPorUsuarioId(usuId);
	}

}
