
public class nestedLoopshw {

	public static void main(String[] args) {
		
		//This is the number that will determine the rows and columns of numbers
		int num = 3;
		buildMultTable(num);

	}

	public static void buildMultTable(int num) {
		
		//In this method this first for loop will run 3 times, which will end up running the inner for loop 3 times, 3 times.
		//This results in a total of 9 numbers, and it basically adds one to the for loop variable every run which
		//acts as an easy way of creating a multiplication table for an infinite amount of times. Then you just multiply
		//the two.
		for(int i = 1; i <= num; i++) {
			for(int p = 1; p <= num; p++) {
				System.out.print(i * p + "\t");
				
			}
			//This creates a new row
			System.out.println("");
		}
		
	}
	
}
