package com.ona.backend.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.ona.backend.models.dao.INegocio;
import com.ona.backend.models.entities.Negocio;
import com.ona.backend.models.entities.Venta;
import com.ona.backend.services.interfaces.INegocioService;

public class NegocioService implements INegocioService{

	@Autowired //Inyección de dependencias
	private INegocio dao;
	
	@Override
	public void save(Negocio negocio) {
		try {
			dao.save(negocio);
		}
		catch(Exception ex) {
			throw ex;
		}
	}
	
	@Override
	@Transactional(readOnly=true)
	public Negocio findById(Long id) {
		return dao.findById(id).get();
	}

	@Override
	@Transactional(readOnly=true)
	public List<Negocio> findAll() {
		return (List<Negocio>) dao.findAll();
	}

}
