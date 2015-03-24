package pieces;

public class Pawn extends ChessPiece {
	int row, col;
	
	public Pawn(int startRow, int startCol, String alignment){
		super(startRow, startCol, alignment);
	}
	
	public void setPosition(int row, int col){
		this.row = row;
		this.col = col;
	}

	public boolean moveIsLegal(int row, int col, Piece[][] boardState) {
		return false;
	}
	
	public boolean isNullPiece(){
		return false;
	}

	@Override
	public boolean isSameAlignment() {
		// TODO Auto-generated method stub
		return false;
	}
}
