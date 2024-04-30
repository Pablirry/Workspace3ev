package Examen;

public class Coche extends Vehiculo {

    private String marca;
    private String modelo;

    public Coche(Matricula matricula, int km, String marca, String modelo) {
        super(matricula, km);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Coche [marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula.getMatricula() + ", km=" + km + "]";
    }
}
