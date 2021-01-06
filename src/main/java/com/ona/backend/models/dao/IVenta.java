package com.ona.backend.models.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ona.backend.models.entities.Venta;

public interface IVenta extends CrudRepository<Venta, Long>{
		
	public List<Venta> findAllByUsuarioIdUsuario(Long idUsuario);

}
