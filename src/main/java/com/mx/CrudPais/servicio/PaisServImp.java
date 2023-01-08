package com.mx.CrudPais.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.CrudPais.dao.PaisDao;
import com.mx.CrudPais.dominio.Pais;

@Service
public class PaisServImp implements Metodos {

	@Autowired // con este se realiza la innyeccion de dependencias
	PaisDao paisDao;
	
	@Override
	public void guardar(Pais pais) {
		// TODO Auto-generated method stub
		paisDao.save(pais);
	}

	@Override
	public void editar(Pais pais) {
		// TODO Auto-generated method stub
		paisDao.save(pais);
	}

	@Override
	public void eliminar(Pais pais) {
		// TODO Auto-generated method stub
		paisDao.delete(pais);
	}

	@Override
	public Pais buscar(Pais pais) {
		// TODO Auto-generated method stub
		return paisDao.findById(pais.getId()).orElse(null);
	}

	@Override
	public List<Pais> listar() {
		// TODO Auto-generated method stub
		return (List<Pais>) paisDao.findAll();
	}

}
