package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Ticket {

    private String fecha;
    private String dependencia;
    private List<DetalleTicket> detalles;

    public Ticket(String fecha, String dependencia) {
        this.fecha = fecha;
        this.dependencia = dependencia;
        this.detalles = new ArrayList<>();
    }

    public void añadirDetallePedido(Producto p, int cantidad) {
        DetalleTicket detalle = new DetalleTicket(p, cantidad);
        detalles.add(detalle);
    }

    public void mostrarTicket() {
        System.out.println("Fecha: " + fecha);
        System.out.println("Dependencia: " + dependencia);
        System.out.println("Detalles del Ticket:");
        int importeTotal = 0;
        for (DetalleTicket detalle : detalles) {
            System.out.println("Producto: " + detalle.getNombreProducto() + "\nCantidad: "
                    + detalle.getCantidadComprada() + "\nTotal: " + detalle.getTotal());
            importeTotal += detalle.getTotal();
        }
        System.out.println("Importe Total: " + importeTotal);
    }

    public String getFecha() {
        return fecha;
    }

    public String getDependencia() {
        return dependencia;
    }

}
