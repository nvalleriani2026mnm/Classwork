package semester2;

public class moreAlteringArrays {

	public static void main(String[] args) {
		
		//These are my two arrays I will be using
		double[] noNegs = {-3.0, 4.0, -22.0, 12.0};
		int[] dropLows = {14, 2, 5, 9};

		//These two method callers give the arrays to these methods
		noNegatives(noNegs);
		dropLowest(dropLows);
	}

	public static void noNegatives(double[] noNegs) {
		
		//This makes a copy of the array so that we can safely change it
		double[] copyArr = new double[noNegs.length];
		
		for(int i = 0; i < noNegs.length; i++) {
			
			copyArr[i] = noNegs[i];
			
			}
		
		//This basically says if the value at b is less than 0.0, then change it to 0
		for(int b = 0; b < copyArr.length; b++) {
			
			if(copyArr[b] < 0.0) {
				
				copyArr[b] = 0;
			}
		}
		
		//This just prints out the resulting array
		for(int c = 0; c < copyArr.length; c++) {
		
			System.out.print(copyArr[c] + " ");	
	}
	
		System.out.println();
		
	}
	
	public static void dropLowest(int[] dropLows) {
		
		//This is making a copy of the array so we can safely change it
		int[] copyArr = new int[dropLows.length];
		
		for(int i = 0; i < dropLows.length; i++) {
			
			copyArr[i] = dropLows[i];
		}
		
		//The variable min is made so that we can reassign it later when we run into another int that was smaller than the previous min
		int min = copyArr[0];
		for(int b = 1; b < copyArr.length; b++) {
			
			if(copyArr[b] < min) {
				min = copyArr[b];
			}
		}
		
		//This just locates wherever min is and changes the value in that slot to 0
		for(int c = 0; c < copyArr.length; c++) {
			
			if(copyArr[c] == min) {
				copyArr[c] = 0;
			}
		}
		
		//This prints out the resulting array
		for(int d = 0; d < copyArr.length; d++) {
			
			System.out.print(copyArr[d] + " ");
			
		}
		
	}
	
}
