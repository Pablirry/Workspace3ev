package Ejercicio1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeSet;

public class Taller {

	private HashMap<Matricula, Vehiculo> vehiculos;
	private TreeSet<Cliente> clientes;
	private LinkedList<Reparacion> reparaciones;

	public Taller() {
		this.vehiculos = new HashMap<>();
		this.clientes = new TreeSet<>();
		this.reparaciones = new LinkedList<>();
	}

	/**
	 * Añade un vehiculo al taller No se permiten matrículas repetidas No se
	 * permiten matrículas erróneas
	 * 
	 * @param Vehiculo : v
	 * @throws ExcepcionTaller
	 */
	public void añadirVehiculo(Vehiculo v) throws ExcepcionTaller {
        // Si la matrícula no está en el taller
        if (vehiculos.containsKey(v.getMatricula())) {
            throw new ExcepcionTaller("La matrícula ya existe en el taller");
        }

        // Si la matrícula es correcta
        if (v.getMatricula().getMatricula().equals("")) {
            throw new ExcepcionTaller("La matrícula no es válida");
        }

        vehiculos.put(v.getMatricula(), v);
    }

	/**
	 * Muestra los vehiculos al tener cada toString implementado en las subclases ya
	 * se indica el tipo de vehiculo
	 */
	public void mostrarVehiculos() {
		for (Vehiculo v : vehiculos.values()) {
			System.out.println(v.toString());
		}
	}

	/**
	 * Añade un cliente al taller No se permiten DNI repetidos No se permiten DNI
	 * erróneos
	 * 
	 * @param Cliente : c
	 * @throws ExcepcionTaller
	 */
	public void añadirCliente(Cliente c) throws ExcepcionTaller {
        // Si el DNI no está en el taller
        if (clientes.contains(c)) {
            throw new ExcepcionTaller("El DNI ya existe en el taller");
        }

        // Si el DNI es correcto
        if (c.getDni().equals("")) {
            throw new ExcepcionTaller("El DNI no es válido");
        }

        clientes.add(c);
    }

	/**
	 * Muestra los clientes
	 */
	public void mostrarClientes() {
		for (Cliente c : clientes) {
			System.out.println(c.toString());
		}
	}

	/**
	 * Crea una reparación El dni debe estar en el taller El dni debe cumplir con
	 * las condiciones de la clase cliente La matricula debe estar en el taller
	 * 
	 * @param String    : dni
	 * @param Matricula : matricula
	 * @param String    : fecha
	 * @throws ExcepcionTaller
	 *
	 */
	public void crearReparacion(String dni, Matricula matricula, String fecha) throws ExcepcionTaller {

        // Si el dni es correcto
        if (!Cliente.verificarDni(dni).equals("")) {
            // Si el DNI está en el taller
            for (Cliente c : clientes) {
                if (c.getDni().equals(dni)) {
                    // Si la matrícula está en el taller
                    if (vehiculos.containsKey(matricula)) {
                        reparaciones.add(new Reparacion(dni, matricula, fecha));
                        return;
                    }
                }
            }

            throw new ExcepcionTaller("El DNI no está en el taller o la matrícula no es válida");
        }

        throw new ExcepcionTaller("El DNI no es válido");
    }

	/**
	 * Muestra las reparaciones
	 */
	public void mostrarReparaciones() {
		for (Reparacion r : reparaciones) {
			System.out.println(r.toString());
		}
	}

	/**
	 * Muestra las reparaciones por cliente Si el dni no pertenece a ningún cliente
	 * se muestra un mensaje de error
	 * 
	 * @param String : dni
	 */
	public void mostrarReparacionesCliente(String dni) {
		// busca el cliente por dni
		for (Cliente c : clientes) {
			if (c.getDni().equals(dni)) {
				// Si lo encuentra muestra las reparaciones
				int contador = 0;
				System.out.println("Reparaciones para el cliente con DNI " + dni);
				String result = "";
				for (Reparacion r : reparaciones) {
					if (r.getDni().equals(dni)) {
						result += r.toString() + "\n";
						// contador para saber si hay reparaciones
						contador++;
					}
				}
				// Si no hay reparaciones
				if (contador == 0) {
					System.err.println("No hay reparaciones para el cliente con DNI " + dni);
				} else {
					System.out.println(result);
				}
				return;
			}
		}
	}

}
