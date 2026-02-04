package semester2;

public class bubbleSortarrays {

	public static void main(String[] args) {
		
		//This is my array I will be using and sorting
		int array1[] = {5, 2, 7, 10, 3, 8};
		bubbleSort(array1);

	}
	//This first makes an exact copy of the original array, then it creates a tempNum as a reference to help make swapping
	//the numbers easier. If the number in front of the next number is greater, then swap those two numbers. This will repeat
	//for the entire array and the outside for loop will reset the nested loop just to make sure that it's all sorted correctly.
	public static int[] bubbleSort(int[] array1) {
		int resultArray[] = new int[array1.length];
		for(int i = 0; i < array1.length; i++) {
			resultArray[i] = array1[i];
		}
		int tempNum = 0;
		for(int a = 0; a < array1.length; a++) {
			for(int b = 0; b < array1.length-1; b++) {
				if(resultArray[b] > resultArray[b+1]) {
					tempNum = resultArray[b];
					resultArray[b] = resultArray[b+1];
					resultArray[b+1] = tempNum;
				}
			}
		}
		//This was just so I could see what the end result looks like
		for(int i = 0; i < array1.length; i++) {
			System.out.print(resultArray[i] + " ");
		}
		return resultArray;
	}
}


