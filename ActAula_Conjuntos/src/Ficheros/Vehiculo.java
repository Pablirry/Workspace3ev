package Ficheros;

import java.util.LinkedList;

public class Vehiculo implements Comparable<Vehiculo> {
	private String matricula;
	private String dni;
	private String nombre;
	private int cp = -1;
	private LinkedList<Paquete> paquetes;

	public Vehiculo(String matricula, String dni, String nombre) {
		this.matricula = matricula;
		this.dni = dni;
		this.nombre = nombre;
		this.paquetes = new LinkedList<Paquete>();
	}

	public void añadirPaquete(Paquete p) {
		paquetes.add(p);
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public LinkedList<Paquete> getPaquetes() {
		return paquetes;
	}

	public void mostrarVehiculo() {
		System.out.println("Vehiculo: [matricula=" + matricula + ", dni=" +
				dni + ", nombre=" + nombre + ", cpAsignado=" + cp + "]");
		if (paquetes.size() > 0) {
			for (Paquete paquete : paquetes) {
				System.out.println('\t' + paquete.toString());
			}
		}
	}

	@Override
	public int compareTo(Vehiculo v) {
		return this.matricula.compareTo(v.matricula);
	}

}
