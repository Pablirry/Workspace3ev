package Ejercicio4;

public class Acceso {

    private Direccion dir;
    private int contadorAccesos;

    public Acceso(String string) {
        dir = new Direccion(string);
        contadorAccesos = 1;
    }

    public void incrementarAcceso() {
        contadorAccesos++;
    }

    @Override
    public String toString() {
        String texto = dir.toString();
        texto += "\n\tNumero de acceso " + contadorAccesos;
        return texto;
    }

}
