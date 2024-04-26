package Ejercicio4;

import java.util.HashMap;
import java.util.Map;

public class ContadorAccesos {

    private Map<Direccion,Acceso> accesos;
	
	public ContadorAccesos() {
		accesos=new HashMap<Direccion, Acceso>();
	}
	
	public void añadirDireccion(String string) {
		Direccion dir=new Direccion(string);
		if(dir.isEsCorrecta()) {
			Acceso acc=accesos.get(dir);
			if(acc==null) {
				acc=new Acceso(string);
				accesos.put(dir, acc);
				System.out.println("NuevoAcceso");
			}else {
				acc.incrementarAcceso();
				System.out.println("Incrementa");
			}
			
		}
	}
	
	public void mostrarAccesos() {
		for(Acceso a: accesos.values()) {
			System.out.println(a.toString());
		}
	}


}
