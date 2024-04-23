package Ejercicio3;

public class Contrasena {

    private String valorContraseña;

    public Contrasena(String param) {
        if (comprobarContrasena(param) == true) {
            valorContraseña = param;
        } else {
            valorContraseña = "XXX";
        }
    }

    /**
     * Comprueba contraseña valida
     * long entre 6 y 10 caracteres
     * min una mayuscula y un numero
     * 
     * @param param
     * @return
     */

    public static boolean comprobarContrasena(String param) {

        boolean resul = true;

        if (param.length() < 6 || param.length() > 10) {
            resul = false;
        } else {
            boolean mayEncontrada = false;
            boolean digEncontrado = false;
            for (int i = 0; i < param.length(); i++) {
                char car = param.charAt(i);
                if (Character.isUpperCase(car) == true) {
                    mayEncontrada = true;
                } else {
                    if (Character.isDigit(car) == true) {
                        digEncontrado = true;
                    }
                }
                if (mayEncontrada == false && digEncontrado == false) {
                    resul = false;
                }
            }
        }
        return resul;
    }

    public String getValorContraseña() {
        return valorContraseña;
    }

}
