package model;

import pieces.ChessPiece;
import pieces.NullPiece;
import pieces.Pawn;

public class ChessBoard implements Board {
	private ChessPiece[][] boardState;
	private static final int BOARDSIZE = 8;
	private boolean whitesTurn;

	public ChessBoard() {
		boardState = new ChessPiece[BOARDSIZE][BOARDSIZE];
		for(int i = 0; i < BOARDSIZE; i++){
			for(int j = 0; i < BOARDSIZE; i++){
				boardState[i][j] = new NullPiece();
			}
		}
		whitesTurn = true;
	}

	public void movePiece(String from, String to) {
		// TODO Auto-generated method stub
		ChessPiece piece = parseSquareInput(from);
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

	public String getVisualString() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < BOARDSIZE; i++){
			for(int j = 0; j < BOARDSIZE; j++){
				ChessPiece piece = boardState[i][j];
				sb.append(piece.visualString() + " ");
			}
			sb.deleteCharAt(sb.length()); //Removes last space inserted
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

	public ChessPiece parseSquareInput(String from) {
		// TODO Auto-generated method stub
		char colChar = from.charAt(0);
		int col = colChar - 96; //convert from a-h to 1-8
		int row = from.charAt(1);
		return boardState[row][col];
	}

}