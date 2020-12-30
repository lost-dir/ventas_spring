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
import com.example.ventas.model.bean.UsuarioBean;
import com.example.ventas.service.impl.UsuarioServiceImpl;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioServiceImpl usuarioService;
	
	@PostMapping("/saveUser")
	public ResponseEntity<Integer> saveUser(@Valid @RequestBody UsuarioBean usuarioBean){
		return new ResponseEntity<Integer>(this.usuarioService.saveUser(usuarioBean), HttpStatus.OK);
	}
	
	@PutMapping("/updateUser")
	public ResponseEntity<Integer> updateUser(@Valid @RequestBody UsuarioBean usuarioBean){
		return new ResponseEntity<Integer>(this.usuarioService.updateUser(usuarioBean), HttpStatus.OK);
	}
	
	@DeleteMapping("deleteUser/{idUsuario}")
	public ResponseEntity<Boolean> deleteUser(@PathVariable("idUsuario") int idUsuario){
		return new ResponseEntity<Boolean>(this.usuarioService.deleteUser(idUsuario), HttpStatus.OK);
	}
	
	@GetMapping("getUser/{idUsuario}")
	public ResponseEntity<UsuarioBean> getUser(@PathVariable("idUsuario") int idUsuario){
		return new ResponseEntity<UsuarioBean>(this.usuarioService.getUser(idUsuario), HttpStatus.OK);
	}
	
	@GetMapping("/getUsers")
	public ResponseEntity<List<UsuarioBean>> getUsers(){
		return new ResponseEntity<>(this.usuarioService.getAllUsers(), HttpStatus.OK);
	}
}
