package Ejercicio2;

import java.util.HashSet;
import java.util.TreeSet;

public class Almacen {

    private TreeSet<Producto> productos;
    private HashSet<Ticket> tickets;

    public Almacen() {
        this.productos = new TreeSet<>();
        this.tickets = new HashSet<>();
    }

    public void crearTicket(String fecha, String dependencia) {
        Ticket ticket = new Ticket(fecha, dependencia);
        tickets.add(ticket);
    }

    public void añadirDetalleTicket(Ticket t, Producto p, int cantidad) {
        t.añadirDetallePedido(p, cantidad);
    }

    public void mostrarTickets() {
        System.out.println("Tickets: ");
        for (Ticket t : tickets) {
            t.mostrarTicket();
            System.out.println("-----------------------------");
        }
    }

    public Producto buscarProducto(int numero) {
        String nombreProducto = "Producto " + numero;
        for (Producto p : productos) {
            if (p.getNombre().equals(nombreProducto)) {
                return p;
            }
        }
        return null;
    }

    public void mostrarTicket(String fecha) {
        boolean encontrado = false;
        for (Ticket t : tickets) {
            if (t.getFecha().equals(fecha)) {
                t.mostrarTicket();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró ningun ticket con la fecha introducida.");
        }
    }

    public TreeSet<Producto> getProductos() {
        return productos;
    }

    public HashSet<Ticket> getTickets() {
        return tickets;
    }

}
