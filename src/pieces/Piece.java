package pieces;

public interface Piece {
	public void setPosition(int row, int col);
	public boolean moveIsLegal(int row, int col, int[][] boardState);
	public boolean isNotNullPiece();
}
