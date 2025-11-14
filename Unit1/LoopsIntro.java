
public class LoopsIntro {

	public static void main(String[] args) {
		
		//These two variables are the string and char passed to my first method
		String theJumble = new String("tghggjjdgggbg");
		char theTarget = 'g';
		
		//These my method callers that pass each of their assigned methods any ints/strings etc. and the last one prints the method result
		countLetters(theJumble, theTarget);
		getFactorial(6);
		System.out.println(getIfRepeats("cdcddcd"));

	}

	//This method contains the formula to check if the string passed to it has the target char inside it and how many times
	public static int countLetters(String theJumble, char theTarget) {
		
		int count = 0;
		
		for(int i = 0; i < theJumble.length(); i++) {
			
			if(theJumble.charAt(i) == theTarget) {
				count ++;
			}

		}
		
		System.out.println(count);
		return count;
		
	}
	
	//This method contains the formula for multiplying and reassigning the finalResult to whatever the theFactor is
	public static int getFactorial(int theFactor) {
		
		int finalResult = 1;
		
		while(theFactor > 0) {

			finalResult *= theFactor;
			theFactor --;
		}
		
		System.out.println(finalResult);
		return finalResult;
	}
	
	//This method contains the formula for checking each char in the string passed to it and seeing if it is the same as the one next to it
	public static boolean getIfRepeats(String doubleStuffs) {
		
		for(int i = 0; i < doubleStuffs.length()-1; i++) {
			
			if(doubleStuffs.charAt(i) == doubleStuffs.charAt(i + 1)) {
				
				return true;
			}
			
		}
		return false;
	
	}
	
}
