package Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Cine {

    private List<Sesion> sesiones;
    private Cola cola;

    public Cine(){
        sesiones = new ArrayList<>();
        cola = new Cola();
    }

    public void añadirPersonaEnCola(Persona p){
        cola.añadirPersona(p);
    }

    public void crearSesion(String tituloPelicula, String fecha) {
        Sesion s = new Sesion("tituloPelicula", "aaaammdd-hh:mm");
        Persona p1 = cola.sacarPersona();
        s.añadirPersona(p1);
        Persona p2 = cola.sacarPersona();
        s.añadirPersona(p2);
        Persona p3 = cola.sacarPersona();
        s.añadirPersona(p3);
        s.mostrarSesion();
        s.cantidadTotalRecaudada();
    }

    public void mostrarCine(){
        cola.listarCola();
        for(Sesion s : sesiones){
            s.mostrarSesion();
        }
    }

    public void añadirPersonaSesion(int sesionIndex, Persona p) {
        if (sesionIndex >= 0 && sesionIndex < sesiones.size()) {
            sesiones.get(sesionIndex).añadirPersona(p);
        } else {
            System.out.println("La sesión especificada no existe.");
        }
    }

    public void listarSesiones() {
        System.out.println("Sesiones:");
        for (int i = 0; i < sesiones.size(); i++) {
            Sesion sesion = sesiones.get(i);
            System.out.println(sesion.toString());
        }
    }

    public void llenarCola(){
        for(int i = 1;i<=10;i++){
            String nombre = "Per" +i;
            Persona p = new Persona(nombre);
            cola.añadirPersona(p);
        }
        cola.listarCola();
    }

    public void listarCola() {
        cola.listarCola();
    }

}
