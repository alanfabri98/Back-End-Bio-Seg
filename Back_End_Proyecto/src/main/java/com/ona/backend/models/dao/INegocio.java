package com.ona.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ona.backend.models.entities.Negocio;

public interface INegocio extends CrudRepository<Negocio, Long>{

}
