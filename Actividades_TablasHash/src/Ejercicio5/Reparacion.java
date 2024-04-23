package Ejercicio5;

public class Reparacion {

    private static int idIncr = 0;
    private int id;
    private String matricula;
    private String dni;
    private double precio;

    public Reparacion(String matricula, String dni) {
        this.id = ++idIncr;
        this.matricula = matricula;
        this.dni = dni;
    }

    public int getId() {
        return id;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getDni() {
        return dni;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Reparacion [id=" + id + ", matricula=" + matricula + ", dni=" + dni + ", precio=" + precio + "]";
    }

}
