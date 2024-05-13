package Modelo;

import java.util.Objects;

public class Pelicula {
	String codPelicula;
	String titulo;
	Genero genero;
	String compañia;
	int añoPublicacion;
	@Override
	public String toString() {
		return "Pelicula [codPelicula=" + codPelicula + ", titulo=" + titulo + ", genero=" + genero + ", compañia="
				+ compañia + ", añoPublicacion=" + añoPublicacion + "]";
	}
	public String getCodPelicula() {
		return codPelicula;
	}
	public String getTitulo() {
		return titulo;
	}
	public Genero getGenero() {
		return genero;
	}
	public String getCompañia() {
		return compañia;
	}
	public int getAñoPublicacion() {
		return añoPublicacion;
	}
	public void setCodPelicula(String codPelicula) {
		this.codPelicula = codPelicula;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}
	public void setAñoPublicacion(int añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}
	public Pelicula(String codPelicula, String titulo, Genero genero, String compañia, int añoPublicacion) {
		this.codPelicula = codPelicula;
		this.titulo = titulo;
		this.genero = genero;
		this.compañia = compañia;
		this.añoPublicacion = añoPublicacion;
	}
	@Override
	public int hashCode() {
		return Objects.hash(codPelicula);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pelicula other = (Pelicula) obj;
		return Objects.equals(codPelicula, other.codPelicula);
	}
	
}
