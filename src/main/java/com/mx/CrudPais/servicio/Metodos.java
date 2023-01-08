package com.mx.CrudPais.servicio;

import java.util.List;

import com.mx.CrudPais.dominio.Pais;

public interface Metodos {
	
	public void guardar(Pais pais);
	public void editar(Pais pais);
	public void eliminar(Pais pais);
	public Pais buscar(Pais pais);
	public List<Pais>listar();

}
