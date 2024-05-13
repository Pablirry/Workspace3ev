package Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String nombre;
    private String cif;
    private List<Departamento> departamentos;

    public Empresa(String nombre, String cif) {
        this.nombre = nombre;
        this.cif = cif;
        this.departamentos = new ArrayList<Departamento>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public void agregarDepartamento(Departamento departamento) {
        if (departamentos.contains(departamento)) {
            throw new IllegalArgumentException("El departamento ya existe en la compañía");
        }
        departamentos.add(departamento);
    }

    public List<Empleado> getEmpleadosPorDepartamento(String nombreDepartamento)
            throws DepartamentoNoEncontradoException {
        for (Departamento departamento : departamentos) {
            if (departamento.getNombre().equals(nombreDepartamento)) {
                return departamento.getEmpleados();
            }
        }
        throw new DepartamentoNoEncontradoException("Departamento no encontrado: " + nombreDepartamento);
    }

    public Departamento getDepartamentoPorNombre(String nombreDepartamento) throws DepartamentoNoEncontradoException {
        for (Departamento departamento : departamentos) {
            if (departamento.getNombre().equals(nombreDepartamento)) {
                return departamento;
            }
        }
        throw new DepartamentoNoEncontradoException("Departamento no encontrado: " + nombreDepartamento);
    }

    public Empleado getEmpleadoPorNif(String nif) throws EmpleadoNoEncontradoException {
        for (Departamento departamento : departamentos) {
            for (Empleado empleado : departamento.getEmpleados()) {
                if (empleado.getNif().equals(nif)) {
                    return empleado;
                }
            }
        }
        throw new EmpleadoNoEncontradoException("Empleado no encontrado: " + nif);
    }

    @Override
    public String toString() {
        return "Empresa [nombre=" + nombre + ", cif=" + cif + ", departamentos=" + departamentos + "]";
    }

}
