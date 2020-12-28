package com.ona.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ona.backend.models.entities.Negocio;
import com.ona.backend.services.interfaces.INegocioService;

@RestController
@RequestMapping("/api/negocio")
public class NegocioController {

	@Autowired
	private INegocioService service;
	
	@GetMapping("/{id}")
	public Negocio retrieve(@PathVariable(value="id") Long id) {
		return service.findById(id);
	}
	
	@GetMapping("")
	public List<Negocio> list() {
		return service.findAll();
	}
	
	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public Negocio create(@RequestBody Negocio negocio) {		
		service.save(negocio);
		return negocio;
	}
	
	
}
