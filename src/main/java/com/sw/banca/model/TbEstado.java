package com.sw.banca.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.*;

import lombok.Data;


/**
 * The persistent class for the tb_estados database table.
 * 
 */
@Entity
@Table(name="tb_estados")
@Data
public class TbEstado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="est_id")
	private BigDecimal estId;

	@Column(name="est_descripcion")
	private String estDescripcion;

}