package com.ona.backend.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ona.backend.models.entities.Articulo;

public interface IArticulo extends CrudRepository<Articulo, Long>{
 
	public Articulo findByNombreArticulo(String criteria);
	
	public List<Articulo> findByusuario(String user);
	
	@Query("SELECT ca FROM Categoria ca WHERE ca.nombreCategoria = :categorie ORDER BY ca.nombreCategoria") //JPQL
	public List<Articulo> findByCategoria(String categorie);
}
