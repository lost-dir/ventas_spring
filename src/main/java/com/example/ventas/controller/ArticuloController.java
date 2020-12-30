package com.example.ventas.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ventas.model.bean.ArticuloBean;
import com.example.ventas.service.impl.ArticuloServiceImpl;

@RestController
@RequestMapping("/articulo")
public class ArticuloController {
	
	@Autowired
	private ArticuloServiceImpl articuloService;
	
	@PostMapping("/saveArticulo")
	public ResponseEntity<Integer> saveUser(@Valid @RequestBody ArticuloBean articuloBean){
		return new ResponseEntity<Integer>(this.articuloService.saveArticulo(articuloBean), HttpStatus.OK);
	}
	
	@PutMapping("/updateArticulo")
	public ResponseEntity<Integer> updateUser(@Valid @RequestBody ArticuloBean articuloBean){
		return new ResponseEntity<Integer>(this.articuloService.updateArticulo(articuloBean), HttpStatus.OK);
	}
	
	@DeleteMapping("deleteArticulo/{idArticulo}")
	public ResponseEntity<Boolean> deleteArticulo(@PathVariable("idArticulo") int idArticulo){
		return new ResponseEntity<Boolean>(this.articuloService.deleteArticulo(idArticulo), HttpStatus.OK);
	}
	
	@GetMapping("getArticulo/{idUsuario}")
	public ResponseEntity<ArticuloBean> getArticulo(@PathVariable("idUsuario") int idArticulo){
		return new ResponseEntity<ArticuloBean>(this.articuloService.getArticulo(idArticulo), HttpStatus.OK);
	}
	
	@GetMapping("/getArticulos")
	public ResponseEntity<List<ArticuloBean>> getArticulos(){
		return new ResponseEntity<List<ArticuloBean>>(this.articuloService.getAllArticulos(), HttpStatus.OK);
	}
}
