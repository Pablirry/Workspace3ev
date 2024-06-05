package Ejercicio;

import java.util.HashSet;
import java.util.Set;

/*
 * De cada selección tenemos la siguiente información:
• Código -> entero
• Nombre -> String
• Nombre del seleccionador -> String
• Conjunto de jugadores (implementado con un TreeSet)
 */

public class Seleccion {

	private int codigo;
	private String nombre;
	private String nombreSeleccionador;
	private Set<Jugador> jugadores;

	public Seleccion(int codigo, String nombre, String nombreSeleccionador) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.nombreSeleccionador = nombreSeleccionador;
		this.jugadores = new HashSet<>();
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public Set<Jugador> getJugadores() {
		return jugadores;
	}

	public void agregarJugador(Jugador jugador) {
		jugadores.add(jugador);
	}

	@Override
	public String toString() {
		return "Código: " + codigo + ", Nombre: " + nombre + ", Seleccionador: " + nombreSeleccionador;
	}
}
