package com.example.ventas.model.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.validation.constraints.Size;
import com.sun.istack.NotNull;

public class UsuarioBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "id_usuario")
	private int idUsuario;
	@NotNull
	@Column(name = "dir_usuario")
	@Size(max = 50)
	private String dirUsuario;
	@NotNull
	@Column(name = "pass_usuario")
	private String passUsuario;
	@NotNull
	@Column(name = "nombre_usuario")
	@Size(max = 50)
	private String nombreUsuario;
	
	public UsuarioBean() {
	}

	public UsuarioBean(int idUsuario) {
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
