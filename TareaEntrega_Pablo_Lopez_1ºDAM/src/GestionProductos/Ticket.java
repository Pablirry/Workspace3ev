package GestionProductos;

import java.util.ArrayList;
import java.util.List;

public class Ticket {

    private String fecha;
    private String nombreDependienta;
    private List<DetalleTicket> detalles;

    public Ticket(String fecha, String nombreDependienta) {
        this.fecha = fecha;
        this.nombreDependienta = nombreDependienta;
        this.detalles = new ArrayList<>();
    }

    public void añadirDetallePedido(Producto producto, int cantidad) {
        DetalleTicket detalle = new DetalleTicket(producto, cantidad);
        detalles.add(detalle);
    }

    public void mostrarTicket() {
        System.out.println("Fecha: " + fecha);
        System.out.println("Dependienta: " + nombreDependienta);
        System.out.println("Detalles del pedido:");
        for (DetalleTicket detalle : detalles) {
            System.out.println("Nombre del producto: " + detalle.getNombreProducto());
            System.out.println("Cantidad comprada: " + detalle.getCantidad());
            System.out.println("Total: " + detalle.getTotal());
        }
    }

    public DetalleTicket getDetallePorProducto(String nombreProducto) {
        for (DetalleTicket detalle : detalles) {
            if (detalle.getNombreProducto().equals(nombreProducto)) {
                return detalle;
            }
        }
        return null;
    }

}
