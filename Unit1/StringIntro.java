import java.util.Scanner;

public class StringINtro {

	public static void main(String[] args) {
		
		
		/**
		 *  This is the scanner code that allows for user input into the console.
		 *  It also contains the myName string which stores the string you put into the console.
		 *	Then we have a method caller that prints the second and last letters in your name.
		 */
		Scanner inputReader = new Scanner(System.in);
		String myName = new String(inputReader.nextLine());
		printSecondAndLastLetter(myName);
		
		// This is the method caller that equals the location of the index of 'e'.
		// The method provides myName to the method findTheE
		int eLocation = findTheE(myName);
		System.out.println("The first e occurs at " +eLocation+ ".");
		
		// This is exactly the same as the previous method caller, but prints the length of the name.
		int lengthOfString = getLength(myName);
		System.out.println("The String is " +lengthOfString+ " characters long.");
		
		//This calls the method and passes the String myName
		printFirstAndLastThree(myName);
			
			inputReader.close();
		
	}
	
	// This void method prints out the second and last letter in the name inputted into the console.
	// This has a space for String which is from myName and the str does the calculation stuff
	public static void printSecondAndLastLetter(String str) {
				
		System.out.println("The second letter is " +str.charAt(1) + " and the last letter is " +str.charAt(str.length()-1) + ".");
				
	}
	
	/**
	 *  (These notes are for future reference for myself)
	 *  This non void method returns an int which will be an index number.
	 *  This method is called by the findTheE(myName) which provides a String to this method, which also has a space open for a String
	 *  It also has a str which represents myName does the actual calculations.
	 */
	public static int findTheE(String str) {
		
		return str.indexOf('e');
		
	}
	
	//This was made the same exact way as the previous method, it does the exact same thing, but gets the length of the name.
	public static int getLength(String str) {
		
		return str.length();
		
	}
			
	// This method here prints a substring of the name (first three letters), then prints out the last three letters.
	public static void printFirstAndLastThree(String str) {
		
		
		System.out.print("The first three characters are " +str.substring(0, 3)+ "");
		System.out.print(" and the last three characters are " +str.substring(str.length()-3) + ".");
		
		
	
	

}


	
	
}
