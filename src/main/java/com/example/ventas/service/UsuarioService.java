package com.example.ventas.service;

import java.util.List;
import com.example.ventas.model.bean.UsuarioBean;

public interface UsuarioService{
	public int updateUser(UsuarioBean usuarioBean);
	public int saveUser(UsuarioBean usuarioBean);
	public UsuarioBean getUser(int idUsuario);
	public boolean deleteUser(int idUsuario);
	public List<UsuarioBean> getAllUsers();
}
