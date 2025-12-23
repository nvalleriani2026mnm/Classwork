import java.util.Scanner;

public class BasicWordleagain {

	//This is how the users will be typing in their inputs
	static Scanner inputReader = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//This is the correct answer and this will loop the getValidInput method until the method returns true which tells it to stop
		//looping the game, otherwise it'll keep going
		String correctAnswer = "water";
		boolean complete = false;
		
		while(!complete) {
			complete = getValidInput(correctAnswer);
		}
	}

	//This method basically checks to see if the user puts in a five letter word, doesn't have repeating letters, and determines what will
	//happen if the user ends up guessing correctly. If the user doesn't follow these rules, it'll return false and keep asking the
	//user for another input
	public static boolean getValidInput(String correctAnswer) {
		
		System.out.print("Please make a five letter word guess! No duplicate letters allowed.");
		System.out.println("");
		String userInput = inputReader.nextLine(); 
		
		if(userInput.length() != 5) {
			System.out.println("Your word is not 5 letters, try again.");
			return false;
		}
		
		if(userInput.charAt(0) == userInput.charAt(1) || userInput.charAt(0) == userInput.charAt(2) || userInput.charAt(0) == userInput.charAt(3) || userInput.charAt(0) == userInput.charAt(4)) {
			System.out.println("Your word has repeating letters, try again.");
			return false;
		}
		else if (userInput.charAt(1) == userInput.charAt(2) || userInput.charAt(1) == userInput.charAt(3) || userInput.charAt(1) == userInput.charAt(4)) {
			System.out.println("Your word has repeating letters, try again.");
			return false;
		}
		else if (userInput.charAt(2) == userInput.charAt(3) || userInput.charAt(2) == userInput.charAt(4)) {
			System.out.println("Your word has repeating letters, try again.");
			return false;
		}
		else if (userInput.charAt(3) == userInput.charAt(4)) {
			System.out.println("Your word has repeating letters, try again.");
			return false;
		}
		
		String result = checkAnswer(userInput, correctAnswer);
		System.out.println(result);
		
		if(userInput.equals(correctAnswer)) {
			System.out.println("You got the answer!");
			return true;
		}
		
	  return false;
		
	}
	
	//This method actually checks to see if the guess was correct or not, but this only runs when the user follows the two rules
	//stated above. The formula inside basically checks to make sure that current letter in the guess that it's checking matches the current 
	//letter in the correct answer. It also makes sure that the letter is actually inside the guess by seeing if the current letter being
	//checked is in the correct answer, if it isn't then it's automatically assigned as -1 which means it's wrong. If those other cases pass
	// it'll just put an X. Finally it will print out your guess
	 public static String checkAnswer(String userInput, String correctAnswer) {
		 
		 String result = "";
		 
		 for(int i = 0; i < userInput.length(); i++) {
			 char currentLetter = userInput.charAt(i);
			 
			 if(currentLetter == correctAnswer.charAt(i)) {
				result += correctAnswer.charAt(i); 
			 }
			 else if(correctAnswer.indexOf(currentLetter) != -1) {
				result += "?";
			 }
			 else {
				result += "X";
			 }
			 
		 }
		 
		 return result;
	 }
	
}
