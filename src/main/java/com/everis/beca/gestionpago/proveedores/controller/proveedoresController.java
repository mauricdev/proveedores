package com.everis.beca.gestionpago.proveedores.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.everis.beca.gestionpago.proveedores.dto.TipoDto;
import com.everis.beca.gestionpago.proveedores.dto.TrabajadorDTo;
import com.everis.beca.gestionpago.proveedores.dto.proveedoresDTo;
import com.everis.beca.gestionpago.proveedores.service.proveedorService;
import com.everis.beca.gestionpago.proveedores.service.tipoService;
import com.everis.beca.gestionpago.proveedores.service.trabajadorService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/proveedor")
public class proveedoresController {

	@Autowired
	private proveedorService proveedorService;
	@Autowired
	private tipoService tipoService;
	@Autowired
	private trabajadorService trabajadorServices;

	
	@GetMapping("/obtenerProveedor")
	public ResponseEntity<List<proveedoresDTo>> obtenerProveedor(@RequestParam Integer prov_id) {
		
		List<proveedoresDTo> response = proveedorService.obtenerProveedor(prov_id);
		
		return new ResponseEntity<>( response, HttpStatus.OK);
	}
	
	@GetMapping("/obtenerTipo")
	public ResponseEntity<List<TipoDto>> obtenerTipo(@RequestParam Integer tip_id) {
		
		List<TipoDto> response = tipoService.obtenerTipo(tip_id);
		
		return new ResponseEntity<>( response, HttpStatus.OK);
	}
	
	@GetMapping("/obtenerTrabajador")
	public ResponseEntity<List<TrabajadorDTo>> obtenerTrabajador(@RequestParam Integer tip_id) {
		
		List<TrabajadorDTo> response = trabajadorServices.obtenerTrabajador(tip_id);
		
		return new ResponseEntity<>( response, HttpStatus.OK);
	}
	
	
	
	
}
