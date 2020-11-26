package com.sw.banca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sw.banca.exception.ModeloNotFoundException;
import com.sw.banca.jpa.inter.IClienteService;
import com.sw.banca.model.TbCliente;

@RestController
@RequestMapping("api/cliente")
public class ClienteController {

	@Autowired
	private IClienteService service;

	@GetMapping("listado")
	public ResponseEntity<List<TbCliente>> listar() {
		List<TbCliente> lista = service.listar();
		return new ResponseEntity<>(lista, HttpStatus.OK);
	}

	@GetMapping("{id}")
	public ResponseEntity<TbCliente> listarPorId(@PathVariable("id") Integer id) {
		TbCliente cli = service.listarPorId(id);

		if (cli.getCliId() == null) {
			throw new ModeloNotFoundException("ID NO EXISTE: " + id);
		}
		return new ResponseEntity<>(cli, HttpStatus.OK);
	}

}
