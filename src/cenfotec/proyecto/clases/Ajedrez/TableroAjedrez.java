package cenfotec.proyecto.clases.Ajedrez;

public class TableroAjedrez {

	private int[][] TableroJugador = new int[8][8];// 0 vacio, 1 jugador = 1, 2 jugador = 2
	private int[][] TableroPiezas = new int[8][8];// 0 peon, 1 torre, 2 caballo, 3 alfil, 4 reina, 5 rey, 6 empty

	public  TableroAjedrez() {
	}

	public int getPlayerCell(int row, int column) {
		return TableroJugador[row][column];
	}

	public int getPieceCell(int row, int column) {
		return TableroPiezas[row][column];
	}

	public void setPlayerCell(int row, int column, int player) {
		TableroJugador[row][column] = player;
	}

	public void setPieceCell(int row, int column, int piece) {
		TableroPiezas[row][column] = piece;
	}

	public int[][] getTableroJugador() {
		return TableroJugador;
	}

	public int[][] getTableroPiezas() {
		return TableroPiezas;
	}

	public void ResetTablero() {

		for (int row = 0; row < 8; row++) {

			for (int column = 0; column < 8; column++) {

				if (row <= 1) {

					TableroJugador[row][column] = 2;

					if (row == 1) {
						TableroPiezas[row][column] = 0; // Vacio
					}

				} else if (row >= 2 && row <= 5) {

					TableroJugador[row][column] = 0; // Vacio
					TableroPiezas[row][column] = 6;

				} else {

					TableroJugador[row][column] = 1;

					if (row == 6) {
						TableroPiezas[row][column] = 0; // Vacio
					}

				}

				if (row == 0 || row == 7) {

					if (column < 5) {
						TableroPiezas[row][column] = (column + 1);
					} else {
						TableroPiezas[row][column] = (8 - column);
					}

				}

			}

		}

	}

	public boolean VerificarGanador(int JugadorActual) {


		int ValidaJugador = 0;

		if (JugadorActual == 1) {
			ValidaJugador = 2;
		} else {
			ValidaJugador = 1;
		}

		for (int row = 0; row < 8; row++) {

			for (int column = 0; column < 8; column++) {

				if (TableroJugador[row][column] == ValidaJugador && TableroPiezas[row][column] == 5) {// Si el rey del
																										// enemigo
																										// todavía queda

					return false;
				}

			}

		}

		return true;

	}

	
	public void CrearTablero() {
		
	}
	
	

}
