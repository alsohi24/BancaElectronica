package com.sw.banca.dto;
 

import javax.validation.constraints.Email;

import lombok.Data;
@Data
public class EmailDto {
	@Email
	private String sendTo;
	private String subject;
	private String usuario;
	private String clave;
	private int nroPlantilla;

}
