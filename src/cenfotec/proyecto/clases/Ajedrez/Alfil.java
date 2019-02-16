package cenfotec.proyecto.clases.Ajedrez;

public class Alfil extends AjedrezPiezas {

	public Alfil() {

	}

	// Movimiento legal
	public boolean legalMove(int startRow, int startColumn, int desRow, int desColumn, int[][] TableroJugador) {

		if (startRow == desRow || startColumn == desColumn) {

			strErrorMsg = "Solo se mueven en diagonal";
			return false;

		}

		// se valida si el movimiento fue en forma diagonal
		return Movimiento(startRow, startColumn, desRow, desColumn, TableroJugador, false);

	}
	@Override
	public String toString() {
		return TipoPieza.Alfil.toString();
	}
	

}
