package model;

import java.util.Scanner;

public class PlayChess {
	private ChessBoard board;
	private String boardVisual;
	private Scanner scan;
	private String endCondition;
	private boolean gameOver;

	public PlayChess() {
		board = new ChessBoard();
		board.setupNewGame();
		scan = new Scanner(System.in);
		gameOver = false;
		endCondition = "";
	}

	public static void main(String[] args) {
		PlayChess game = new PlayChess();
		game.play();
		while (true) {
			System.out.println("Play again? (y/n)");
			@SuppressWarnings("resource")
			String playAgain = (new Scanner(System.in)).nextLine();
			if (playAgain.equals("y")) {
				game = new PlayChess();
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
			Boolean gameDrawn = checkForDraw(nextMove);
			Boolean gameForfeited = checkForForfeit(nextMove);
			if(gameDrawn || gameForfeited){
				break;
			}
			movePiece(nextMove);
			gameOver = board.checkWinCondition();
		}
		checkForStaleMateOrCheckMate(gameOver);
		printEndCondition();
	}
	
	private void movePiece(String nextMove){
		Scanner moveScanner = new Scanner(nextMove);
		String from = moveScanner.next();
		String to = moveScanner.next();
		moveScanner.close();
		try {
			board.movePiece(from, to);
		} catch (moveNotAllowedException e) {
			System.out.println("Illegal move! ");
		} catch (stillInCheckException e) {
			System.out.println("King is still in check!");
		}
	}
	
	private Boolean checkForForfeit(String nextMove) {
		if(nextMove.equals("forfeit")){
			endCondition = "forfeit by " + board.getCurrentPlayer();
		}
		return false;
	}

	private Boolean checkForDraw(String nextMove) {
		if(nextMove.equals("remi")){
			System.out.println("Accept draw? (y/n)");
			nextMove = scan.nextLine();
			if(nextMove.equals("y")){
				endCondition = "remi";
				return true;
			}
		}
		return false;
	}
	
	private void checkForStaleMateOrCheckMate(boolean gameOver){
		if(board.staleMate()){
			endCondition = "stalemate";
		}
		else if(gameOver){
			endCondition = "mate by" + board.getCurrentPlayer();
		}
	}

	private void printEndCondition(){
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
		} else if (endCondition.equals("stalemate")){
			System.out.println("Game drawn, stalemate!");
		}
	}
}
