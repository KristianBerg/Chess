package pieces;

import model.ChessBoard;

public class Pawn extends ChessPiece {
	
	public Pawn(int startRow, int startCol, String alignment){
		super(startRow, startCol, alignment);
	}
	
	public void setPosition(int row, int col){
		this.row = row;
		this.col = col;
	}

	public boolean moveIsLegal(int row, int col, Piece[][] boardState) {
		int direction = 0;
		if(alignment.equals("white")){
			direction = 1;
		} else {
			direction = -1;
		}
		if(this.row == row && this.col == col - 1 * direction){
			return true;
		}
		return false;
	}
	
	public boolean isNullPiece(){
		return false;
	}

	@Override
	public boolean isSameAlignment(Piece piece) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isThreatening(int row, int col, ChessBoard board) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String visualString() {
		// TODO Auto-generated method stub
		return null;
	}
}
