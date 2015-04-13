package pieces;

import model.ChessBoard;

public class NullPiece extends ChessPiece{
	
	public NullPiece(){
		super(0, 0, null);
	}

	public boolean moveIsLegal(int row, int col, Piece[][] boardState){
		throw new UnsupportedOperationException("Can't move nonexistent piece");
	}

	public void setPosition(int row, int col) {
		throw new UnsupportedOperationException("Can't move nonexistent piece");
	}
	
	public boolean isNullPiece(){
		return true;
	}

	public boolean isSameAlignment(Piece piece) {
		return false;
	}

	public boolean isThreatening(int row, int col, ChessBoard board) {
		throw new UnsupportedOperationException("Nonexistent piece can't threaten");
	}

	public String visualString() {
		return "0";
	}
}
