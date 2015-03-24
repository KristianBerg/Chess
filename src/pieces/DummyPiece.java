package pieces;

public class DummyPiece implements Piece {
	int row, col;
	
	public DummyPiece(int row, int col){
		
	}
	
	@Override
	public void setPosition(int row, int col) {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean moveIsLegal(int row, int col, Piece[][] boardState) {
		boolean isLegalDirection, isNotBlocked;
		return false;
	}

	@Override
	public boolean isNullPiece() {
		return false;
	}

	@Override
	public boolean isSameAlignment() {
		// TODO Auto-generated method stub
		return false;
	}

}
