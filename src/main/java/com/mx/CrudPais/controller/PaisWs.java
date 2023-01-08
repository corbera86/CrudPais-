package com.mx.CrudPais.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.CrudPais.dominio.Pais;
import com.mx.CrudPais.servicio.Metodos;

@RestController // estereotipos o anotaciones
@RequestMapping("PaisWs")  // es el path de mi clase
@CrossOrigin // este es un concepto de seguridad que brinda permisos para que no  nos bloqueee las peticiones
public class PaisWs {
	
	// tipos de peticiones get , post, put, view, delete.....
	
	@Autowired
	Metodos metodo;
	// url --> http://localhost:9000/PaisWs/listar
	@RequestMapping("listar")
	public List<Pais>listar() {
		List<Pais> lista = metodo.listar();
		
		
		return lista ;
	}
	
	// url --> http://localhost:9000/PaisWs/guardar
	@PostMapping("guardar")
	public void guardar(@RequestBody Pais pais) {  // @RequestBody --> este hace que convierte un json en objeto
		metodo.guardar(pais);
		
	}
	
	// url --> http://localhost:9000/PaisWs/editar
	@PostMapping("editar")
	public void editar(@RequestBody Pais pais) {
		metodo.editar(pais);
	}
	
	// url --> http://localhost:9000/PaisWs/eliminar
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Pais pais) {
		metodo.eliminar(pais);
	}
	
	// url --> http://localhost:9000/PaisWs/buscar
	@PostMapping("buscar")
	public Pais buscar(@RequestBody Pais pais) {
		pais = metodo.buscar(pais);
		
		return pais;
	}

}
