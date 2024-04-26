package Prueba;

import GestionProductos.Tienda;
import java.util.ArrayList;
import java.util.List;
import GestionProductos.Producto;
import GestionProductos.Ticket;

public class Gestor {

	public static void main(String[] args) {
        Tienda tienda = new Tienda("Juan Pérez");
        Producto producto1 = new Producto(1, "Producto1", 10, 5);
        Producto producto2 = new Producto(2, "Producto2", 5, 10);
        tienda.añadirProducto(producto1);
        tienda.añadirProducto(producto2);
        Ticket ticket = new Ticket("10/03/2022", "Juan Pérez");
        List<String> nombresProductos = new ArrayList<>();
        nombresProductos.add("Producto1");
        nombresProductos.add("Producto2");
        List<Integer> cantidades = new ArrayList<>();
        cantidades.add(3);
        cantidades.add(2);
        tienda.realizarPedido(ticket, nombresProductos, cantidades);
        ticket.mostrarTicket();
        tienda.mostrarInventario();
    }

}
