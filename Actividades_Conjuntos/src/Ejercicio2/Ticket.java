package Ejercicio2;

import java.util.ArrayList;

public class Ticket {

    private String fecha;
    private String nombreDependienta;
    private ArrayList<DetalleTicket> detalles;

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
        System.out.println("Importe final del ticket: " + calcularImporteFinal());
    }

    private int calcularImporteFinal() {
        int importeFinal = 0;
        for (DetalleTicket detalle : detalles) {
            importeFinal += detalle.getTotal();
        }
        return importeFinal;
    }

    public String getFecha() {
        return fecha;
    }

    public String getNombreDependienta() {
        return nombreDependienta;
    }

}
