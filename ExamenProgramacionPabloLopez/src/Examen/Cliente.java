package Examen;

public class Cliente {

    private String dni;
    private String nombre;
    private String telefono;

    public Cliente(String dni, String nombre, String telefono) {
        this.dni = validarDni(dni);
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Cliente(String dni){
        this.dni = dni;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente [dni=" + dni + ", nombre=" + nombre + ", telefono=" + telefono + "]";
    }

    private String validarDni(String dni) {
        if(dni.matches("[0-9]{8}[a-zA-Z]")){
            return dni;
        }else{
            return "El dni no está bien formado";
        }

        }
}