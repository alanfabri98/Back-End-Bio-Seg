package com.ona.backend.services.implementations;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ona.backend.models.dao.IVenta;
import com.ona.backend.models.entities.Venta;
import com.ona.backend.services.interfaces.IVentaService;
@Service
public class VentaService implements IVentaService{

	@Autowired //Inyección de dependencias
	private IVenta dao;
	
	@Override
	public void save(Venta venta) {
		try {
			dao.save(venta);
		}
		catch(Exception ex) {
			throw ex;
		}
	}

	@Override
	public Venta findById(Long id) {
		return dao.findById(id).get();
	}
	
	@Override
	public List<Venta> findAll() {
		return (List<Venta>) dao.findAll();
	}	

	@Override
	public List<Venta> findByAllData(Date fecha) {
		return (List<Venta>) dao.findAll();
	}
	
	@Override
	public List<Venta> findByAllDataBetween(Date desde, Date hasta) {
		return (List<Venta>) dao.findAll();
	}
	
	//-----------------------------------------------------------------//
	
	@Override
	public List<Venta> findAllByUsuarioIdUsuario(Long idUsuario) {
		return (List<Venta>) dao.findAllByUsuarioIdUsuario(idUsuario);
	}
	
}
