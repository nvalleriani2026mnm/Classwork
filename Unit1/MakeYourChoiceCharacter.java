
public class mycCharacter {

	//These are my class attributes that have different values based on what class you choose in the main method
	int health;
	int speed; 
	int strength;
	String name;
	
	//These three classes have different values for each of their attributes like health, speed and strength
	public mycCharacter(String classSelection, String userName) {
		
		if(classSelection.equals("Warrior")) {
			
			health = 100;
			speed = 15;
			strength = 50;
		}
		else if (classSelection.equals("Mortician")) {
			
			health = 50;
			speed = 15;
			strength = 25;
		}
		else if (classSelection.equals("Knight")) {
			
			health = 200;
			speed = 5;
			strength = 100;
		}
		
	}
	
	//This is my method which contains a simple formula for calculating the damage done to the player
	public void takeDamage(int damageMeter) {
		
		health -= damageMeter;
		
		if(health <= 0) {
			health = 0;
		}
	}
}
