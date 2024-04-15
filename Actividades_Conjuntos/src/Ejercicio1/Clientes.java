package Ejercicio1;

import java.util.Objects;

public class Clientes {

    private String nombre;
    private String apellidos;
    private String dni;
    private String DESCUENTO;

    public Clientes(String nombre, String apellidos, String dni, String DESCUENTO) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.DESCUENTO = DESCUENTO;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDESCUENTO() {
        return DESCUENTO;
    }

    public void setDESCUENTO(String dESCUENTO) {
        DESCUENTO = dESCUENTO;
    }

    @Override
    public String toString() {
        return "Clientes [nombre=" + nombre + ", apellidos=" + apellidos + ", DESCUENTO=" + DESCUENTO + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Clientes other = (Clientes) obj;
        return (this.dni == other.dni);
    }

}
