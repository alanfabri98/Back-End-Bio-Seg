package com.ona.backend.services.implementations;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.ona.backend.models.dao.IArticulo;
import com.ona.backend.models.entities.Articulo;
import com.ona.backend.services.interfaces.IArticuloService;

public class ArticuloService implements IArticuloService{
	
	@Autowired
	private IArticulo dao;//Data Access Object

	@Override
	@Transactional
	public void save(Articulo article) {
		try {
			dao.save(article);
		}
		catch(Exception ex) {
			throw ex;
		}		
	}

	@Override
	public Articulo findById(Long id) {
		return dao.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		try {
			dao.deleteById(id);;
		}
		catch(Exception ex) {
			throw ex;
		}
		
	}

	@Override	
	public List<Articulo> findAll() {		
		return (List<Articulo>)dao.findAll();
	}

}
