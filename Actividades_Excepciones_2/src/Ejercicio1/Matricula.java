package Ejercicio1;

import java.util.Objects;

public class Matricula {

	private String matricula;

    /**
     * Constructor de la clase Matricula
     * 
     * @param String : matrícula
     */
    public Matricula(String matricula) {
        this.matricula = validarMatricula(matricula);
    }

    /**
     * Devuelve la matrícula
     * 
     * @return String : matrícula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Valida la matrícula, en caso de ser incorrecta muestra un mensaje de error y
     * se asigna una cadena vacía
     * formato de la matrícula A-0000-AA
     * 
     * @param String : matrícula a validar
     * @return String : matrícula validada o cadena vacía
     */
    private String validarMatricula(String matricula) {
        boolean correcto = true;
        // longitud
        if (matricula.length() != 9) {
            System.err.println("La matrícula debe tener 8 caracteres");
            correcto = false;
        } else {
            // verificar separadores
            if (matricula.charAt(1) != '-' || matricula.charAt(6) != '-') {
                System.err.println("Los separadores deben ser guiones");
                correcto = false;

            }
            // primer pos y dos últimas letras
            if (!Character.isLetter(matricula.charAt(0)) || !Character.isLetter(matricula.charAt(7))
                    || !Character.isLetter(matricula.charAt(8))) {
                System.err.println("La primera y últimas dos posiciones deben ser letras");
                correcto = false;
            }
            // 2 a 5 dígitos
            for (int i = 2; i < 6; i++) {
                if (!Character.isDigit(matricula.charAt(i))) {
                    correcto = false;
                }
            }
        }
        return correcto ? matricula : "";
    }

    /**
     * Devuelve la representación en cadena de un objeto
     * 
     * @return String : matrícula en cadena
     */
    @Override
    public String toString() {
        return matricula;
    }

    /**
     * Devuelve el hashCode de la matrícula
     * 
     * @return int : hashCode
     */
    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    @Override
    /**
     * Compara dos matrículas
     * 
     * @param Object : matrícula a comparar
     * @return boolean : true si son iguales, false en caso contrario
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Matricula)) {
            return false;
        }
        Matricula matricula = (Matricula) obj;
        return Objects.equals(this.matricula, matricula.matricula);
    }

}