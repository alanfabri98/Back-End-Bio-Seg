package com.ona.backend.services.interfaces;

import java.util.List;

import com.ona.backend.models.entities.Carrito;

public interface ICarritoService {
	
	public void save(Carrito carrito);//create-update
	
	public void delete(Long id);//delete
	
	public List<Carrito> findAll();//list
	
}
