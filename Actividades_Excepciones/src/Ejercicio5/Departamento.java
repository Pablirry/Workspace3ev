package Ejercicio5;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Departamento {

    private String nombre;
    private List<Empleado> empleados;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.empleados = new LinkedList<Empleado>();
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
        return "Departamento [nombre=" + nombre + ", empleados=" + empleados + "]";
    }

    public void agregarEmpleado(Empleado e) {
        if (empleados.contains(e)) {
            throw new IllegalArgumentException("El empleado ya existe en la compañía");
        }
        empleados.add(e);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Departamento other = (Departamento) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.nombre);
        return hash;
    }
}
