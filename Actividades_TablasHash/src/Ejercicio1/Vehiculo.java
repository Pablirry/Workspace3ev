package Ejercicio1;

public class Vehiculo {

    private Matricula matricula;
    private String modelo;
    private int km;

    public Vehiculo(String matricula, int km, String modelo) {
        this.matricula = new Matricula(matricula);
        this.modelo = modelo;
        this.km = km;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public int getKm() {
        return km;
    }

    @Override
    public String toString() {
        return "Vehiculo [Matrícula: " + matricula + ", Modelo: " + modelo + ", Kilometraje: " + km + "]";
    }
}

