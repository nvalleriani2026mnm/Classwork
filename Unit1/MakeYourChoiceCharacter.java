
public class mycCharacter {

	int health;
	int speed; 
	int strength;
	String name;
	
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
	
	public void takeDamage(int damageMeter) {
		
		health -= damageMeter;
		
		if(health <= 0) {
			health = 0;
		}
	}
	
	
	
	
