package com.sw.banca.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;


/**
 * The persistent class for the tb_cuentas database table.
 * 
 */
@Entity
@Table(name="tb_cuentas")
@Data
public class TbCuenta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name="cta_id")
	private Integer ctaId;
	
	@NotNull
	@Column(name="cta_est_id")
	private Integer ctaEstId;

	@Column(name="cta_fe_crea")
	private Date ctaFeCrea;

	@Column(name="cta_fe_mod")
	private Date ctaFeMod;

	@NotNull
	@Column(name="cta_nu_cuenta")
	private String ctaNuCuenta;

	@NotNull
	@Column(name="cta_nu_cuenta_cci")
	private String ctaNuCuentaCci;

	@NotNull
	@Column(name="cta_saldo")
	private BigDecimal ctaSaldo;

	@ManyToOne
	@JoinColumn(name = "cta_tcta_id",referencedColumnName = "tcta_id", nullable = false)
	private TbTipoCuenta tipoCuenta;
	
	@ManyToOne
	@JoinColumn(name = "cta_prod_id",referencedColumnName = "prod_id", nullable = false)
	private TbProducto producto;

	@ManyToOne
	@JoinColumn(name = "cta_usu_id",referencedColumnName = "usu_id", nullable = false)
	private TbUsuario usuario;
}