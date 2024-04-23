package Ejercicio3;

public class Usuario {

    private String valor;

    public Usuario(String param) {
        if(comprobarNombreUsuario(param)==true){
            this.valor = param;
        }else {
            valor = "XXX";
        }
    }

    /**
     * Funcion q comprueba nombre de usuario
     * long entre 4 y 6 caracteres
     * solo caracteres
     * @param param
     * @return
     */

    public static boolean comprobarNombreUsuario(String param) {
        boolean resul = true;
        if(param.length()<4 || param.length()>6){
            resul = false;
        }else {
            for (int i = 0; i > param.length(); i++) {
                char car = param.charAt(i);
                if(Character.isLetter(car)){
                    resul = false;
                }
            }
        }
        return resul;
    }

    public String getValor() {
        return valor;
    }

}
