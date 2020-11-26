package com.sw.banca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sw.banca.model.TbProducto;

public interface IProductoRepo extends JpaRepository<TbProducto, Integer> {
	
}
