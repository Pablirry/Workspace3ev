package Tester;

import java.text.ParseException;

import Excepciones.miExcepcion;
import Logica.VideoClub;
import Modelo.Cinta;
import Modelo.Dvd;
import Modelo.Genero;
import Modelo.Pelicula;
import Modelo.Socio;

public class CargaDatos {

	public static VideoClub cargaDatos() {
		VideoClub v = new VideoClub();
		try {
			// añadir peliculas
			v.crearPelicula(new Pelicula("peli1", "pelicula 1", Genero.COMEDIA, "COMP 1", 2020));
			v.crearPelicula(new Pelicula("peli2", "pelicula 2", Genero.DRAMA, "COMP 1", 2020));
			v.crearPelicula(new Pelicula("peli3", "pelicula 3", Genero.FICCION, "COMP 1", 2020));
			// crear ejemplares
			v.crearEjemplar(new Cinta("c1", "peli1"));
			v.crearEjemplar(new Cinta("c2", "peli1"));
			v.crearEjemplar(new Dvd("d3", "peli1"));
			v.crearEjemplar(new Dvd("d4", "peli1"));
			v.crearEjemplar(new Dvd("d5", "peli1"));
			v.crearEjemplar(new Cinta("c6", "peli2"));
			v.crearEjemplar(new Cinta("c7", "peli2"));
			v.crearEjemplar(new Dvd("d8", "peli2"));
			v.crearEjemplar(new Dvd("d9", "peli2"));
			// crearsocios
			v.crearSocio(new Socio(1111111, "pepe"));
			v.crearSocio(new Socio(2222222, "paco"));
			v.crearSocio(new Socio(3333333, "lolo"));

			v.nuevoAlquiler(1111111, "c1", "12/01/2023");
			v.nuevoAlquiler(1111111, "c2", "12/01/2023");
			v.nuevoAlquiler(2222222, "d3", "12/01/2023");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return v;

	}
}
