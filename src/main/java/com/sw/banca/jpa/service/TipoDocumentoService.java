package com.sw.banca.jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sw.banca.jpa.inter.ITipoDocumentoService;
import com.sw.banca.model.TbTipoDocumento;
import com.sw.banca.repository.ITipoDocumentoRepo;

@Service
public class TipoDocumentoService implements ITipoDocumentoService{

	@Autowired
	private ITipoDocumentoRepo repo;
	
	@Override
	public TbTipoDocumento registrar(TbTipoDocumento obj) {
		return repo.save(obj);
	}

	@Override
	public TbTipoDocumento modificar(TbTipoDocumento obj) {
		return repo.save(obj);
	}

	@Override
	public List<TbTipoDocumento> listar() {
		return repo.findAll();
	}

	@Override
	public TbTipoDocumento listarPorId(Integer v) { 
		Optional<TbTipoDocumento> op = repo.findById(v);
		return op.isPresent() ? op.get() : new TbTipoDocumento();
	}

	@Override
	public void eliminar(Integer v) {
		repo.deleteById(v);
	}

}
