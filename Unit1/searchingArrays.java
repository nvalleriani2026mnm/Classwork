package semester2;

public class searchingArrays {

	public static void main(String[] args) {
		
		//This is the array I will be using for my methods
		int[] theNums = {3, 2, 4, 10, 12, 1, 4};
		
		//THese are my method callers
		checkFor4(theNums);
		countFor4(theNums);
		checkForFour4(theNums);

	}

	public static boolean checkFor4(int[] theNums) {
		
		for(int i = 0; i < theNums.length; i++) {
			
			//This if statement checks if at any point in the array there is a 4, then it returns true if that's the case
			if(theNums[i] == 4) {
				
				System.out.println("true");
				return true;
				
			}

		}
		return false;
	}
	
	public static int countFor4(int[] theNums) {
		
		//This creates a count and sets it to 0 so that we can increase it whenever there is a 4 wherever the int at i is
		int count = 0;
		
		for(int i = 0; i < theNums.length; i++) {
			
			if(theNums[i] == 4) {
				
				count++;
			}
			
		}
		//This simply returns the count
		System.out.println(count);
		return count;
	}
	
	public static boolean checkForFour4(int[] theNums) {
		
		int count = 0;
		
		for(int i = 0; i < theNums.length; i++) {
			
			//After creating another count and setting it to 0 we increase the value every time an int inside the array is equal to 4
			if(theNums[i] == 4) {
				
				count++;
			}
		}
		
		if(count == 4) {
			
			//Returns true if there are four 4s
			System.out.print("true");
			return true;
		}
		
		//Returns false if there aren't four 4s
		System.out.print("false");
		return false;
	}
}
