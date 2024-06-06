package Baloncesto;

public class Jugador implements Comparable<Jugador> {

    private String nombre;
    private double altura;
    private int minutosJugados;
    private double puntosPorPartido;
    private int edad;

    public Jugador(String nombre, double altura, int minutosJugados, double puntosPorPartido, int edad) {
        this.nombre = nombre;
        this.altura = altura;
        this.minutosJugados = minutosJugados;
        this.puntosPorPartido = puntosPorPartido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getMinutosJugados() {
        return minutosJugados;
    }

    public void setMinutosJugados(int minutosJugados) {
        this.minutosJugados = minutosJugados;
    }

    public double getPuntosPorPartido() {
        return puntosPorPartido;
    }

    public void setPuntosPorPartido(double puntosPorPartido) {
        this.puntosPorPartido = puntosPorPartido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Jugador [nombre=" + nombre + ", altura=" + altura + ", minutosJugados=" + minutosJugados
                + ", puntosPorPartido=" + puntosPorPartido + ", edad=" + edad + "]";
    }

    @Override
    public int compareTo(Jugador obj) {
        return nombre.compareTo(obj.getNombre());
    }

}
