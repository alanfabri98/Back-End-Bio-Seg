package com.ona.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ona.backend.models.entities.Venta;
import com.ona.backend.services.interfaces.IVentaService;

@RestController
@RequestMapping("/api/venta")
public class VentaController {

	@Autowired
	private IVentaService service;
	
	@GetMapping("/{id}")
	public Venta retrieve(@PathVariable(value="id") Long id) {
		return service.findById(id);
	}
	
	@GetMapping("")
	public List<Venta> list() {
		return service.findAll();
	}
	
	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public Venta create(@RequestBody Venta venta) {		
		service.save(venta);
		return venta;
	}
	
}
