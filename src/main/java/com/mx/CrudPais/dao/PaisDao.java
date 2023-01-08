package com.mx.CrudPais.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.CrudPais.dominio.Pais;
// CrudRepository ---> es una clase que contiene todos los metodos del crud para cualquier a plicacion --> es decir ya es generico
public interface PaisDao extends CrudRepository<Pais, Integer> {

}
