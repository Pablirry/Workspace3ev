package Ejercicio5;

public class Vehiculo {

    private String matricula;
    private String modelo;

    public Vehiculo(String matricula, String modelo) {
        this.matricula = matricula;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "Vehiculo [matricula=" + matricula + ", modelo=" + modelo + "]";
    }

}
