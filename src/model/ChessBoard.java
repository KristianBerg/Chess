package model;

import pieces.Pawn;
import pieces.Piece;

public class ChessBoard implements Board{
	private Piece[][] boardState;
	private static final int BOARDSIZE = 8;
	
	public ChessBoard(){
		boardState = new Piece[BOARDSIZE][BOARDSIZE];
	}
	
	public boolean movePiece(String from, String to){
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setupNewGame() {
		// TODO Auto-generated method stub
		for(int i = 0; i < BOARDSIZE; i++){
			boardState[1][i] = new Pawn(1, i, "white");
			boardState[7][i] = new Pawn(7, i, "black");
		}
		
	}

	@Override
	public void checkWinCondition() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void movePiece() {
		// TODO Auto-generated method stub
		
	}
	
}
