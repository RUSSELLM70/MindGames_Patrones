package cenfotec.proyecto.gestores;

import java.util.ArrayList;

import cenfotec.proyecto.clases.Jugador;

public class GestorJugador {

	private ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>();

	public ArrayList<Jugador> getListaJugadores() {
		return listaJugadores;
	}

	public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
		this.listaJugadores = listaJugadores;
	}

	public void CrearJugador(String pNombre) {

		Jugador miJugador;
		miJugador = new Jugador(pNombre);
		listaJugadores.add(miJugador);
	}

}
