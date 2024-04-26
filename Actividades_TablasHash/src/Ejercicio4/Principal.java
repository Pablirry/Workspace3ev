package Ejercicio4;

public class Principal {

    public static void main(String[] args) {

        ContadorAccesos cont = new ContadorAccesos();
        cont.añadirDireccion("http://www.host.com:80/datos/fichero.txt");
        cont.añadirDireccion("http://www.host.com:80/datos/fichero.txt");
        cont.añadirDireccion("http://www.host.com:80/datos/fichero.txt");
        cont.añadirDireccion("http://www.host.com:80/datos/fichero.txt");
        cont.añadirDireccion("http://www.host.com:80/datos/fichero.txt");

        cont.añadirDireccion("http://www.host.com:80/SRC/fichero2.txt");
        cont.añadirDireccion("http://www.host.com:80/SRC/fichero2.txt");
        cont.añadirDireccion("http://www.host.com:80/SRC/fichero2.txt");
        cont.añadirDireccion("http://www.host.com:80/SRC/fichero2.txt");

        cont.añadirDireccion("http://www.hosting.com:80/SRC/fichero2.txt");
        cont.añadirDireccion("http://www.hosting.com:80/SRC/fichero2.txt");
        cont.añadirDireccion("http://www.hosting.com:80/SRC/fichero2.txt");

        cont.añadirDireccion("http://www.hosting.com:8081/datos/fichero1.txt");
        cont.añadirDireccion("http://www.hosting.com:8081/datos/fichero1.txt");
        cont.añadirDireccion("http://www.hosting.com:8081/datos/fichero1.txt");
        cont.añadirDireccion("http://www.hosting.com:8081/datos/fichero1.txt");

        cont.mostrarAccesos();

    }
}
