package model;

import pieces.DummyPiece;
import pieces.NullPiece;
import pieces.Piece;

public class DummyBoard implements Board {
	private Piece[][] boardState;
	private static final int BOARDSIZE = 8;

	@Override
	public void setupNewGame() {
		// TODO Auto-generated method stub
		boardState = new Piece[BOARDSIZE][BOARDSIZE];
		for (int i = 0; i < BOARDSIZE; i++) {
			for (int j = 0; j < BOARDSIZE; j++) {
				boardState[i][j] = new NullPiece();
			}
		}
		boardState[3][3] = new DummyPiece(3, 3);
		boardState[3][4] = new DummyPiece(3, 4);
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

}
