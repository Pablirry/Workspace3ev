package Ejemplo1_Tablas_Hash;

import java.util.Objects;

public class Persona {

    private String nombre;
    private int cod;

    public Persona(String nombre, int cod) {
        this.nombre = nombre;
        this.cod = cod;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", cod=" + cod + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(cod);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        return cod == other.cod;
    }

}
