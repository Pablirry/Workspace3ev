package Ejercicio4;

public class Persona {

    /*
     * Un cine de un pueblo pequeño nos propone hacer una aplicación para controlar
     * las personas de una cola de un cine en los grandes estrenos de películas. El
     * grupo de personas esperan en una cola para sacar una entrada, que tendremos
     * que calcular en base a su edad.
     * • Menores de 10 años : 1€
     * • Entre 11 y 17 años : 2€
     * • Mayores de 18 años hasta 65: 7€
     * • Mayores de 65 : 2€
     * Almacenamos una clase persona con los atributos:
     * • Nombre : String
     * • Edad : int generado de forma aleatoria entre 5 y 90 años
     * A medida que los ciudadanos solicitan entradas, se le asigna a la cola. A
     * medida que van entrando, se les saca de la cola.
     * De cada sesión se almacena:
     * • Titulo de la película
     * • Fecha :dd/mm/aa-hh:mm
     * • Una listas de personas que entran en cada sesión
     * • Métodos:
     * o double cantidadTotalRecaudada(
     * void añadirPersona(Persona p) : Tener en cuenta que añadir una persona a la
     * sesión implica sacarla de la cola
     * En la clase Cola se requieren los siguientes métodos:
     * • void añadirPersona(Persona p)
     * • Persona sacarPersona(
     * Métodos de la clase cine
     * • void añadirPersonaenLaCola(Persona p)
     * • void crearSesion()
     * • void añadirPersonaSesion()
     * • void listarCola()
     * • void listarSesiones()
     */

    private String nombre;
    private int edad;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.edad = generarEdadAleatoria();
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    private int generarEdadAleatoria() {
        return (int) (Math.random()*85) + 5; // genera un número aleatorio entre 5 y 90
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
    }
}
