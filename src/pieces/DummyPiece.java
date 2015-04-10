package pieces;

public class DummyPiece implements Piece {
	int row, col;

	public DummyPiece(int row, int col) {

	}

	@Override
	public void setPosition(int row, int col) {
		this.row = row;
		this.col = col;
	}

	@Override
	public boolean moveIsLegal(int row, int col, Piece[][] boardState) {
		// TODO Auto-generated method stub
		boolean isLegalDirection = false, isNotBlocked = false, isInBoardBounds = false;
		int length = boardState.length;
		if (0 < row && row < length && 0 < col && col < length) {
			isInBoardBounds = false;
		} 
		if (Math.abs(row - this.row) == 2 && col == this.col){
			isLegalDirection = true;
			int direction = (row - this.row) / 2;
			if(boardState[row + direction][col].isNullPiece() && boardState[row + 2*direction][col].isNullPiece()){
				isNotBlocked = true;
			}
		} else if (Math.abs(col - this.col) == 2 && row == this.row){
			isLegalDirection = true;
		}
		
		return isLegalDirection && isNotBlocked && isInBoardBounds;
	}

	@Override
	public boolean isNullPiece() {
		return false;
	}

	@Override
	public boolean isSameAlignment(Piece piece) {
		if (!(piece instanceof DummyPiece)){
			return false;
		}
		return true;
	}

}
