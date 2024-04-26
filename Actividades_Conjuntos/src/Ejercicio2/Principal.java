package Ejercicio2;

public class Principal {

    public static void main(String[] args) {
        Almacen almacen = new Almacen();

        // Crear productos y añadirlos al almacen
        Producto producto1 = new Producto(1, "producto1", 100, 10);
        Producto producto2 = new Producto(2, "producto2", 100, 20);
        almacen.productos.add(producto1);
        almacen.productos.add(producto2);

        // Crear un ticket y añadir detalles
        almacen.crearTicket("2023-03-01", "Juan");
        almacen.añadirDetallePedido(producto1, 5);
        almacen.añadirDetallePedido(producto2, 3);

        // Mostrar tickets
        almacen.mostrarTickets();

        // Buscar un producto
        Producto productoBuscado = almacen.buscarProducto(2);
        System.out.println("Producto buscado: " + productoBuscado.getNombre());

        // Mostrar ticket por fecha
        almacen.mostrarTickets();
    }
}
