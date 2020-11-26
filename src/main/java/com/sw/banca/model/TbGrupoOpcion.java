package com.sw.banca.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;


/**
 * The persistent class for the tb_grupo_opcion database table.
 * 
 */
@Entity
@Table(name="tb_grupo_opcion")
@Data
public class TbGrupoOpcion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="gop_id")
	private Integer gopId;

	@Column(name="gop_descripcion")
	private String gopDescripcion;

	@Column(name="gop_icono")
	private String gopIcono;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "tb_grupo_opciones", joinColumns = @JoinColumn(name = "gop_id", referencedColumnName = "gop_id"), inverseJoinColumns = @JoinColumn(name = "op_id", referencedColumnName = "op_id"))
	private List<TbOpcion> opciones;

}