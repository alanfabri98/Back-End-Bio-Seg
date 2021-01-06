package com.ona.backend.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ona.backend.models.entities.Articulo;

public interface IArticulos extends CrudRepository<Articulo, Long> {

	@Query("SELECT c FROM Articulo c")
	public List<Articulo> findByCategoriaId(Long id);
}
