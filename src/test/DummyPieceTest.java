package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import model.Board;
import model.DummyBoard;

import org.junit.Before;
import org.junit.Test;

import pieces.DummyPiece;
import pieces.NullPiece;
import pieces.Pawn;
import pieces.Piece;

public class DummyPieceTest {
	private Piece piece;
	private Piece[][] boardState;

	@Before
	public void setUp() throws Exception {
		piece = new DummyPiece(4, 4);
		boardState = new Piece[8][8];
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				boardState[i][j] = new NullPiece();
			}
		}
		boardState[3][3] = new DummyPiece(3, 3);
		boardState[3][4] = new DummyPiece(3, 4);
	}

	@Test
	public void testSetPosition() {
		piece.setPosition(2, 2);
	}

	@Test
	public void testMoveIsLegal() {
		assertTrue(piece.moveIsLegal(4, 6, boardState));
		assertTrue(piece.moveIsLegal(4, 2, boardState));
		assertTrue(piece.moveIsLegal(2, 4, boardState));
		assertTrue(piece.moveIsLegal(6, 4, boardState));
		assertFalse(piece.moveIsLegal(0, 0, boardState));
		assertFalse(piece.moveIsLegal(4, 8, boardState));
		assertFalse(piece.moveIsLegal(0, 4, boardState));
	}

	@Test
	public void testIsNullPiece() {
		assertFalse(piece.isNullPiece());
	}

	@Test
	public void testIsSameAlignment() {
		Piece enemyPiece = new Pawn(3,3, "white");
		assertFalse(piece.isSameAlignment(enemyPiece));
		Piece friendPiece = new DummyPiece(2, 2);
		assertTrue(piece.isSameAlignment(friendPiece));
	}
}
