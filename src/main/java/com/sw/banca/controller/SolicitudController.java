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

import com.sw.banca.dto.ProcesarDto;
import com.sw.banca.model.TbSolicitud;
import com.sw.banca.resource.SolicitudResource;

@RestController
@RequestMapping("api/solicitud")
public class SolicitudController {

	@Autowired
	private SolicitudResource resource;
	
	@GetMapping("listar")
	public ResponseEntity<?> listarSolicitudes() {
		return resource.listar();
	}
	
	@GetMapping("obtener/{soliId}")
	public ResponseEntity<?> obtenerSolicitud(@Param("soliId") Integer usuId) {
		return resource.obtenerSolicitud(usuId);
	}
	
	@PostMapping("crear")
	public ResponseEntity<?> registar(@Valid @RequestBody TbSolicitud solicitud, BindingResult result) {
		return resource.registar(solicitud,result);
	}
	
	@PostMapping("verificacion/ocr")
	public ResponseEntity<?> verificacionOcr(@Valid @RequestBody ProcesarDto procesarDto) {
		return resource.verificacionOcr(procesarDto);
	}
}
