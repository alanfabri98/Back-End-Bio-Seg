package com.ona.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ona.backend.models.entities.Categoria;

public interface ICategoria extends CrudRepository<Categoria, Long>{

}
