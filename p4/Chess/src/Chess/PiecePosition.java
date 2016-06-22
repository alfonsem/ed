package Chess;

/**
 * 
 * @author Alfonso Esteve
 */
public class PiecePosition {

	/**
         * Esta función devuelve si la posición esta dentro del tablero dando los parámetros
         * @param column Columna
         * @param row Fila
         * @return Delvuelve true si es una posición dentro del tablero y false en caso contrario
         */
	public static boolean isAvailable(int column, int row) {
		return column >= 0 && column < 8 && row >= 0 && row < 8;
	}

	/**
         * Esta función devuelve si la posición de la pieza después de incrementar la columna y
         * la fila están dentro del tablero
         * @param position Posición actual de la pieza
         * @param columnIncrement Nueva columna incrementada
         * @param rowIncrement Nueva fila incrementada
         * @return Devuelve true si la posición es válida y false en caso contrario
         */
	static boolean isAvailable(PiecePosition position, int columnIncrement, int rowIncrement) {
		if (position == null)
			return false;
		
		int newColumn = position.getColumn() + columnIncrement;
		int newRow = position.getRow() + rowIncrement;
		return isAvailable(newColumn, newRow);
	}

	/**
         * Función que nos dice si la pieza está dentro del tablero dándonos la posición
         * de la pieza y devolciendo la posción de la columna y la fila
         * @param position Posición de la pieza
         * @return Devuelve la posición de la columna y la fila
         */
	static boolean isAvailable(PiecePosition position) {
		if (position == null)
			return false;
		return isAvailable(position.getColumn(), position.getRow());
	}

	private int column, row;

	/**
         * Constructor de la posición de la pieza con parámetros para la columna
         * y la fila
         * @param column Columna de la pieza
         * @param row Fila de la pieza
         */
	public PiecePosition(int column, int row) {
		this.column = column;
		this.row = row;
	}
	
	/**
         * Método que nos devuelve la columna de la posición de la pieza
         * @return 
         */
	public int getColumn() {
		return column;
	}

	/**
         * Método que nos devuelve la fila de la posición de la pieza
         * @return 
         */
	public int getRow() {
		return row;
	}
	/**
         * Método que intenta guardar la posición de la pieza dado la columna y
         * la fila
         * @param column COlumna  de la posición de la pieza
         * @param row Fila de la posición de la pieza
         * @return Nos devuelve true si ha podido darle los valores de la columna
         * y la fila o false en caso contrario
         */
	public boolean setValues(int column, int row) {
		if (isAvailable(column, row)) {
			this.column = column;
			this.row = row;			
			return true;
		}
		return false;
	}
	
	/**
         * Método que dado una columna y una fila nos devuelve la nueva posición
         * de la pieza
         * @param columnCount Número de columnas a desplazar
         * @param rowCount Número de filas a desplazar
         * @return Nos devuelve la nueva posición de la pieza
         */
	public PiecePosition getDisplacedPiece(int columnCount, int rowCount) {		
		if (!isAvailable(this, columnCount, rowCount))
			return null;
		int newColumn = getColumn() + columnCount;
		int newRow = getRow() + rowCount;
		return new PiecePosition(newColumn, newRow);
	}
	
	/**
         * Método para clonar la posición de la pieza
         * @return 
         */
	public PiecePosition clone() {
		return new PiecePosition(column, row);
	}
	
	/**
         * Método que dada una posición de la pieza compara si es la misma en la
         * que estamos
         * @param aPosition Nueva posición
         * @return Nos devuelve true si es la misma posición y false en caso contrario
         */
	public boolean equals(PiecePosition aPosition) {
		return aPosition.getColumn() == getColumn() && aPosition.getRow() == getRow();
	}
}
