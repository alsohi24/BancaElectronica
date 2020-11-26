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
 * The persistent class for the tb_parametro database table.
 * 
 */
@Entity
@Table(name="tb_parametro")
@Data
public class TbParametro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="par_id")
	private Integer parId;

	@Column(name="par_description")
	private String parDescription;

	@Column(name="par_valor")
	private String parValor;
}