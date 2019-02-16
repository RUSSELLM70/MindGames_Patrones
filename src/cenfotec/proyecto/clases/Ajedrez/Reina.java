package cenfotec.proyecto.clases.Ajedrez;


public class Reina extends AjedrezPiezas {

	public  Reina() {
	}

	public boolean legalMove(int startRow, int startColumn, int desRow, int desColumn, int[][] TableroJugador) {

		boolean axis = true;

		if (startRow == desRow ^ startColumn == desColumn) {
			axis = true;
		} else if (startRow != desRow && startColumn != desColumn) {
			axis = false; // Mover diagonal
		} else {

			strErrorMsg = "Reina se puede mover en cualquier direccion";
			return false;

		}

		return Movimiento(startRow, startColumn, desRow, desColumn, TableroJugador, axis);

	}
	@Override
	public String toString() {
		return TipoPieza.Reina.toString();
	}
	
}
