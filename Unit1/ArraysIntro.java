
public class arraysIntro {

	public static void main(String[] args) {
		
		//1. These are empty arrays that have been declared
		double[] doubArr;
		int[] intArr;
		boolean[] boolArr;
		String[] strArr;
		Circle[] circArr;
		
		//2. This array named randomNums contains these ints
		int[] randomNums = {7, -12, 88, -88, 0, 5, 2000};
		
		//3. The default value for  these five strings is just "0", and for ints it's 0, for doubles it's 0.0, for booleans is false
		String[] fruitsArr = {"Hello", "Yolo", "OK", "Play", "Where"};
		
		//4. This directly accesses the second value in the array and changes it to this word
		fruitsArr[2] = "Bapple";
		
		//5. This accesses the length minus 1 to account to change the last word to this word
		fruitsArr[fruitsArr.length-1] = "Zanana";
		
		//6. This prints out the second value in the array fruitsArr
		System.out.println(fruitsArr[2]);
		
		//7. This for loop runs the amount of times there are values in the array, and then it prints out the value in he position of i
		for(int i = 0; i < fruitsArr.length; i++) {
			System.out.print(fruitsArr[i]);
			System.out.print(" ");
		}
	}

}
