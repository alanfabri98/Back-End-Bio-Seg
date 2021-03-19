package com.ona.backend.controllers;

import java.util.List;

import javax.persistence.TemporalType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Temporal;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;

import com.ona.backend.models.entities.Venta;
import com.ona.backend.services.interfaces.IVentaService;

@RestController
@RequestMapping("/api/venta")
public class VentaController {

	@Autowired
	private IVentaService service;
	
	@GetMapping("/{id}")
	public ResponseUtility retrieve(@PathVariable(value="id") Long id) {
		Venta vt = service.findById(id);
		if(vt == null) {
			return new ResponseUtility("Venta not found", HttpStatus.NOT_FOUND, null);
		}
		return new ResponseUtility("Venta found", HttpStatus.OK, vt);
	}
	
	@GetMapping("")
	public ResponseUtility list() {
		List<Venta> vt = service.findAll();
		if(vt == null) {
			return new ResponseUtility("Venta not found", HttpStatus.NOT_FOUND, null);
		}
		return new ResponseUtility("Venta found", HttpStatus.OK, vt);
	}
	
	@PostMapping(value = "", consumes = "application/json", produces = "application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public Venta create(@RequestBody Venta venta) {		
		service.save(venta);
		return venta;
	}
	
	//-----------------------------------------------------------------//	
	@GetMapping("/search_usuario/{id}")
	public ResponseUtility findAllByUsuarioIdUsuario(@PathVariable Long id){
		List<Venta> vt = service.findAllByUsuarioIdUsuario(id);
		if(vt == null) {
			return new ResponseUtility("Venta not found", HttpStatus.NOT_FOUND, null);
		}
		return new ResponseUtility("Venta found", HttpStatus.OK, vt);
	}
	
}
