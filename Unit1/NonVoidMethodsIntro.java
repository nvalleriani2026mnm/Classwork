
public class nonVoidIntroREAL {

	public static void main(String[] args) {
		
		//These right here print out my strings and values like my name, hair style, favorite food, circle stats and math
		
		System.out.print(giveName());
		System.out.print(giveHairStyle());
		System.out.print(giveFavoriteFood());
		
		System.out.print(getCircleStats(6.0));
		
		System.out.print(getMathStuffs(7, 12));
		
		//These call on my methods
		giveName();
		giveHairStyle();
		giveFavoriteFood();
		getCircleStats(1.0);
		getMathStuffs(7, 12);
		
		
	}
	
	/**
	 * This method here tells my name.
	 */
		
	public static String giveName() {
		
		return "My name is Nicolas, ";
		
	}
	
	/**
	 * This method here tells my hair style.
	 */
	
	public static String giveHairStyle() {
		
		return "my hair style is straight, ";
		
	}
	
	/**
	 * This method here tells my favorite food.
	 */
		
	public static String giveFavoriteFood() {
		
		return "and my favorite food is lobster tail.";
		
	}
	
	/**
	 * This method here tells my eye color, but doesn't actually get called upon.
	 */
	
	public static String giveEyeColor() {
		
		return "My eye color is Hazel Green";
	}
		
	/**
	 * This method here tells my eye color, but doesn't actually get called upon.
	 */
	
	public static String giveBestFriend() {
		
		return "My best friend is Avri but also Jesse";

	}
	
	/**
	 * This method here calculates the circle's stuff then returns a sentence for the code above in the main to print out.
	 */
	
	public static String getCircleStats( double radius ) {
		
		//These are the specific calculation formulas for the circle
		double diameter = 2 * radius;
		double circumference = 2 * 3.14 * radius;
		double area = 3.14 * (radius * radius);
		
		//This is the proper English statement for the calculations.
		return "\nA circle with a radius of " +radius+ ", has a diameter of " +diameter+ ", a circumference of " +circumference+ ", and an area of " +area+ ".";
	
	}
	
	/**
	 * This method here calculates the two ints put inside the print, which then gives their sum, difference, product, quotient and remainder.
	 */
	
	public static String getMathStuffs(int num1, int num2) {
		
		//This is the specific formulas used to calculate the results.
		int sum = num1 + num2;
		int difference = num1 - num2;
		int product = num1 * num2;
		int quotient = num1 / num2;
		int remainder = num1 % num2;
		
		//This is the proper English statement for the calculations.
		return "\nThe sum is " +sum+ ", the difference is " +difference+ ", the product is " +product+ ", the quotient is " +quotient+ ", and the remainder is " +remainder+ ".";
	
	}

}
