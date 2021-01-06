package com.ona.backend.models.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name="Carritos")
@Entity
public class Carrito implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_carrito")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long idCarrito;
	
	@Column(name = "estado_carrito")
	private boolean estadoCarrito;
	
	@JoinColumn(name="fk_articulo", referencedColumnName="id_articulo")
	@ManyToOne
	private Articulo articulo;
	
	@JoinColumn(name="fk_usuario", referencedColumnName="id_usuario")
	@ManyToOne
	private Usuario usuario;
	
	@OneToMany(mappedBy="carrito", fetch=FetchType.LAZY)
	private List<Negocio> negocios;
	
	public Carrito() {
		super();
	}
	
	public Carrito(Long id) {
		super();
		this.idCarrito = id;
	}

	public Long getIdCarrito() {
		return idCarrito;
	}

	public void setIdCarrito(Long idCarrito) {
		this.idCarrito = idCarrito;
	}

	public boolean isEstadoCarrito() {
		return estadoCarrito;
	}

	public void setEstadoCarrito(boolean estadoCarrito) {
		this.estadoCarrito = estadoCarrito;
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Negocio> getNegocios() {
		return negocios;
	}

	public void setNegocios(List<Negocio> negocios) {
		this.negocios = negocios;
	}
	
	
	
}
