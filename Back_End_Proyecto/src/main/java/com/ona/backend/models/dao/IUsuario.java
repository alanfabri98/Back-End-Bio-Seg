package com.ona.backend.models.dao;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ona.backend.models.entities.Usuario;

public interface IUsuario extends CrudRepository<Usuario, Long>{

	@Query("SELECT us FROM Usuario us WHERE us.nombre = :criteria")
	public Usuario buscarPorNombre(String criteria);
	
	public Usuario findByRol(String role);			

}
