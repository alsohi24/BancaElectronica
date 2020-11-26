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

import lombok.Data;


/**
 * The persistent class for the tb_movimientos_automatico database table.
 * 
 */
@Entity
@Table(name="tb_movimiento_automatico")
@Data
public class TbMovimientoAutomatico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="matm_id")
	private Integer matmId;

	@Column(name="matm_concepto")
	private String matmConcepto;

	@Column(name="matm_fe_crea")
	private Date matmFeCrea;

	@Column(name="matm_intervalo")
	private Integer matmIntervalo;

	@Column(name="matm_monto")
	private BigDecimal matmMonto;

	@ManyToOne
	@JoinColumn(name = "matm_tmvm_id",referencedColumnName = "tmvm_id")
	private TbTipoMovimiento tipoMovimiento;

	
	@ManyToOne
	@JoinColumn(name = "matm_usu_id", referencedColumnName = "usu_id")
	private TbUsuario usuario;
	
	
}