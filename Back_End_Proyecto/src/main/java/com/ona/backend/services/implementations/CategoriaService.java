package com.ona.backend.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ona.backend.models.dao.ICategoria;
import com.ona.backend.models.entities.Categoria;
import com.ona.backend.services.interfaces.ICategoriaServicio;

@Service
public class CategoriaService implements ICategoriaServicio{

	@Autowired
	private ICategoria dao;
	
	@Override
	public void save(Categoria category) {
		dao.save(category);
	}

	@Override
	public Categoria findById(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		dao.deleteById(id);
	}

	@Override
	public List<Categoria> findAll() {
		// TODO Auto-generated method stub
		return (List<Categoria>) dao.findAll();
	}

}
