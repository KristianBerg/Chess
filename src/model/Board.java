package model;

import pieces.Pawn;
import pieces.Piece;

public class Board {
	private Piece[][] boardState;
	
	//Standard chess board
	public Board(){
		boardState = new Piece[8][8];
		for(int i = 0; i < 8; i++){
			boardState[1][i] = new Pawn(1, i);
			boardState[7][i] = new Pawn(7, i);
		}
		
	}
	
	public boolean move(String from, String to){
		return false;
	}
	
}
