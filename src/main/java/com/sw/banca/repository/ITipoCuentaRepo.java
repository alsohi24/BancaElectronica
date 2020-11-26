package com.sw.banca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sw.banca.model.TbTipoCuenta;

public interface ITipoCuentaRepo extends JpaRepository<TbTipoCuenta, Integer>{

}
