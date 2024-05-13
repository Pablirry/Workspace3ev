package Tester;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Excepciones.miExcepcion;
import Logica.VideoClub;
import Modelo.Genero;
import Modelo.Pelicula;

class TestPelicula {
	VideoClub v;
	@BeforeEach
	void cargaDatos() {
		v=CargaDatos.cargaDatos();
	}
	@Test
	void testCrearPelicula() {
		try {
			v.crearPelicula(new Pelicula("peli4","pelicula 4",Genero.DRAMA,"comp1",2023));
			assertTrue(v.numPeliculas()==4);
			assertTrue(v.buscarPelicula("peli4")!=null);
		} catch (miExcepcion e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		
		assertThrows(miExcepcion.class,()->v.crearPelicula(
				new Pelicula("peli1","pelicula 4",Genero.DRAMA,"comp1",2023)));
		assertTrue(v.numPeliculas()==4);
	}
	@Test
	void testModificarPelicula() {
		try {
			v.modificarPelicula("peli1","NUEVO",Genero.FICCION,"XXX", 2000);
		} catch (miExcepcion e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		assertTrue(v.numPeliculas()==3);
		Pelicula p=v.buscarPelicula("peli1");
	
		assertTrue(p!=null);
		assertTrue(p.getTitulo().compareTo("NUEVO")==0);
		assertTrue(p.getGenero()==Genero.FICCION);
		assertTrue(p.getCompañia().compareTo("XXX")==0);
		assertTrue(p.getAñoPublicacion()==2000);

		assertThrows(miExcepcion.class,()->v.modificarPelicula("peli5","NUEVO",Genero.FICCION,"XXX", 2000));
		
	}
	
	@Test
	void testEliminarPelicula(){
		try {
			v.eliminarPelicula("peli1");
		} catch (miExcepcion e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		assertTrue(v.numPeliculas()==2);
		assertTrue(v.buscarPelicula("peli1")==null);
	
		assertThrows(miExcepcion.class,()->v.eliminarPelicula("peli6"));
		assertThrows(miExcepcion.class,()->v.eliminarPelicula("peli2"));
		
	}

}
