import java.util.Scanner;

public class MakeYourChoice {

	//I have my scanner being instantiated here alongside all of my other boolean variables as well. I also have an object player from my
	//character class.
	static Scanner inputReader = new Scanner(System.in);
	static boolean isHorseOkay = true;
	static boolean isInfected = false;
	static boolean hasMedkit = false;
	static boolean isAlive = true;
	static mycCharacter player;
	
	public static void main(String[] args) {
		
		//Starts the game
		gameStart();

	}

	//This method starts the game off by asking the player to choose their class (each with different attributes), and then it will ask
	//what name the user wants to be referred to as. Then it'll greet the player and then start the game.
	public static void gameStart() {
		
		System.out.println("Please choose your class below, think carefully before choosing.");
		System.out.println("");
		System.out.println("---Warrior---");
		System.out.println("The Warrior has average HP, average speed, and is strong. You have an Iron Sword with you, allowing");
		System.out.println("you to strike down enemies decently well.");
		System.out.println("");
		System.out.println("---Mortician---");
		System.out.println("The Mortician has below average HP, average speed, but isn't very strong. You have a Medical Kit with");
		System.out.println("you allowing you to heal others or yourself.");
		System.out.println("");
		System.out.println("---Knight---");
		System.out.println("The Knight has above average HP, very slow speed, but is very strong. You have armor on allowing you");
		System.out.println("to take bites and hits multiple times before falling. You also wield a poleaxe.");
		System.out.println("");
		
		boolean validClass = false;
		String classSelection = "";
		
		while(validClass == false) {
			System.out.println("Who will you be?");
			System.out.println("");
			classSelection = inputReader.nextLine();
			
		if(classSelection.equalsIgnoreCase("Knight")) {
			System.out.print("You have chosen the Knight class. Now please input your name.");
			System.out.println("");
			validClass = true;
			classSelection = "Knight";
		}
		else if(classSelection.equalsIgnoreCase("Warrior")) {
			System.out.print("You have chosen the Warrior class. Now please input your name.");
			System.out.println("");
			validClass = true;
			classSelection = "Warrior";
		}
		else if(classSelection.equalsIgnoreCase("Mortician")) {
			System.out.println("You have chosen the Mortician class. Now please input your name.");
			System.out.println("");
			validClass = true;
			classSelection = "Mortician";
		}
		else {
			System.out.println("That's not a class, try again.");
		}
	  }
		String userName = inputReader.nextLine();
		
		player = new mycCharacter(classSelection, userName);
		
		System.out.println("Welcome, O Great " +userName+ ", the " +classSelection+ "! Let's begin.");
		System.out.println("");
		System.out.println("=============================================================================================================");
		System.out.println("=============================================================================================================");
		System.out.println("");
		startSequence(userName, classSelection);
		
	}
	
	//Essentially the prologue to my story, it then asks the player to put in a letter to continue the narration.
	public static void startSequence(String userName, String classSelection) {
		System.out.println("Somewhere in Nevada... in the year 1899..");
		System.out.println("A lab experimenting on a potential cure for Tuberculosis has accidently created and released a virus that");
		System.out.println("turns people into zombies! Your job is simple, escape the state by reaching its borders");
		System.out.println("before they close for good, or else you'll be left to die... And whenever you are given a choice, input 'Yes' or 'No");
		System.out.println("");
		System.out.println("Input any letter to start.");
		String startChoose = inputReader.nextLine();
		
		//A boolean created to help figure out if the user actually put in ANY string value into the scanner input to continue
		//the game.
		boolean continueNow = false;
		if(startChoose != null) {
			continueNow = true;
		}
		else {
			continueNow = false;
		}
		
		if(continueNow == true) {
		System.out.println("");
		System.out.println("--Blackstone Camp--");
		System.out.println("You wake up to the sound of screaming, you watch as zombies eat person after person, truly a horrific sight to see.");
		System.out.println("You get up fast, and notice a stagecoach with two horses ready to go, off on the side, you take it immediately.");
		System.out.println("As you ride off into the empty desert road, you look back, only to see hordes of zombies follow your trail slowly.");
		System.out.println("");
		System.out.println("You continue to ride off into the sunset in hopes of finding other survivors for help escaping this mess.");
		System.out.println("Input a letter to continue.");
		String startChoose2 = inputReader.nextLine();
		
		boolean continueNow2 = false;
		if(startChoose2 != null) {
			continueNow2 = true;
		}
		else {
			continueNow2 = false;
			System.out.println("how did you do this");
		}
		if(continueNow2 == true) {
		firstNight(userName, classSelection);
		}
	  }
	}
	
	//The first night which will loop the question of asking the user to make a choice if they put in an invalid input. It also will minus
	//health from the player health attribute if you say Yes as a Warrior for example. It'll change the boolean attributes based on your decision.
	public static void firstNight(String userName, String classSelection) {
		System.out.println("");
		System.out.println("=============================================================================================================");
		System.out.println("");
		System.out.println("--South Yankton--");
		System.out.println("The sun has vanished and the moon has settled in, you need to feed your horses something, or else they may starve. You find an old town and take a rest stop there.");
		System.out.println("Will you go inside to find food and risk your safety, or wing it and keep going?");
		boolean validAnswer = false;
		
		while(validAnswer == false) {
			String choosing1 = inputReader.nextLine();
			
		if(choosing1.equalsIgnoreCase("Yes") && classSelection.equals("Warrior")) {
			System.out.println("You hop off the stagecoach and clutch onto your sword as you head into the dark town.");
			System.out.println("There is one building that hasn't collapsed yet, you walk inside..");
			System.out.println("You find on a table two crates of carrots and corn, perfect for feeding the horses! But you also find a pair of");
			System.out.println("eyes staring directly at you from the corner of the room. You step back and put your sword up, and a zombie emerges from the");
			System.out.println("darkness lunging at you! In a quick effort however, you dodge the attack and strike it once in the shoulder. It attacks again and");
			System.out.println("manages to scratch your arm, but you end up killing it in the process.");
			System.out.println("You go back outside and feed the carrots to your horses, giving them energy to start going once again.");
			int zombieDamage = 20;
			player.takeDamage(zombieDamage);
			isHorseOkay = true;
			isInfected = true;
			validAnswer = true;
		}
		else if(choosing1.equalsIgnoreCase("Yes") && classSelection.equals("Knight")) {
			System.out.println("You slowly climb down the stagecoach and you clutch onto your axe as you head into the dark town.");
			System.out.println("There is one building that hasn't collapsed yet, you walk inside..");
			System.out.println("You find on a table two crates of carrots and corn, perfect for feeding the horses! But you also find a pair of");
			System.out.println("eyes staring directly at you from the corner of the room. You step back and ready your axe, and a zombie emerges from the");
			System.out.println("darkness lunging at you! It pushes you to the ground and you both struggle for a few seconds, eventually you push the zombie off of you.");
			System.out.println("You make one big strike decapitating the zombie clean, resulting in you being completely fine.");
			System.out.println("You go back outside and feed the carrots to your horses, giving them energy to start going once again.");
			isHorseOkay = true;
			isInfected = false;
			validAnswer = true;
		}
		else if(choosing1.equalsIgnoreCase("No") && (classSelection.equals("Warrior") || classSelection.equals("Knight"))) {
			System.out.println("You decide that it's too risky to go into town and you force your horses to keep going on the roadway anyway.");
			isHorseOkay = false;
			isInfected = false;
			validAnswer = true;
		}
		//This makes sure that if the user puts in something wrong, this will show up to reprompt them.
		else {
			System.out.println("That's not an answer, try again.");
			validAnswer = false;
		}
	}
		
		System.out.println("Input a letter to continue.");
		String startChoose3 = inputReader.nextLine();
		
		boolean continueNow3 = false;
		if(startChoose3 != null) {
			continueNow3 = true;
		}
		else {
			continueNow3 = false;
			System.out.println("how did you do this");
		}
		if(continueNow3 == true) {
		secondNight(userName, classSelection);
		}
	}
	
	//This is the method for the second night which runs almost identical to the first night (same as the rest too), the only difference
	//being the question that asks the user to pick an option. Depending on your answer it will change the boolean attributes that affect
	//how the game goes on.
	public static void secondNight(String userName, String classSelection) {
		System.out.println("");
		System.out.println("=============================================================================================================");
		System.out.println("");
		System.out.println("--The Clinic--");
		System.out.println("After spending the day fighting zombies and getting burnt in the sun, you find yourself at a clinic.");
		System.out.println("There is a good chance you can find some very helpful supplies in here that may come in handy later, will you take a look?");
		boolean validAnswer = false;
		
		while(validAnswer == false) {
			String choosing = inputReader.nextLine();
			
		if(choosing.equalsIgnoreCase("Yes") && classSelection.equals("Warrior")) {
			System.out.println("You hack and slash away at the zombies guarding the entrance to the clinic and you walk inside. After a thorough");
			System.out.println("search, you find a medical bag and use it to heal your scratch wound from last night. You make your way back the stagecoach");
			System.out.println("and continue forward down the roadway feeling better than ever!");
			int zombieDamage = 20;
			player.takeDamage(zombieDamage);
			isInfected = false;
			hasMedkit = true;
			validAnswer = true;
		}
		else if(choosing.equalsIgnoreCase("Yes") && classSelection.equals("Knight")) {
			System.out.println("You hack and slash away at the zombies guarding the entrance to the clinic and you walk inside. After a thorough");
			System.out.println("search, you find a medical bag and decide to keep it for later when you really need it. You make your way back to the stagecoach");
			System.out.println("and continue forward down without trouble.");
			int zombieDamage = 20;
			player.takeDamage(zombieDamage);
			hasMedkit = true;
			validAnswer = true;
		}
		else if(choosing.equalsIgnoreCase("No") && (classSelection.equals("Warrior"))) {
			System.out.println("You decide to not go inside because of the risk, and you continue on the roadway. Although you don't feel too good...");
			int zombieDamage = 50;
			player.takeDamage(zombieDamage);
			hasMedkit = false;
			isInfected = true;
			validAnswer = true;
		}
		else if(choosing.equalsIgnoreCase("No") && (classSelection.equals("Knight"))) {
			System.out.println("You decide to not go inside because of the risk, and you continue on the roadway.");
			hasMedkit = false;
			validAnswer = true;
		}
		else {
			System.out.println("That's not an answer, try again.");
			validAnswer = false;
		}
	}
	
		System.out.println("Input a letter to continue.");
		String startChoose3 = inputReader.nextLine();
		
		boolean continueNow3 = false;
		if(startChoose3 != null) {
			continueNow3 = true;
		}
		else {
			continueNow3 = false;
			System.out.println("how did you do this");
		}
		if(continueNow3 == true) {
		thirdNight(userName, classSelection);
		}
	}
	
	//This is the third night which is still the same as the last one but with a different question. This is the method where there are 2 of 4
	//endings (the other two are incomplete), you can either get the zombie ending or horse ending based on your past choices. 
	public static void thirdNight(String userName, String classSelection) {
		System.out.println("");
		System.out.println("=============================================================================================================");
		System.out.println("");
		System.out.println("--The Roadblock--");
		System.out.println("You decided to fall to sleep after leaving the clinic and let the horses walk the road as they wanted to, that was until something woke you up.");
		System.out.println("You get out of the stagecoach seat and realize that the horses have stopped for some reason. After taking a step outside, you notice a large pile of rubble");
		System.out.println("blocking the roadway, with no way around it either.");
		System.out.println("");
		System.out.println("Theres two ways to go about this, the first being that you manually move the debris yourself, but there is a risk of injury if you're not strong enough.");
		System.out.println("Or, you could slightly move the debris out of the way manually and then have the horses ram through the rest, but they are at risk of injury too if they are not strong enough either.");
		System.out.println("Will you try and manually push the debris out of the way completely by yourself?");
		boolean validAnswer = false;
		
		while(validAnswer == false) {
			String choosing = inputReader.nextLine();
			
		if(choosing.equalsIgnoreCase("Yes") && classSelection.equals("Warrior") && isInfected) {
			System.out.println("You grab the large pieces of debris and slowly start tossing them out of the way, but you quickly exhaust yourself.");
			System.out.println("You try again but end up straining yourself and collapsing to the ground coughing up blood. I guess that scratch wound from earlier finally got to you.");
			System.out.println("Zombie Ending.");
			endGame();
			validAnswer = true;
		}
		else if(choosing.equalsIgnoreCase("Yes") && classSelection.equals("Warrior") && !isInfected) {
			System.out.println("You grab the large pieces of debris and slowly start tossing them out of the way, but you quickly exhaust yourself.");
			System.out.println("You try again and manage to shove a few more pieces to the side. While you were doing that a zombie attempted to sneak up on");
			System.out.println("you, but you quickly moved out of the way. You run back to the stagecoach and have no choice but to ram through the rest");
			System.out.println("of the debris, and");
			validAnswer = true;
		}
		else if(choosing.equalsIgnoreCase("No") && (classSelection.equals("Warrior") && isInfected)) {
			System.out.println("You take a moment to shove the");
			
			validAnswer = true;
		}
		else if(choosing.equalsIgnoreCase("No") && (classSelection.equals("Knight") && !isInfected)) {
			System.out.println("");
			validAnswer = true;
		}
		else if(choosing.equalsIgnoreCase("Yes") && classSelection.equals("Knight")) {
			System.out.println("You grab the large pieces of debris and quickly start tossing them out of the way, you manage to move most");
			System.out.println("of the debris until a zombie suddenly grabs you from behind. You push it away and you try to run back to the stagecoach,");
			System.out.println("but your armor weighs you down and you get tackled again. You take a few hits before killing the zombie. You get back onto");
			System.out.println("the stagecoach and speed away from the scene.");
			validAnswer = true;
		}
		else {
			System.out.println("That's not an answer, try again.");
			validAnswer = false;
		}
	}
		
		System.out.println("Input a letter to continue.");
		String startChoose3 = inputReader.nextLine();
		
		boolean continueNow3 = false;
		if(startChoose3 != null) {
			continueNow3 = true;
		}
		else {
			continueNow3 = false;
			System.out.println("how did you do this");
		}
		if(continueNow3 == true) {
		fourthNight(userName, classSelection);
		}
		
	}
	
	//This is the final night, which is incomplete but would have prompted the user to say Yes or No to a question. This is also where you
	//can get the horse ending if you didn't feed them at the beginning of the game. The if statements are supposed to be what happens when
	//you choose one of those options.
	public static void fourthNight(String userName, String classSelection) {
		if(isHorseOkay == false) {
		System.out.println("Just when you thought you were going to make it to the end, something happened. It turns out your horses suddenly");
		System.out.println("collapsed to the ground without warning. Maybe you pushed them too hard? Or it was because you didn't feed them.");
		System.out.println("Animal Abuse Ending.");
		endGame();
	}
		System.out.println("");
		System.out.println("=============================================================================================================");
		System.out.println("");
		System.out.println("--The Border--");
		System.out.println("Finally, after finding a town, a clinic, and running into a roadblock, you have finally made it to the border.");
		System.out.println("You see the wall, but notice that there seems to be small camps scattered around it, which could only mean one thing... bandits!!");
		System.out.println("As you quickly approach the border, the bandits shoot down your wheels, causing the stagecoach to collapse and for the horses to run off scared.");
		System.out.println("You get up, stumbling a little, and as you look up you watch as the bandits slowly approach you guns up.");
		boolean validAnswer = false;
		
		while(validAnswer == false) {
			String choosing = inputReader.nextLine();
			
		if(choosing.equalsIgnoreCase("Yes") && classSelection.equals("Warrior")) {
			System.out.println("");
			validAnswer = true;
		}
		else if(choosing.equalsIgnoreCase("Yes") && classSelection.equals("Warrior")) {
			System.out.println("");
			validAnswer = true;
		}
		else if(choosing.equalsIgnoreCase("No") && (classSelection.equals("Warrior"))) {
			System.out.println("");
			validAnswer = true;
		}
		else if(choosing.equalsIgnoreCase("No") && (classSelection.equals("Knight"))) {
			System.out.println("");
			validAnswer = true;
		}
		else if(choosing.equalsIgnoreCase("Yes") && classSelection.equals("Knight")) {
			System.out.println("");
			validAnswer = true;
		}
		else {
			System.out.println("That's not an answer, try again.");
			validAnswer = false;
		}
	  }
    }
	
	//This method is called when you get an ending, it doesn't do anything except run itself and stop the game.
	public static int endGame() {
		return -1;
	}
}


