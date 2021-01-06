package com.ona.backend.services.interfaces;

import com.ona.backend.models.entities.Negocio;
import java.util.List;

public interface INegocioService {

	public void save(Negocio negocio);//create-update
	
	public Negocio findById(Long id);//retrieve
	
	public List<Negocio> findAll();//list
	
	/* Custom Methods */
	public List<Negocio> findAllByVentaIdVenta(Long idVenta);
}
