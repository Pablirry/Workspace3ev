package Ejercicio5;

import java.util.List;

public class Principal {

	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";

	public static void main(String[] args) {
		Empresa empresa = new Empresa("empresa", "111X");
		try {
			empresa.añadirDepartamento(new Departamento("dep1"));
			empresa.añadirEmpleado("dep1", new Empleado("emp1", "ape", "puesto"));
			empresa.añadirEmpleado("dep1", new Empleado("emp2", "ape", "puesto"));
			empresa.añadirEmpleado("dep1", new Empleado("emp3", "ape", "puesto"));
		} catch (DepartamentoNotFoundException e1) {
			System.out.println(e1.toString());
		}
		try {
			empresa.añadirDepartamento(new Departamento("dep2"));
			empresa.añadirEmpleado("dep2", new Empleado("emp4", "ape", "puesto"));
			empresa.añadirEmpleado("dep2", new Empleado("emp5", "ape", "puesto"));
			empresa.añadirEmpleado("dep2", new Empleado("emp6", "ape", "puesto"));
			empresa.añadirEmpleado("dep2", new Empleado("emp7", "ape", "puesto"));
		} catch (DepartamentoNotFoundException e1) {
			System.out.println(e1.toString());
		}
		try {
			empresa.añadirDepartamento(new Departamento("dep3"));
			empresa.añadirEmpleado("dep3", new Empleado("emp8", "ape", "puesto"));
			empresa.añadirEmpleado("dep3", new Empleado("emp9", "ape", "puesto"));
			empresa.añadirEmpleado("dep3", new Empleado("emp10", "ape", "puesto"));
			empresa.añadirEmpleado("dep3", new Empleado("emp11", "ape", "puesto"));
		} catch (DepartamentoNotFoundException e1) {
			System.out.println(e1.toString());
			try {
				empresa.borrarDepartamento("dep2");
			} catch (DepartamentoNotFoundException e2) {
				System.out.println(e2.toString());
			}
		}
		System.out.println(ANSI_RED + empresa.toString());
		System.out.println(ANSI_WHITE + "*************************************************\n");
		try {
			List<Empleado> lista = empresa.getEmpleadosDepartamento("dep3");
			for (int i = 0; i < lista.size(); i++) {
				Empleado emp = lista.get(i);
				System.out.println(ANSI_PURPLE + emp.toString());
			}
		} catch (DepartamentoNotFoundException e1) {
			System.out.println(e1.toString());
		}

		System.out.println(ANSI_WHITE + "\n*************************************************\n");

		Departamento buscar;
		try {
			buscar = empresa.buscarDepartamento("dep1");
			System.out.println(ANSI_CYAN + buscar.toString());
		} catch (DepartamentoNotFoundException e) {
			System.out.println(e.toString());
		}

		System.out.println(ANSI_WHITE + "*************************************************\n");
		Empleado buscare;
		try {
			buscare = empresa.buscarEmpleado("emp5");
			System.out.println(ANSI_YELLOW + buscare.toString());
		} catch (EmpleadoNotFoundException e) {
			System.out.println(e.toString());
		}
	}

}