package Baloncesto;

import java.util.Set;
import java.util.TreeSet;

public class Seleccion {

    private int codigo;
    private String nombre;
    private String nombreSeleccionador;
    private Set<Jugador> jugadores;

    public Seleccion(int codigo, String nombre, String nombreSeleccionador) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nombreSeleccionador = nombreSeleccionador;
        this.jugadores = new TreeSet<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreSeleccionador() {
        return nombreSeleccionador;
    }

    public void setNombreSeleccionador(String nombreSeleccionador) {
        this.nombreSeleccionador = nombreSeleccionador;
    }

    public Set<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(Set<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    @Override
    public String toString() {
        return "Seleccion [codigo=" + codigo + ", nombre=" + nombre + ", nombreSeleccionador=" + nombreSeleccionador
                + "]\n\t jugadores=" + jugadores + "]";
    }

}
