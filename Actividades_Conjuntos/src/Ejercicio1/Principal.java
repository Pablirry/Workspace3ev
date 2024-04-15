package Ejercicio1;

public class Principal {

    public static void main (String [] args) {

        Hotel h = new Hotel();
        h.añadirHabitacion(new Habitacion(1, 'A', 1000, TipoHabitacion.DOBLE));
        h.añadirHabitacion(new Habitacion(2, 'B', 1000, TipoHabitacion.SIMPLE));
        h.añadirHabitacion(new Habitacion(3, 'C', 1000, TipoHabitacion.MATRIMONIAL));
        h.añadirCliente(new Clientes("Juan", "Perez", "12345678A", "10%"));
        h.añadirCliente(new Clientes("Pedro", "Perez", "12345678B", "10%"));
        h.añadirCliente(new Clientes("Pablo", "Lopez", "12345678C", "10%"));

        h.mostrarHabitaciones();
        h.mostrarClientes();

    }

}
