package Baloncesto;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GestorPartidos {

	private Map<String, Partido> partidos;
	private List<Seleccion> selecciones;

	public GestorPartidos() {
		this.partidos = new HashMap<String, Partido>();
		this.selecciones = new LinkedList<Seleccion>();
	}

	public void agregarSeleccion(Seleccion seleccion) throws ExcepcionBaloncesto {
		for (Seleccion s : selecciones) {
			if (s.getCodigo() == seleccion.getCodigo()) {
				throw new ExcepcionBaloncesto("Ya existe una seleccion con el mismo codigo");
			}
			if (s.getNombre().equals(seleccion.getNombre())) {
				throw new ExcepcionBaloncesto("Ya existe una seleccion con el mismo nombre");
			}
		}
		selecciones.add(seleccion);
	}

	public void agregarJugadorASeleccion(Jugador jugador, int codigoSeleccion) throws ExcepcionBaloncesto {
		for (Seleccion s : selecciones) {
			if (s.getCodigo() == codigoSeleccion) {
				for (Jugador j : s.getJugadores()) {
					if (j.getNombre().equals(jugador.getNombre())) {
						throw new ExcepcionBaloncesto("Ya existe un jugador con ese nombre en esa seleccion");
					}
				}
				s.agregarJugador(jugador);
			}
		}
	}

	public void agregarPartido(String fecha, char codEstadio, Seleccion equipoA, Seleccion equipoB)
			throws ExcepcionBaloncesto {

		String codPartido = fecha + codEstadio;

		if (partidos.containsKey(codPartido)) {
			throw new ExcepcionBaloncesto("Ya existe un partido con ese codigo");
		}
		if (!selecciones.contains(equipoA) || !selecciones.contains(equipoB)) {
			throw new ExcepcionBaloncesto("No existe alguna de las selecciones");
		}

		Partido partido = new Partido(fecha, codEstadio, equipoA, equipoB);
		partidos.put(codPartido, partido);
	}

	public void agregarPuntuacionPartido(String fecha, char codEstadio, Seleccion equipo, int puntuacion)
			throws ExcepcionBaloncesto {

		String codPartido = fecha + codEstadio;

		if (!partidos.containsKey(codPartido)) {
			throw new ExcepcionBaloncesto("El partido no existe");
		}
		if (puntuacion < 0) {
			throw new ExcepcionBaloncesto("La puntuacion no puede ser negtiva");
		}

		Partido partido = partidos.get(codPartido);

		if (equipo.equals(partido.getEquipoA())) {
			partido.setResultados(puntuacion, partido.getResultadoB());
		} else if (equipo.equals(partido.getEquipoB())) {
			partido.setResultados(partido.getResultadoA(), puntuacion);
		} else {
			throw new ExcepcionBaloncesto("El equipo no pertenece al partido");
		}
	}

	public void mostrarDatosSeleccion(int codigo) throws ExcepcionBaloncesto {

		for (Seleccion s : selecciones) {
			if (s.getCodigo() == codigo) {
				System.out.println(s);
				for (Jugador j : s.getJugadores()) {
					System.out.println(j);
				}
				return;
			}
		}
		throw new ExcepcionBaloncesto("No existe una seleccion con ese codigo");
	}

	public void mostrarSelecciones() {
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
			double alturaMedia = 0;
			if (cantidadJugadores > 0) {
				alturaMedia = sumaAlturas / cantidadJugadores;
			}
			System.out.println("Altura media Seleccion " + s.getNombre() + " = " + alturaMedia);
		}
	}

	public void mostrarMaximoEdad(int codigo) throws ExcepcionBaloncesto {
		for (Seleccion s : selecciones) {
			if (s.getCodigo() == codigo) {
				if (s.getJugadores().isEmpty()) {
					throw new ExcepcionBaloncesto("La seleccion no tiene jugadores");
				}
				Jugador jugadorMaxEdad = null;
				for (Jugador j : s.getJugadores()) {
					if (jugadorMaxEdad == null || j.getEdad() > jugadorMaxEdad.getEdad()) {
						jugadorMaxEdad = j;
					}
				}
				System.out.println("El jugador con maxima edad de la seleccion " + s.getNombre() + " es " + jugadorMaxEdad);
			}
				
			
		}
	}
}
