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

    public void agregarSeleccion (Seleccion seleccion) throws ExcepcionBaloncesto {
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
            if(s.getCodigo() == codigoSeleccion) {
                for(Jugador j : s.getJugadores()) {
                    if (j.getNombre().equals(jugador.getNombre())) {
                        throw new ExcepcionBaloncesto("Ya existe un jugador con ese nombre en esa seleccion");
                    }
                }
                s.agregarJugador(jugador);
            }
        }
    }

    public void agregarPartido(String fecha, char codEstadio, Seleccion equipoA, Seleccion equipoB) throws ExcepcionBaloncesto {

        String codPartido = fecha + codEstadio;
        
        if (partidos.containsKey(codPartido)) {
            throw new ExcepcionBaloncesto("Ya existe un partido con ese codigo");
        }
        if(!selecciones.contains(equipoA) || !selecciones.contains(equipoB)) {
            throw new ExcepcionBaloncesto("No existe alguna de las selecciones");
        }

        Partido partido = new Partido(fecha, codEstadio, equipoA, equipoB);
        partidos.put(codPartido, partido);
    }


}
