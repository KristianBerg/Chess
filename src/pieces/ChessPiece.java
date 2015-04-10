package pieces;

import model.ChessBoard;

public abstract class ChessPiece implements Piece{
	private String alignment;
	private int row, col;
	
	public abstract boolean isThreatening(int row, int col, ChessBoard board);
	
	protected ChessPiece(int r, int c, String a){
		
	}
}
