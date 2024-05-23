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

    public List<Empleado> getEmpleadosDepartamento(String nombreDep) throws DepartamentoNotFoundException {
        Departamento d = null;
        for(int i=0; i<departamentos.size() && d==null; i++) {
            Departamento dep = departamentos.get(i);
            if(dep.getNombre().compareTo(nombreDep)==0){
                d=dep;
            }
        }
        if(d==null){
            throw new DepartamentoNotFoundException("Departamento " + nombreDep + " no encontrado");
        }else{
            return d.getEmpleados();
        }
    }

    public Departamento buscarDepartamento(String nombreDep) throws DepartamentoNotFoundException {

        for(Departamento d:departamentos){
            if(d.getNombre().compareTo(nombreDep)==0){
                return d;
            }
        }
        throw new DepartamentoNotFoundException("Departamento no encontrado");
    }

    public Empleado buscarEmpleado(String nombre) throws EmpleadoNotFoundException {
        for (Departamento d : departamentos) {
            for (Empleado e : d.getEmpleados()) {
                if (e.getNombre().compareTo(nombre) == 0) {
                    return e;
                }
            }
        }
        throw new EmpleadoNotFoundException("Empleado no encontrado");
    }
}
