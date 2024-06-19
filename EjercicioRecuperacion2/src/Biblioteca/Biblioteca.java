package Biblioteca;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Biblioteca {

	private Set<Socio> socios;
	private Set<Libro> libros;

	public Biblioteca() {
		socios = new HashSet<Socio>();
		libros = new TreeSet<Libro>();
	}

	public void altaSocio(Socio socio) throws ExcepcionBiblioteca {

		for (Socio s : socios) {
			if (s.getCodSocio() == socio.getCodSocio()) {
				throw new ExcepcionBiblioteca("Numero de socio ya existe");
			}
		}
		socios.add(socio);
	}

	public void bajaSocio(int codSocio) throws ExcepcionBiblioteca {
		Socio socio = buscarSocio(codSocio);

		if (socio == null) {
			throw new ExcepcionBiblioteca("El socio no existe");
		}
		socios.remove(socio);
	}

	public Socio buscarSocio(int codSocio) {
		for (Socio s : socios) {
			if (s.getCodSocio() == codSocio) {
				return s;
			}
		}
		return null;
	}

	public void listarSocios() {
		for (Socio s : socios) {
			System.out.println(s);
		}
	}

	public void listarLibros() {
		for (Libro l : libros) {
			System.out.println(l);
		}
	}

	public void altaLibro(Libro l) throws ExcepcionBiblioteca {
		for (Libro lib : libros) {
			if (lib.getCodLibro() == l.getCodLibro()) {
				throw new ExcepcionBiblioteca("El código de libro ya existe.");
			}
		}
		libros.add(l);
	}
	
	public Libro buscarLibro(int codLibro) {
		for(Libro l : libros) {
			if(l.getCodLibro() == codLibro) {
				return l;
			}
		}
		return null;
	}
	
	public void realizarPrestamo(int codSocio, int codLibro) throws ExcepcionBiblioteca {
		Socio socio = buscarSocio(codSocio);
		if(socio == null) {
			throw new ExcepcionBiblioteca("El socio no existe");
		}
		Libro libro = buscarLibro(codLibro);
		if(libro == null) {
			throw new ExcepcionBiblioteca("El libro no existe");
		}
		socio.addPrestamo(libro);
	}
	
	public void eliminarPrestamo(int codSocio, int codLibro) throws ExcepcionBiblioteca {
		Socio socio = buscarSocio(codSocio);
		if(socio == null) {
			throw new ExcepcionBiblioteca("El socio no existe");
		}
		Libro libro = buscarLibro(codLibro);
		if(libro == null) {
			throw new ExcepcionBiblioteca("El libro no existe");
		}
		socio.removePrestamos(libro);
	}
	
	public void verPrestamos(int codSocio) throws ExcepcionBiblioteca {
		Socio socio = buscarSocio(codSocio);
		
		if(socio == null) {
			throw new ExcepcionBiblioteca("El socio no existe");
		}
		
		List<Libro> prestamos = socio.getPrestamos();
		for(Libro l : prestamos) {
			System.out.println(l);
		}
	}
			
		public void eliminarSociosConMasDe4Prestamos() {
			List<Socio> sociosAEliminar = new ArrayList<>();
			for(Socio s : socios) {
				if(s.getPrestamos().size() > 4) {
					sociosAEliminar.add(s);
				}
			}
			socios.removeAll(sociosAEliminar);
		}
	}


