package com.ona.backend.services.interfaces;

import java.util.List;

import com.ona.backend.models.entities.Carrusel;

public interface ICarruselService {

	public void save(Carrusel carrusel);//create-update
	
	public void delete(Long id);//delete
	
	public Carrusel findById(Long id);//retrieve
	
	public List<Carrusel> findAll();//list
	
}
