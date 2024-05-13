package Modelo;

import java.util.Calendar;
import java.util.Date;

public class Cinta extends Ejemplar {

	public Cinta(String codEjemplar, String codPelicula) {
		super(codEjemplar, codPelicula);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Date calculaFechaDevolucion(Date fechaAlquiler) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
	    calendar.setTime(fechaAlquiler); 
	    calendar.add(Calendar.DAY_OF_YEAR, 3);  
	    return calendar.getTime();
	}

}
