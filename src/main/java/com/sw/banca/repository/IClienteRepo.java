package com.sw.banca.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sw.banca.model.TbCliente;

public interface IClienteRepo extends JpaRepository<TbCliente, Integer>{

}
