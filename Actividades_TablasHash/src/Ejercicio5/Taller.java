package Ejercicio5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Taller {

    private Map<String, Cliente> clientes;
    private Map<String, Vehiculo> vehiculos;
    private List<Reparacion> reparaciones;

    public Taller() {
        clientes = new HashMap<>();
        vehiculos = new HashMap<>();
        reparaciones = new ArrayList<>();
    }

    public void insertarVehiculo(Vehiculo v) {
        this.vehiculos.put(v.getMatricula(), v);
    }

    public void insertarCliente(Cliente c) {
        this.clientes.put(c.getDni(), c);
    }

    public void insertarReparacion(Reparacion r) {
        Cliente cliente = this.clientes.get(r.getDni());
        Vehiculo vehiculo = this.vehiculos.get(r.getMatricula());

        if (cliente != null && vehiculo != null) {
            Reparacion reparacion = new Reparacion(r.getMatricula(), r.getDni(), r.getPrecio());
            reparaciones.add(reparacion);
        } else {
            System.out.println("Error, no existe");
        }
    }

    public void mostrarDatos() {
        System.out.println("Clientes: ");
        for (Cliente c : clientes.values()) {
            System.out.println(c);
        }

        System.out.println("**********************************");

        System.out.println("\nVehiculos: ");
        for (Vehiculo v : vehiculos.values()) {
            System.out.println(v);
        }

        System.out.println("**********************************");

        System.out.println("\nReparaciones: ");
        for (Reparacion r : reparaciones) {
            System.out.println(r);
        }
    }

    public List<Reparacion> ReparacionesPorCliente(Cliente c) {
        List<Reparacion> reparacionesCliente = new ArrayList<>();

        for (Reparacion rep : reparaciones) {
            if (rep.getDni().equals(c.getDni())) {
                reparacionesCliente.add(rep);
            }
        }
        return reparacionesCliente;
    }

    public List<Reparacion> ReparacionesPorVehiculo(String matricula) {
        List<Reparacion> reparacionesVehiculo = new ArrayList<>();

        for (Reparacion rep : reparaciones) {
            if (rep.getMatricula().equals(matricula)) {
                reparacionesVehiculo.add(rep);
            }
        }

        return reparacionesVehiculo;
    }

}
