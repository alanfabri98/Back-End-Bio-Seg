package com.ona.backend.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ona.backend.models.dao.IArticulos;
import com.ona.backend.models.entities.Articulo;
import com.ona.backend.services.interfaces.IArticulosService;

@Service
public class ArticulosService implements IArticulosService{
	
	@Autowired
	private IArticulos dao; //Data Access Object

	@Override
	public void save(Articulo article) {
		try {
			dao.save(article);
		}catch(Exception ex) {
			throw ex;
		}
		
	}

	@Override
	public Articulo findById(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public void delete(Long Id) {
		try {
			dao.deleteById(Id);
		}catch(Exception ex) {
			throw ex;
		}
	}

	@Override
	public List<Articulo> findAll() {
		// TODO Auto-generated method stub
		return (List<Articulo>) dao.findAll();
	}

	@Override
	public List<Articulo> findByCategoriaId(Long id) {
		// TODO Auto-generated method stub
		return dao.findByCategoriaId(id);
	}

}
