package Ejercicio6;

public class SocioNotFoundException extends Exception {

    public SocioNotFoundException(String nif) {
        super("No se encontró el socio con NIF " + nif);
    }

}
