package com.sw.banca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sw.banca.resource.ListadoResource;

@RestController
@RequestMapping("api/listar")
public class ListaController {

	@Autowired
	private ListadoResource resource;
	
	@GetMapping("agencia")
	public ResponseEntity<?> listarAgencias() {
		return resource.listarAgencias();
	}
	/*
	@GetMapping("tipoDocumento")
	public ResponseEntity<?> listaTipoDocumento() {
		return resource.listarTipoDocumentos();
	}
	
	@GetMapping("tipoMoneda")
	public ResponseEntity<?> listaTipoMoneda() {
		return resource.listarTipoModena();
	}
	
	@GetMapping("tipoCuenta")
	public ResponseEntity<?> listaTipoCuenta() {
		return resource.listarTipoCuenta();
	}
	
	@GetMapping("producto")
	public ResponseEntity<?> listaProducto() {
		return resource.listarProducto();
	}
	*/
}
