package com.sw.banca.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sw.banca.model.TbAgencia;
import com.sw.banca.model.TbCliente;
import com.sw.banca.model.TbRol;

public interface IAgenciaRepo extends JpaRepository<TbAgencia, Integer>{

}
