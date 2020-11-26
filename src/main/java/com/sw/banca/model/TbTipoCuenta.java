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
 * The persistent class for the tb_tipo_cuentas database table.
 * 
 */
@Entity
@Table(name="tb_tipo_cuentas")
@Data
public class TbTipoCuenta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="tcta_id")
	private Integer tctaId;

	@Column(name="tcta_descripcion")
	private String tctaDescripcion;

	@Column(name="tcta_est_id")
	private Integer tctaEstId;

}