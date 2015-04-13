package pieces;

import model.ChessBoard;

public abstract class ChessPiece implements Piece{
	protected String alignment;
	protected int row, col;
	
	public abstract boolean isThreatening(int row, int col, ChessBoard board);
	public abstract String visualString();
	
	protected ChessPiece(int r, int c, String a){
		
	}
}
