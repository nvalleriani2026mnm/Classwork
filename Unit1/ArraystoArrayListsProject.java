package semester2;

import java.util.ArrayList;

public class ArrayToArrayListProject {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		int findThis = 1;
		
		nums.add(3);
		nums.add(1);
		nums.add(26);
		nums.add(-44);
		nums.add(55);
		nums.add(12);
		nums.add(3);
		nums.add(19);
		nums.add(5);
		nums.add(5);
		nums.add(604);
		nums.add(1);

		System.out.println(theSmallest(nums));
		System.out.println(theSmallestIndex(nums));
		System.out.println(averageOfAll(nums));
		System.out.println(areTheyEven(nums));
		System.out.println(twoFives(nums));
		System.out.println(theThreeSame(nums));
		System.out.println(showsUp(nums, findThis));
		System.out.println(backwardsVersion(nums));
		System.out.println(shiftToRight(nums));
		System.out.println(selectionSorting(nums));
	}

	//Gets the smallest number by assigning min to the next int that just so happens to be less than the current one
	public static int theSmallest(ArrayList<Integer> nums) {
		
		int min = nums.get(0);
		
		for(int i = 0; i < nums.size(); i++) {
			if(nums.get(i) < min) {
				min = nums.get(i);
			}
		}
		return min;
	}
	
	//This finds the location of the smallest number by doing the same thing as before but also retrieving at which
	//i it landed on from the for loop
	public static int theSmallestIndex(ArrayList<Integer> nums) {
		
		int min = nums.get(0);
		int minLoc = 0;
		
		for(int i = 0; i < nums.size(); i++) {
			if(nums.get(i) < min) {
				minLoc = i;
			}
		}
		return minLoc;
	}
	
	//This gets the average by using a formula and for loop to add up all of the numbers and then divide them by themselves together
	public static int averageOfAll(ArrayList<Integer> nums) {
		
		int average = 0;
		
		for(int i = 0; i < nums.size()-1; i++) {
			int total = nums.get(i) + nums.get(i+1);
			average = total/nums.size();
		}
		return average;
	}
	
	//Checks if the numbers are all even by setting it to false if it ever comes across an odd number (2 can't go into it nicely)
	public static boolean areTheyEven(ArrayList<Integer> nums) {
		
		boolean ohOk = true;
		
		for(int i = 0; i < nums.size(); i++) {
			if(nums.get(i)%2 != 0) {
				ohOk = false;
			}
		}
		return ohOk;
	}
	
	//Checks if there are two fives by always checking i and one spot ahead of that and seeing if they are both fives
	public static ArrayList<Integer> twoFives(ArrayList<Integer> nums) {
		
		for(int i = 0; i < nums.size()-1; i++) {
			 if((nums.get(i) == 5) && (nums.get(i+1) == 5)) {
				 nums.set(i, 0);
				 nums.set(i+1, 0);
			 }
		}
		return nums;
	}
	
	//Same as before but checks for three spots instead of just two and for any number
	public static boolean theThreeSame(ArrayList<Integer> nums) {
		
		boolean tripleExists = false;
		
		for(int i = 0; i < nums.size()-2; i++) {
			if((nums.get(i) == nums.get(i+1)) && (nums.get(i) == nums.get(i+2))) {
				tripleExists = true;
			}
			else {
				
			}
		}
		return tripleExists;
	}
	
	//Puts a counter up every time it runs into a number that was given by the findThis variable
	public static int showsUp(ArrayList<Integer> nums, int findThis) {
		
		int count = 0;
		
		for(int i = 0; i < nums.size(); i++) {
			if(nums.get(i) == findThis) {
				count++;
			}
		}
		return count;
	}
	
	//This makes a backwards version of the arraylist by just adding numbers to the front over and over again to naturally shift it over
	public static ArrayList<Integer> backwardsVersion(ArrayList<Integer> nums) {
		
		ArrayList<Integer> copyArr = new ArrayList<Integer>();
		
		for(int i = 0; i < nums.size(); i++) {
			copyArr.add(0, nums.get(i));
		}

		return copyArr;
	}
	
	//This takes the last number and saves it to put at the front after already recreating the original array list
	public static ArrayList<Integer> shiftToRight(ArrayList<Integer> nums) {
		
		ArrayList<Integer> copyArr = new ArrayList<Integer>(nums);
				
		int lastNum = copyArr.remove(copyArr.size()-1);
		
		copyArr.add(0, lastNum);
				
		return copyArr;
	}
	
	//This sorts the array list by getting its minimum and location, then creating a temporary number to set the new minimum number
	//in its right spot, and it does this over and over again
	public static ArrayList<Integer> selectionSorting(ArrayList<Integer> nums) {
		
		for(int a = 0; a < nums.size()-1; a++) {
			int min = nums.get(a);
			int minLoc = a;
						
			for(int i = a+1; i < nums.size(); i++) {
				if(min > nums.get(i)) {
					min = nums.get(i);
					minLoc = i;
				}
			}
			int temp = nums.get(minLoc);
			nums.set(minLoc, nums.get(a));
			nums.set(a, temp);
		}

		return nums;
	}
}


