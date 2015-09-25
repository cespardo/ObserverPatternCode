package Subject;
import Observador.LibroMalEstado;

public interface Subject {
	
	public void attach(LibroMalEstado observador);
	public void dettach(LibroMalEstado observador);
	public void notifyObservers();

}
