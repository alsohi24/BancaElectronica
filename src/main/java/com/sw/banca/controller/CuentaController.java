package com.sw.banca.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sw.banca.model.TbCuenta;
import com.sw.banca.resource.CuentaResource;

@RestController
@RequestMapping("api/cuenta")
public class CuentaController {

	@Autowired
	private CuentaResource resource;
	
	@GetMapping("listar")
	public ResponseEntity<?> listaCuentas() {
		return resource.listar();
	}
	
	@GetMapping("obtener/user/{usuId}")
	public ResponseEntity<?> obtenerCuentasPorUsuario(@Param("usuId") Integer usuId) {
		return resource.listarPorUsuId(usuId);
	}
	
	@PostMapping("crear")
	public ResponseEntity<?> registar(@Valid @RequestBody TbCuenta cuenta, BindingResult result) {
		return resource.registar(cuenta,result);
	}
}
