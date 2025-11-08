
public class TestingStuffs {

	public static void main(String[] args) {
		
		//This will print out whatever the method returns 
		System.out.print(multiply(5, 6));
		
	}
	
	//This is the method that holds the formula to calculate the two ints passed to it
	public static int multiply(int first, int second) {
		
		//The sum starts at zero so that it can be added to the first int given
		int sum = 0;
		
		//This says that as long as i (which starts as 0), is less than second (which is 6 in this case) the body will run
		for(int i = 0; i < second; i++) {
			
			//This is the formula for manually adding the 'first' to itself 'second' amount of times
			sum += first;
			
		}
			return sum;
		
		 
	}

}
