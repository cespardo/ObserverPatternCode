package DisparaEvento;

import Subject.AlarmaLibro;

public class Biblioteca {
	
	public void devuelveLibro(Obervable.Libro libro){
		if(libro.getEstado().equalsIgnoreCase("MALO")){
			AlarmaLibro a = new AlarmaLibro();
			a.notifyObservers();
		}
	}

}
