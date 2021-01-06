package com.ona.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ona.backend.models.entities.Usuario;
import com.ona.backend.services.interfaces.IUsuarioService;

@RestController
@RequestMapping("/api/user")
public class UsuarioController {

	@Autowired
	private IUsuarioService service;
	
	@GetMapping("/id")
	public Usuario retrive(@PathVariable(value="id") Long id) {
		return service.findById(id);
	}
	
	@GetMapping("")
	public List<Usuario> list(){
		return service.findAll();
	}
}
