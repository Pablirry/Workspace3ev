package Ejercicio1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Taller {

	private Map<Matricula, Vehiculo> vehiculos;
	private Set<Cliente> clientes;
	private List<Reparacion> reparaciones;

	public Taller() {
		this.vehiculos = new HashMap<>();
		this.clientes = new TreeSet<>();
		this.reparaciones = new LinkedList<>();
	}

	public Map<Matricula, Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public Set<Cliente> getClientes() {
		return clientes;
	}

	public List<Reparacion> getReparaciones() {
		return reparaciones;
	}

	public void setVehiculos(Map<Matricula, Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}

	public void setReparaciones(List<Reparacion> reparaciones) {
		this.reparaciones = reparaciones;
	}

	public void anadirVehiculo(Vehiculo vehiculo) {
		if (!vehiculos.containsKey(vehiculo.getMatricula())) {
			vehiculos.put(vehiculo.getMatricula(), vehiculo);
		}
	}

	public void eliminarVehiculo(Matricula matricula) {
		vehiculos.remove(matricula);
	}

	public void anadirCliente(Cliente cliente) {
		if (!clientes.contains(cliente)) {
			clientes.add(cliente);
		}
	}

	public void eliminarCliente(Dni dni) {
		clientes.removeIf(cliente -> cliente.getDni().equals(dni));
	}

	public void nuevaReparacion(Dni dniCliente, Matricula matriculaVehiculo, String fecha) {
		if (clientes.contains(new Cliente(dniCliente, "", "")) && vehiculos.containsKey(matriculaVehiculo)) {
			Reparacion reparacion = new Reparacion(reparaciones.size() + 1, dniCliente, matriculaVehiculo, fecha);
			reparaciones.add(reparacion);
		}
	}

	public void listarReparaciones() {
		for (Reparacion reparacion : reparaciones) {
			System.out.println(reparacion.toString());
		}
	}

	public void listarReparacionesCliente(Dni dni) throws ExceptionDniNoEncontrado {
		for (Reparacion reparacion : reparaciones) {
	        if (reparacion.getDniCliente().equals(dni)) {
	            System.out.println(reparacion.toString());
	        }
	        throw new ExceptionDniNoEncontrado("Dni no encontrado");
		}
	}

	@Override
	public String toString() {
		return "Taller [vehiculos=" + vehiculos + ", clientes=" + clientes + ", reparaciones=" + reparaciones + "]";
	}

}
