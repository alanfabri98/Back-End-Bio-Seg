package com.ona.backend.services.interfaces;

import java.util.List;

import com.ona.backend.models.entities.Usuario;


public interface IUsuarioService {
	
	public void save(Usuario user); //create-update
	public Usuario findById(Long id); //retrieve
	public void delete(Long id);	//delete
	public List<Usuario> findAll(); //list
}
