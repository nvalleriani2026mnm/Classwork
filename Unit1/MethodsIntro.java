
public class methodsIntro {

	public static void main(String[] args) {
		
		
		
		//These five right here call on five of my methods
		
		stateName();
		stateEyeColor();
		stateFavoriteFood();
		printCircleStats(3.0);
		printMathStuffs(10, 5);
		
		

	}
/**
 * This is my first method that states my name.
 */
	
	public static void stateName() {
	
		System.out.println("Nicolas");
	}
	
	/**
	 * This is my second method that states my eye color.
	 */
	
	public static void stateEyeColor() {
		
		System.out.println("Hazel Green");
	}
	
	/**
	 * This is my third method that states my hair style.
	 */
	
	public static void stateHairStyle() {
		
		System.out.print("Straight");
	}
	
	/**
	 * This is my fourth method that states my best friend.
	 */
	
	public static void stateBestFriend() {
		
		System.out.print("Avri");
	}
	
	/**
	 * This is my fifth method that states my favorite food.
	 */
	
	public static void stateFavoriteFood() {
		
		System.out.println("Lobster Tail");
	
		
	}
	/**
	 * This is my method that gives the radius, diameter, circumference and area of a circle.
	 */
	public static void printCircleStats( double radius ) {
		
		double diameter = 2 * radius;
		double circumference = 2 * 3.14 * radius;
		double area = 3.14 * (radius * radius);
		
		System.out.println("\nA circle with a radius of " +radius+ " has a diameter of " +diameter+ ", a circumference of " +circumference+ ", and an area of " +area+ ".");
		
		
	}
	/**
	 * This is my method that takes the two integers at the top in my method caller, then finds their sum, difference, product, quotient and remainder.
	 */
		public static void printMathStuffs(int num1, int num2) {
			
			int sum = num1 + num2;
			int difference = num1 - num2;
			int product = num1 * num2;
			int quotient = num1 / num2;
			int remainder = num1 % num2;
			
			System.out.println("\nThe sum is " +sum+ ", the difference is " +difference+ ", the product is " +product+ ", the quotient is " +quotient+ ", and the remainder is " +remainder+ ".");
			
			
		
	}
	
	

	
	
}



