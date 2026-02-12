package semester2;

public class binarySearch {

	public static void main(String[] args) {
		
		//This is my array I will be using
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

		//This calls the method I made
		binarySearche(nums);
	}

	public static void binarySearche(int[] nums) {
		
		//This is the target int we are looking for and eventually the mid will become the number we are looking for
		int target = 26;
		boolean targetFound = false;
		int mid = nums.length/2;
		int min = 0;
		int max = nums.length-1;
		
		//This will loop until the target index is found, and it compares the number of the middle of the array to the target so that
		//we know which half the target IS in and where it's NOT in. 
		while(targetFound == false) {
			if(nums[mid] < target) {
				min = mid;
				mid = min + ((max-min) / 2);
			}
			else if(nums[mid] > target) {
				max = mid;
				mid = max - ((max-min) / 2);
			}
			else if(nums[mid] == target) {
				System.out.print(mid);
				targetFound = true;
			}
		}
	
	}
}
