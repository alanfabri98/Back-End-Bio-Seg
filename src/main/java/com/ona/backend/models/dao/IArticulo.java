package com.ona.backend.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ona.backend.models.entities.Articulo;

public interface IArticulo extends CrudRepository<Articulo, Long>{
 
	public Articulo findBynombre_articulo(String criteria);
	
	public List<Articulo> findByusuario(String user);
	
	@Query("SELECT ca FROM Categorias ca WHERE ca.nombre_categoria = :categorie ORDER BY ca.nombre_categoria") //JPQL
	public List<Articulo> findByCategoria(String categorie);
}
