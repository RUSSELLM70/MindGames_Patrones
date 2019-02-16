package cenfotec.proyecto.gestores;

import cenfotec.proyecto.clases.Go;

//Esta clase se va a encargar de manejar el almacenamiento(Las matrices, Array)
//Creacion de la matriz de cada uno de los tipos de juego(Tableros con sus dimenciones)
//Go   19x19  tablero
// Esta clase debe  heredar del objeto "GO"(Indicar atributos)
public class GestorGo extends Go {

	protected String[][] TableroGo = new String[19][19];

	public String[][] getTableroGo() {
		return TableroGo;
	}

	public void setTableroGo(String[][] tableroGo) {
		TableroGo = tableroGo;
	}

}
