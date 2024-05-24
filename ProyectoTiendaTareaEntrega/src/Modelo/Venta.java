package Modelo;

import Excepciones.*;

public class Venta {

	private Cliente cliente;
	private Producto producto;
	private int cantidad;
	private double precioTotal;

	public Venta(Cliente cliente, Producto producto, int cantidad) {
		this.cliente = cliente;
		this.producto = producto;
		this.cantidad = cantidad;
		this.precioTotal = producto.getPrecio() * cantidad;
	}

	public void realizarVenta()
			throws ExcepcionClienteNoEncontrado, ExcepcionProductoNoEncontrado, ExcepcionStockInsuficiente {
		if (!cliente.getEmail().equals(this.cliente.getEmail())) {
			throw new ExcepcionClienteNoEncontrado("Cliente no encontrado");
		}
		if (!producto.getCodigo().equals(this.producto.getCodigo())) {
			throw new ExcepcionProductoNoEncontrado("Producto no encontrado");
		}
		producto.restarStock(cantidad);
		this.precioTotal = producto.getPrecio() * cantidad;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Producto getProducto() {
		return producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	@Override
	public String toString() {
		return "Venta [cliente=" + cliente + ", producto=" + producto + ", cantidad=" + cantidad + ", precioTotal="
				+ precioTotal + "]";
	}

}
