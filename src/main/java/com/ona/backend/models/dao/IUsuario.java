package com.ona.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ona.backend.models.entities.Usuario;

public interface IUsuario extends CrudRepository<Usuario, Long>{

}
