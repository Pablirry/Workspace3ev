package Modelo;

import java.util.Date;
import java.util.Objects;
import Excepciones.miExcepcion;

public abstract class Ejemplar {
	String codEjemplar;
	String codPelicula;
	boolean estaDisponible;
	public String getCodEjemplar() {
		return codEjemplar;
	}
	public String getCodPelicula() {
		return codPelicula;
	}
	public boolean isEstaDisponible() {
		return estaDisponible;
	}
	public void setCodEjemplar(String codEjemplar) {
		this.codEjemplar = codEjemplar;
	}
	public void setCodPelicula(String codPelicula) {
		this.codPelicula = codPelicula;
	}
	public void setEstaDisponible(boolean estaDisponible) {
		this.estaDisponible = estaDisponible;
	}
	public Ejemplar(String codEjemplar, String codPelicula) {
		this.codEjemplar = codEjemplar;
		this.codPelicula = codPelicula;
		this.estaDisponible = true;
	}
	public void alquilarEjemplar() throws miExcepcion {
		if(estaDisponible==false) 
			throw new miExcepcion("ERROr ejemplar no disponible");
		estaDisponible=false;
	}
	public void devolverEjemplar() throws miExcepcion {
		if(estaDisponible==true) 
			throw new miExcepcion("ERROr ejemplar no esta en alquiler");
		estaDisponible=true;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(codEjemplar);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ejemplar other = (Ejemplar) obj;
		return Objects.equals(codEjemplar, other.codEjemplar);
	}
	public abstract Date calculaFechaDevolucion(Date fechaAlquiler);
	
}
