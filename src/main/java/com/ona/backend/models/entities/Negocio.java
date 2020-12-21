package com.ona.backend.models.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import javax.persistence.Column;
import javax.persistence.Basic;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.GeneratedValue;

import java.io.Serializable;

@Table(name="Negocios")
@Entity
public class Negocio implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_negocio")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long idNegocio;
	
	@Column(name = "cantidad")
	private int cantidad;
	
	@Column(name = "precio", length=20)
	private float precio;
	
	@Column(name = "sub_total", length=20)
	private float subTotal;
	
	@Column(name = "total", length=20)
	private float total;
	
	@Column(name = "estado")
	private boolean estado;
	
	@JoinColumn(name="fk_venta", referencedColumnName="id_venta")
	@ManyToOne
	private Venta venta;
	
	@JoinColumn(name="fk_carrito", referencedColumnName="id_carrito")
	@ManyToOne
	private Carrito carrito;
		
	public Long getIdNegocio() {
		return idNegocio;
	}

	public void setIdNegocio(Long idNegocio) {
		this.idNegocio = idNegocio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public float getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(float subTotal) {
		this.subTotal = subTotal;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}
	
	public Negocio() {
		super();
	}
	
	public Negocio(Long idNegocio) {
		super();
		this.idNegocio = idNegocio;
	}

	public Carrito getCarrito() {
		return carrito;
	}

	public void setCarrito(Carrito carrito) {
		this.carrito = carrito;
	}
	
	
	
}
