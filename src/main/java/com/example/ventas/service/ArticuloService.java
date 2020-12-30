package com.example.ventas.service;

import java.util.List;
import com.example.ventas.model.bean.ArticuloBean;

public interface ArticuloService {
	public int saveArticulo(ArticuloBean articuloBean);
	public int updateArticulo(ArticuloBean articuloBean);
	public boolean deleteArticulo(int idArticulo);
	public ArticuloBean getArticulo(int idArticulo);
	public List<ArticuloBean> getAllArticulos();
}
