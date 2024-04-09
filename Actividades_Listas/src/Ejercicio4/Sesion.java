package Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Sesion {

    private final int TOPE_MAX = 5;

    private String titulo;
    private String fecha;
    List<Persona> personasEnSesion;

    public Sesion(String titulo, String fecha) {
        this.titulo = titulo;
        this.fecha = fecha;
        personasEnSesion = new ArrayList<Persona>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void añadirPersona(Persona p) {
        if(personasEnSesion.size() < TOPE_MAX) {
            personasEnSesion.add(p);
        }else{
            System.out.println("Sesion llena");
        }
    }

    public void mostrarSesion(){
        System.out.println(titulo + " " + fecha);
        for (Persona p : personasEnSesion) {
            System.out.println(p.toString());
        }
    }

    public double cantidadTotalRecaudada() {
        double total = 0;
        for (Persona p : personasEnSesion) {
            if (p.getEdad() < 10) {
                total += 1;
            } else if (p.getEdad() >= 11 && p.getEdad() <= 17) {
                total += 2;
            } else if (p.getEdad() >= 18 && p.getEdad() <= 65) {
                total += 7;
            } else {
                total += 2;
            }
        }
        return total;
    }

    @Override
    public String toString() {
        return "Sesion [titulo=" + titulo + ", fecha=" + fecha + "]";
    }

}
