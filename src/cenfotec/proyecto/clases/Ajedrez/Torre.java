package cenfotec.proyecto.clases.Ajedrez;


public class Torre extends AjedrezPiezas {

	public  Torre() {
	}

	public boolean legalMove(int startRow, int startColumn, int desRow, int desColumn, int[][] TableroJugador) {

		if (startRow != desRow && startColumn != desColumn) // Si se mueve en diagonal
		{

			strErrorMsg = "Torre solo se puede mover en horinzotal o vertical";
			return false;

		}
		// La reina comparte el mismo movimiento como un alfil o una torre, para eso se
		// valida el movimiento como
		// si fuera de los tres
		// Al final el resultado es si la pieza se mueve en forma diagonal o en forma
		// recta
		return Movimiento(startRow, startColumn, desRow, desColumn, TableroJugador, true);

	}
	@Override
	public String toString() {
		return TipoPieza.Torre.toString();
	}
	
}
