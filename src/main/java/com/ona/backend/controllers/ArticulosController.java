package com.ona.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ona.backend.models.entities.Articulo;
import com.ona.backend.services.interfaces.IArticulosService;

@RestController
@RequestMapping("/api/articulo")
public class ArticulosController {

	@Autowired
	private IArticulosService service;
	
	@GetMapping("/{id}")
	public Articulo retrive(@PathVariable(value="id") Long id) {
		return service.findById(id);
	}
	
	@GetMapping("")
	public List<Articulo> list(){
		return service.findAll();
	}
	
	@PostMapping("")
	public Articulo create(@RequestBody Articulo article) {
		service.save(article);
		return article;
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
	
	@GetMapping("/category/{id}")
	public List<Articulo> listCategory(Long id){
		return service.findByCategoriaId(id);
	}
}
