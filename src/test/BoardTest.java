package test;

import model.ChessBoard;

import org.junit.Before;
import org.junit.Test;

public class BoardTest {
	private ChessBoard board;

	@Before
	public void Setup() {
		board = new ChessBoard();
		board.setupNewGame();
	}
	
	@Test
	public void testGetVisualRepresentationOfPawns() {
		String boardString = board.getVisualString();
		System.out.println(boardString);
	}

	@Test
	public void testRegularLegalMove() {

	}

	@Test
	public void testParseSquareInput() {
		
	}
}