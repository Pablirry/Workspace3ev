package Ejercicio4;

import java.util.LinkedList;
import java.util.List;

public class Cola {

    private List<Persona> personasEnCola;

    public Cola() {
        personasEnCola = new LinkedList<Persona>();
    }

    public void añadirPersona(Persona p) {
        personasEnCola.add(p);
    }

    public Persona sacarPersona() {
        if (personasEnCola.isEmpty()==true) {
            System.out.println("La cola está vacía");
            return null;
        } else {
            Persona p = personasEnCola.remove(0);
            return p;
        }
    }

    public void listarCola() {
        System.out.println("Personas en cola: ");
        for (Persona p : personasEnCola) {
            System.out.println(p.toString());
        }
    }

}
