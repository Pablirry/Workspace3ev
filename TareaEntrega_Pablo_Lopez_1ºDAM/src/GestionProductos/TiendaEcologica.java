package GestionProductos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TiendaEcologica {

    public Set<Producto> productos = new TreeSet<>();
    public Set<Ticket> tickets = new HashSet<>();
    private Map<String, List<Integer>> preciosProductos = new TreeMap<>();

    public TiendaEcologica() {
        this.productos = new TreeSet<>();
        this.tickets = new HashSet<>();
    }

    public void crearTicket(String fecha, String nombreDependienta) {
        Ticket ticket = new Ticket(fecha, nombreDependienta);
        tickets.add(ticket);
    }

    public void añadirDetallePedido(Producto producto, int cantidad) {
        DetalleTicket detalle = new DetalleTicket(producto, cantidad);
        producto.setCantidad(producto.getCantidad() - cantidad);
        preciosProductos.get(producto.getNombre()).add(producto.getPrecio());
        detalle.setTotal(producto.getPrecio() * cantidad);
    }

    public void mostrarTickets() {
        for (Ticket ticket : tickets) {
            ticket.mostrarTicket();
        }
    }

    public Producto buscarProducto(int número) {
        for (Producto producto : productos) {
            if (producto.getNombre().equals("producto" + número)) {
                return producto;
            }
        }
        return null;
    }

    public void añadirProducto(Producto producto) {
        productos.add(producto);
        preciosProductos.put(producto.getNombre(), new ArrayList<>());
        preciosProductos.get(producto.getNombre()).add(producto.getPrecio());
    }

    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
        preciosProductos.remove(producto.getNombre());
    }

    public List<Integer> getPreciosProducto(String nombreProducto) {
        return preciosProductos.get(nombreProducto);
    }
}
