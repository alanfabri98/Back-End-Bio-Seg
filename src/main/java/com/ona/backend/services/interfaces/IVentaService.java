package com.ona.backend.services.interfaces;

import java.sql.Date;
import java.util.List;

import com.ona.backend.models.entities.Venta;

public interface IVentaService {
	
	public void save(Venta venta);//create-update
	
	public Venta findById(Long id);//retrieve
	
	public List<Venta> findAll();//list
	
	public List<Venta> findByAllData( Date fecha );//list
	
	public List<Venta> findByAllDataBetween( Date desde, Date hasta );//list
	
	/* Custom Methods */	
	/*
	public List<Venta> findAllByUsuarioIdUsuarioAndDate( int idUsuario, Date fecha );//list

	public List<Venta> findAllByUsuarioIdUsuarioAndDateBetween(int idUsuario, Date desde, Date hasta);
	*/
	public List<Venta> findAllByUsuarioIdUsuario(int idUsuario);
	
}
