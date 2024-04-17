package Ejercicio1;

import java.util.Objects;

public class Matricula {

    private String valor;

    public Matricula(String matricula) {
        if (comprobarMatricula(matricula) == true) {
            this.valor = matricula;
        } else {
            this.valor = "-1";
        }
    }

    /**
     * Comprobar que la matricula es correcta
     * 1.- si long != 8 error
     * 2.- si alguno de los 4 primeros no es digito error
     * 3.- la pos 4 tiene que ser un guion
     * 4.- si alguno de los 3 ultimos no es letra error
     * 
     * @param matricula
     * @return
     */

    public static boolean comprobarMatricula(String matricula) {
        boolean resul = true;
        if (matricula.length() != 8) {
            resul = false;
            System.out.println("Error en longitud de matricula");
        }

        for (int i = 0; i < 4; i++) {
            char car = matricula.charAt(i);
            if (Character.isDigit(car) == false) {
                System.out.println("Error, no digito pos " + i);
                resul = false;
            }
        }

        char car = matricula.charAt(4);
        if (car != '-') {
            System.out.println("Error no hay guion en pos 4.");
        }

        for (int i = 5; i < 8; i++) {
            car = matricula.charAt(i);
            if (Character.isLetter(car) == false) {
                System.out.println("Error, No letra en la posición " + i);
                resul = false;
            }
        }
        return resul;
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Matricula other = (Matricula) obj;
        return Objects.equals(valor, other.valor);
    }

    @Override
    public String toString() {
        return valor;
    }

}
