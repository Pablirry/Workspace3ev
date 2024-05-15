package Ejercicio5;

public class Principal {

    public static void main(String[] args) {
        Empresa empresa=new Empresa("empresa","111X");
		try {
			empresa.añadirDepartamento(new Departamento("dep1"));
			empresa.añadirEmpleado("dep1",new Empleado("emp1","ape","puesto"));
			empresa.añadirEmpleado("dep1",new Empleado("emp2","ape","puesto"));
			empresa.añadirEmpleado("dep1",new Empleado("emp3","ape","puesto"));
		}catch (DepartamentoNotFoundException e1) {
			System.out.println(e1.toString());
		}
		try {
			empresa.añadirDepartamento(new Departamento("dep2"));
			empresa.añadirEmpleado("dep2",new Empleado("emp4","ape","puesto"));
			empresa.añadirEmpleado("dep2",new Empleado("emp5","ape","puesto"));
			empresa.añadirEmpleado("dep2",new Empleado("emp6","ape","puesto"));
			empresa.añadirEmpleado("dep2",new Empleado("emp6","ape","puesto"));
		} catch (DepartamentoNotFoundException e1) {
			System.out.println(e1.toString());
			try {
				empresa.borrarDepartamento("dep2");
			} catch (DepartamentoNotFoundException e) {
				System.out.println(e.toString());
			}
		}
		
		
		//**************************************************
	
		
		try {
            empresa.añadirDepartamento(new Departamento("dep3"));
			empresa.añadirEmpleado("dep3",new Empleado("emp4","ape","puesto"));
		}catch (DepartamentoNotFoundException e) {
			System.out.println("Error al añadir emp4");
		}
		try {
			empresa.añadirEmpleado("dep3",new Empleado("emp5","ape","puesto"));
		}catch (DepartamentoNotFoundException e) {
			System.out.println("Error al añadir emp5");
		}
		try {
			empresa.añadirEmpleado("dep3",new Empleado("emp6","ape","puesto"));
		}catch (DepartamentoNotFoundException e) {
			System.out.println("Error al añadir emp6");
		}
		try {
			empresa.añadirEmpleado("dep3",new Empleado("emp7","ape","puesto"));
		}catch (DepartamentoNotFoundException e) {
			System.out.println("Error al añadir emp7");
		}
		
		
		System.out.println(empresa.toString());
	}

}