package Logica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import Excepciones.ExamenExcepcion;
import Excepciones.FormatoExcepcion;
import Modelo.Alquiler;
import Modelo.Autobus;
import Modelo.Cliente;
import Modelo.Matricula;

public class GestorAutobus {
	private HashMap<Matricula, Autobus> autobuses;
	private Set<Cliente> clientes;
	private List<Alquiler> alquileres;

	public GestorAutobus() {
		this.autobuses = new HashMap<>();
		this.clientes = new TreeSet<>();
		this.alquileres = new ArrayList<>();
	}

	public void addCliente(Cliente c) throws ExamenExcepcion {
		if (!clientes.add(c)) {
			throw new ExamenExcepcion("Cliente con NIF " + c.getNif() + " ya existe.");
		}
		clientes.add(c);
	}

	public void addAutobus(Autobus a) throws ExamenExcepcion {
		if (autobuses.containsKey(a.getMatricula())) {
			throw new ExamenExcepcion("Autobus con matricula " + a.getMatricula() + " ya existe.");
		}
		autobuses.put(a.getMatricula(), a);
	}

	public String listarTodosLosAutobuses() {
		String resultado = "";
		for (Autobus a : autobuses.values()) {
			resultado += "Matricula: " + a.getMatricula() +
					", Plazas: " + a.getNumPlazas() +
					", Precio por Dia: " + a.getPrecioDia() +
					", Precio por Km: " + a.getPrecioKm() + "\n";
		}
		return resultado;
	}

	public void alquilarAutocar(String matricula, String nif, String fecha, int numDias, int numKm)
			throws ExamenExcepcion, FormatoExcepcion {
		Matricula mat = new Matricula(matricula);
		Autobus autobus = autobuses.get(mat);
		if (autobus == null) {
			throw new ExamenExcepcion("No existe un autocar con la matricula " + matricula);
		}
		if (!autobus.estaDisponible(fecha, numDias)) {
			throw new ExamenExcepcion("El autocar con matricula " + matricula + " no está disponible en esas fechas.");
		}
		Cliente cliente = null;
		for (Cliente c : clientes) {
			if (c.getNif().equals(nif)) {
				cliente = c;
				break;
			}
		}
		if (cliente == null) {
			throw new ExamenExcepcion("No existe un cliente con el NIF " + nif);
		}
		Alquiler alquiler = new Alquiler(autobus, nif, fecha, numDias, numKm);
		alquileres.add(alquiler);
		autobus.alquilar(fecha, numDias);
	}

	public String listarAlquileresCliente(String nif) throws ExamenExcepcion {
		Cliente cliente = null;
		for (Cliente c : clientes) {
			if (c.getNif().equals(nif)) {
				cliente = c;
				break;
			}
		}
		if (cliente == null) {
			throw new ExamenExcepcion("No existe un cliente con el NIF " + nif);
		}
		String resultado = "Cliente :" + nif + " total alquileres: ";
		long count = alquileres.stream().filter(a -> a.getNifCliente().equals(nif)).count();
		resultado += count + "\n";
		for (Alquiler a : alquileres) {
			if (a.getNifCliente().equals(nif)) {
				resultado += a + "\n";
			}
		}
		return resultado;
	}

	public String listarAlquileresAutobus(String matricula) throws ExamenExcepcion, FormatoExcepcion {
		Matricula mat = new Matricula(matricula);
		Autobus autobus = autobuses.get(mat);
		if (autobus == null) {
			throw new ExamenExcepcion("Error matricula no encontrado");
		}
		String resultado = "Autobus " + matricula + " total alquileres: ";
		long count = alquileres.stream().filter(a -> a.getAutobus().getMatricula().equals(mat)).count();
		resultado += count + "\n";
		for (Alquiler a : alquileres) {
			if (a.getAutobus().getMatricula().equals(mat)) {
				resultado += a + "\n";
			}
		}
		return resultado;
	}

	public String listarAutocaresDisponibles(String fecha, int numDias) throws FormatoExcepcion {
		String resultado = "";
		for (Autobus autobus : autobuses.values()) {
			if (autobus.estaDisponible(fecha, numDias)) {
				resultado += autobus + "\n";
			}
		}
		return resultado;
	}

	public String generarFactura(String nif) throws ExamenExcepcion {
		Cliente cliente = null;
		for (Cliente c : clientes) {
			if (c.getNif().equals(nif)) {
				cliente = c;
				break;
			}
		}
		if (cliente == null) {
			throw new ExamenExcepcion("ERROR nif no encontrado");
		}
		String resultado = "";
		double totalImporte = 0.0;
		for (Alquiler a : alquileres) {
			if (a.getNifCliente().equals(nif)) {
				resultado += a + "\n";
				totalImporte += a.calcularImporte();
			}
		}
		resultado += "Total importe " + totalImporte + "\n";
		return resultado;
	}


	

}
