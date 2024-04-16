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
		int inCp = 0;
		for (Vehiculo v : vehiculos) {
			if (v.getCp() == null) {
				String cpAsignado = String.valueOf(cps[inCp]);
				v.setCp(cpAsignado);
				for (Paquete p : paquetes) {
					if (String.valueOf(p.getCp()).equals(cpAsignado)) {
						v.añadirPaquete(p);
					}
				}
			}
		}
	}

	public void mostrarReparto() {

		for (Vehiculo v : vehiculos) {
			System.out.println(v.toString());
			System.out.println("Paquetes asignados:");
			for (Paquete p : v.getPaquetes()) {
				System.out.println(p.toString());
			}
		}
	}
}
