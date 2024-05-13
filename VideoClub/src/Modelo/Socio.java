package Modelo;

import Excepciones.miExcepcion;

public class Socio implements Comparable<Socio>{
	int codSocio;
	String nombre;
	public Socio(int codSocio) throws miExcepcion {
		if(codSocio<1000000 || codSocio>9999999) {
			throw new miExcepcion("Error codigo de socio incorrecto");
		}
		this.codSocio = codSocio;
		this.nombre = "";
	}
	public Socio(int codSocio, String nombre) throws miExcepcion {
		if(codSocio<1000000 || codSocio>9999999) {
			throw new miExcepcion("Error codigo de socio incorrecto");
		}
		this.codSocio = codSocio;
		this.nombre = nombre;
	}
	public int getCodSocio() {
		return codSocio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setCodSocio(int codSocio) {
		this.codSocio = codSocio;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Socio [codSocio=" + codSocio + ", nombre=" + nombre + "]";
	}
	@Override
	public int compareTo(Socio s) {
		// TODO Auto-generated method stub
		if(this.codSocio==s.codSocio) return 0;
		else if(this.codSocio<s.codSocio) return -1;
		else return 1;
	}
	
}
