package com.ona.backend.services.interfaces;

import java.util.List;

import com.ona.backend.models.entities.Articulo;


public interface IArticuloService {
	
	public void save(Articulo articlulo); //create-update
	public Articulo findById(Long id); //retrieve
	public void delete(Long id);	//delete
	public List<Articulo> findAll(); //list
	
	/**** Custom methods 
	public List<Articulo> findByCategoria(String categoria);
	public Articulo findBynombre_articulo(String name);
	public List<Articulo> findByusuario(String user);***/
}
