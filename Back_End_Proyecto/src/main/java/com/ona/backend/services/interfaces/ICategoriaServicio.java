package com.ona.backend.services.interfaces;

import java.util.List;

import com.ona.backend.models.entities.Categoria;

public interface ICategoriaServicio {

	public void save(Categoria category);
	public Categoria findById(Long id);
	public void delete(Long id);
	public List<Categoria> findAll();
	
	/**Custom methods **/
}
