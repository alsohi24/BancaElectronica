package com.sw.banca.jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sw.banca.jpa.inter.IMovimientoService;
import com.sw.banca.model.TbMovimiento;
import com.sw.banca.repository.IMovimientoRepo;

@Service
public class MovimientoService implements IMovimientoService {
	
	@Autowired
	private IMovimientoRepo repo;

	@Override
	public TbMovimiento registrar(TbMovimiento obj) {
		return repo.save(obj);
	}

	@Override
	public TbMovimiento modificar(TbMovimiento obj) {
		return repo.save(obj);
	}

	@Override
	public List<TbMovimiento> listar() {
		return repo.findAll();
	}

	@Override
	public TbMovimiento listarPorId(Integer v) {
		Optional<TbMovimiento> op = repo.findById(v);
		return op.isPresent() ? op.get() : new TbMovimiento();
	}

	@Override
	public void eliminar(Integer v) {
		repo.deleteById(v);
	}
}
