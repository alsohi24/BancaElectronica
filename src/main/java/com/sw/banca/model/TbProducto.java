package com.sw.banca.model;

import java.io.Serializable;

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
 * The persistent class for the tb_productos database table.
 * 
 */
@Entity
@Table(name="tb_producto")
@Data
public class TbProducto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="prod_id")
	private Integer prodId;

	@Column(name="prod_descripcion")
	private String prodDescripcion;

	@Column(name="prod_est_id")
	private Integer prodEstId;

}