import java.util.Scanner;

public class MakeYourChoice {

	static Scanner inputReader = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		gameStart();
		
		mycCharacter player = new mycCharacter(damageMeter);

	}

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
		
		System.out.println("Welcome, O Great " +userName+ ", the " +classSelection+ "! Let's begin.");
		System.out.println("");
		System.out.println("=============================================================================================================");
		System.out.println("=============================================================================================================");
		System.out.println("");
		startSequence(userName, classSelection);
		
	}
	
	public static void startSequence(String userName, String classSelection) {
		System.out.println("Somewhere in Nevada... in the year 1899..");
		System.out.println("A lab experimenting on a potential cure for Tuberculosis has accidently created and released a virus that");
		System.out.println("turns people into undead humanoid creatures! Your job is simple, escape the state by reaching its borders");
		System.out.println("before they close for good, or else you'll be left to die...");
		
		System.out.println("***FIX LATER***");
		System.out.println("");
		System.out.println("You run as fast as you can barely climbing onto the back of the train cart, and you catch your breath.");
		System.out.println("As the train leaves the camp, you watch as the undead try to chase you, but you're way too fast for them.");
		System.out.println("");	
		firstNight(userName, classSelection);
	}
	
	public static void firstNight(String userName, String classSelection) {
		System.out.println("After a long afternoon of driving the train, you take a rest stop near an abandoned town.");
		System.out.println("It's dark and cold, yet you have this strange feeling that something else is here with you...");
		System.out.println("");
		System.out.println("You need to find more coal in order to keep the train going, or else you'll run out of fuel. Will you go into");
		System.out.println("town and find supplies? **Yes/No**");
		String choosing1 = inputReader.nextLine();
		
		if(choosing1.equalsIgnoreCase("Yes") && classSelection.equals("Warrior")) {
			System.out.println("You hop off the train and clutch your sword as you head into the dark town, waiting for an ambush.");
			System.out.println("There is only one building that hasn't collapsed, you walk inside..");
			System.out.println("Out of a dark corner in the room, a zombie lunges at you, desperate for a meal. You move out of the way quickly.");
			System.out.println("You swing hard, striking it in the head and taking it out, but the zombie still");
			System.out.println("gets one scratch on your left shoulder, hopefully that doesn't worsen..");
			int zombieDamage = 20;
			player.takeDamage(zombieDamage);
		}
		else if(choosing1.equalsIgnoreCase("Yes") && classSelection.equals("Knight")) {
			System.out.println("You slowly climb down the train cart's side and you clutch your axe as you feel the cold breeze");
			System.out.println("through your armor, waiting for an ambush.");
			System.out.println("There is only one building that hasn't collapsed, you walk inside..");
			System.out.println("Out of a dark corner in the room, a zombie lunges at you, desperate for a meal. You both grab the axe trying to push the other over=-067uyuyuyyy");
			System.out.println("you both struggle to push the other down. You eventually push it away, and you decapitate the zombie with ease.");
		}
	}
	
}





