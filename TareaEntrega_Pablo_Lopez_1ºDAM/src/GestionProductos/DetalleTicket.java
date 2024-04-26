package GestionProductos;

public class DetalleTicket {

    private String nombreProducto;
    private int cantidad;
    private int total;

    public DetalleTicket(Producto producto, int cantidadComprada) {
        if (producto == null) {
            throw new IllegalArgumentException("El producto no puede ser nulo.");
        }
        if (cantidadComprada > producto.getCantidad()) {
            throw new IllegalArgumentException("La cantidad comprada no puede superar la cantidad almacenada.");
        }
        this.nombreProducto = producto.getNombre();
        this.cantidad = cantidadComprada;
        this.total = 0;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}
