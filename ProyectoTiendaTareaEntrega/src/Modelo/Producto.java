package Modelo;

import Excepciones.ExcepcionStockInsuficiente;

public class Producto {

	private String codigo;
	private String nombre;
	private double precio;
	private int stock;

	public Producto(String codigo, String nombre, double precio, int stock) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}

	public void restarStock(int cantidad) throws ExcepcionStockInsuficiente {
		if (this.stock - cantidad < 0) {
			throw new ExcepcionStockInsuficiente("Stock insuficiente");
		}
		this.stock -= cantidad;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public int getStock() {
		return stock;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + "]";
	}

}
