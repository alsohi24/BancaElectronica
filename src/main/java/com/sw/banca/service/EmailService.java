/*
 * @(#)EmailService.java
 * 
 * Copyright 2019 ZyTrust SA, Todos los derechos reservados.
 * ZT PROPRIETARIO/CONFIDENTIALIDAD. Su uso está sujeto a los
 * términos de la licencia adquirida a ZyTrust SA.
 * No se permite modificar, copiar ni difundir sin autorización
 * expresa de ZyTrust SA.
 */
package com.sw.banca.service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.sw.banca.dto.EmailDto;
import com.sw.banca.dto.Response;
import com.sw.banca.utils.ErroresEnum;

/**
 * "Service de envio de correo"
 *
 *
 * @author Gustavo Jimenez
 * @version 8.2, 29/05/2020 03:44:19 PM
 * @since 1.0
 */
@Service
public class EmailService {

    private static final  Logger LOG = LogManager.getLogger(EmailService.class);

    @Autowired
    private JavaMailSender emailSender;
    
    private static final String CLOSE_ET_P = "</p>";
	
    public Response<?> sendMessage(EmailDto emailDto) {

        MimeMessageHelper helper = null;
        MimeMessage message = null;
        Response<?> response = null;
        StringBuilder sbAsunto = null;
        response = new Response<>();
        try {

            message = emailSender.createMimeMessage();
            helper = new MimeMessageHelper(message, true, "UTF-8");
            helper.setTo(emailDto.getSendTo());
            sbAsunto = new StringBuilder();
            sbAsunto.append(emailDto.getSubject());
            
            helper.setSubject(sbAsunto.toString());
            
            switch(emailDto.getNroPlantilla()) {
			case 1:
				helper.setText(plantBienvenida(emailDto), true);
	            break;

			default:
				break;
			}
            
            //helper.addInline("attachment.png", resourceFile);
            emailSender.send(message);
            response.setError(ErroresEnum.OK);
        } catch (MessagingException | MailException e) {
            LOG.error("Error al enviar correo:", e);
            response.setError(ErroresEnum.EMAIL_NO_SEND);
        }

        return response;
    }

    private String plantBienvenida(EmailDto emailDto) {

    	StringBuilder sb = new StringBuilder();
    	sb.append("<html><body>");
    	sb.append("<p><strong>Bienvenido a CiberBanca</strong></p><br>");
    	sb.append("<p>Usuario :</strong></p>");
    	sb.append(emailDto.getUsuario());
    	sb.append(CLOSE_ET_P);
    	sb.append("<p>Clave :</strong></p>");
    	sb.append(emailDto.getClave());
    	sb.append(CLOSE_ET_P);
    	sb.append("<p>Este correo es informativo, No responder</strong></p><br>");
    	sb.append("<p>Atentamente,</p>");
    	sb.append("<p>CiberBanca</p>");
    	sb.append("</body></html>");
    	
        return sb.toString();
    }
}
