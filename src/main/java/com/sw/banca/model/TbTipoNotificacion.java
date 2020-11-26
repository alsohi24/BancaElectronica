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
 * The persistent class for the tb_tipo_notificaciones database table.
 * 
 */
@Entity
@Table(name="tb_tipo_notificacion")
@Data
public class TbTipoNotificacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="tntf_id")
	private Integer tntfId;

	@Column(name="tntf_descripcion")
	private String tntfDescripcion;
}