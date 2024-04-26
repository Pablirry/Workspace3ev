package Gestion;

import GestionProductos.DetalleTicket;
import GestionProductos.Producto;
import GestionProductos.Ticket;
import GestionProductos.TiendaEcologica;

public class Tienda {

    /**
     * Metodo para cargar los datos de la tienda
     * 
     * @param t : TiendaEcologica
     */

    private static void cargaDatos(TiendaEcologica t) {

        Producto p1 = new Producto("Manzanas ecológicas", 10, 1.5);
        Producto p2 = new Producto("Aceite de oliva ecológico", 5, 12.0);
        Producto p3 = new Producto("Pan ecológico", 20, 2.0);

        t.agregarProducto(p1);
        t.agregarProducto(p2);
        t.agregarProducto(p3);

        String fecha = "2023-03-15";
        String dependienta = "Ana";

        Ticket t1 = new Ticket(fecha, dependienta);
        t1.agregarDetalle(new DetalleTicket(p1, 3));
        t1.agregarDetalle(new DetalleTicket(p2, 1));

        t.generarTicket(t1);

        fecha = "2023-03-16";
        dependienta = "Laura";

        Ticket t2 = new Ticket(fecha, dependienta);
        t2.agregarDetalle(new DetalleTicket(p1, 5));
        t2.agregarDetalle(new DetalleTicket(p3, 2));

        t.generarTicket(t2);

        t.actualizarPrecio(p1, 1.7);
        t.actualizarPrecio(p1, 3.0);
        t.actualizarPrecio(p3, 3.0);
        t.actualizarPrecio(p3, 3.5);

        
    }

    public static void main(String[] args) {
        TiendaEcologica t = new TiendaEcologica();
        cargaDatos(t);
        System.out.println("Productos:");
        t.mostrarProductos();
        System.out.println("--------------------------------------");
        System.out.println("Tickets:");
        t.mostrarTickets();
        System.out.println("--------------------------------------");
        System.out.println("Precios");
        t.mostrarPrecios();
        System.out.println("--------------------------------------");
        System.out.println("Productos actualizados:");
        System.out.println();
        t.mostrarProductos();
    }

}
