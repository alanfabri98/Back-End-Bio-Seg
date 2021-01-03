package com.ona.backend.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ona.backend.models.dao.IArticulo;
import com.ona.backend.models.entities.Articulo;
import com.ona.backend.services.interfaces.IArticuloService;

@Service
public class ArticuloService implements IArticuloService{
	
	@Autowired
	private IArticulo dao;//Data Access Object

	@Override
	@Transactional(readOnly = true)
	public void save(Articulo article) {
		try {
			dao.save(article);
		}
		catch(Exception ex) {
			throw ex;
		}		
	}

	@Override
	@Transactional(readOnly = true)
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
	@Transactional(readOnly = true)
	public List<Articulo> findAll() {		
		return (List<Articulo>)dao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Articulo> findByCategoria(String categorie) {
		// TODO Auto-generated method stub
		return (List<Articulo>)dao.findByCategoria(categorie);
	}

	@Override
	@Transactional(readOnly = true)
	public Articulo findByNombreArticulo(String name) {
		// TODO Auto-generated method stub
		return dao.findByNombreArticulo(name);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Articulo> findByUsuario(String user) {
		// TODO Auto-generated method stub
		return (List<Articulo>)dao.findByusuario(user);
	}

}
