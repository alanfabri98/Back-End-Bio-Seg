package com.ona.backend.models.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Carrusels")
@Entity
public class Carrusel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_carrusel")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long idCarrusel;
	
	@Column(name = "url_imagen", length=999)
	private String urlImagen;
	
	public Long getIdCarrusel() {
		return idCarrusel;
	}

	public void setIdCarrusel(Long idCarrusel) {
		this.idCarrusel = idCarrusel;
	}

	public String getUrlImagen() {
		return urlImagen;
	}

	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}

	public Carrusel() {
		super();
	}

	public Carrusel(Long idCarrusel) {
		super();
		this.idCarrusel = idCarrusel;
	}
	
}
