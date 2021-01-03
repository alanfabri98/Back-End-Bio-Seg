package com.ona.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ona.backend.models.entities.Articulo;
import com.ona.backend.services.interfaces.IArticuloService;

@RestController
@RequestMapping("/api/articulo")
public class ArticuloController {
	
	@Autowired(required=true)
	private IArticuloService services; 
	
	@GetMapping("/{id}")
	public Articulo retrive(@PathVariable(value="id") Long id) {
		return services.findById(id);
	}
	
	@GetMapping("")
	public List<Articulo> list(){
		return services.findAll();
	}
	
	@PostMapping("")
	public Articulo cerate(@RequestBody Articulo article, @PathVariable Long id) {
		services.save(article);
		return article;
	}
	
	@PutMapping("/{id}")
	public Articulo update(@RequestBody Articulo article, @PathVariable Long id) {		 			
		services.save(article);
		return article;
	}
	
	@PutMapping("/{id}")
	public void deleted(@PathVariable Long id) {
		services.delete(id);
	}	
		
}
