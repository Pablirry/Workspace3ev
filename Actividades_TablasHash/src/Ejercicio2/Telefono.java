package Ejercicio2;

public class Telefono {

    private String numero;

    // Constructor
    public Telefono(String numero) {
        this.numero = numero;
    }

    // Comprobar que el telefono tiene un formato correcto (9 digitos)
    public boolean esCorrecto() {
        if (numero.length() != 9) {
            return false;
        }
        for (int i = 0; i < numero.length(); i++) {
            char c = numero.charAt(i);
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    // Getter
    public String getNumero() {
        return numero;
    }

}
