package Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import Excepciones.ExcepcionClienteNoEncontrado;

public class Cliente {

	private String email;
	private String nombre;
	private String direccion;
	private List<Venta> ventas;

	public Cliente(String email, String nombre, String direccion) {
		this.email = email;
		this.nombre = nombre;
		this.direccion = direccion;
		this.ventas = new ArrayList<>();
	}

	public String getEmail() {
		return email;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public List<Venta> getVentas() {
		return ventas;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}

	public void actualizarDatos(String nuevoNombre, String nuevaDireccion, String nuevoEmail)
			throws ExcepcionClienteNoEncontrado {
		if (!this.email.equals(email)) {
			throw new ExcepcionClienteNoEncontrado("Cliente no encontrado");
		}
		this.nombre = nuevoNombre;
		this.direccion = nuevaDireccion;
		this.email = nuevoEmail;
	}

	public void agregarVenta(Venta venta) {
		this.ventas.add(venta);
	}

	@Override
	public String toString() {
		return "Cliente [email=" + email + ", nombre=" + nombre + ", direccion=" + direccion + ", ventas=" + ventas
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(direccion, email, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(direccion, other.direccion) && Objects.equals(email, other.email)
				&& Objects.equals(nombre, other.nombre);
	}

}
