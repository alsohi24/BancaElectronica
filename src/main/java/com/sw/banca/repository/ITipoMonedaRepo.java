package com.sw.banca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sw.banca.model.TbTipoMoneda;

public interface ITipoMonedaRepo extends JpaRepository<TbTipoMoneda, Integer>{

}
