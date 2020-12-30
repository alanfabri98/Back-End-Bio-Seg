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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name="Usuarios")
@Entity
public class Usuario implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_usuario")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long idUsuario;
	
	@Column(name = "nombre", length=50)
	private String nombre;
	
	@Column(name = "apellido", length=50)
	private String apellido;
	
	@Column(name = "telefono", length=15)
	private String telefono;
	
	@Column(name = "email", length=30)
	private String email;
	
	@Column(name = "contrasena", length=50)
	private int contrasena;
	
	@Column(name = "estado_usuario")
	private boolean estadoUsuario;
	
	@Column(name = "token", length=999)
	private String token;
	
	@Column(name = "rol", length=10)
	private String rol;
	
	@OneToMany(mappedBy="usuario", fetch=FetchType.LAZY)
	private List<Articulo> articulos;
	
	@OneToMany(mappedBy="usuario", fetch=FetchType.LAZY)
	private List<Venta> ventas;
	
	@OneToMany(mappedBy="usuario", fetch=FetchType.LAZY)
	private List<Carrito> carritos;
	
	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public boolean isEstadoUsuario() {
		return estadoUsuario;
	}

	public void setEstadoUsuario(boolean estadoUsuario) {
		this.estadoUsuario = estadoUsuario;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getContrasena() {
		return contrasena;
	}

	public void setContrasena(int contrasena) {
		this.contrasena = contrasena;
	}

	public boolean isEstado() {
		return estadoUsuario;
	}

	public void setEstado(boolean estado) {
		this.estadoUsuario = estado;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}
	
	public List<Articulo> getArticulos() {
		return articulos;
	}

	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}

	public List<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}

	public List<Carrito> getCarritos() {
		return carritos;
	}

	public void setCarritos(List<Carrito> carritos) {
		this.carritos = carritos;
	}

	public Usuario(Long idUsuario) {
		super();
		this.idUsuario = idUsuario;
	}
	
	public Usuario() {
		super();
	}

	public Long getIdStudent() {
		return idUsuario;
	}
	
}
