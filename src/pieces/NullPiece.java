package pieces;

public class NullPiece implements Piece{
	
	public boolean moveIsLegal(int row, int col, int[][] boardState){
		throw new UnsupportedOperationException("Can't move nonexistent piece");
	}

	public void setPosition(int row, int col) {
		throw new UnsupportedOperationException("Can't move nonexistent piece");
	}
	
	public boolean isNotNullPiece(){
		return false;
	}
}
