package com.sw.banca.jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sw.banca.jpa.inter.IMovimientosAutomaticoService;
import com.sw.banca.model.TbMovimientoAutomatico;
import com.sw.banca.repository.IMovimientosAutomaticoRepo;

@Service
public class MovimientosAutomaticoService implements IMovimientosAutomaticoService {
	
	@Autowired
	private IMovimientosAutomaticoRepo repo;

	@Override
	public TbMovimientoAutomatico registrar(TbMovimientoAutomatico obj) {
		return repo.save(obj);
	}

	@Override
	public TbMovimientoAutomatico modificar(TbMovimientoAutomatico obj) {
		return repo.save(obj);
	}

	@Override
	public List<TbMovimientoAutomatico> listar() {
		return repo.findAll();
	}

	@Override
	public TbMovimientoAutomatico listarPorId(Integer v) {
		Optional<TbMovimientoAutomatico> op = repo.findById(v);
		return op.isPresent() ? op.get() : new TbMovimientoAutomatico();
	}

	@Override
	public void eliminar(Integer v) {
		repo.deleteById(v);
		
	}

}
