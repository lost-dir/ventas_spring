package com.example.ventas.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ventas.model.Articulo;
import com.example.ventas.model.bean.ArticuloBean;
//import com.example.ventas.model.bean.UsuarioBean;
import com.example.ventas.repository.ArticuloRepository;
import com.example.ventas.service.ArticuloService;
//import com.example.ventas.service.UsuarioService;

@Service
@Transactional
public class ArticuloServiceImpl implements ArticuloService {
	
	@Autowired
	private ArticuloRepository articuloRepo;

	@Override
	public int saveArticulo(ArticuloBean articuloBean) {
		Articulo articulo = new Articulo();
		articulo.setIdArticulo(articuloBean.getIdArticulo());
		articulo.setNombreArticulo(articuloBean.getNombreArticulo());
		articulo.setPrecioArticulo(articuloBean.getPrecioArticulo());
		articulo.setIvaArticulo(articuloBean.getIvaArticulo());
		
		this.articuloRepo.save(articulo);
		
		return articulo.getIdArticulo();
	}

	@Override
	public int updateArticulo(ArticuloBean articuloBean) {
		Articulo articulo = this.articuloRepo.findById(articuloBean.getIdArticulo()).orElseThrow();
		articulo.setNombreArticulo(articuloBean.getNombreArticulo());
		articulo.setPrecioArticulo(articuloBean.getPrecioArticulo());
		articulo.setIvaArticulo(articuloBean.getIvaArticulo());
		
		this.articuloRepo.save(articulo);
		
		return articulo.getIdArticulo();
	}

	@Override
	public boolean deleteArticulo(int idArticulo) {
		Articulo articulo = this.articuloRepo.findById(idArticulo).orElseThrow();
		this.articuloRepo.delete(articulo);
		return true;
	}

	@Override
	public ArticuloBean getArticulo(int idArticulo) {
		Articulo articulo = this.articuloRepo.findById(idArticulo).orElseThrow();
		ArticuloBean articuloBean = new ArticuloBean();
		
		articuloBean.setIdArticulo(articulo.getIdArticulo());
		articuloBean.setNombreArticulo(articulo.getNombreArticulo());
		articuloBean.setPrecioArticulo(articulo.getPrecioArticulo());
		articuloBean.setIvaArticulo(articulo.getIvaArticulo());
		
		return articuloBean;
	}

	@Override
	public List<ArticuloBean> getAllArticulos() {
		List<Articulo> articuloList = this.articuloRepo.findAll();
		List<ArticuloBean> articuloBeanList = new ArrayList<>();
		
		for(int i = 0; i < articuloList.size(); i++) {
			ArticuloBean articuloBean = new ArticuloBean();
			articuloBean.setIdArticulo(articuloList.get(i).getIdArticulo());
			articuloBean.setNombreArticulo(articuloList.get(i).getNombreArticulo());
			articuloBean.setPrecioArticulo(articuloList.get(i).getPrecioArticulo());
			articuloBean.setIvaArticulo(articuloList.get(i).getIvaArticulo());
			
			articuloBeanList.add(articuloBean);
		}
		return articuloBeanList;
	}
}
