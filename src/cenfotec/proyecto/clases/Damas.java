package cenfotec.proyecto.clases;

public class Damas {

	protected int Blanca = 1; // 1
	protected int Negra = 0; // 0
	protected String Posicion;

	public Damas() {

	}

	public Damas(int blanca, int negra, String posicion) {
		super();
		Blanca = blanca;
		Negra = negra;
		Posicion = posicion;
	}

	public int getBlanca() {
		return Blanca;
	}

	public void setBlanca(int blanca) {
		Blanca = blanca;
	}

	public int getNegra() {
		return Negra;
	}

	public void setNegra(int negra) {
		Negra = negra;
	}

	public String getPosicion() {
		return Posicion;
	}

	public void setPosicion(String posicion) {
		Posicion = posicion;
	}

	@Override
	public String toString() {
		return "Damas [Blanca=" + Blanca + ", Negra=" + Negra + ", Posicion=" + Posicion + "]";
	}

}
