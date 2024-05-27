package Interfaz;

import java.util.Scanner;

import Excepciones.ExcepcionClienteNoEncontrado;
import Excepciones.ExcepcionProductoNoEncontrado;
import Logica.Tienda;
import Modelo.Cliente;
import Modelo.Producto;

public class Principal {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Tienda t = cargarDatos();

		int opcion = menuPrincipal();
		while (opcion != 0) {
			switch (opcion) {
			case 1:
				menuClientes(t);
				break;
			case 2:
				menuProductos(t);
				break;
			case 3:
				menuVentas(t);
				break;
			}
			opcion = menuPrincipal();
		}

	}

	private static Tienda cargarDatos() {
		Tienda t = new Tienda();

		Cliente cliente1 = new Cliente("email", "Cliente 1", "Dirección 1");
		Cliente cliente2 = new Cliente("email", "Cliente 2", "Dirección 2");
		Cliente cliente3 = new Cliente("email", "Cliente 3", "Dirección 3");

		try {
			t.agregarCliente(cliente1);
			t.agregarCliente(cliente2);
			t.agregarCliente(cliente3);
		} catch (Exception e) {
			System.err.println("Error al agregar clientes: " + e.getMessage());
		}
		Producto producto1 = new Producto("producto1", "Producto 1", 10.0, 5);
		Producto producto2 = new Producto("producto2", "Producto 2", 20.0, 3);
		Producto producto3 = new Producto("producto3", "Producto 3", 30.0, 7);

		try {
			t.agregarProducto(producto1);
			t.agregarProducto(producto2);
			t.agregarProducto(producto3);
		} catch (Exception e) {
			System.err.println("Error al agregar productos: " + e.getMessage());
		}
		return t;
	}

	private static int menuPrincipal() {
		System.out.println("1. Clientes");
		System.out.println("2. Productos");
		System.out.println("3. Ventas");
		System.out.println("0. Salir");
		System.out.print("Seleccione una opción: ");
		return scanner.nextInt();
	}

	private static void menuClientes(Tienda t) {
		int opcion = menuClientesSecundario();
		while (opcion != 0) {
			switch (opcion) {
			case 1:
				t.listarClientes();
				break;
			case 2:
				System.out.print("Ingrese el email del cliente: ");
				String email = scanner.nextLine();
				System.out.print("Ingrese el nuevo nombre: ");
				String nuevoNombre = scanner.nextLine();
				System.out.print("Ingrese la nueva dirección: ");
				String nuevaDireccion = scanner.nextLine();
				try {
					t.modificarCliente(email, nuevoNombre, nuevaDireccion, email);
				} catch (ExcepcionClienteNoEncontrado e) {
					System.err.println(e.getMessage());
				}
				break;
			case 3:
				System.out.print("Ingrese el email del cliente: ");
				String emailBorrar = scanner.nextLine();
				try {
					t.borrarCliente(emailBorrar);
				} catch (ExcepcionClienteNoEncontrado e) {
					System.err.println(e.getMessage());
				}
				break;
			}
			opcion = menuClientesSecundario();
		}
	}

	private static int menuClientesSecundario() {
		System.out.println("1. Listar clientes");
		System.out.println("2. Modificar cliente");
		System.out.println("3. Borrar cliente");
		System.out.println("0. Volver al menú principal");
		System.out.print("Seleccione una opción: ");
		return scanner.nextInt();
	}

	private static void menuProductos(Tienda t) {
		int opcion = menuProductosSecundario();
		while (opcion != 0) {
			switch (opcion) {
			case 1:
				t.listarProductos();
				break;
			case 2:
				System.out.print("Ingrese el código del producto: ");
				String codigo = scanner.nextLine();
				System.out.print("Ingrese el nuevo nombre: ");
				String nuevoNombre = scanner.nextLine();
				System.out.print("Ingrese el nuevo precio: ");
				double nuevoPrecio = scanner.nextDouble();
				System.out.print("Ingrese el nuevo stock: ");
				int nuevoStock = scanner.nextInt();
				try {
					t.modificarProducto(codigo, nuevoNombre, nuevoPrecio, nuevoStock);
				} catch (ExcepcionProductoNoEncontrado e) {
					System.err.println(e.getMessage());
				}
				break;
			case 3:
				System.out.print("Ingrese el código del producto: ");
				String codigoBorrar = scanner.nextLine();
				try {
					t.borrarProducto(codigoBorrar);
				} catch (ExcepcionProductoNoEncontrado e) {
					System.err.println(e.getMessage());
				}
				break;
			}
			opcion = menuProductosSecundario();
		}
	}

	private static int menuProductosSecundario() {
		System.out.println("1. Listar productos");
		System.out.println("2. Modificar producto");
		System.out.println("3. Borrar producto");
		System.out.println("0. Volver al menú principal");
		System.out.print("Seleccione una opción: ");
		return scanner.nextInt();
	}

	private static void menuVentas(Tienda t) {
		int opcion = menuVentasSecundario();
		while (opcion != 0) {
			switch (opcion) {
			case 1:
				t.listarVentas();
				break;
			}
			opcion = menuVentasSecundario();
		}
	}

	private static int menuVentasSecundario() {
		System.out.println("1. Listar ventas");
		System.out.println("0. Volver al menú principal");
		System.out.print("Seleccione una opción: ");
		return scanner.nextInt();
	}

}
