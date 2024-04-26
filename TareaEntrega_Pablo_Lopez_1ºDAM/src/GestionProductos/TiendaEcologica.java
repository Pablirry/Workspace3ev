package GestionProductos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class TiendaEcologica {

    private TreeSet<Producto> productos;
    private HashSet<Ticket> tickets;
    private Map<String, List<Double>> preciosProductos;

    public TiendaEcologica() {
        this.productos = new TreeSet<>();
        this.tickets = new HashSet<>();
        this.preciosProductos = new HashMap<>();
    }

    public TreeSet<Producto> getProductos() {
        return productos;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void generarTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public void actualizarPrecio(Producto p, double nuevoPrecio) {
        if (p == null) {
            throw new IllegalArgumentException("El producto no puede ser nulo");
        }
        List<Double> preciosHistoricos = preciosProductos.computeIfAbsent(p.getNombre(), k -> new ArrayList<>());
        preciosHistoricos.add(p.getPrecio());
        p.setPrecio(nuevoPrecio);
    }

    public void mostrarProductos() {
        for (Producto producto : productos) {
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Cantidad disponible: " + producto.getCantidad());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println();
        }
    }

    public void mostrarTickets() {
        for (Ticket ticket : tickets) {
            System.out.println("Fecha: " + ticket.getFecha());
            System.out.println("Dependienta: " + ticket.getDependenta());
            System.out.println("\tDetalles:");
            for (DetalleTicket detalle : ticket.getDetalles()) {
                System.out.println("\t  Producto: " + detalle.getProducto().getNombre());
                System.out.println("\t  Cantidad: " + detalle.getCantidad());
                System.out.println("\t  Precio: " + detalle.getProducto().getPrecio());
                System.out.println();
            }
        }
    }

    public void mostrarPrecios() {
        for (Map.Entry<String, List<Double>> p : preciosProductos.entrySet()) {
            System.out.println("Producto: " + p.getKey());
            System.out.println("Precios históricos: " + p.getValue());
        }
    }

}
