package com.ona.backend.services.interfaces;

import java.sql.Date;
import java.util.List;

import com.ona.backend.models.entities.Venta;

public interface IVentaService {
	
	public void save(Venta venta);//create-update
	
	public Venta findById(Long id);//retrieve
	
	public List<Venta> findAll();//list
	
	/* Custom Methods */
	public List<Venta> findAllByUsuarioIdUsuario(Long idUsuario);
	
}
