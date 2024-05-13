package Ejercicio4;

public class Prueba {

    public static void main(String[] args) {

        Propietario p1 = new Propietario ("prop1", "ape1");
        Propietario p2 = new Propietario ("prop2", "ape2");
        Apartamento a1 = new Apartamento(1, 'A');
        a1.añadirPropietario(p1);
        a1.añadirPropietario(p2);
        Propietario p3 = new Propietario ("prop3", "ape3");
        Propietario p4 = new Propietario ("prop4", "ape4");
        Apartamento a2 = new Apartamento(1, 'B');
        a2.añadirPropietario(p3);
        a2.añadirPropietario(p4);
        Propietario p5 = new Propietario ("prop5", "ape5");
        Propietario p6 = new Propietario ("prop6", "ape6");
        Apartamento a3 = new Apartamento(1, 'C');
        a3.añadirPropietario(p5);
        a3.añadirPropietario(p6);
        Propietario p7 = new Propietario ("prop7", "ape7");
        Propietario p8 = new Propietario ("prop8", "ape8");
        Apartamento a4 = new Apartamento(1, 'D');
        a4.añadirPropietario(p7);
        a4.añadirPropietario(p8);

        Edificio edificio = new Edificio("Oviedo", "Asturias", 33001);
        edificio.añadirApartamento(a1);
        edificio.añadirApartamento(a2);
        edificio.añadirApartamento(a3);
        edificio.añadirApartamento(a4);

           
       
    }
}
