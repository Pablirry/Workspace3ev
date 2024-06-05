package Ejercicio;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GestorPartidos {

	private Map<String, Partido> partidos;
	private List<Seleccion> selecciones;

	public GestorPartidos() {
		this.partidos = new HashMap<>();
		this.selecciones = new LinkedList<>();
	}

	public void agregarSeleccion(Seleccion seleccion) {
		for (Seleccion s : selecciones) {
			if (s.getCodigo() == seleccion.getCodigo()) {
				System.out.println("Error: Ya existe una selección con el mismo código.");
				return;
			}
			if (s.getNombre().equals(seleccion.getNombre())) {
				System.out.println("Error: Ya existe una selección con el mismo nombre.");
				return;
			}
		}
		selecciones.add(seleccion);
		System.out.println("Selección agregada correctamente.");
	}

	public void agregarJugadorASeleccion(Jugador jugador, int codigoSeleccion) {
		for (Seleccion s : selecciones) {
			if (s.getCodigo() == codigoSeleccion) {
				for (Jugador j : s.getJugadores()) {
					if (j.getNombre().equals(jugador.getNombre())) {
						System.out.println("Error: Ya existe un jugador con el mismo nombre en esta selección.");
						return;
					}
				}
				s.agregarJugador(jugador);
				System.out.println("Jugador agregado correctamente.");
				return;
			}
		}
		System.out.println("Error: No existe una selección con el código especificado.");
	}

	public void agregarPartido(String codPartido, Seleccion equipoA, Seleccion equipoB) {
		if (partidos.containsKey(codPartido)) {
			System.out.println("Error: Ya hay un partido ese día en ese estadio.");
			return;
		}
		if (!selecciones.contains(equipoA) || !selecciones.contains(equipoB)) {
			System.out.println("Error: Alguna de las selecciones no existe.");
			return;
		}
		Partido partido = new Partido(codPartido, equipoA, equipoB);
		partidos.put(codPartido, partido);
		System.out.println("Partido agregado correctamente.");
	}

	public void agregarPuntuacionPartido(String codPartido, Seleccion equipo, int puntuacion) {
		if (!partidos.containsKey(codPartido)) {
			System.out.println("Error: El partido no está incluido.");
			return;
		}
		if (puntuacion < 0) {
			System.out.println("Error: La puntuación no puede ser negativa.");
			return;
		}
		Partido partido = partidos.get(codPartido);
		if (equipo.equals(partido.getEquipoA())) {
			partido.setResultados(puntuacion, partido.getResultadoB());
			System.out.println("Puntuación actualizada para el equipo A.");
		} else if (equipo.equals(partido.getEquipoB())) {
			partido.setResultados(partido.getResultadoA(), puntuacion);
			System.out.println("Puntuación actualizada para el equipo B.");
		} else {
			System.out.println("Error: El equipo no pertenece al partido.");
		}
	}

	public void mostrarDatosSeleccion(int codigo) {
		for (Seleccion s : selecciones) {
			if (s.getCodigo() == codigo) {
				System.out.println(s);
				for (Jugador j : s.getJugadores()) {
					System.out.println(j);
				}
				return;
			}
		}
		System.out.println("Error: No existe una selección con el código especificado.");
	}

	public void mostrarTodasSelecciones() {
		for (Seleccion s : selecciones) {
			System.out.println(s);
		}
	}

	public void mostrarAlturaMedia() {
		for (Seleccion s : selecciones) {
			double sumaAlturas = 0;
			int cantidadJugadores = s.getJugadores().size();
			for (Jugador j : s.getJugadores()) {
				sumaAlturas += j.getAltura();
			}
			double alturaMedia = cantidadJugadores > 0 ? sumaAlturas / cantidadJugadores : 0;
			System.out.println("Altura media de la selección " + s.getNombre() + ": " + alturaMedia);
		}
	}

	public void mostrarMaximoEdad(int codigo) {
		for (Seleccion s : selecciones) {
			if (s.getCodigo() == codigo) {
				if (s.getJugadores().isEmpty()) {
					System.out.println("Error: La selección no tiene jugadores.");
					return;
				}
				Jugador jugadorMaxEdad = null;
				for (Jugador j : s.getJugadores()) {
					if (jugadorMaxEdad == null || j.getEdad() > jugadorMaxEdad.getEdad()) {
						jugadorMaxEdad = j;
					}
				}
				System.out.println("Jugador más alto de la selección " + s.getNombre() + ": " + jugadorMaxEdad);
				return;
			}
		}
		System.out.println("Error: No existe una selección con el código especificado.");
	}

}
