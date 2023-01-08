package com.mx.CrudPais.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "PAISES86")
public class Pais {
	
	/*
	 * CREATE TABLE PAISES86(
  ID NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(100),
CAPITAL NVARCHAR2(100),
NUMH NUMBER,
IDIOMA NVARCHAR2(100),
MONEDA NVARCHAR2(100),
CONTINENTE NVARCHAR2(100)
);
	 * */
	
	//MAPEAR LA TABLA
	@Id
	@Column(name= "ID", columnDefinition="NUMBER")
	int id;
	@Column(name= "NOMBRE", columnDefinition="NVARCHAR2(100)")
	String nombre;
	@Column(name= "CAPITAL", columnDefinition="NVARCHAR2(100)")
	String capital;
	@Column(name= "NUMH", columnDefinition="NUMBER")
	int numH;
	@Column(name= "IDIOMA", columnDefinition="NVARCHAR2(100)")
	String idioma;
	@Column(name= "MONEDA", columnDefinition="NVARCHAR2(100)")
	String moneda;
	@Column(name= "CONTINENTE", columnDefinition="NVARCHAR2(100)")
	String continente;
	
	public Pais() {
		
	}
	
	public Pais(int id) {
		
		this.id = id;
	}
	

	public Pais(int id, String nombre, String capital, int numH, String idioma, String moneda, String continente) {
		
		this.id = id;
		this.nombre = nombre;
		this.capital = capital;
		this.numH = numH;
		this.idioma = idioma;
		this.moneda = moneda;
		this.continente = continente;
	}

	@Override
	public String toString() {
		return "Pais [id=" + id + ", nombre=" + nombre + ", capital=" + capital + ", numH=" + numH + ", idioma="
				+ idioma + ", moneda=" + moneda + ", continente=" + continente + "]";
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public int getNumH() {
		return numH;
	}

	public void setNumH(int numH) {
		this.numH = numH;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public String getContinente() {
		return continente;
	}

	public void setContinente(String continente) {
		this.continente = continente;
	}
	
	
	
	
	
	
	

}
