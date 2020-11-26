package com.sw.banca.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

/**
 * The persistent class for the tb_notificaciones database table.
 * 
 */
@Entity
@Table(name = "tb_notificaciones")
@Data
public class TbNotificaciones implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ntfc_id")
	private Integer ntfcId;

	@Column(name = "ntfc_fe_crea")
	private Date ntfcFeCrea;

	@Column(name = "ntfc_mensaje")
	private String ntfcMensaje;

	@ManyToOne
	@JoinColumn(name = "ntfc_usu_id", referencedColumnName = "usu_id")
	 private TbUsuario ntfcUsuario;

	@ManyToOne
	@JoinColumn(name = "ntfc_tntf_id", referencedColumnName = "tntf_id")
	private TbTipoNotificacion ntfcTntfId;

}