package com.example.ventas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "articulo")
public class Articulo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_articulo")
	private int idArticulo;
	@Column(name = "nombre_articulo", nullable = false, length = 50)
	private String nombreArticulo;
	@Column(name = "precio_articulo", nullable = false)
	private double precioArticulo;
	@Column(name = "iva_articulo", nullable = false)
	private int ivaArticulo;
	
	public Articulo() {
	}
	
	public Articulo(int idArticulo) {
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
