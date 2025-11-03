import java.util.Scanner;

public class MontyHallProblemo {

	//This is my scanner being enstantiated up here so that I can call to use it in the future
	static Scanner inputReader = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//This method caller starts the game
		gameStart();
	
		//This method caller closes the input scanner to not allow any resource leaks
		inputReader.close();	
	}

	//This method is what starts the game by picking a winning door, then asking the user to pick a door
	private static void gameStart() {
		
		int winDoor = (int)(Math.random() * (3) + 1);
		chooseDoor(winDoor);
	}
	//This method is what allows the user to pick a door
		public static void chooseDoor(int victoryDoor) {
		
			System.out.println("Choose a door number from 1-3.");
		
		
			String playerAnswer = inputReader.nextLine();
		
			if (playerAnswer.equals("1")) {
				System.out.print("");
			}
			else if (playerAnswer.equals("2")) {
				System.out.print("");
			}
			else if (playerAnswer.equals("3")) {
				System.out.print("");
			}
			else {
				System.out.print("COME BACK WHEN YOU ACHIEVE BETTER READING COMPREHENSION, I SAID CHOOSE BETWEEN 1 TO 3.");
			}
		
		
			revealDoor(playerAnswer, victoryDoor);
		
		}
		
		//This method reveals one of the wrong doors by choosing a wrong door, then conforming to the user what door they picked
		public static void revealDoor(String playerAnswer, int victoryDoor) {
			
			//Since I'm making a new variable I'm giving it a random value since I'm changing it anyway
			int wrongDoor = 6741;
			
			if (!(playerAnswer.equals("1")) && victoryDoor != 1) {
				wrongDoor = 1;
			}
			else if (!(playerAnswer.equals("2")) && victoryDoor != 2) {
				wrongDoor = 2;
			}
			else {
				wrongDoor = 3;
			}
			
			System.out.println("You have chosen door " + playerAnswer + ", but door " + wrongDoor + " has nothing behind it.");
			switchDoor(playerAnswer, wrongDoor, victoryDoor);
			
		}
		
		//This method allows for the user to switch their door if the want to
		public static void switchDoor(String playerAnswer, int wrongDoor, int victoryDoor) {
			
			if (playerAnswer.equals("1") || playerAnswer.equals("2") || playerAnswer.equals("3")) {
				System.out.println("Would you like to switch your door? (Yes/No)");
			}
			else {
				System.out.println("TRY AGAIN!!!!!!!");
			}
			
			String ynChoice = inputReader.nextLine();
			
			
			if (ynChoice.equals("yes") || (ynChoice.equals("Yes")) || (ynChoice.equals("YES"))) {
				if (wrongDoor != 1 && !(playerAnswer.equals("1"))) {
					playerAnswer = "1";
					System.out.println("You have switched your selected door to " + playerAnswer + ".");
				}
				else if (wrongDoor != 2 && !(playerAnswer.equals("1"))) {
					playerAnswer = "2";
					System.out.println("You have switched your selected door to " + playerAnswer + ".");
				}
				else {
					playerAnswer = "3";
					System.out.println("You have switched your selected door to " + playerAnswer + ".");
				}
				
				
			}
			else if (ynChoice.equals("no") || (ynChoice.equals("No")) || (ynChoice.equals("NO"))) {
				System.out.println("You have chosen to stay with your selected door of " + playerAnswer + ".");
			}
			else {
				System.out.println("Invalid input, try again.");
			}
			
			winLose(playerAnswer, victoryDoor);
	
		}
		
		//This method detects if the user won or lost the round by checking if the user picked the winning door
		public static void winLose(String playerAnswer, int victoryDoor) {
			
			if (playerAnswer.equals("1") && victoryDoor == 1) {
				System.out.print("Congratulations, you've won!!!");
			}
			else if (playerAnswer.equals("2") && victoryDoor == 2) {
				System.out.print("Congratulations, you've won!!!");
			}
			else if (playerAnswer.equals("3") && victoryDoor == 3) {
				System.out.print("Congratualtions, you've won!!!");
			}
			
			else {
				System.out.print("Sorry, you lost! Better luck next time.");
			}
		

		
	}
	
	
}
