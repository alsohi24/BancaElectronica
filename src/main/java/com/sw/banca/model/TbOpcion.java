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
 * The persistent class for the tb_opcion database table.
 * 
 */
@Entity
@Table(name="tb_opcion")
@Data
public class TbOpcion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="op_id")
	private Integer opcId;

	@Column(name="op_descripcion")
	private String opcDescripcion;

	@Column(name="op_icono")
	private String opcIcono;

}