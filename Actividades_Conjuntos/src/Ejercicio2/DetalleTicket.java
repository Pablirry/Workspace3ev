package Ejercicio2;

public class DetalleTicket {

    private String nombreProducto;
    private int cantidadComprada;
    private int total;

    public DetalleTicket(Producto p, int cantidad) {
        if (p == null || cantidad <= 0 || cantidad > p.getCantidad()) {
            System.out.println("ERROR: Producto nulo o cantidad inválida");
            this.nombreProducto = "";
            this.cantidadComprada = 0;
            this.total = 0;
        } else {
            this.nombreProducto = p.getNombre();
            this.cantidadComprada = cantidad;
            this.total = p.getPrecio() * cantidad;
        }
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public int getCantidadComprada() {
        return cantidadComprada;
    }

    public int getTotal() {
        return total;
    }

}
