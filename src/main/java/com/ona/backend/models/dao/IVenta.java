package com.ona.backend.models.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ona.backend.models.entities.Venta;

public interface IVenta extends CrudRepository<Venta, Long>{
	
	public List<Venta> findAllByUsuarioIdUsuario(int idUsuario);
	//@Query("select vt from Venta vt where vt.usuario.idUsuario = :idUsuario") //JPQL
	//public List<Venta> findAllByUsuarioIdUsuario(int idUsuario);
	
	//@Query("select st from Student st where st.sex = :gender order by st.lastName") //JPQL
	/*
	public List<Venta> findAllByUsuarioIdUsuarioAndDate( int idUsuario, Date fecha );//list
		
	public List<Venta> findAllByUsuarioIdUsuarioAndDateBetween(int idUsuario, Date desde, Date hasta);
	*/
}
