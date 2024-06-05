package Ejercicio;

/*
 * De cada jugador tenemos la siguiente información:
 • Nombre -> String
 • Altura ->número real
 • Minutos jugados -> entero
 • Puntos por partido ->número real
 • Edad -> entero
 */

public class Jugador {
	
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

    public double getAltura() {
        return altura;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Altura: " + altura + ", Minutos Jugados: " + minutosJugados + 
               ", Puntos por Partido: " + puntosPorPartido + ", Edad: " + edad;
    }
}
