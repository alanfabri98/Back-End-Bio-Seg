package com.ona.backend.models.entities;

import java.io.Serializable;
import java.util.Calendar;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Table(name="Articulos")
@Entity
public class Articulo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_articulo")
	private Long idArticulo;
	
	@Column(name = "nombre_articulo", length=100)
	private String nombreArticulo;
	
	@Column(name = "precio", length=20)
	private float precio;
	
	@Column(name = "detalle", length=999)
	private String detalle;
	
	@Column(name = "fecha_registro")	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Calendar fechaRegistro;
	
	@Column(name = "url_imagen", length=999)
	private String urlImagen;
	
	@Column(name = "cantidad")
	private int cantidad;
	
	@Column(name = "estado_articulo")
	private boolean estadoArticulo;
	
	@JoinColumn(name="fk_usuario", referencedColumnName="id_usuario")
	@ManyToOne
	private Usuario usuario;
	
	@JoinColumn(name="fk_categoria", referencedColumnName="id_categoria")
	@ManyToOne
	private Categoria categoria;
	
	@JsonIgnore
	@OneToMany(mappedBy="articulo", fetch=FetchType.LAZY)
	private List<Carrito> carritos;

	public Long getIdArticulo() {
		return idArticulo;
	}

	public void setIdArticulo(Long idArticulo) {
		this.idArticulo = idArticulo;
	}

	public String getNombreArticulo() {
		return nombreArticulo;
	}

	public void setNombreArticulo(String nombreArticulo) {
		this.nombreArticulo = nombreArticulo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public Calendar getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Calendar fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String getUrlImagen() {
		return urlImagen;
	}

	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public boolean isEstadoArticulo() {
		return estadoArticulo;
	}

	public void setEstadoArticulo(boolean estadoArticulo) {
		this.estadoArticulo = estadoArticulo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<Carrito> getCarritos() {
		return carritos;
	}

	public void setCarritos(List<Carrito> carritos) {
		this.carritos = carritos;
	}

	public Articulo() {
		super();
	}
	
	public Articulo(Long idArticulo) {
		super();
		this.idArticulo = idArticulo;
	}
		
}