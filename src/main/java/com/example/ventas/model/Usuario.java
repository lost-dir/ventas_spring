package com.example.ventas.model;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	private int idUsuario;
	@Column(name = "dir_usuario", nullable = false, length = 50)
	private String dirUsuario;
	@Column(name = "pass_usuario", nullable = false)
	private String passUsuario;
	@Column(name = "nombre_usuario", nullable = false, length = 50)
	private String nombreUsuario;
	
	public Usuario() {
	}

	public Usuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getDirUsuario() {
		return dirUsuario;
	}

	public void setDirUsuario(String dirUsuario) {
		this.dirUsuario = dirUsuario;
	}

	public String getPassUsuario() {
		return passUsuario;
	}

	public void setPassUsuario(String passUsuario) {
		this.passUsuario = passUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
}
