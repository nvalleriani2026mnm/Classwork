package semester2;

public class alteringArrays {

	public static void main(String[] args) {
		
		//This is the array we start with
		int[] nums = {6, 7, 21, 46};
		subtract5FromAll4(nums);
		
	}

	public static void subtract5FromAll4(int[] nums) {
		
		//This segment here creates an exact copy of the original array to then modify the copy safely
		int[] copyArr = new int[nums.length];
		
		for(int i = 0; i < nums.length; i++) {
			
			copyArr[i] = nums[i];
		}
		//This here minuses five from every int inside of the array
		for(int b = 0; b < copyArr.length; b++) {
			
			copyArr[b] -= 5;
		}
		
		//This prints out the result
		for(int c = 0; c < copyArr.length; c++) {
			
			System.out.print(copyArr[c] + " ");
		}

	}
	
}
