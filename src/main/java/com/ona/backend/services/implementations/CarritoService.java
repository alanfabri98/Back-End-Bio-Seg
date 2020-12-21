package com.ona.backend.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.ona.backend.models.dao.ICarrito;
import com.ona.backend.models.entities.Carrito;
import com.ona.backend.services.interfaces.ICarritoService;

public class CarritoService implements ICarritoService {
	
	@Autowired //Inyección de dependencias
	private ICarrito dao;

	@Override
	public void save(Carrito carrito) {
		try {
			dao.save(carrito);
		}
		catch(Exception ex) {
			throw ex;
		}
	}

	@Override
	public void delete(Long id) {
		try {
			dao.deleteById(id);
		}
		catch(Exception ex) {
			throw ex;
		}
	}

	@Override
	@Transactional(readOnly=true)
	public List<Carrito> findAll() {
		return (List<Carrito>) dao.findAll();
	}
	
	

}
