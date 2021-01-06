package com.ona.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ona.backend.models.entities.Categoria;
import com.ona.backend.services.interfaces.ICategoriaServicio;

@RestController
@RequestMapping("/api/category")
public class CategoriaController {
	
	@Autowired
	private ICategoriaServicio service;
	
	@GetMapping("/{id}")
	public Categoria retrive(@PathVariable(value="id") Long id) {
		return service.findById(id);
	}
	
	@GetMapping("")
	public List<Categoria> list(){
		return service.findAll();
	}
	
	
	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public Categoria create(@RequestBody Categoria category) {
		service.save(category);
		return category;
	}
	@PutMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public Categoria update(@RequestBody Categoria category, @PathVariable Long id) {
		service.save(category);
		return category;
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
	
	
}
