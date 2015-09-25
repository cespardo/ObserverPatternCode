package Observador;

public class Stock implements LibroMalEstado{

	@Override
	public void update() {
		System.out.println("Señores de Stock:");
		System.out.println("     Dar de baja al libro dañado...\n");	
		
	}

}
