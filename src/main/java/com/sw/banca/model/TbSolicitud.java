package com.sw.banca.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import lombok.Data;


/**
 * The persistent class for the tb_solicitudes database table.
 * 
 */
@Entity
@Table(name="tb_solicitud")
@Data
public class TbSolicitud implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="soli_id")
	private Integer soliId;

	@Column(name="soli_fec_crea")
	private Date soliFecCrea;

	@Column(name="soli_fec_mod")
	private Date soliFecMod;

	@ManyToOne
	@JoinColumn(name = "soli_usu_id", referencedColumnName = "usu_id" , nullable = false)
	private TbUsuario usuario;
	
	@ManyToOne
	@JoinColumn(name = "soli_rses_id", referencedColumnName = "rses_id" , nullable = false)
	private TbRecordSession recordSession;
	
	@Column(name="soli_estado")
	private String soliEstado;
	
    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(cascade = {CascadeType.ALL}, orphanRemoval = true, mappedBy = "solicitud")
    private List<TbSolicitudDetalle> solicitudDetalle = new ArrayList<>();
    
	@PrePersist
	public void prePersist() {
		soliFecCrea = new Date();
	}

	@PreUpdate
	public void preUpdate() {
		soliFecMod = new Date();
	}

}