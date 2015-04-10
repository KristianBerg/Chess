package model;

import java.util.Scanner;

public class playChess {
	private ChessBoard board;
	private String boardVisual;
	private Scanner scan;
	private boolean gameOver;

	public playChess() {
		board = new ChessBoard();
		board.setupNewGame();
		scan = new Scanner(System.in);
		gameOver = false;
	}

	public static void main(String[] args) {
		playChess game = new playChess();
		game.play();
		while (true) {
			System.out.println("Play again? (y/n)");
			@SuppressWarnings("resource")
			String playAgain = (new Scanner(System.in)).nextLine();
			if (playAgain == "y") {
				game = new playChess();
				game.play();
			} else {
				System.exit(0);
			}
		}
	}

	public void play() {
		while (!gameOver) {
			boardVisual = board.getVisualString();
			System.out.println(boardVisual);
			System.out.println("Enter move: ");
			String nextMove = scan.nextLine();
			Scanner moveScanner = new Scanner(nextMove);
			String from = moveScanner.next();
			String to = moveScanner.next();
			moveScanner.close();
			try {
				board.movePiece(from, to);
			} catch (moveNotAllowedException e) {
				System.out.println("Illegal move!");
			} catch (stillInCheckException e) {
				System.out.println("King is still in check!");
			}
			gameOver = board.checkWinCondition();
		}
		String endCondition = board.getEndCondition();
		if (endCondition.equals("mate by white")) {
			System.out.println("Check mate, white wins!");
		} else if (endCondition.equals("mate by black")) {
			System.out.println("Check mate, black wins!");
		} else if (endCondition.equals("remi")) {
			System.out.println("Game drawn!");
		} else if (endCondition.equals("forfeit by white")) {
			System.out.println("Game forfeited, black wins!");
		} else if (endCondition.equals("forfeit by black")) {
			System.out.println("Game forfeited, white wins!");
		}
	}
}
