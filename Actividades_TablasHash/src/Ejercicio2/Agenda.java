package Ejercicio2;

import java.util.HashMap;

public class Agenda {

    private HashMap<Telefono, Contacto> agenda;

    // Constructor
    public Agenda() {
        agenda = new HashMap<>();
    }

    // Metodos

    // boolean esVacia()
    public boolean esVacia() {
        return agenda.isEmpty();
    }

    // void nuevaEntrada (String numero, String nombre, String dirección)
    public void nuevaEntrada(String numero, String nombre, String direccion) {
        Telefono tel = new Telefono(numero);
        if (tel.esCorrecto()) {
            Contacto contact = new Contacto(nombre, tel, direccion);
            agenda.put(tel, contact);
        } else {
            System.out.println("Formato de telefono incorrecto");
        }
    }

    // Contacto buscaContactoTelefono(String numero)
    public Contacto buscaContactoTelefono(String numero) {
        Telefono tel = new Telefono(numero);
        if (tel.esCorrecto()) {
            return agenda.get(tel);
        } else {
            System.out.println("Formato de telefono incorrecto");
            return null;
        }
    }

    // Contacto buscaContactoNombre(String nombre)
    public Contacto buscaContactoNombre(String nombre) {
        for (Contacto contact : agenda.values()) {
            if (contact.getNombre().equals(nombre)) {
                return contact;
            }
        }
        System.out.println("Contacto no encontrado");
        return null;
    }

    // void mostrarAgenda()
    public void mostrarAgenda() {
        for (Contacto contact : agenda.values()) {
            System.out.println("Nombre: " + contact.getNombre());
            System.out.println("Telefono: " + contact.getTelefono().getNumero());
            System.out.println("Direccion: " + contact.getDireccion());
            System.out.println("--------------------");
        }
    }

    // void imprimirAgenda()
    public void imprimirAgenda() {
        for (Contacto contact : agenda.values()) {
            System.out.println("[" + contact.getNombre() + ", " + contact.getTelefono().getNumero() + ", "
                    + contact.getDireccion() + "]");
        }
    }

}
