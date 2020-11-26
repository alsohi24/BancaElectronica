package com.sw.banca.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/configuraciones")
public class ConfigController {
/*
	@Autowired
	private IConfigService service;

	@PostMapping
	public Config registrar(@RequestBody Config obj) {
		return service.registrar(obj);
	}

	@PutMapping
	public Config modificar(@RequestBody Config obj) {
		return service.modificar(obj);
	}

	@GetMapping("/{id}")
	public Config listarPorId(@PathVariable("id") Integer id) {
		return service.listarPorId(id);
	}	
	
	@GetMapping(value = "/buscar/{param}")
	public Config listarPorId(@PathVariable("param") String param){
		return service.leerParametro(param);
	}

	@GetMapping
	public List<Config> listar() {
		return service.listar();
	}

	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		service.eliminar(id);
	}
	*/
}
