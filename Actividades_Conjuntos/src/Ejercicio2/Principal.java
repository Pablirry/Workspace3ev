package Ejercicio2;

public class Principal {

    public static void main(String[] args) {
        // Crear instancia de Almacen
        Almacen almacen = new Almacen();

        // Crear algunos productos y agregarlos al almacen
        for (int i = 1; i <= 5; i++) {
            Producto producto = new Producto(i);
            almacen.getProductos().add(producto);
        }

        // Crear un ticket
        almacen.crearTicket("2024-04-17", "Ana");

        // Añadir detalles al ticket
        Ticket ticket = almacen.getTickets().stream().findFirst().orElse(null);
        if (ticket != null) {
            Producto producto1 = almacen.buscarProducto(1);
            Producto producto2 = almacen.buscarProducto(2);
            Producto producto3 = almacen.buscarProducto(3);

            almacen.añadirDetalleTicket(ticket, producto1, 3);
            almacen.añadirDetalleTicket(ticket, producto2, 2);
            almacen.añadirDetalleTicket(ticket, producto3, 1);
        } else {
            System.out.println("No se creó ningún ticket.");
        }

        // Mostrar los tickets
        almacen.mostrarTickets();
    }

}
