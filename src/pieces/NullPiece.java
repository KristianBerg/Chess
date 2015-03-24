package pieces;

public class NullPiece implements Piece{
	
	public boolean moveIsLegal(int row, int col, Piece[][] boardState){
		throw new UnsupportedOperationException("Can't move nonexistent piece");
	}

	public void setPosition(int row, int col) {
		throw new UnsupportedOperationException("Can't move nonexistent piece");
	}
	
	public boolean isNullPiece(){
		return true;
	}

	@Override
	public boolean isSameAlignment() {
		// TODO Auto-generated method stub
		return false;
	}
}
