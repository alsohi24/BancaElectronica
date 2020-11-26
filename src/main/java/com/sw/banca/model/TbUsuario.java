package com.sw.banca.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

/**
 * The persistent class for the tb_usuario database table.
 * 
 */
@Entity
@Table(name = "tb_usuario")
@Data
public class TbUsuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private Integer usuId;

	@OneToOne(cascade = CascadeType.ALL)
	@MapsId
	@JoinColumn(name = "usu_id", nullable = false)
	private TbCliente cliente;

	@NotNull
	@Column(name = "usu_clave")
	private String usuClave;

	@Column(name = "usu_estado")
	private Integer usuEstado;
	
	@NotNull
	@Column(name = "usu_nombre")
	private String usuNombre;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "tb_rol_usuario", joinColumns = @JoinColumn(name = "usu_id", referencedColumnName = "usu_id"), inverseJoinColumns = @JoinColumn(name = "rol_id", referencedColumnName = "rol_id"))
	private List<TbRol> roles;
}