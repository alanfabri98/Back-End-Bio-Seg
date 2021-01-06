package com.ona.backend.models.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ona.backend.models.entities.Negocio;

public interface INegocio extends CrudRepository<Negocio, Long>{

	//public List<Venta> findAllByUsuarioIdUsuario(Long idUsuario);
	public List<Negocio> findAllByVentaIdVenta(Long idVenta);
	
}
