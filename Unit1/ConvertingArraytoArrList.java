package semester2;

import java.util.ArrayList;

public class ArrayToArrayList {

	public static void main(String[] args) {
		
		//These are the array lists that i will be using
		ArrayList<Integer> intArrList = new ArrayList<Integer>();
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		//These are adding numbers to my lists so that I can change them later on
		intArrList.add(5);
		intArrList.add(2);
		intArrList.add(3);
		intArrList.add(4);
		intArrList.add(17);
		intArrList.add(8);
		intArrList.add(5);
		
		nums.add(4);
		nums.add(4);
		nums.add(6);
		nums.add(10);
		nums.add(5);
		nums.add(5);
		nums.add(-5);
		
		//These print out the methods that return an array list
		System.out.println(checkFor4(intArrList));
		System.out.println(bubbleSort(intArrList));


	}
	
	public static int checkFor4(ArrayList<Integer> intArrList) {
		
		//Runs a for loop that will return  the spot that there was a number 4 at
		for(int i = 0; i < intArrList.size(); i++) {
			if(intArrList.get(i) == 4) {
				return i;
			}
		}
		return -1;
	}

	public static void ridAllFives(ArrayList<Integer> nums) {
		
		//Every time  there is a 5 it removes it and moves back one to check that spot again
		for(int i = 0; i < nums.size(); i++) {
			if(nums.get(i).equals(5)) {
				nums.remove(i);
				i--;
			}
		}
	}
	
	public static ArrayList<Integer> bubbleSort(ArrayList<Integer> intArrList) {
		
		int tempNum = 0;
		
		//Bubble sorts the array list by swapping numbers whenever they are mismatched
		for(int a = 0; a < intArrList.size(); a++) {
			for(int b = 0; b < intArrList.size()-1; b++) {
				if(intArrList.get(b) > intArrList.get(b+1)) {
					tempNum = intArrList.get(b);
					intArrList.set(b, b+1);
					intArrList.set(b+1, tempNum);
				}
			}
		}
		return intArrList;
	}
}
