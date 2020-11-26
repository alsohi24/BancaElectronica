package com.sw.banca.jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sw.banca.jpa.inter.IProductoService;
import com.sw.banca.model.TbProducto;
import com.sw.banca.repository.IProductoRepo;

@Service
public class ProductoService implements IProductoService {
	
	@Autowired
	private IProductoRepo repo;

	@Override
	public TbProducto registrar(TbProducto obj) {
		return repo.save(obj);
	}

	@Override
	public TbProducto modificar(TbProducto obj) {
		return repo.save(obj);
	}

	@Override
	public List<TbProducto> listar() {
		return repo.findAll();
	}

	@Override
	public TbProducto listarPorId(Integer v) {
		Optional<TbProducto> op = repo.findById(v);
		return op.isPresent() ? op.get() : new TbProducto();
	}

	@Override
	public void eliminar(Integer v) {
		repo.deleteById(v);
	}

}
