package pieces;

public class Pawn implements Piece {
	int row, col;
	
	public Pawn(int startRow, int startCol){
		row = startRow;
		col = startCol;
	}
	
	public void setPosition(int row, int col){
		this.row = row;
		this.col = col;
	}

	public boolean moveIsLegal(int row, int col, Piece[][] boardState) {
		return false;
	}
	
	public boolean isNotNullPiece(){
		return true;
	}
}
