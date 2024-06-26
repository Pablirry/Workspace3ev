package Ejercicio2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Almacen {

    public Set<Producto> productos = new TreeSet<>();
    public Set<Ticket> tickets = new HashSet<>();
    private Set<DetalleTicket> detalles = new HashSet<>();

    public Almacen() {
        this.productos = new TreeSet<>();
        this.tickets = new HashSet<>();
    }

    public void crearTicket(String fecha, String nombreDependienta) {
        Ticket ticket = new Ticket(fecha, nombreDependienta);
        tickets.add(ticket);
    }

    public void añadirDetallePedido(Producto producto, int cantidad) {
        DetalleTicket detalle = new DetalleTicket(producto, cantidad);
        detalles.add(detalle);
    }

    public void mostrarTickets() {
        for (Ticket ticket : tickets) {
            ticket.mostrarTicket();
        }
    }

    public Producto buscarProducto(int numero) {
        for (Producto producto : productos) {
            if (producto.getNombre().equals("producto" + numero)) {
                return producto;
            }
        }
        return null;
    }

    public void añadirProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }

}
