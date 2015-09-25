package Principal;

import DisparaEvento.Biblioteca;
import Obervable.Libro;
import Observador.Administración;
import Observador.Compras;
import Observador.Stock;
import Subject.AlarmaLibro;

public class Main {

	public static void main(String[] args) {
		AlarmaLibro a = new AlarmaLibro();
		a.attach(new Compras());
		a.attach(new Administración());
		a.attach(new Stock());
		
		Libro libro = new Libro();
		libro.setEstado("MALO");
		
		Biblioteca b = new Biblioteca();
		b.devuelveLibro(libro);
		
	}

}
