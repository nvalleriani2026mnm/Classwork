package semester2;

import java.util.Scanner;

public class TicTacToe {
	
	public static void main(String[] args) {
		
		//This is the gameboard I will be using for this game
		String[][] gameBoard = {
				{"?","|","?","|","?"},
				{"?","|","?","|","?"},
				{"?","|","?","|","?"}
		};
		
		//This is a scanner which will read the player's input
		Scanner inputReader = new Scanner(System.in);
		
		//Prints out the current game board for players
		for(int z = 0; z < gameBoard.length; z++) {
			for(int x = 0; x < gameBoard[z].length; x++) {
				System.out.print(gameBoard[z][x]);
			}
			System.out.print("\n");
		}
		
		//Calls the first method to start the game
		playerOneTurn(gameBoard, inputReader);
	}
	
	public static void playerOneTurn(String[][] gameBoard, Scanner inputReader) {
		
		System.out.print("\n");
		System.out.print("Player 1 choose your tile.");
		System.out.print("\n");
		System.out.print("\n");
		
		String playerOneSelect = inputReader.nextLine();
		
		//Detects what the player typed in, if they put in top left, the top left will be filled in with the player's corresponding
		//symbol (X or O)
		if(playerOneSelect.equalsIgnoreCase("top left")) {
			if(gameBoard[0][0].equals("?")) {
				gameBoard[0][0] = "O";
			}
			else {
				System.out.print("That spot is already taken, choose again.");
				System.out.print("\n");
				playerOneTurn(gameBoard, inputReader);
			}
		}
		else if(playerOneSelect.equalsIgnoreCase("top middle")) {
			if(gameBoard[0][2].equals("?")) {
				gameBoard[0][2] = "O";
			}
			else {
				System.out.print("That spot is already taken, choose again.");
				System.out.print("\n");
				playerOneTurn(gameBoard, inputReader);
			}
		}
		else if(playerOneSelect.equalsIgnoreCase("top right")) {
			if(gameBoard[0][4].equals("?")) {
				gameBoard[0][4] = "O";
			}
			else {
				System.out.print("That spot is already taken, choose again.");
				System.out.print("\n");
				playerOneTurn(gameBoard, inputReader);
			}
		}
		else if(playerOneSelect.equalsIgnoreCase("middle left")) {
			if(gameBoard[1][0].equals("?")) {
				gameBoard[1][0] = "O";
			}
			else {
				System.out.print("That spot is already taken, choose again.");
				System.out.print("\n");
				playerOneTurn(gameBoard, inputReader);
			}
		}
		else if(playerOneSelect.equalsIgnoreCase("middle")) {
			if(gameBoard[1][2].equals("?")) {
				gameBoard[1][2] = "O";
			}
			else {
				System.out.print("That spot is already taken, choose again.");
				System.out.print("\n");
				playerOneTurn(gameBoard, inputReader);
			}
		}
		else if(playerOneSelect.equalsIgnoreCase("middle right")) {
			if(gameBoard[1][4].equals("?")) {
				gameBoard[1][4] = "O";
			}
			else {
				System.out.print("That spot is already taken, choose again.");
				System.out.print("\n");
				playerOneTurn(gameBoard, inputReader);
			}
		}
		else if(playerOneSelect.equalsIgnoreCase("bottom left")) {
			if(gameBoard[2][0].equals("?")) {
				gameBoard[2][0] = "O";
			}
			else {
				System.out.print("That spot is already taken, choose again.");
				System.out.print("\n");
				playerOneTurn(gameBoard, inputReader);
			}
		}
		else if(playerOneSelect.equalsIgnoreCase("bottom middle")) {
			if(gameBoard[2][2].equals("?")) {
				gameBoard[2][2] = "O";
			}
			else {
				System.out.print("That spot is already taken, choose again.");
				System.out.print("\n");
				playerOneTurn(gameBoard, inputReader);
			}
		}
		else if(playerOneSelect.equalsIgnoreCase("bottom right")) {
			if(gameBoard[2][4].equals("?")) {
				gameBoard[2][4] = "O";
			}
			else {
				System.out.print("That spot is already taken, choose again.");
				System.out.print("\n");
				playerOneTurn(gameBoard, inputReader);
			}
		}
		else {
			System.out.print("That's not a valid input!");
			System.out.print("\n");
			playerOneTurn(gameBoard, inputReader);
		}
		
		for(int z = 0; z < gameBoard.length; z++) {
			for(int x = 0; x < gameBoard[z].length; x++) {
				System.out.print(gameBoard[z][x]);
			}
			System.out.print("\n");
		}
		
		//This detects to see if at any of the 8 possible winning points a player has won, it manually checks each set of rows
		//and columns, it'll then return if they won to stop the loop
		if(gameBoard[0][0].equals("O") && gameBoard[0][2].equals("O") && gameBoard[0][4].equals("O")) {
			System.out.print("\n");
			System.out.print("Player 1 wins!");
			return;
		}
		else if(gameBoard[1][0].equals("O") && gameBoard[1][2].equals("O") && gameBoard[1][4].equals("O")) {
			System.out.print("\n");
			System.out.print("Player 1 wins!");
			return;
		}
		else if(gameBoard[2][0].equals("O") && gameBoard[2][2].equals("O") && gameBoard[2][4].equals("O")) {
			System.out.print("\n");
			System.out.print("Player 1 wins!");
			return;
		}
		else if(gameBoard[0][0].equals("O") && gameBoard[1][0].equals("O") && gameBoard[2][0].equals("O")) {
			System.out.print("\n");
			System.out.print("Player 1 wins!");
			return;
		}
		else if(gameBoard[0][2].equals("O") && gameBoard[1][2].equals("O") && gameBoard[2][2].equals("O")) {
			System.out.print("\n");
			System.out.print("Player 1 wins!");
			return;
		}
		else if(gameBoard[0][4].equals("O") && gameBoard[1][4].equals("O") && gameBoard[2][4].equals("O")) {
			System.out.print("\n");
			System.out.print("Player 1 wins!");
			return;
		}
		else if(gameBoard[0][0].equals("O") && gameBoard[1][2].equals("O") && gameBoard[2][4].equals("O")) {
			System.out.print("\n");
			System.out.print("Player 1 wins!");
			return;
		}
		else if(gameBoard[0][4].equals("O") && gameBoard[1][2].equals("O") && gameBoard[2][0].equals("O")) {
			System.out.print("\n");
			System.out.print("Player 1 wins!");
			return;
		}
		
		//Checks every turn if the board is completely full with no winners, if so it stops everything
		if(isItTied(gameBoard)) {
			System.out.print("Nobody won, it's a tie.");
			return;
		}
		playerTwoTurn(gameBoard, inputReader);
	}
	
	public static void playerTwoTurn(String[][] gameBoard, Scanner inputReader) {
		
		System.out.print("\n");
		System.out.print("Player 2 choose your tile.");
		System.out.print("\n");
		System.out.print("\n");
		
		String playerTwoSelect = inputReader.nextLine();
		
		//Same as before, it reads what the player types and changes that spot to match their corresponding symbol (X or O)
		if(playerTwoSelect.equalsIgnoreCase("top left")) {
			if(gameBoard[0][0].equals("?")) {
				gameBoard[0][0] = "X";
			}
			else {
				System.out.print("That spot is already taken, choose again.");
				System.out.print("\n");
				playerTwoTurn(gameBoard, inputReader);
			}
		}
		else if(playerTwoSelect.equalsIgnoreCase("top middle")) {
			if(gameBoard[0][2].equals("?")) {
				gameBoard[0][2] = "X";
			}
			else {
				System.out.print("That spot is already taken, choose again.");
				System.out.print("\n");
				playerTwoTurn(gameBoard, inputReader);
			}
			
		}
		else if(playerTwoSelect.equalsIgnoreCase("top right")) {
			if(gameBoard[0][4].equals("?")) {
				gameBoard[0][4] = "X";
			}
			else {
				System.out.print("That spot is already taken, choose again.");
				System.out.print("\n");
				playerTwoTurn(gameBoard, inputReader);
			}
		}
		else if(playerTwoSelect.equalsIgnoreCase("middle left")) {
			if(gameBoard[1][0].equals("?")) {
				gameBoard[1][0] = "X";
			}
			else {
				System.out.print("That spot is already taken, choose again.");
				System.out.print("\n");
				playerTwoTurn(gameBoard, inputReader);
			}
		}
		else if(playerTwoSelect.equalsIgnoreCase("middle")) {
			if(gameBoard[1][2].equals("?")) {
				gameBoard[1][2] = "X";
			}
			else {
				System.out.print("That spot is already taken, choose again.");
				System.out.print("\n");
				playerTwoTurn(gameBoard, inputReader);
			}
		}
		else if(playerTwoSelect.equalsIgnoreCase("middle right")) {
			if(gameBoard[1][4].equals("?")) {
				gameBoard[1][4] = "X";
			}
			else {
				System.out.print("That spot is already taken, choose again.");
				System.out.print("\n");
				playerTwoTurn(gameBoard, inputReader);
			}
		}
		else if(playerTwoSelect.equalsIgnoreCase("bottom left")) {
			if(gameBoard[2][0].equals("?")) {
				gameBoard[2][0] = "X";
			}
			else {
				System.out.print("That spot is already taken, choose again.");
				System.out.print("\n");
				playerTwoTurn(gameBoard, inputReader);
			}
		}
		else if(playerTwoSelect.equalsIgnoreCase("bottom middle")) {
			if(gameBoard[2][2].equals("?")) {
				gameBoard[2][2] = "X";
			}
			else {
				System.out.print("That spot is already taken, choose again.");
				System.out.print("\n");
				playerTwoTurn(gameBoard, inputReader);
			}
		}
		else if(playerTwoSelect.equalsIgnoreCase("bottom right")) {
			if(gameBoard[2][4].equals("?")) {
				gameBoard[2][4] = "X";
			}
			else {
				System.out.print("That spot is already taken, choose again.");
				System.out.print("\n");
				playerTwoTurn(gameBoard, inputReader);
			}
		}
		else {
			System.out.print("That's not a valid input!");
			System.out.print("\n");
			playerTwoTurn(gameBoard, inputReader);
		}
		
		for(int z = 0; z < gameBoard.length; z++) {
			for(int x = 0; x < gameBoard[z].length; x++) {
				System.out.print(gameBoard[z][x]);
			}
			System.out.print("\n");
		}
		
		//Same as before it manually checks every possible winning point to see if a player has those spots
		if(gameBoard[0][0].equals("X") && gameBoard[0][2].equals("X") && gameBoard[0][4].equals("X")) {
			System.out.print("\n");
			System.out.print("Player 2 wins!");
			return;
		}
		else if(gameBoard[1][0].equals("X") && gameBoard[1][2].equals("X") && gameBoard[1][4].equals("X")) {
			System.out.print("\n");
			System.out.print("Player 2 wins!");
			return;
		}
		else if(gameBoard[2][0].equals("X") && gameBoard[2][2].equals("X") && gameBoard[2][4].equals("X")) {
			System.out.print("\n");
			System.out.print("Player 2 wins!");
			return;
		}
		else if(gameBoard[0][0].equals("X") && gameBoard[1][0].equals("X") && gameBoard[2][0].equals("X")) {
			System.out.print("\n");
			System.out.print("Player 2 wins!");
			return;
		}
		else if(gameBoard[0][2].equals("X") && gameBoard[1][2].equals("X") && gameBoard[2][2].equals("X")) {
			System.out.print("\n");
			System.out.print("Player 2 wins!");
			return;
		}
		else if(gameBoard[0][4].equals("X") && gameBoard[1][4].equals("X") && gameBoard[2][4].equals("X")) {
			System.out.print("\n");
			System.out.print("Player 2 wins!");
			return;
		}
		else if(gameBoard[0][0].equals("X") && gameBoard[1][2].equals("X") && gameBoard[2][4].equals("X")) {
			System.out.print("\n");
			System.out.print("Player 2 wins!");
			return;
		}
		else if(gameBoard[0][4].equals("X") && gameBoard[1][2].equals("X") && gameBoard[2][0].equals("X")) {
			System.out.print("\n");
			System.out.print("Player 2 wins!");
			return;
		}
		
		//Checks every turn to see if the board is ever completely full with no winners
		if(isItTied(gameBoard)) {
			System.out.print("Nobody won, it's a tie.");
			return;
		}
		playerOneTurn(gameBoard, inputReader);
	}
	
	//Goes through every spot and sees if there is at any point an empty spot and stops itself. But if it never does then that's how
	//we know the game is a tie
	public static boolean isItTied(String[][] gameBoard) {
		
			for(int i = 0; i < gameBoard.length; i++) {
				for(int k = 0; k < gameBoard[i].length; k+=2) {
					if(gameBoard[i][k].equals("?")) {
						return false;
					}
				}
			}
			return true;
		}

}

