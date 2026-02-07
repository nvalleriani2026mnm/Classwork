package semester2;

public class binarySearch {

	public static void main(String[] args) {
		
		//This is my array I will be using
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
		bogoSearch(nums);
	}

	public static void bogoSearch(int[] nums) {
		
		//This is the target int we are looking for
		int target = 24;
		
		//This for loop will look through every int in the array until it comes across the target int and then it'll print out the index it's at
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == target) {
				System.out.print(i);
			}
		}
	}
}
