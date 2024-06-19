package Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Socio {

	private int codSocio;
	private String nombre;
	private String apellidos;
	private String telefono;
	private List<Libro> prestamos;

	public Socio(int codSocio, String nombre, String apellidos, String telefono) {
		this.codSocio = codSocio;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.prestamos = new ArrayList<Libro>();
	}

	public int getCodSocio() {
		return codSocio;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public List<Libro> getPrestamos() {
		return prestamos;
	}

	public void setCodSocio(int codSocio) {
		this.codSocio = codSocio;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setPrestamos(List<Libro> prestamos) {
		this.prestamos = prestamos;
	}

	public void addPrestamo(Libro libro) {
		prestamos.add(libro);
	}

	public void removePrestamos(Libro libro) {
		prestamos.remove(libro);
	}

	@Override
	public String toString() {
		return "Socio{" + "numero=" + codSocio + ", nombre= " + nombre + ", apellidos='" + apellidos + ", telefono= " + telefono + '}';
	}
}
