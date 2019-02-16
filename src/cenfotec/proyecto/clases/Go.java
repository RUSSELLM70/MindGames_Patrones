package cenfotec.proyecto.clases;

public class Go extends Damas{

	public Go() {
	
	}

	public Go(int blanca, int negra, String posicion) {
		super(blanca, negra, posicion);
	}

	@Override
	public String toString() {
		return "Go [Blanca=" + Blanca + ", Negra=" + Negra + ", Posicion=" + Posicion + "]";
	}

}
