package com.sw.banca.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.sw.banca.dto.Response;
import com.sw.banca.jpa.service.AgenciaService;
import com.sw.banca.jpa.service.ProductoService;
import com.sw.banca.jpa.service.TipoCuentaService;
import com.sw.banca.jpa.service.TipoDocumentoService;
import com.sw.banca.jpa.service.TipoMonedaService;
import com.sw.banca.model.TbAgencia;
import com.sw.banca.utils.ErroresEnum;

@Component
public class ListadoResource {

	@Autowired
	AgenciaService agenciaService;

	@Autowired
	TipoDocumentoService tipoDocumentoService;
	
	@Autowired
	TipoMonedaService tipoMonedaService;
	
	@Autowired
	TipoCuentaService tipoCuentaService;
	
	@Autowired
	ProductoService productoService;

	public ResponseEntity<Response<?>> listarAgencias() {
		
		Response response = new Response<>();
		List<TbAgencia> list = agenciaService.listar();
		
		
		if(list.isEmpty()) {
			response.setError(ErroresEnum.NO_DATA);
			 return new ResponseEntity<>(response, HttpStatus.OK);
		}
		
		response.setError(ErroresEnum.OK);
		response.setData(list);
	    return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	/*
	public ResponseEntity<Response<?>> listarTipoDocumentos() {
		reset();
		
		List<TbTipoDocumento> list = tipoDocumentoService.listar();
		
		
		if(list.isEmpty()) {
			response.setError(ErroresEnum.NO_DATA);
			return respuesta(response);
		}
		
		response.setError(ErroresEnum.OK);
		response.setData(list);
		return respuesta(response);
	}
	
	
	public ResponseEntity<Response<?>> listarTipoModena() {
		reset();
		
		List<TbTipoMoneda> list = tipoMonedaService.listar();
		
		
		if(list.isEmpty()) {
			response.setError(ErroresEnum.NO_DATA);
			return respuesta(response);
		}
		
		response.setError(ErroresEnum.OK);
		response.setData(list);
		return respuesta(response);
	}
	
	public ResponseEntity<Response<?>> listarTipoCuenta() {
		reset();
		
		List<TbTipoCuenta> list = tipoCuentaService.listar();
		
		
		if(list.isEmpty()) {
			response.setError(ErroresEnum.NO_DATA);
			return respuesta(response);
		}
		
		response.setError(ErroresEnum.OK);
		response.setData(list);
		return respuesta(response);
	}
	
	public ResponseEntity<Response<?>> listarProducto() {
		reset();
		
		List<TbProducto> list = productoService.listar();
		
		
		if(list.isEmpty()) {
			response.setError(ErroresEnum.NO_DATA);
			return respuesta(response);
		}
		
		response.setError(ErroresEnum.OK);
		response.setData(list);
		return respuesta(response);
	}

*/
}
