package Ejercicio2;

public class Contacto {

    private String nombre;
    private Telefono telefono;
    private String direccion;

    // Constructor
    public Contacto(String nombre, Telefono telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

}
