package cenfotec.proyecto.clases.Ajedrez;

public class AjedrezPiezas {

	protected int finalDesRow = 0;
	protected int finalDesColumn = 0;
	protected String strErrorMsg = "";

	public AjedrezPiezas() {

	}

	public int getDesRow() {
		return finalDesRow;
	}

	public int getDesColumn() {
		return finalDesColumn;
	}

	public String getErrorMsg() {
		return strErrorMsg;
	}

	// Verifica si la celda esta vacia
	private boolean ValidarMovimientos(int newRow, int newColumn, int[][] TableroJugador) {

		if (TableroJugador[newRow][newColumn] != 0) {// Si no esta vacia

			strErrorMsg = "La pieza esta bloqueando el camino";
			return false;

		}

		return true;

	}

	protected boolean Movimiento(int startRow, int startColumn, int desRow, int desColumn, int[][] TableroJugador,boolean MovimientoRecto) {

		if (MovimientoRecto) {// Si se mueve de manera recta (torre , reina)

			if ((startColumn == desColumn) && (startRow != desRow)) {

				if (desRow < startRow) {// Moverse al norte

					for (int newRow = (startRow - 1); newRow > desRow; newRow--) {

						if (!ValidarMovimientos(newRow, desColumn, TableroJugador)) {
							return false;
						}

					}

				} else {

					for (int newRow = (startRow + 1); newRow < desRow; newRow++) {

						if (!ValidarMovimientos(newRow, desColumn, TableroJugador)) {
							return false;
						}

					}

				}

			} else if ((startRow == desRow) && (startColumn != desColumn)) {

				if (desColumn < startColumn) {

					for (int newColumn = (startColumn - 1); newColumn > desColumn; newColumn--) {

						if (!ValidarMovimientos(desRow, newColumn, TableroJugador)) {
							return false;
						}

					}

				} else {

					for (int newColumn = (startColumn + 1); newColumn < desColumn; newColumn++) {

						if (!ValidarMovimientos(desRow, newColumn, TableroJugador)) {
							return false;
						}

					}

				}

			} else {

				strErrorMsg = " //Error";
				return false;

			}

		} else // Moverse en diagonal (alfil, reina)
		{

			strErrorMsg = "El destino es  la misma diagonal";
			int newColumn = 0;

			if (desRow < startRow && desColumn < startColumn) {

				if ((desRow - startRow) == (desColumn - startColumn)) {

					for (int newRow = (startRow - 1); newRow > desRow; newRow--) {

						newColumn = startColumn - (startRow - newRow);

						if (!ValidarMovimientos(newRow, newColumn, TableroJugador)) {
							return false;
						}

					}

				} else {
					return false;
				}

			} else if (desRow < startRow && desColumn > startColumn) // si se mueve NE
			{

				if ((desRow - startRow) == (startColumn - desColumn)) {

					for (int newRow = (startRow - 1); newRow > desRow; newRow--) {

						newColumn = startColumn + (startRow - newRow);

						if (!ValidarMovimientos(newRow, newColumn, TableroJugador)) {
							return false;
						}

					}

				} else {
					return false;
				}

			} else if (desRow > startRow && desColumn < startColumn) // si se mueve SO
			{

				if ((startRow - desRow) == (desColumn - startColumn)) {

					for (int newRow = (startRow + 1); newRow < desRow; newRow++) {

						newColumn = startColumn - (newRow - startRow);

						if (!ValidarMovimientos(newRow, newColumn, TableroJugador)) {
							return false;
						}

					}

				} else {
					return false;
				}

			} else if (desRow > startRow && desColumn > startColumn) // si se mueve SE
			{

				if ((startRow - desRow) == (startColumn - desColumn)) {

					for (int newRow = (startRow + 1); newRow < desRow; newRow++) {

						newColumn = startColumn + (newRow - startRow);

						if (!ValidarMovimientos(newRow, newColumn, TableroJugador)) {
							return false;
						}

					}

				} else {
					return false;
				}

			} else // No se mueve en diagoanl
			{

				strErrorMsg = "No se puede mover en diagonal";
				return false;

			}

		}

		finalDesRow = desRow;
		finalDesColumn = desColumn;

		return true;

	}

	
	public enum TipoPieza {
		
		Peon("P"),
		Caballo("C"),
		Rey("R"),
		Alfil("A"),
		Reina("RN"),
		Torre("T");
		
		private String NombrePieza;
		
		TipoPieza(final String NombrePieza){
			
			this.NombrePieza = NombrePieza;
		}
		
		@Override
		public String toString() {
			return this.NombrePieza;
		}
		
	}


}
