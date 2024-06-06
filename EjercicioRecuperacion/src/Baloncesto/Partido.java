package Baloncesto;

public class Partido {

    private String codPartido;
	private Seleccion equipoA;
	private Seleccion equipoB;
	private int resultadoA;
	private int resultadoB;

    public Partido(String fecha, char codEstadio, Seleccion equipoA, Seleccion equipoB) {
        this.codPartido = fecha + codEstadio;
        this.equipoA = equipoA;
        this.equipoB = equipoB;
        resultadoA = 0;
        resultadoB = 0;
    }

    public String getCodPartido() {
        return codPartido;
    }

    public void setCodPartido(String codPartido) {
        this.codPartido = codPartido;
    }

    public Seleccion getEquipoA() {
        return equipoA;
    }

    public void setEquipoA(Seleccion equipoA) {
        this.equipoA = equipoA;
    }

    public Seleccion getEquipoB() {
        return equipoB;
    }

    public void setEquipoB(Seleccion equipoB) {
        this.equipoB = equipoB;
    }

    public int getResultadoA() {
        return resultadoA;
    }

    public void setResultados(int resultadoA, int resultadoB) {
        this.resultadoA = resultadoA;
        this.resultadoB = resultadoB;
    }

    public int getResultadoB() {
        return resultadoB;
    }

    @Override
    public String toString() {
        return "Partido: " + codPartido + 
        "\n\tEquipo A: " + equipoA.getNombre() + 
        "\n\tEquipo B: " + equipoB.getNombre() +
        "\n\tResultado: " + resultadoA + "-" + resultadoB;
    }

}
