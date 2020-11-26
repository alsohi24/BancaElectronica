package com.sw.banca.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

/**
 * The persistent class for the tb_cliente database table.
 * 
 */
@Entity
@Table(name = "tb_cliente")
@Data
public class TbCliente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Integer cliId;

	@JsonIgnore
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "cliente")
	private TbUsuario usuario;
	
	@NotNull
	@Column(name = "cli_ape_materno")
	private String cliApeMaterno;

	@NotNull
	@Column(name = "cli_ape_paterno")
	private String cliApePaterno;
	
	@NotNull
	@Column(name = "cli_corrreo")
	private String cliCorrreo;
	
	@NotNull
	@Column(name = "cli_direccion")
	private String cliDireccion;
	
	@NotNull
	@Column(name = "cli_fec_nac")
	private Date cliFecNac;
	
	@NotNull
	@Column(name = "cli_nombres")
	private String cliNombres;
	
	@NotNull
	@Column(name = "cli_num_celular")
	private String cliNumCelular;
	
	@NotNull
	@Column(name = "cli_num_documento")
	private String cliNumDocumento;
	
	@NotNull
	@Column(name = "cli_foto")
	private byte[] cliFoto;
	
	@ManyToOne
	@JoinColumn(name = "cli_tdoc_id", referencedColumnName = "tdoc_id", nullable = false)
	private TbTipoDocumento tipoDocumento;

	@ManyToOne
	@JoinColumn(name = "cli_agen_id", referencedColumnName = "agen_id", nullable = false)
	private TbAgencia agencia;

}