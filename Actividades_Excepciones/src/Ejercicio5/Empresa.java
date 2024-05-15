package Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String nombre;
    private String CIF;
    private List<Departamento> departamentos;

    public Empresa(String nombre, String cIF) {
        this.nombre = nombre;
        CIF = cIF;
        this.departamentos = new ArrayList<Departamento>();
    }

    public void añadirDepartamento(Departamento d) {
        departamentos.add(d);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCIF() {
        return CIF;
    }

    public void setCIF(String cIF) {
        CIF = cIF;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    @Override
    public String toString() {
        String texto = "Empresa [nombre=" + nombre + ", CIF=" + CIF + "]\n";
        for (Departamento d : departamentos) {
            texto += d.toString();
        }
        return texto;
    }

    public void añadirEmpleado(String nombreDep, Empleado empleado) throws DepartamentoNotFoundException {
        boolean encontrado = false;
        for (Departamento d : departamentos) {
            if (d.getNombre().compareTo(nombreDep) == 0) {
                d.añadirEmpleado(empleado);
                encontrado = true;
            }
        }
        if (encontrado == false) {
            throw new DepartamentoNotFoundException("departamento " + nombreDep + " no encontrado");
        }

    }

    public void borrarDepartamento(String nombreDep) throws DepartamentoNotFoundException {
        for (int i = 0; i < departamentos.size(); i++) {
            Departamento d = departamentos.get(i);
            if (d.getNombre().compareTo(nombreDep) == 0) {
                departamentos.remove(i);
                return;
            }
        }
        throw new DepartamentoNotFoundException("departamento " + nombreDep + " no encontrado");
    }
}
