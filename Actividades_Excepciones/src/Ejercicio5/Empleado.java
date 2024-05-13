package Ejercicio5;

public class Empleado {

    private String nombre;
    private String apellidos;
    private String nif;
    private String puesto;

    public Empleado(String nombre, String apellidos, String nif, String puesto) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
        this.puesto = puesto;
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

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", apellidos=" + apellidos + ", nif=" + nif + ", puesto=" + puesto + "]";
    }

}
