package com.ona.backend.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ona.backend.models.dao.IUsuario;
import com.ona.backend.models.entities.Usuario;
import com.ona.backend.services.interfaces.IUsuarioService;

@Service
public class UsuarioService implements IUsuarioService {
	
	@Autowired
	private IUsuario dao;

	@Override
	public void save(Usuario user) {
		dao.save(user);		
	}

	@Override
	public Usuario findById(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		dao.deleteById(id);
	}

	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return (List<Usuario>) dao.findAll();
	}

}
