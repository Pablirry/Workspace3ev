package GestionProductos;

public class DetalleTicket {

    private Producto producto;
    private int cantidad;

    /**
     * Constructor clase DetalleTicket
     * 
     * @param producto
     * @param cantidad
     */

    public DetalleTicket(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    /**
     * Metodo get de producto
     * 
     * @return : Producto
     */

    public Producto getProducto() {
        return producto;
    }

    /**
     * Metodo get del atributo cantidad
     * 
     * @return : entero
     */

    public int getCantidad() {
        return cantidad;
    }

}
