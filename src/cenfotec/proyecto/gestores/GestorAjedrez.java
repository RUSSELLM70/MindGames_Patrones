package cenfotec.proyecto.gestores;

import cenfotec.proyecto.clases.Ajedrez.AjedrezPiezas;

public class GestorAjedrez extends AjedrezPiezas {
	
	protected String[][] TableroAjedrez = new String[8][8];

	public String[][] getTableroAjedrez() {
		return TableroAjedrez;
	}

	public void setTableroAjedrez(String[][] tableroAjedrez) {
		TableroAjedrez = tableroAjedrez;
	}

}
