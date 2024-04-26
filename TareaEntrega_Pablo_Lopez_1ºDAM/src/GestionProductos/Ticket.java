package GestionProductos;

import java.util.ArrayList;
import java.util.List;

public class Ticket {

    private String fecha;
    private String dependiente;
    private List<DetalleTicket> detalles;

    /**
     * Constructor de la clase Ticket
     * @param fecha : String
     * @param dependiente : String
     */

    public Ticket(String fecha, String dependiente) {
        this.fecha = fecha;
        this.dependiente = dependiente;
        this.detalles = new ArrayList<>();
    }

    /**
     * Metodo para agregar un detalle
     * @param detalle : DetalleTicket
     */

    public void agregarDetalle(DetalleTicket detalle) {
        detalles.add(detalle);
    }

    /**
     * Metodo get del atributo Fecha
     * @return : String
     */

    public String getFecha() {
        return fecha;
    }

    /**
     * Metodo get del atributo dependiente
     * @return : String
     */

    public String getDependiente() {
        return dependiente;
    }

    /**
     * Metodo get del atributo detalles
     * @return : List<DetalleTicket>
     */

    public List<DetalleTicket> getDetalles() {
        return detalles;
    }

}
