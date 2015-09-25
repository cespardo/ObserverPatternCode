package Subject;

import java.util.ArrayList;

import Observador.LibroMalEstado;

public class AlarmaLibro implements Subject{
	
	private static ArrayList<LibroMalEstado> observadores = new ArrayList<>();

	@Override
	public void attach(LibroMalEstado observador) {
		observadores.add(observador);			
	}

	@Override
	public void dettach(LibroMalEstado observador) {
		observadores.remove(observador);
	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i< observadores.size(); i++){
			observadores.get(i).update();
		}
		
	}

}
