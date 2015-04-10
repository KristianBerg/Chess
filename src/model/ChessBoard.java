package model;

import pieces.ChessPiece;
import pieces.Pawn;
import pieces.Piece;

public class ChessBoard implements Board {
	private ChessPiece[][] boardState;
	private static final int BOARDSIZE = 8;
	private boolean whitesTurn;

	public ChessBoard() {
		boardState = new ChessPiece[BOARDSIZE][BOARDSIZE];
		whitesTurn = true;
	}

	public boolean movePiece(String from, String to) {
		// TODO Auto-generated method stub
		ChessPiece piece = parseSquareInput(from);
		return false;
	}

	@Override
	public void setupNewGame() {
		// TODO Auto-generated method stub
		for (int i = 0; i < BOARDSIZE; i++) {
			boardState[1][i] = new Pawn(1, i, "white");
			boardState[7][i] = new Pawn(7, i, "black");
		}

	}

	@Override
	public boolean checkWinCondition() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void movePiece() {
		// TODO Auto-generated method stub
	}

	public String getVisualString() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < BOARDSIZE; i++){
			for(int j = 0; j < BOARDSIZE; j++){
				ChessPiece piece = boardState[i][j];
				if(piece.isNullPiece()){
					sb.append("o ");
				} else {
					sb.append(piece.visualString() + " ");
				}
			}
			sb.deleteCharAt(sb.length()); //Remove last space
			sb.append("\n");
		}
		return sb.toString();
	}

	public String getCurrentPlayer() {
		if (whitesTurn) {
			return "white";
		}
		return "black";
	}

	public boolean staleMate() {
		// TODO Auto-generated method stub
		return false;
	}

	private ChessPiece parseSquareInput(String from) {
		// TODO Auto-generated method stub
		return null;
	}

}