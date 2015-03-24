package test;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import pieces.DummyPiece;

public class TestDummyPieceTest {
	private DummyPiece piece;

	@Before
	public void setUp() throws Exception {
		piece = new DummyPiece(4, 4);
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
