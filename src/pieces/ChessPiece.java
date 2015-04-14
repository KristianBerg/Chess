package pieces;


public abstract class ChessPiece implements Piece{
	protected String alignment;
	protected int row, col;
	
	public abstract boolean isThreatening(int row, int col, ChessPiece boardState[][]);
	public abstract String visualString();
	
	protected ChessPiece(int r, int c, String a){
		row = r;
		col = c;
		alignment = a;
	}
}
