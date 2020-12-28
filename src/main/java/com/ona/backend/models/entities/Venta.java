package com.ona.backend.models.entities;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Basic;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;

@Table(name="Ventas")
@Entity
public class Venta implements Serializable {
			
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id_venta")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long idVenta;
	
	@Column(name = "fecha_venta")	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Calendar fechaVenta;
	
	@JoinColumn(name="fk_usuario", referencedColumnName="id_usuario")
	@ManyToOne
	private Usuario usuario;
	
	//**Cardinalidad uno a varios 	//mappedBy apunta al nombre del atributo en la clase Negocio
	@OneToMany(mappedBy="venta", fetch=FetchType.LAZY)
	private List<Negocio> negocios;

	public Long getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(Long idVenta) {
		this.idVenta = idVenta;
	}

	public Calendar getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(Calendar fechaVenta) {
		this.fechaVenta = fechaVenta;
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
	
	public Venta() {
		super();
	}

	public Venta(Long idVenta) {
		super();
		this.idVenta = idVenta;
	}
	
}
