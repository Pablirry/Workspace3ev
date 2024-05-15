package Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Departamento {

	private String nombre;
	private List<Empleado> empleados;

	public Departamento(String nombre) {
		this.nombre = nombre;
		this.empleados = new ArrayList<Empleado>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	@Override
	public String toString() {
		String texto = "Departamento [nombre=" + nombre + "]\n";
		for (Empleado e : empleados) {
			texto += "\t" + e.toString() + "\n";
		}
		return texto;
	}

	public void añadirEmpleado(Empleado e) {

		empleados.add(e);
	}

}
