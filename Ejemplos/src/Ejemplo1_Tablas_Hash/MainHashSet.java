package Ejemplo1_Tablas_Hash;

public class MainHashSet {

    public static void main (String [] args) {

    Persona p1 = new Persona("Juan", 100);
    Persona p2 = new Persona("Pedro", 200);
    Persona p3 = new Persona("Juan", 300);
    Persona p4 = new Persona("Juan", 400);

    Conjunto_HashSet prueba = new Conjunto_HashSet();
    prueba.añadirPersona(p1);
    prueba.añadirPersona(p2);
    prueba.añadirPersona(p3);
    prueba.añadirPersona(p4);

    prueba.mostrarConjunto();

    System.out.println("******************************");
    System.out.println("Borramos p1");
    prueba.borrarPersona(p1);
    prueba.mostrarConjunto();

    System.out.println("******************************");
    System.out.println("Borrar una persona juan 300");
    Persona pNueva = new Persona("Juan", 300);
    prueba.borrarPersona(pNueva);
    prueba.mostrarConjunto();

    }
}
