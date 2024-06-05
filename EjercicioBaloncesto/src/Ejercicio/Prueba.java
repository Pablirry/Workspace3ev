package Ejercicio;

public class Prueba {
	
	public static void main(String[] args) {
        GestorPartidos gestor = new GestorPartidos();

        Seleccion esp = new Seleccion(1, "España", "Seleccionador 1");
        Seleccion usa = new Seleccion(2, "USA", "Seleccionador 2");

        gestor.agregarSeleccion(esp);
        gestor.agregarSeleccion(usa);

        Jugador jugador1 = new Jugador("Jugador 1", 1.90, 30, 20.5, 25);
        Jugador jugador2 = new Jugador("Jugador 2", 2.05, 28, 18.0, 30);

        gestor.agregarJugadorASeleccion(jugador1, 1);
        gestor.agregarJugadorASeleccion(jugador2, 1);

        gestor.agregarPartido("10/06/2023A", esp, usa);

        gestor.agregarPuntuacionPartido("10/06/2023A", esp, 80);
        gestor.agregarPuntuacionPartido("10/06/2023A", usa, 85);

        gestor.mostrarDatosSeleccion(1);

        gestor.mostrarTodasSelecciones();

        gestor.mostrarAlturaMedia();

        gestor.mostrarMaximoEdad(1);
    }

}
