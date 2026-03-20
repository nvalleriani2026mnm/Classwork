package semester2;

import java.util.ArrayList;

public class ArraysListIntro {

	public static void main(String[] args) {
		
		//This is the array lists i will be using
		ArrayList<Integer> intArrList = new ArrayList<Integer>();
		ArrayList<String> stringArrList = new ArrayList<String>();
		
		//These add these ints to the array list
		intArrList.add(1);
		intArrList.add(2);
		intArrList.add(3);
		
		//These add these strings to the array list
		stringArrList.add("Alice");
		stringArrList.add("Bob");
		stringArrList.add("Charlie");
		
		//Adds 5 and Derek to their respective array lists
		intArrList.add(2,5);
		stringArrList.add(1,"Derek");
		
		//Prints out the second and last element in each of the lists
		System.out.print(intArrList.get(1) + " " + intArrList.get(intArrList.size()-1));
		System.out.print("\n");
		System.out.print(stringArrList.get(1) + " " + stringArrList.get(stringArrList.size()-1));
		System.out.print("\n");
		
		//Prints out he first elements, changes them then prints them again
		System.out.print(intArrList.get(0) + " " + stringArrList.get(0));
		intArrList.set(0, 0);
		stringArrList.set(0, "Zero");
		System.out.print(intArrList.get(0) + " " + stringArrList.get(0));
		System.out.print("\n");
		
		//Prints out the element that got removed
		System.out.print(intArrList.remove(intArrList.size()-1) + " " + stringArrList.remove(stringArrList.size()-1));

	}

}
