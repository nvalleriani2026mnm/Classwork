package semester2;

public class binarySearchRecursive {

	public static void main(String[] args) {
		
		int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
		int target = 27;
		int min = 0;
		int max = nums.length-1;
		
		System.out.print(binSearchR(nums, target, min, max));

	}

	public static int binSearchR(int[] nums, int target, int min, int max) {
		
		//There is no array left to look at making this our base case
		if(max < min) {
			return -1;
		}
		
		//Sets our mid point
		int mid = (max + min)/2;
		
		//Another base case for just in case the middle is the target
		if(nums[mid] == target) {
			return mid;
		}
		
		//If the middle number is less than the target number, we shift our array to the right side. We do this by calling the method again but
		//instead of passing min to min, we give it mid plus 1 (this changes our minimum to the middle value but plus 1 which then changes our
		//mid point and the cycle repeats.
		if(nums[mid] < target) {
			return binSearchR(nums, target, mid + 1, max);
		}
		//If the middle number is less than the target number, we shift our array to the left side. We call do this by calling the method again
		//and passing min minus 1 to max, which also changes our mid point and the cycle repeats
		else if(nums[mid] > target) {
			return binSearchR(nums, target, min, mid - 1);
		}
		return 0;
	}
	
}
