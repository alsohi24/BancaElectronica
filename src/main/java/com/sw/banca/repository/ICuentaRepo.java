package com.sw.banca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sw.banca.model.TbCuenta;

public interface ICuentaRepo extends JpaRepository<TbCuenta, Integer> {
	
	@Query("SELECT c FROM TbCuenta c WHERE c.usuario.usuId = :usuId")
	public List<TbCuenta> findByUsuario(@Param("usuId") Integer usuId);
}