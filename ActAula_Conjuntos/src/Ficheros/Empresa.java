package Ficheros;

import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class Empresa {
	private Set<Paquete> paquetes;
	private Set<Vehiculo> vehiculos;

	public Empresa() {
		this.paquetes = new HashSet<Paquete>();
		this.vehiculos = new TreeSet<Vehiculo>();
	}

	public void añadirPaquete(Paquete p) {
		if (!paquetes.contains(p)) {
			paquetes.add(p);
			System.out.println("Paquete " + p.getCodigo() + " insertado correctamente.");
		} else {
			System.out.println("ERROR, no se pudo insertar");
		}
	}

	public void añadirVehiculo(Vehiculo v) {
		if (!vehiculos.contains(v)) {
			vehiculos.add(v);
			System.out.println("Vehiculo " + v.getMatricula() + " insertado correctamente.");
		} else {
			System.out.println("ERROR, no se pudo insertar");
		}
	}

	public void mostrarPaquetes() {
		System.out.println("Numero de paquetes: " + paquetes.size());
		for (Paquete p : paquetes) {
			System.out.println(p.toString());
		}
	}

	public void mostrarVehiculos() {
		System.out.println("Numero de vehiculos: " + vehiculos.size());
		for (Vehiculo v : vehiculos) {
			System.out.println(v.toString());
		}
	}

	public void repartirPaquetes(int cps[]) {
		for (int cp : cps) {
			boolean asignado = false;
			for (Vehiculo vehiculo : vehiculos) {
				if (!asignado && vehiculo.getCp() == -1) {
					vehiculo.setCp(cp);
					for (Paquete paquete : paquetes) {
						if (paquete.getCp() == cp) {
							vehiculo.añadirPaquete(paquete);
						}
					}
					asignado = true;
				}
			}
		}
	}

	public void mostrarReparto() {
		System.out.println("Detalles reparto:");
		for (Vehiculo v : vehiculos) {
			v.mostrarVehiculo();
		}
	}
}
