package com.ona.backend.services.interfaces;

import java.util.List;

import com.ona.backend.models.entities.Articulo;

public interface IArticulosService {

	public void save(Articulo article);/*C.R.U.D.*/
	public Articulo findById(Long id);
	public void delete(Long Id);
	public List<Articulo> findAll();
	
	public List<Articulo> findByCategoriaId(Long id);
}
