package Tester;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Excepciones.miExcepcion;
import Logica.VideoClub;
import Modelo.Alquiler;
import Modelo.Ejemplar;

class TestAlquiler {
	VideoClub v;
	@BeforeEach
	void cargaDatos() {
		v=CargaDatos.cargaDatos();
	}
	@Test
	void testCrearAlquiler() {
	
		try {
			v.nuevoAlquiler(2222222,"c6","12/01/2023");
		} catch (miExcepcion | ParseException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		assertTrue(v.numAlquileres()==4);
		Ejemplar ej=v.buscarEjemplar("c6");
		assertTrue(ej.isEstaDisponible()==false);
		assertThrows(miExcepcion.class,()->v.nuevoAlquiler(1111111,"x1","12/01/2023"));
		assertThrows(miExcepcion.class,()->v.nuevoAlquiler(1111111,"c6","12/01/2023"));
		try {
			v.nuevoAlquiler(2222222,"d8","12/01/2023");
		} catch (miExcepcion | ParseException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		assertTrue(v.numAlquileres()==5);
		ej=v.buscarEjemplar("d8");
		assertTrue(ej.isEstaDisponible()==false);
		assertThrows(miExcepcion.class,()->v.nuevoAlquiler(1111111,"d8","12/01/2023"));
		assertThrows(miExcepcion.class,()->v.nuevoAlquiler(123123,"d9","12/01/2023"));
		assertThrows(miExcepcion.class,()->v.nuevoAlquiler(1234567,"d8","12/01/2023"));
		assertThrows(miExcepcion.class,()->v.nuevoAlquiler(3333333,"d8","60/60/1010"));	
	}
	@Test
	void testModificarAlquiler() {
		try {
			assertTrue(v.modificarAlquiler(6,2222222,"c6","12/01/2023","15/01/2023"));
		} catch (miExcepcion | ParseException ex) {
			// TODO Auto-generated catch block
			System.out.println(ex.getMessage());
		}
		assertTrue(v.numAlquileres()==3);
		Alquiler a=v.buscarAlquiler(6);
		assertTrue(a.getCodsocio()==2222222);
		assertTrue(a.getCodEjemplar().compareTo("c6")==0);
	}

}
