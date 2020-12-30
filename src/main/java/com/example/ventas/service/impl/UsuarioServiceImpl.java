package com.example.ventas.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ventas.model.Usuario;
import com.example.ventas.model.bean.UsuarioBean;
import com.example.ventas.service.UsuarioService;
import com.example.ventas.repository.UsuarioRepository;

@Service
@Transactional
public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	private UsuarioRepository usuarioRepo;
	
	@Override
	public int updateUser(UsuarioBean usuarioBean) {
		Usuario usuario = this.usuarioRepo.findById(usuarioBean.getIdUsuario()).orElseThrow();
		usuario.setNombreUsuario(usuarioBean.getNombreUsuario());
		usuario.setPassUsuario(usuarioBean.getPassUsuario());
		usuario.setDirUsuario(usuarioBean.getDirUsuario());
		
		this.usuarioRepo.save(usuario);
		
		return usuario.getIdUsuario();
	}

	@Override
	public int saveUser(UsuarioBean usuarioBean) {
		Usuario usuario = new Usuario();
		usuario.setNombreUsuario(usuarioBean.getNombreUsuario());
		usuario.setPassUsuario(usuarioBean.getPassUsuario());
		usuario.setDirUsuario(usuarioBean.getDirUsuario());
		
		this.usuarioRepo.save(usuario);
		
		return usuario.getIdUsuario();
	}

	@Override
	public UsuarioBean getUser(int idUsuario) {
		Usuario usuario = this.usuarioRepo.findById(idUsuario).orElseThrow();
		UsuarioBean usuarioBean = new UsuarioBean();
		usuarioBean.setIdUsuario(usuario.getIdUsuario());
		usuarioBean.setNombreUsuario(usuario.getNombreUsuario());
		usuarioBean.setPassUsuario(usuario.getPassUsuario());
		usuarioBean.setDirUsuario(usuario.getDirUsuario());
		return usuarioBean;
	}

	@Override
	public boolean deleteUser(int idUsuario) {
		Usuario usuario = this.usuarioRepo.findById(idUsuario).orElseThrow();
		this.usuarioRepo.delete(usuario);
		return true;
	}

	@Override
	public List<UsuarioBean> getAllUsers() {
		List<Usuario> usuarioList = this.usuarioRepo.findAll();
		List<UsuarioBean> usuarioBeanList = new ArrayList<>();
		
		for(int i = 0; i < usuarioList.size(); i++) {
			UsuarioBean usuarioBean = new UsuarioBean();
			usuarioBean.setIdUsuario(usuarioList.get(i).getIdUsuario());
			usuarioBean.setNombreUsuario(usuarioList.get(i).getNombreUsuario());
			usuarioBean.setPassUsuario(usuarioList.get(i).getPassUsuario());
			usuarioBean.setDirUsuario(usuarioList.get(i).getDirUsuario());
			
			usuarioBeanList.add(usuarioBean);
		}
		return usuarioBeanList;
	}

}
