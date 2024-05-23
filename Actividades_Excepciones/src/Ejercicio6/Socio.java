package Ejercicio6;

public class Socio {

    private String nif;
    private String nombre;
    private String apellidos;
    private String codSocio;
    private String cp;

    public Socio(String nif, String nombre, String apellidos, String codSocio, String cp) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.codSocio = codSocio;
        this.cp = cp;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
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

    public String getCodSocio() {
        return codSocio;
    }

    public void setCodSocio(String codSocio) {
        this.codSocio = codSocio;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    @Override
    public String toString() {
        return "Socio [nif=" + nif + ", nombre=" + nombre + ", apellidos=" + apellidos + ", codSocio=" + codSocio
                + ", cp=" + cp + "]\n\t";
    }

}
