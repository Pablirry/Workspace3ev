package Logica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import Excepciones.miExcepcion;
import Modelo.Alquiler;
import Modelo.Ejemplar;
import Modelo.Genero;
import Modelo.Pelicula;
import Modelo.Socio;

public class VideoClub {
	Set<Socio> socios;
	Map<String,Pelicula> peliculas;
	Map<String,Ejemplar> ejemplares;
	List<Alquiler> alquileres;
	
	public VideoClub() {
		socios=new TreeSet<Socio>();
		peliculas=new HashMap<String,Pelicula>();
		ejemplares=new HashMap<String,Ejemplar>();
		alquileres=new ArrayList<Alquiler>();
		
	}
	// CRUD de socios
	/**
	 * 
	 * @param s: inserta un  nuevo socio si no exite un socio con el mismo codigo
	 * @return true si se inserta correctamente
	 * @throws miExcepcion si existe un socio duplicado
	 */
	public boolean crearSocio(Socio s) throws miExcepcion {
		if(socios.contains(s)) {
			throw new miExcepcion("Codigo de socio duplicado");
		}
		socios.add(s);
		return true;
	}
	/**
	 * 
	 * @param codSocio un entero codSocio
	 * @return un socio si existe, sino null
	 * @throws miExcepcion si el codSocio es un codErroneo
	 */
	public Socio buscarSocio(int codSocio) throws miExcepcion {
		Socio s1=new Socio(codSocio);
		for(Socio s:socios) {
			if(s.getCodSocio()==codSocio) return s;
		}
		return null;
	}
	/**
	 * 
	 * @param codSocio cod del socio 
	 * @param nombre nombre del socio
	 * @return true si ha modificado correctamente
	 * @throws miExcepcion si el codSocio es un codigo mal formado; si el socio no existe 
	 */
	public boolean modificarSocio(int codSocio, String nombre) throws miExcepcion {
		Socio s1=new Socio(codSocio);
		if(socios.contains(s1)==false) {
			throw new miExcepcion("Error socio noencontrado para modificar");
		}
		Socio s=buscarSocio(codSocio);
		s.setCodSocio(codSocio);
		s.setNombre(nombre);
		return true;
	}
	/**
	 * 
	 * @param codSocio codigo del socio a eliminar
	 * @return true si elimina el socio correctamente
	 * @throws miExcepcion si el codigoesta mal formado, si el socio no existe
	 */
    public boolean eliminarSocio(int codSocio) throws miExcepcion {
		Socio s1=new Socio(codSocio);
		if(socios.contains(s1)==false) {
			throw new miExcepcion("Error socio noencontrado para modificar");
		}
		socios.remove(s1);
		return true;
	}
	
	//CRUD de peliculas
    /**
     * 
     * @param p inserta una nueva pelicula
     * @return true si ha insertado correctamente la pelicula
     * @throws miExcepcion si el codigo de la pelicula se encuentra ya almacenado
     */
	public boolean crearPelicula(Pelicula p) throws miExcepcion {
		if(peliculas.containsKey(p.getCodPelicula())) {
			throw new miExcepcion("Error pelicula duplciada para crear una nueva");
		}
		peliculas.put(p.getCodPelicula(),p);
		return true;
	}
	/**
	 * 
	 * @param codPelicula cod de l a pelicula a buscar
	 * @return si la pelicula existe la reotrna ; sino un null
	 * 
	 */
	public Pelicula buscarPelicula(String codPelicula) {
		if (peliculas.containsKey(codPelicula)==false) {
			return null;			
		}
		return peliculas.get(codPelicula);
	}	
	/**
	 * 
	 * @param codPelicula cod de la pelicula a modificar
	 * @param titulo
	 * @param genero
	 * @param compañia
	 * @param añoPublicacion
	 * @return mdifica los parametros de la pelicula; retorna true si la modifcia correctamente
	 * @throws miExcepcion si la pelicula no se encuentra almacenada
	 */
	public boolean modificarPelicula(String codPelicula, String titulo, Genero genero, String compañia, int añoPublicacion) throws miExcepcion {		
		if(peliculas.containsKey(codPelicula)==false) {
			throw new miExcepcion("Error pelicula no encontrada");
		}
		Pelicula p = peliculas.get(codPelicula);
		p.setTitulo(titulo);
		p.setGenero(genero);
		p.setCompañia(compañia);
		p.setAñoPublicacion(añoPublicacion);
		return true;
	}
	/**
	 * 
	 * @param codPelicula de la pelicula a eliminar
	 * @return true si la elimina correctamente
	 * @throws miExcepcion si la pelicula no see encuentra almacenada
	 * Elimina todos los ejemplares asocaciados a la pelicula
	 */
	public boolean eliminarPelicula(String codPelicula) throws miExcepcion {
		if (peliculas.containsKey(codPelicula)==false){
			throw new miExcepcion("Error pelicula no encontrada");				
		}
		Pelicula p = peliculas.remove(codPelicula);
		List<Ejemplar> ejemPelicula=buscarEjemplaresDePelicula(codPelicula);
		for(Ejemplar e:ejemplares.values()) {
			if(e.isEstaDisponible()==false) {
				throw new miExcepcion("Error no se puede eliminar pelicula por tener un ejemplar alquilado");
			}
		}
		for(Ejemplar e:ejemplares.values()) {
			ejemplares.remove(e.getCodEjemplar());
			
		}
		peliculas.remove(codPelicula);
		return true;
	}
	/**
	 * 
	 * @param codPelicula 
	 * @return unalista con todos los ejemplares de la pelicula
	 */
	public List<Ejemplar> buscarEjemplaresDePelicula(String codPelicula) {
		// TODO Auto-generated method stub
		List<Ejemplar> lista=new ArrayList<Ejemplar>();
		for(Ejemplar e:ejemplares.values()) {
			if(e.getCodPelicula().compareTo(codPelicula)==0) {
				lista.add(e);
			}
		}
		return lista;
	}
	
	//CRUD ejemplares
	/**
	 * inserta un nuevo ejemplar asociado a un pelicula
	 * @param e: ejemplar(Dvd o Cinta)
	 * @return true si la inserta correctamente
	 * @throws miExcepcion error si lel codigo ya existe, y error si la pelicula asociada no existe
	 */
	public boolean crearEjemplar(Ejemplar e) throws miExcepcion {
		if(ejemplares.containsKey(e.getCodEjemplar())) 
			throw new miExcepcion("Error codEjemplar duplicado");
		if(peliculas.containsKey(e.getCodPelicula())==false) 
			throw new miExcepcion("Error codPelicula no encontrada");
		ejemplares.put(e.getCodEjemplar(),e);
		return true;
	}
	/**
	 * 
	 * @param codEjemplar cod del ejemplar a buscar
	 * @return el ejemplar si existe, null en caso contrario
	 * 
	 */
	public Ejemplar buscarEjemplar(String codEjemplar) {
		if(ejemplares.containsKey(codEjemplar)==false) 
			return null;
		return ejemplares.get(codEjemplar);
	}
	/**
	 * modifica todos os campos de un ejemplar
	 * @param codEjemplar
	 * @param codPelicula
	 * @return true si lo puede modificar
	 * @throws miExcepcion si el ejemplar no existe
	 */
	public boolean modificarEjemplar(String codEjemplar, String codPelicula) throws miExcepcion {
		if(ejemplares.containsKey(codEjemplar)==false) 
			throw new miExcepcion("Error ejemplar no encontrado");
		if(peliculas.containsKey(codPelicula)==false)
			throw new miExcepcion("Error pelicula no encontrado");
		Ejemplar e = ejemplares.get(codEjemplar);
		e.setCodPelicula(codPelicula);
		return true;
	}
	/**
	 * elimina un ejemplar de la lista si existe y no esta alquilado
	 * @param codEjemplar
	 * @return true si se elimina correctamente
	 * @throws miExcepcion si el ejemplar no existe y si ademas esta alquilado porque no se puede eliminar
	 */
	public boolean eliminarEjemplar(String codEjemplar) throws miExcepcion {
		if(ejemplares.containsKey(codEjemplar)==false) 
			throw new miExcepcion("Error ejemplar no encontrado");
		Ejemplar e = buscarEjemplar(codEjemplar);
		if(e!=null && e.isEstaDisponible()==false) {
			throw new miExcepcion("Error no se puede eliminar un ejemplar alquilado");
		}
		ejemplares.remove(codEjemplar);
		return true;
	}
	
	//CRUD Alquiler
	/**
	 * inserta un nuevo alquiler en la lista de alquileres. 
	 * @param codSocio
	 * @param codEjemplar
	 * @param fecha
	 * @return true si se puede isnertar correctamente
	 * @throws miExcepcion si el socio noe xiste error, si el ejemplar no existe error, si el ejemplar esta alquilado error
	 * @throws ParseException error en el formato de fecha
	 */
	public boolean nuevoAlquiler(int codSocio, String codEjemplar, String fecha) throws miExcepcion, ParseException {
		Socio s=buscarSocio(codSocio);
		if (s==null)throw new miExcepcion("Error socio no encontrado");
		Ejemplar e=buscarEjemplar(codEjemplar);
		if(e==null)throw new miExcepcion("Error ejemplar no encontrado");
		if(e.isEstaDisponible()==false) throw new miExcepcion("Error ejemplar no disponible");
		Date fechaAlquiler = parseFecha(fecha);
		Date fechaDevolucion=e.calculaFechaDevolucion(fechaAlquiler);
		Alquiler a = new Alquiler(codSocio,codEjemplar,fechaAlquiler,fechaDevolucion);
		e.alquilarEjemplar();
		alquileres.add(a);
		return true;
	}
	
	/**
	 * busca un alquiler a partir del cod alquiler
	 * @param codAlquiler
	 * @return null si no lo encuentra, y un objeto alquiler si existe
	 */
	public Alquiler buscarAlquiler(int codAlquiler) {
		for(int i=0;i<alquileres.size();i++){
			Alquiler a=alquileres.get(i);
			if(a.getCodalquiler()==codAlquiler)
				return a;
		}
		return null;
	}
	/**
	 * modifica los parametro de un alquiler
	 * @param codAlquiler
	 * @param codSocio
	 * @param codEjemplar
	 * @param fechaAlquiler
	 * @param fechaDevolucion
	 * @returntrue si se ha modifciado correctamente
	 * @throws miExcepcion si el alquiler no existe
	 * @throws ParseException error en formato de fecha
	 */
	public boolean modificarAlquiler(int codAlquiler,int codSocio, String codEjemplar, String fechaAlquiler, String fechaDevolucion) throws miExcepcion, ParseException {
		Alquiler a=buscarAlquiler(codAlquiler);
		if(a==null) throw new miExcepcion("Error alquiler no encontrado");
		Ejemplar e=buscarEjemplar(codEjemplar);
		if(e==null) throw new miExcepcion("Error ejemplar no encontrado");
		if(e.isEstaDisponible()==false) throw new miExcepcion("Error ejemplar no disponible");
		if(a.getCodEjemplar().compareTo(codEjemplar)!=0) {
			Ejemplar viejo=buscarEjemplar(a.getCodEjemplar());
			viejo.setEstaDisponible(true);
			e.setEstaDisponible(false);
			a.setCodEjemplar(codEjemplar);
		}
		Socio s=buscarSocio(codSocio);
		if(s==null)throw new miExcepcion("Error socio no encontrado");
		a.setCodsocio(codSocio);
		a.setFechaAlquiler(parseFecha(fechaAlquiler));
		a.setFechaDevolución(parseFecha(fechaDevolucion));
		return true;			
	}
	/**
	 * elimina un alquiler de la lista
	 * @param codAlquiler
	 * @return true si se elimina correctamente
	 * @throws miExcepcion si el alquiler no existe
	 */
	public boolean eliminaralquiler(int codAlquiler) throws miExcepcion {
		Alquiler a=buscarAlquiler(codAlquiler);
		if(a==null) throw new miExcepcion("Error alquiler no encontrado");
		Ejemplar e=buscarEjemplar(a.getCodEjemplar());
		e.devolverEjemplar();
		alquileres.remove(codAlquiler);
		return true;
	}
	
	/**
	 * @param parametro string en formato "dd/mm/aa"
	 * @return un objeto date con la fecha
	 * @throws ParseException 
	 */
	private Date parseFecha(String fechaString) throws ParseException {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		Date fecha = formato.parse(fechaString);
		return fecha;
	}
	/**
	 * retorna unalista con todos los alquileres de ejemplares aociados a un pelicula
	 * @param codPelicula
	 * @return una lista de alquileres
	 * @throws miExcepcion si la pelicula no existe
	 */
	public List<Alquiler> alquileresPorPelicula(String codPelicula) throws miExcepcion{
		if(peliculas.containsKey(codPelicula)==false) {
			throw new miExcepcion("Error pelcula no existe");
		}
		List<Alquiler> retorno=new ArrayList<Alquiler>();
		List<Ejemplar> listaEjemplares=buscarEjemplaresDePelicula(codPelicula);
		for(Alquiler a:alquileres) {
			for(Ejemplar e:listaEjemplares) {
				if(a.getCodEjemplar()==e.getCodEjemplar()) {
					retorno.add(a);
				}
			}
		}
		return retorno;
	}
	/**
	 * retorna una lista de alquielres de un socio
	 * @param codSocio
	 * @return una lista de alquileres
	 * @throws miExcepcion si el socio no existe
	 */
	public List<Alquiler> alquileresPorSocio(int codSocio) throws miExcepcion{
		if(socios.contains(codSocio)==false) {
			throw new miExcepcion("Error socio no existe");
		}
		List<Alquiler> retorno=new ArrayList<Alquiler>();
		for(Alquiler a:alquileres) {
			if(codSocio==a.getCodsocio()) {
				retorno.add(a);
			}
		}
		return retorno;
	}
	
	/// metodos par ajunit
	public int numSocios() {
		return socios.size();
	}
	public int numPeliculas() {
		return peliculas.size();
	}
	public int numEjemplares() {
		return ejemplares.size();
	}
	public int numAlquileres() {
		return alquileres.size();
	}
}
















