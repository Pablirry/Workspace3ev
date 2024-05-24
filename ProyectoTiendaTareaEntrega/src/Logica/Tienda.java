package Logica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import Excepciones.*;

import Modelo.*;

public class Tienda {

	private Map<String, Cliente> clientes;
	private List<Producto> productos;
	private Set<Venta> ventas;

	public Tienda() {
		this.clientes = new HashMap<>();
		this.productos = new ArrayList<>();
		this.ventas = new HashSet<>();
	}

	public void agregarCliente(Cliente cliente) {
		this.clientes.put(cliente.getEmail(), cliente);
	}

	public void modificarCliente(String email, String nuevoNombre, String nuevaDireccion, String nuevoEmail)
			throws ExcepcionClienteNoEncontrado {
		if (this.clientes.containsKey(email)) {
			Cliente cliente = this.clientes.get(email);
			cliente.actualizarDatos(nuevoNombre, nuevaDireccion, nuevoEmail);
			this.clientes.put(nuevoEmail, cliente);
			if (!email.equals(nuevoEmail)) {
				this.clientes.remove(email);
			}
		} else {
			throw new ExcepcionClienteNoEncontrado("Cliente no encontrado");
		}
	}

	public void borrarCliente(String email) throws ExcepcionClienteNoEncontrado {
		if (this.clientes.containsKey(email)) {
			this.clientes.remove(email);
		} else {
			throw new ExcepcionClienteNoEncontrado("Cliente no encontrado");
		}
	}

	public void listarClientes() {
		for (Cliente c : this.clientes.values()) {
			System.out.println(c.getEmail() + " - " + c.getNombre() + " - " + c.getDireccion());
		}
	}

	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}

	public void modificarProducto(String codigo, String nuevoNombre, double nuevoPrecio, int nuevoStock)
			throws ExcepcionProductoNoEncontrado {
		for (Producto p : this.productos) {
			if (p.getCodigo().equals(codigo)) {
				p.setNombre(nuevoNombre);
				p.setPrecio(nuevoPrecio);
				p.setStock(nuevoStock);
				return;
			}
		}
		throw new ExcepcionProductoNoEncontrado("Producto no encontrado");
	}

	public void borrarProducto(String codigo) throws ExcepcionProductoNoEncontrado {
		for (Producto p : this.productos) {
			if (p.getCodigo().equals(codigo)) {
				this.productos.remove(p);
				return;
			}
		}
		throw new ExcepcionProductoNoEncontrado("Producto no encontrado");
	}

	public void listarProductos() {
		for (Producto p : this.productos) {
			System.out.println(p.getCodigo() + " - " + p.getNombre() + " - " + p.getPrecio() + " - " + p.getStock());
		}
	}

	public void agregarVenta(Venta venta) {
		this.ventas.add(venta);
	}

	public void modificarVenta(Venta venta, Cliente nuevoCliente, Producto nuevoProducto, int nuevaCantidad)
			throws ExcepcionClienteNoEncontrado, ExcepcionProductoNoEncontrado, ExcepcionStockInsuficiente,
			ExcepcionVentaNoEncontrada {
		for (Venta v : this.ventas) {
			if (v.getCliente().getEmail().equals(venta.getCliente().getEmail())
					&& v.getProducto().getCodigo().equals(venta.getProducto().getCodigo())) {
				v.setCliente(nuevoCliente);
				v.setProducto(nuevoProducto);
				v.setCantidad(nuevaCantidad);
				return;
			}
		}
		throw new ExcepcionVentaNoEncontrada("Venta no encontrada");
	}

	public void borrarVenta(Venta venta) throws ExcepcionVentaNoEncontrada {
		if (this.ventas.contains(venta)) {
			this.ventas.remove(venta);
		} else {
			throw new ExcepcionVentaNoEncontrada("Venta no encontrada");
		}
	}

	public void listarVentas() {
		for (Venta v : this.ventas) {
			System.out
					.println(v.getCliente().getEmail() + " - " + v.getProducto().getCodigo() + " - " + v.getCantidad());
		}
	}

	@Override
	public String toString() {
		return "Tienda [clientes=" + clientes + ", productos=" + productos + ", ventas=" + ventas + "]";
	}

}
