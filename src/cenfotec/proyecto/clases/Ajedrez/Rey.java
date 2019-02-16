package cenfotec.proyecto.clases.Ajedrez;


public class Rey extends AjedrezPiezas {

	public  Rey() {
	}

	public boolean legalMove(int startRow, int startColumn, int desRow, int desColumn, int[][] playerMatrix) {

		finalDesRow = desRow;
		finalDesColumn = desColumn;

		if (desRow == (startRow + 1) && desColumn == startColumn) // S
		{
			return true;
		} else if (desRow == (startRow + 1) && desColumn == (startColumn - 1)) // SO
		{
			return true;
		} else if (desRow == startRow && desColumn == startColumn - 1) // O
		{
			return true;
		} else if (desRow == (startRow - 1) && desColumn == (startColumn - 1)) // NO
		{
			return true;
		} else if (desRow == (startRow - 1) && desColumn == startColumn) // N
		{
			return true;
		} else if (desRow == (startRow - 1) && desColumn == (startColumn + 1)) // NE
		{
			return true;
		} else if (desRow == startRow && desColumn == (startColumn + 1)) // E
		{
			return true;
		} else if (desRow == (startRow + 1) && desColumn == (startColumn + 1)) // SE
		{
			return true;
		} else {

			strErrorMsg = "Rey solo se puede mover un espacio en diferente direcciones";
			return false;

		}

	}
	@Override
	public String toString() {
		return TipoPieza.Rey.toString();
	}
	
}
