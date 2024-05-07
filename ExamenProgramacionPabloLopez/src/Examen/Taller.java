package Examen;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class Taller {

    private Map<String, Vehiculo> vehiculos;
    private Set<Cliente> clientes;
    private LinkedList<Reparacion> reparaciones;

    public Taller() {
        this.vehiculos = new HashMap<>();
        this.clientes = new HashSet<>();
        this.reparaciones = new LinkedList<>();
    }

    public void añadirVehiculos(Vehiculo v) {
        if (vehiculos.containsKey(v.getMatricula().getMatricula())) {
            System.out.println("Ya existe un vehículo con la matrícula " + v.getMatricula().getMatricula());
        }
        if (!v.getMatricula().validarMatricula().equals("Matricula valida")) {
            System.out.println("La matrícula " + v.getMatricula().getMatricula() + " no es válida");
        }
        vehiculos.put(v.getMatricula().getMatricula(), v);
    }

    public void mostrarVehiculos() {
        for (Vehiculo vehiculo : vehiculos.values()) {
            System.out.println(vehiculo);
        }
    }

    public void añadirCliente(Cliente c) {
        if (clientes.contains(c)) {
            System.out.println("Ya existe un cliente con el DNI " + c.getDni());
        }
        clientes.add(c);
    }

    public void mostrarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    public void nuevaReparacion(String dni, String matricula, String fecha) {
        Cliente cliente = new Cliente(dni);
        if (!clientes.contains(cliente)) {
            System.out.println("No existe un cliente con el DNI " + dni);
        }
        Vehiculo vehiculo = vehiculos.get(matricula);
        if (vehiculo == null) {
            System.out.println("No existe un vehículo con la matrícula " + matricula);
        }
        Matricula matriculaObj = vehiculo.getMatricula();
        Reparacion reparacion = new Reparacion(reparaciones.size() + 1, cliente, matriculaObj, vehiculo, fecha);
        reparaciones.add(reparacion);
    }

    public void listarReparaciones() {
        for (Reparacion reparacion : reparaciones) {
            System.out.println(reparacion);
        }
    }

    public void listarReparacionesCliente(String dni) {
        for (Reparacion r : reparaciones) {
            if (r.getDniCliente().equals(r.getDniCliente())) {
                System.out.println(r.toString());
            }
        }
    }

}
