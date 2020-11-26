package com.sw.banca.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


/**
 * The persistent class for the tb_record_session database table.
 * 
 */
@Entity
@Table(name="tb_record_session")
@Data
public class TbRecordSession implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="rses_id")
	private Integer rsesId;

	@Column(name="rses_fecha_log_in")
	private Date rsesFechaLogIn;

	@Column(name="rses_fecha_log_out")
	private Date rsesFechaLogOut;

	@Column(name="rses_plataforma")
	private String rsesPlataforma;

	@Column(name="rses_usuario")
	private String rsesUsuario;
	
	@Column(name="rses_estado")
	private String rsesEstado;

}