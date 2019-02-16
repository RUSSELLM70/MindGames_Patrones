package cenfotec.proyecto.gestores;

import cenfotec.proyecto.clases.Damas;

public class GestorDamas extends Damas {

	protected String[][] TableroDamas = new String[10][10];

	public String[][] getTableroDamas() {
		return TableroDamas;
	}

	public void setTableroDamas(String[][] tableroDamas) {
		TableroDamas = tableroDamas;
	}

}
