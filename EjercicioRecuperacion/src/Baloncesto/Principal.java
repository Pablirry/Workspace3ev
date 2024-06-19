package Baloncesto;

public class Principal {

	public static void main(String[] args) {

		GestorPartidos gestor = new GestorPartidos();

		Seleccion espana = new Seleccion(1, "España", "Seleccionador 1");
		Seleccion usa = new Seleccion(2, "USA", "Seleccionador 2");

		try {
			gestor.agregarSeleccion(espana);
			gestor.agregarSeleccion(usa);

			Jugador jugador1 = new Jugador("Jugador 1", 1.90, 30, 20.5, 25);
			Jugador jugador2 = new Jugador("Jugador 2", 2.05, 28, 18.0, 30);
			Jugador jugador3 = new Jugador("Jugador 3", 2.8, 28, 14.0, 25);
			Jugador jugador4 = new Jugador("Jugador 4", 2.05, 28, 12.0, 50);

			gestor.agregarJugadorASeleccion(jugador1, 1);
			gestor.agregarJugadorASeleccion(jugador2, 1);
			gestor.agregarJugadorASeleccion(jugador3, 2);
			gestor.agregarJugadorASeleccion(jugador4, 2);

			gestor.agregarPartido("10/06/2023", 'A', espana, usa);
			gestor.agregarPuntuacionPartido("10/06/2023", 'A', espana, 80);
			gestor.agregarPuntuacionPartido("10/06/2023", 'A', usa, 70);

			gestor.mostrarDatosSeleccion(1);
			gestor.mostrarAlturaMedia();
			gestor.mostrarMaximoEdad(2);
		} catch (ExcepcionBaloncesto e) {
			System.out.println(e.getMessage());
		}

	}

}
