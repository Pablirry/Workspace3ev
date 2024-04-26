package GestionProductos;

import java.util.ArrayList;
import java.util.List;

public class Tienda {

    private List<Producto> productos;
    private String nombreDependienta;

    public Tienda(String nombreDependienta) {
        this.nombreDependienta = nombreDependienta;
        this.productos = new ArrayList<>();
    }

    public void añadirProducto(Producto producto) {
        productos.add(producto);
    }

    public Producto buscarProducto(String nombreProducto) {
        for (Producto producto : productos) {
            if (producto.getNombre().equals(nombreProducto)) {
                return producto;
            }
        }
        return null;
    }

    public void realizarPedido(Ticket ticket, List<String> nombresProductos, List<Integer> cantidades) {
        if (nombresProductos.size() != cantidades.size()) {
            throw new IllegalArgumentException("Los tamaños de las listas no coinciden.");
        }
        for (int i = 0; i < nombresProductos.size(); i++) {
            String nombreProducto = nombresProductos.get(i);
            int cantidad = cantidades.get(i);
            Producto producto = buscarProducto(nombreProducto);
            if (producto == null) {
                System.out.println("El producto " + nombreProducto + " no se encuentra en la tienda.");
            } else {
                if (cantidad > producto.getCantidad()) {
                    System.out.println("No hay suficiente stock del producto " + nombreProducto + ".");
                } else {
                    int total = cantidad * producto.getPrecio();
                    ticket.añadirDetallePedido(producto, cantidad);
                    DetalleTicket detalle = ticket.getDetallePorProducto(nombreProducto);
                    detalle.setTotal(total);
                    producto.setCantidad(producto.getCantidad() - cantidad);
                }
            }
        }
    }

    public void mostrarInventario() {
        System.out.println("Inventario de la tienda:");
        for (Producto producto : productos) {
            System.out.println("Nombre del producto: " + producto.getNombre());
            System.out.println("Cantidad almacenada: " + producto.getCantidad());
            System.out.println("Precio del producto: " + producto.getPrecio());
        }
    }

    public String getNombreDependienta() {
        return nombreDependienta;
    }

}
