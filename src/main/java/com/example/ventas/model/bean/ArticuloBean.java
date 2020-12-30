package com.example.ventas.model.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

public class ArticuloBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "id_articulo")
	private int idArticulo;
	@NotNull
	@Column(name = "nombre_articulo")
	@Size(max = 50)
	private String nombreArticulo;
	@NotNull
	@Column(name = "precio_articulo")
	private double precioArticulo;
	@NotNull
	@Column(name = "iva_articulo")
	private int ivaArticulo;
	
	public ArticuloBean() {
	}
	
	public ArticuloBean(int idArticulo) {
		this.idArticulo = idArticulo;
	}

	public int getIdArticulo() {
		return idArticulo;
	}

	public void setIdArticulo(int idArticulo) {
		this.idArticulo = idArticulo;
	}

	public String getNombreArticulo() {
		return nombreArticulo;
	}

	public void setNombreArticulo(String nombreArticulo) {
		this.nombreArticulo = nombreArticulo;
	}

	public double getPrecioArticulo() {
		return precioArticulo;
	}

	public void setPrecioArticulo(double precioArticulo) {
		this.precioArticulo = precioArticulo;
	}

	public int getIvaArticulo() {
		return ivaArticulo;
	}

	public void setIvaArticulo(int ivaArticulo) {
		this.ivaArticulo = ivaArticulo;
	}
}
