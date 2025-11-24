import java.util.Scanner;

public class StringPracticeforProject {

	//This opens up  my scanner so I can use it
	static Scanner inputReader = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//These two variables store a boolean and int value for the while loop
		boolean keepGoing = true;
		int count = 0;
		
		//As long as keepGoing is true (Which stays true until the user types in "stop" in any way), this will keep asking the user for input.
		//This also keeps counting the amount of times the loop reexecutes itself
		while(keepGoing == true) {
			
			System.out.println("Put it an input NOW");
			String userInput = inputReader.nextLine();
			
			if (!(userInput.equalsIgnoreCase("stop"))) {
				
				count++;
				System.out.println(count);
				
			}
			else if (userInput.equalsIgnoreCase("stop")) {
				
				keepGoing = false;
			}
			else {
				
				
			}
		}
		
		//These two variables here store doubles values, one is the total (this will get added to the player input), and the starting radius.
		//I also have a circle object from my CircleB class which I will be using for this for loop
		CircleB myCircle1 = new CircleB(4.0);
		double startingRad = myCircle1.getRadius();
		double total = 0;
		
		//This for loop WILL run 5 times, and every time that it does it asks the user to put in a double value, which gets added to the starting radius.
		//Eventually after five times it puts all of the numbers together and prints out the starting radius and final radius.
		for(int i = 0; i < 5; i++) {
			
			System.out.println("What would you like to add to the radius?");
			double playersNumber = inputReader.nextDouble();
			
			total += playersNumber;
			
		}
		
		double finalRad = total + startingRad;
		System.out.print("You started with a radius of " +startingRad+ ", and ended up with " +finalRad+ ".");
	}
	
}
