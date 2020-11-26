package com.sw.banca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sw.banca.model.TbMovimientoAutomatico;

public interface IMovimientosAutomaticoRepo extends JpaRepository<TbMovimientoAutomatico, Integer> {

	
}
