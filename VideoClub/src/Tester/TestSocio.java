package Tester;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Excepciones.miExcepcion;
import Logica.VideoClub;
import Modelo.Socio;

class TestSocio {

	VideoClub v;
	@BeforeEach
	void cargaDatos() {
		v=CargaDatos.cargaDatos();
	}
	@Test
	void testSocioCrear(){
		//v=CargaDatos.cargaDatos();
		try {
			Socio s=new Socio(4444444,"pepe");
		} catch (miExcepcion e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		
		assertThrows(miExcepcion.class,()->new Socio(444,"pepe"));
		
		
		try {
			assertTrue(v.crearSocio(new Socio(4444444,"pepe"))==true);
		} catch (miExcepcion e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		
		assertTrue(v.numSocios()==4);
		try {
			assertTrue(v.buscarSocio(4444444)!=null);
		} catch (miExcepcion e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
	}	
	@Test
	void testSocioModificar(){
		try {
			v.modificarSocio(1111111, "manolo");
		} catch (miExcepcion e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		
		assertTrue(v.numSocios()==3);
		try {
			Socio s =v.buscarSocio(1111111);
			assertTrue(s!=null);
			assertTrue(s.getNombre().compareTo("manolo")==0);
		} catch (miExcepcion e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
	
		assertThrows(miExcepcion.class,()->v.modificarSocio(123123, "manolo"));
		assertThrows(miExcepcion.class,()->v.modificarSocio(1234567, "manolo"));
		
	}
	@Test
	void testSocioEliminar(){
		try {
			v.eliminarSocio(1111111);
		} catch (miExcepcion e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		assertTrue(v.numSocios()==2);
		try {
			Socio s=v.buscarSocio(1111111);
			assertTrue(s==null);
		} catch (miExcepcion e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		assertThrows(miExcepcion.class,()->v.eliminarSocio(123123));
		assertThrows(miExcepcion.class,()->v.eliminarSocio(1234567));
	
	}

}
