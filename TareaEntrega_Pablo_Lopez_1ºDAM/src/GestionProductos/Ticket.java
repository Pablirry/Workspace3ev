package GestionProductos;

import java.util.ArrayList;
import java.util.List;

public class Ticket {

    private String fecha;
    private String dependienta;
    private List<DetalleTicket> detalles;

    public Ticket(String fecha, String dependienta) {
        this.fecha = fecha;
        this.dependienta = dependienta;
        this.detalles = new ArrayList<>();
    }

    public void agregarDetalle(DetalleTicket detalle) {
        detalles.add(detalle);
    }

    public String getFecha() {
        return fecha;
    }

    public String getDependenta() {
        return dependienta;
    }

    public List<DetalleTicket> getDetalles() {
        return detalles;
    }

}
