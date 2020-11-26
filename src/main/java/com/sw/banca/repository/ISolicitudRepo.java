package com.sw.banca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sw.banca.model.TbSolicitud;

public interface ISolicitudRepo extends JpaRepository<TbSolicitud, Integer> {
	
}