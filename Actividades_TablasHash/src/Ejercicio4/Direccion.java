package Ejercicio4;

import java.util.Objects;

public class Direccion {

    private String servidor;
    private int puerto;
    private String recurso;
    private boolean esCorrecta;

    public Direccion(String string) {
        // limpiar direccion
        int i = 0;
        while (i < string.length() && string.charAt(i) != 'w') {
            i++;
        }

        // sacar servidor
        servidor = "";
        while (i < string.length() && string.charAt(i) != ':') {
            servidor += string.charAt(i);
            i++;
        }
        // i apunta a los :
        i++;

        String puertoString = "";
        while (i < string.length() && Character.isDigit(string.charAt(i))) {
            puertoString += string.charAt(i);
            i++;
        }

        puerto = Integer.parseInt(puertoString);

        // i apunta / (/datos/recurso.txt)
        recurso = "";
        while (i < string.length()) {
            recurso += string.charAt(i);
            i++;
        }

        // validarDireccion();
        esCorrecta = true;
    }

    @SuppressWarnings("unused")
    private boolean validarDireccion() {
        esCorrecta = true;
        // XX letras y numeros
        // validar el servidor
        // www.XXXX.XXXXXXX.XXXX.EXT

        String trozos[] = servidor.split(".");
        /*
         * www.host.com
         * [0]=www
         * [1]=host
         * [2]=com
         */
        if (trozos[0].charAt(0) != 'w' || trozos[0].charAt(1) != 'w' ||
                trozos[0].charAt(2) != 'w')
            esCorrecta = false;
        int ultimaPosicion = trozos.length - 1;
        if (trozos[ultimaPosicion].length() != 3)
            esCorrecta = false;

        // validar el recurso
        // /XXXXX/XXXXX/XXXX.EXT
        String trozos2[] = recurso.split("/");
        ultimaPosicion = trozos2.length - 1;
        if (trozos2[ultimaPosicion].length() != 3)
            esCorrecta = false;

        return esCorrecta;
    }

    @Override
    public String toString() {
        return "Direccion \n   [servidor=" + servidor + ", puerto=" + puerto + ", recurso=" + recurso + ", esCorrecta="
                + esCorrecta + "]";
    }

    public String getServidor() {
        return servidor;
    }

    public int getPuerto() {
        return puerto;
    }

    public String getRecurso() {
        return recurso;
    }

    public boolean isEsCorrecta() {
        return esCorrecta;
    }

    @Override
    public int hashCode() {
        return Objects.hash(puerto, recurso, servidor);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Direccion other = (Direccion) obj;
        return puerto == other.puerto && recurso.compareTo(other.recurso) == 0
                && servidor.compareTo(other.servidor) == 0;
    }

}
