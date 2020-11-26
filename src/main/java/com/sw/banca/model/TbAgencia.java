package com.sw.banca.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;


/**
 * The persistent class for the tb_agencia database table.
 * 
 */
@Entity
@Table(name="tb_agencia")
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TbAgencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="agen_id")
	private Integer agenId;
	@NotNull
	@Column(name="agen_descripcion")
	private String agenDescripcion;
	@NotNull
	@Column(name="agen_direccion")
	private String agenDireccion;
	@NotNull
	@Column(name="agen_estado")
	private Integer agenEstado;
}