package Ejercicio4;

import java.util.HashMap;
import java.util.Map;

public class Principal {

    public static void main(String[] args) {
        
        // Crear un diccionario para almacenar las visitas web
        Map<DireccionHttp, Integer> visitasWeb = new HashMap<>();

        // Ejemplo de uso
        registrarVisita(visitasWeb, "http://www.ejemplo.com:80/pagina1");
        registrarVisita(visitasWeb, "http://www.otroejemplo.com:8080/pagina2");
        registrarVisita(visitasWeb, "http://www.ejemplo.com:80/pagina1");

        // Mostrar número de visitas
        System.out.println("Número de visitas a http://www.ejemplo.com:80/pagina1: " + obtenerNumeroVisitas(visitasWeb, "http://www.ejemplo.com:80/pagina1"));
        System.out.println("Número de visitas a http://www.otroejemplo.com:8080/pagina2: " + obtenerNumeroVisitas(visitasWeb, "http://www.otroejemplo.com:8080/pagina2"));
    
        System.out.println(descomponerDireccion("http://www.ejemplo.com:80/pagina1"));
        System.out.println(descomponerDireccion("http://www.otroejemplo.com:8080/pagina2"));
    }

    public static void registrarVisita(Map<DireccionHttp, Integer> visitasWeb, String direccionCompleta) {
        DireccionHttp direccion = descomponerDireccion(direccionCompleta);
        visitasWeb.put(direccion, visitasWeb.getOrDefault(direccion, 0) + 1);
    }

    public static int obtenerNumeroVisitas(Map<DireccionHttp, Integer> visitasWeb, String direccionCompleta) {
        DireccionHttp direccion = descomponerDireccion(direccionCompleta);
        return visitasWeb.getOrDefault(direccion, 0);
    }

    public static DireccionHttp descomponerDireccion(String direccionCompleta) {
        // Ejemplo de descomposición de la dirección: http://www.ejemplo.com:80/pagina1
        String[] partes = direccionCompleta.split(":");
        String servidor = partes[1].substring(2); // www.ejemplo.com
        int puerto = Integer.parseInt(partes[2].split("/")[0]); // 80
        String direccion = partes[2].substring(partes[2].indexOf("/")); // /pagina1
        return new DireccionHttp(servidor, puerto, direccion);
    }

}
