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
import javax.persistence.PrePersist;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

/**
 * The persistent class for the tb_solicitudes database table.
 * 
 */
@Entity
@Table(name = "tb_solicitud_detalle")
@Data
public class TbSolicitudDetalle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "sdet_id")
	private Integer sdetId;

	@Column(name = "sdet_fec_crea")
	private Date sdetFecCrea;
	
	@Column(name = "sdet_movimiento_id")
	private String sdetMovimientoId;

	@ManyToOne
	@JoinColumn(name = "sdet_top_id", referencedColumnName = "top_id", nullable = false)
	private TbTipoOperacion tipoOperacion;

    @JsonIgnore
    @JoinColumn(name = "sdet_soli_id", referencedColumnName = "soli_id")
    @ManyToOne(optional = false)
    private TbSolicitud solicitud;
    
    
    
	@PrePersist
	public void prePersist() {
		sdetFecCrea = new Date();
	}


}