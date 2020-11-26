/*
 * @(#)NotificacionService.java
 * 
 * Copyright 2019 ZyTrust SA, Todos los derechos reservados.
 * ZT PROPRIETARIO/CONFIDENTIALIDAD. Su uso está sujeto a los
 * términos de la licencia adquirida a ZyTrust SA.
 * No se permite modificar, copiar ni difundir sin autorización
 * expresa de ZyTrust SA.
 */
package com.sw.banca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sw.banca.dto.EmailDto;
import com.sw.banca.dto.Response;

/**
 * "Aqui Descripcion"
 *
 *
 * @author Jacinto Miraval
 * @version 8.2, 10/06/2020 06:46:00 PM
 * @since 1.0
 */
@Service
public class NotificacionService {

	//private static final Logger LOG = LogManager.getLogger(NotificacionService.class);

	@Autowired
	private EmailService emailService;
	
	
	public Response<?> envioCorreo(EmailDto emailDto){
		return emailService.sendMessage(emailDto);
	}
	
	
}
