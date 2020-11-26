package com.sw.banca.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


/**
 * The persistent class for the tb_tipo_monedas database table.
 * 
 */
@Entity
@Table(name="tb_tipo_monedas")
@Data
public class TbTipoMoneda implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="tmon_id")
	private Integer tmonId;

	@Column(name="tmon_descripcion")
	private String tmonDescripcion;

}