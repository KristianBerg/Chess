package pieces;

public interface Piece {
	public void setPosition(int row, int col);
	public boolean moveIsLegal(int row, int col, Piece[][] boardState);
	public boolean isNullPiece();
	public boolean isSameAlignment(Piece piece);
}
