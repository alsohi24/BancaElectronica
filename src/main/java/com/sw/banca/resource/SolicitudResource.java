package com.sw.banca.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;

import com.sw.banca.dto.ProcesarDto;
import com.sw.banca.dto.Response;
import com.sw.banca.jpa.service.SolicitudService;
import com.sw.banca.model.TbSolicitud;
import com.sw.banca.service.OcrService;
import com.sw.banca.utils.ErroresEnum;

@Component
public class SolicitudResource {

	@Autowired
	private SolicitudService service;
	
	@Autowired
	private OcrService ocrService;
	
	public ResponseEntity<Response<?>> listar() {
		Response<List<TbSolicitud>> response = new Response<>();
		List<TbSolicitud> list = service.listar();
		
		
		if(list.isEmpty()) {
			response.setError(ErroresEnum.NO_DATA);
		    return new ResponseEntity<>(response, HttpStatus.OK);
		}
		
		response.setError(ErroresEnum.OK);
		response.setData(list);
	    return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	public ResponseEntity<Response<?>> obtenerSolicitud(Integer usuId) {
		Response<TbSolicitud> response = new Response<>();

		TbSolicitud obj = service.listarPorId(usuId);
		
		
		if(obj !=null) {
			response.setError(ErroresEnum.NO_DATA);
			return new ResponseEntity<>(response, HttpStatus.OK);
		}
		
		response.setError(ErroresEnum.OK);
		response.setData(obj);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	public ResponseEntity<Response<?>> registar(TbSolicitud cuenta,BindingResult result) {
		Response<TbSolicitud> response = new Response<>();
		
		if(result.hasErrors()) {
			response.setError(ErroresEnum.DATOS_REQUERIDOS_INCOMPLETOS);
			return new ResponseEntity<>(response, HttpStatus.OK);
		}
		
		TbSolicitud obj = service.registrar(cuenta);
		
		
		if(obj !=null) {
			response.setError(ErroresEnum.FALLO_REGISTRO);
			return new ResponseEntity<>(response, HttpStatus.OK);
		}
		
		response.setError(ErroresEnum.OK);
		response.setData(obj);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	public ResponseEntity<Response<?>> verificacionOcr(ProcesarDto procesarDto) {
		Response<String> response = null;
		
		response = ocrService.lecturaDocumento(procesarDto.getImagen());
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
