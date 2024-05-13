package Ejercicio5;

import java.util.List;

public class Principal {

    public static void main (String [] args) {
        Empresa empresa = new Empresa("Compañía XYZ", "XYZ123");

        // Agregar departamentos
        Departamento departamento1 = new Departamento("Departamento 1");
        Departamento departamento2 = new Departamento("Departamento 2");
        empresa.agregarDepartamento(departamento1);
        empresa.agregarDepartamento(departamento2);

        // Agregar empleados
        Empleado empleado1 = new Empleado("12345678A", "Juan", "Pérez", "Vendedor");
        Empleado empleado2 = new Empleado("87654321B", "Ana", "García", "Gerente de Marketing");
        departamento1.agregarEmpleado(empleado1);
        departamento2.agregarEmpleado(empleado2);

        System.out.println("Departamentos de la empresa:");
        for (Departamento departamento : empresa.getDepartamentos()) {
            System.out.println("- " + departamento.getNombre());
        }

        // Imprimir los empleados de un departamento específico
        System.out.println("\nEmpleados en Departamento 1:");
        try {
            List<Empleado> dep1emp = empresa.getEmpleadosPorDepartamento("Departamento 1");
            for (Empleado empleado : dep1emp) {
                System.out.println("- " + empleado.getNombre() + " " + empleado.getApellidos() + " (" + empleado.getPuesto() + ")");
            }
        } catch (DepartamentoNoEncontradoException e) {
            System.err.println("Error: " + e.getMessage());
        }

        // Imprimir la información de un empleado específico
        System.out.println("\nInformación del empleado:");
        try {
            Empleado empleado = empresa.getEmpleadoPorNif("12345678A");
            System.out.println("- NIF: " + empleado.getNif());
            System.out.println("- Nombre: " + empleado.getNombre());
            System.out.println("- Apellido: " + empleado.getApellidos());
            System.out.println("- Puesto: " + empleado.getPuesto());
        } catch (EmpleadoNoEncontradoException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}