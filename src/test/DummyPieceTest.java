package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import pieces.DummyPiece;
import pieces.Pawn;
import pieces.Piece;

public class DummyPieceTest {
	private Piece piece;

	@Before
	public void setUp() throws Exception {
		piece = new DummyPiece(4, 4);
	}

	@Test
	public void testSetPosition() {
		piece.setPosition(2, 2);
	}

	@Test
	public void testMoveIsLegal() {
		assertTrue(piece.moveIsLegal(4, 6, null));
		assertTrue(piece.moveIsLegal(4, 2, null));
		assertTrue(piece.moveIsLegal(2, 4, null));
		assertTrue(piece.moveIsLegal(6, 4, null));
		assertFalse(piece.moveIsLegal(0, 0, null));
		assertFalse(piece.moveIsLegal(4, 8, null));
		assertFalse(piece.moveIsLegal(0, 4, null));
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
