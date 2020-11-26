package com.sw.banca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sw.banca.model.TbTipoDocumento;

public interface ITipoDocumentoRepo extends JpaRepository<TbTipoDocumento, Integer>{

}
