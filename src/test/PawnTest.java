package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import pieces.NullPiece;
import pieces.Pawn;
import pieces.Piece;

public class PawnTest {
	private Pawn pawn;
	private Piece[][] boardState;
	
	@Before
	public void Setup(){
		pawn = new Pawn(1, 4, "white");
		boardState = new Piece[8][8];
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				boardState[i][j] = new NullPiece();
			}
		}
	}
	
	@Test
	public void testLegalMove(){
		assertTrue(pawn.moveIsLegal(1, 5, boardState));
	}
	
	@Test
	public void testIllegalMove(){
		assertFalse(pawn.moveIsLegal(4, 3, boardState));
		assertFalse(pawn.moveIsLegal(3, 0, boardState));
	}
	
	@Test
	public void testFirstMoveMechanics(){
		assertTrue("First move can be two squares", pawn.moveIsLegal(4, 6, boardState));
		assertFalse("Second move and onwards can only be one square", pawn.moveIsLegal(4, 8, boardState));
	}
}
