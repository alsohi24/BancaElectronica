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

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

/**
 * The persistent class for the tb_movimientos database table.
 * 
 */
@Entity
@Table(name = "tb_movimientos")
@Data
public class TbMovimiento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "mvmt_id")
	private Integer mvmtId;

	@Column(name = "mvmt_concepto")
	private String mvmtConcepto;

	@Column(name = "mvmt_fe_crea")
	private Date mvmtFeCrea;

	@Column(name = "mvmt_monto")
	private BigDecimal mvmtMonto;

	@ManyToOne
	@JoinColumn(name = "mvmt_tmvm_id",referencedColumnName = "tmvm_id")
	private TbTipoMovimiento tipoMovimiento;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "mvmt_cta_id",referencedColumnName = "cta_id")
	private TbCuenta cuenta;
	
}