package com.sw.banca.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;

import com.sw.banca.dto.Response;
import com.sw.banca.jpa.service.CuentaService;
import com.sw.banca.model.TbCuenta;
import com.sw.banca.utils.ErroresEnum;

@Component
public class CuentaResource {

	@Autowired
	private CuentaService service;
	
	public ResponseEntity<Response<?>> listar() {
		Response<List<TbCuenta>> response = new Response<>();
		List<TbCuenta> list = service.listar();
		
		
		if(list.isEmpty()) {
			response.setError(ErroresEnum.NO_DATA);
		    return new ResponseEntity<>(response, HttpStatus.OK);
		}
		
		response.setError(ErroresEnum.OK);
		response.setData(list);
	    return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	public ResponseEntity<Response<?>> listarPorUsuId(Integer usuId) {
		Response<List<TbCuenta>> response = new Response<>();
		
		List<TbCuenta> list = service.listarPorUsuarioId(usuId);
		
		
		if(list.isEmpty()) {
			response.setError(ErroresEnum.NO_DATA);
			  return new ResponseEntity<>(response, HttpStatus.OK);
		}
		
		response.setError(ErroresEnum.OK);
		response.setData(list);
		  return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	public ResponseEntity<Response<?>> registar(TbCuenta cuenta,BindingResult result) {
		Response<TbCuenta> response = new Response<>();
		
		if(result.hasErrors()) {
			response.setError(ErroresEnum.DATOS_REQUERIDOS_INCOMPLETOS);
			return new ResponseEntity<>(response, HttpStatus.OK);
		}
		
		TbCuenta obj = service.registrar(cuenta);
		
		
		if(obj !=null) {
			response.setError(ErroresEnum.FALLO_REGISTRO);
			return new ResponseEntity<>(response, HttpStatus.OK);
		}
		
		response.setError(ErroresEnum.OK);
		response.setData(obj);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
