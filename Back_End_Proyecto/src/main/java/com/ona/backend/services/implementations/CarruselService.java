package com.ona.backend.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ona.backend.models.dao.ICarrusel;
import com.ona.backend.models.entities.Carrusel;
import com.ona.backend.services.interfaces.ICarruselService;

@Service
public class CarruselService implements ICarruselService{

	@Autowired
	private ICarrusel dao; //Data Access Object
	
	@Override
	@Transactional
	public void save(Carrusel carrusel) {
		try {
			dao.save(carrusel);
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
	public Carrusel findById(Long id) {
		return dao.findById(id).get();
	}

	@Override
	@Transactional(readOnly=true)
	public List<Carrusel> findAll() {
		return (List<Carrusel>) dao.findAll();
	}

}
