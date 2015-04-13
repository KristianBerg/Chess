package pieces;

public class Pawn extends ChessPiece {
	private int direction;
	
	public Pawn(int startRow, int startCol, String alignment){
		super(startRow, startCol, alignment);
		if(alignment.equals("white")){
			direction = 1;
		} else {
			direction = -1;
		}
	}
	
	public void setPosition(int row, int col){
		this.row = row;
		this.col = col;
	}

	public boolean moveIsLegal(int row, int col, Piece[][] boardState) {
		if(this.isThreatening(row, col, (ChessPiece[][]) boardState)){ //TODO Figure out better solution
			return true;
		}
		if(this.row == row && this.col == col - direction){ //Is square valid for movement?
			if(boardState[row][col].isNullPiece()){ //Is square occupied?
				return true;
			}
		}
		return false;
	}
	
	public boolean isNullPiece(){
		return false;
	}

	@Override
	public boolean isSameAlignment(Piece piece) {
		if(!(piece instanceof ChessPiece)){
			return false;
		}
		ChessPiece comparePiece = (ChessPiece) piece; 
		return this.alignment.equals(comparePiece.alignment);
	}

	@Override
	public boolean isThreatening(int row, int col, ChessPiece boardState[][]) {
		// TODO Passant
		if(boardState[row][col].alignment.equals(this.alignment)){
			return false;
		}
		if(this.row == row - direction && Math.abs(this.col - col) == 1){
			return true;
		}
		return false;
	}

	@Override
	public String visualString() {
		// TODO Auto-generated method stub
		if(alignment.equals("white")){
			return "wp";
		}
		return "bp";
	}
}
