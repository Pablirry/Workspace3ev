package Ejercicio1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Hotel {

    private Set<Habitacion> habitaciones;
    private Set<Clientes> clientes;

    public Hotel() {
        habitaciones = new TreeSet<Habitacion>();
        clientes = new HashSet<Clientes>();
    }

    public void añadirHabitacion(Habitacion h) {
        boolean resul = habitaciones.add(h);
        if (resul == true) {
            System.out.println("Habitacion correctamente insertada.");
        } else {
            System.out.println("Error al insertar habitacion.");
        }
    }

    public void mostrarHabitaciones() {
        for (Habitacion h : habitaciones) {
            System.out.println(h.toString());
        }
    }

    public void añadirCliente(Clientes c) {
        boolean resul = clientes.add(c);
        if (resul == true) {
            System.out.println("Cliente correctamente insertado.");
        } else {
            System.out.println("Error al insertar cliente.");
        }
    }

    public void mostrarClientes() {
        for (Clientes c : clientes) {
            System.out.println(c.toString());
        }
    }

}
