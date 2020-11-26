package com.sw.banca.jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sw.banca.jpa.inter.ISolicitudService;
import com.sw.banca.model.TbSolicitud;
import com.sw.banca.repository.ISolicitudRepo;

@Service
public class SolicitudService implements ISolicitudService {

	@Autowired
	private ISolicitudRepo repo;
	
	@Override
	public TbSolicitud registrar(TbSolicitud obj) {
		return repo.save(obj);
	}

	@Override
	public TbSolicitud modificar(TbSolicitud obj) {
		return repo.save(obj);
	}

	@Override
	public List<TbSolicitud> listar() {
		return repo.findAll();
	}

	@Override
	public TbSolicitud listarPorId(Integer v) { 
		Optional<TbSolicitud> op = repo.findById(v);
		return op.isPresent() ? op.get() : new TbSolicitud();
	}

	@Override
	public void eliminar(Integer v) {
		repo.deleteById(v);
	}

}
