package cenfotec.proyecto.clases;


public class Jugador {
	
	private String nombreJugador;

	public Jugador() {
	}

	public Jugador(String nombreJugador) {
		super();
		this.nombreJugador = nombreJugador;
	}

	public String getNombreJugador() {
		return nombreJugador;
	}

	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}


	@Override
	public String toString() {
		return "Nombre Jugador ="+" "+ nombreJugador + "";
	}
}