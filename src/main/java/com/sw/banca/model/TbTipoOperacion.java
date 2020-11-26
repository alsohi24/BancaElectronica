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
 * The persistent class for the tb_tipo_solicitudes database table.
 * 
 */
@Entity
@Table(name="tb_tipo_operacion")
@Data
public class TbTipoOperacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="top_id")
	private Integer tsolId;

	@Column(name="top_descripcion")
	private String tsolDescripcion;
}