package com.sw.banca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sw.banca.model.TbMovimiento;

public interface IMovimientoRepo extends JpaRepository<TbMovimiento, Integer>{

	
}
