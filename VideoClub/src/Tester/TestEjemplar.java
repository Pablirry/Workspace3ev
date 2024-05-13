package Tester;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Excepciones.miExcepcion;
import Logica.VideoClub;
import Modelo.Cinta;
import Modelo.Dvd;
import Modelo.Ejemplar;

public class TestEjemplar {
	VideoClub v;
	@BeforeEach
	void cargaDatos() {
		v=CargaDatos.cargaDatos();
	}
	@Test
	void testCrearEjemplar() {
		try {
			v.crearEjemplar(new Cinta("c10","peli3"));
		} catch (miExcepcion e) {
			System.err.println(e.getMessage());
		}
		assertTrue(v.numEjemplares()==10);
		assertTrue(v.buscarEjemplar("c10")!=null);
		assertThrows(miExcepcion.class,()->v.crearEjemplar(new Cinta("c1","peli1")));
		assertThrows(miExcepcion.class,()->v.crearEjemplar(new Cinta("c11","XXX")));
		
		try {
			v.crearEjemplar(new Dvd("d11","peli3"));
		} catch (miExcepcion e) {
			System.err.println(e.getMessage());
		}
		assertTrue(v.numEjemplares()==11);
		assertTrue(v.buscarEjemplar("d11")!=null);
		assertThrows(miExcepcion.class,()->v.crearEjemplar(new Dvd("d3","peli1")));
		assertThrows(miExcepcion.class,()->v.crearEjemplar(new Dvd("d12","XXX")));
	}
	
	@Test
	void testModificarEjemplar() {
		try {
			v.modificarEjemplar("c1", "peli3");
		} catch (miExcepcion e) {
			System.err.println(e.getMessage());
		}
		assertTrue(v.numEjemplares()==9);
		Ejemplar cinta=v.buscarEjemplar("c1");
		assertTrue(cinta!=null);
		assertTrue(cinta.getCodPelicula().compareTo("peli3")==0);
		try {
			v.modificarEjemplar("d3", "peli3");
		} catch (miExcepcion e) {
			System.err.println(e.getMessage());
		}
		assertTrue(v.numEjemplares()==9);
		Ejemplar dvd=v.buscarEjemplar("d3");
		assertTrue(dvd!=null);
		assertTrue(dvd.getCodPelicula().compareTo("peli3")==0);
		
		assertThrows(miExcepcion.class,()->v.modificarEjemplar("d100", "peli1"));
		assertThrows(miExcepcion.class,()->v.modificarEjemplar("c100", "peli1"));
		assertThrows(miExcepcion.class,()->v.modificarEjemplar("c1", "peliXXX"));
		assertThrows(miExcepcion.class,()->v.modificarEjemplar("d3", "peliXXX"));
	}
	
	@Test
	void testEliminarEjemplar() {
		try {
			v.eliminarEjemplar("c7");
		} catch (miExcepcion e) {
			System.err.println(e.getMessage());
		}
		assertTrue(v.numEjemplares()==8);
		Ejemplar cinta=v.buscarEjemplar("c7");
		assertTrue(cinta==null);
		
		try {
			v.eliminarEjemplar("d4");
		} catch (miExcepcion e) {
			System.err.println(e.getMessage());
		}
		assertTrue(v.numEjemplares()==7);
		Ejemplar dvd=v.buscarEjemplar("d4");
		assertTrue(dvd==null);
		
		assertThrows(miExcepcion.class,()->v.eliminarEjemplar("cxxx"));
		assertThrows(miExcepcion.class,()->v.eliminarEjemplar("dxxx"));
		assertThrows(miExcepcion.class,()->v.eliminarEjemplar("c2"));
		assertThrows(miExcepcion.class,()->v.eliminarEjemplar("d3"));
	}
}
