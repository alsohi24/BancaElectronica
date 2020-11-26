package com.sw.banca.jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sw.banca.jpa.inter.ITipoMonedaService;
import com.sw.banca.model.TbTipoMoneda;
import com.sw.banca.repository.ITipoMonedaRepo;

@Service
public class TipoMonedaService implements ITipoMonedaService{

	@Autowired
	private ITipoMonedaRepo repo;
	
	@Override
	public TbTipoMoneda registrar(TbTipoMoneda obj) {
		return repo.save(obj);
	}

	@Override
	public TbTipoMoneda modificar(TbTipoMoneda obj) {
		return repo.save(obj);
	}

	@Override
	public List<TbTipoMoneda> listar() {
		return repo.findAll();
	}

	@Override
	public TbTipoMoneda listarPorId(Integer v) { 
		Optional<TbTipoMoneda> op = repo.findById(v);
		return op.isPresent() ? op.get() : new TbTipoMoneda();
	}

	@Override
	public void eliminar(Integer v) {
		repo.deleteById(v);
	}

}
