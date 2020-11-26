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
 * The persistent class for the tb_session database table.
 * 
 */
@Entity
@Table(name="tb_session")
@Data
public class TbSession implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ses_id")
	private Integer sesId;

	@Column(name="ses_fec_crea")
	private Date sesFecCrea;

	@Column(name="ses_token")
	private String sesToken;

	@ManyToOne
	@JoinColumn(name = "ses_usu_id", referencedColumnName = "usu_id")
	private TbUsuario usuario;
}