package GestionProductos;

public class DetalleTicket {

    private Producto producto;
    private int cantidad;

    public DetalleTicket(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "DetalleTicket [producto=" + producto + ", cantidad=" + cantidad + "]";
    }

}
