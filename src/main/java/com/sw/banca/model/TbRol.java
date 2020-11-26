package com.sw.banca.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;


/**
 * The persistent class for the tb_rol database table.
 * 
 */
@Entity
@Table(name="tb_rol")
@Data
public class TbRol implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="rol_id")
	private Integer rolId;
	@NotNull
	@Column(name="rol_descripcion")
	private String rolDescripcion;
	@NotNull
	@Column(name="rol_titulo")
	private String rolTitulo;

}