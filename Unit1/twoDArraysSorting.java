package semester2;

public class TwoDArraysSorting {

	public static void main(String[] args) {
		
		//The grid I will be using for this
		double gridNums[][] = {
				{7.0,6.3},
				{0.2,22.5},
				{3.0,1.5},
				{14.9,2.4}
		};
		
		//Method 1: How you would read (left to right, top-down)
		leftToRight(gridNums);

	}
	
	public static double[][] leftToRight(double[][] gridNums) {
		
		//This is my row variable which counts up so that it switches to the next row once the previous is
		//sorted
		for(int j = 0; j < gridNums.length; j++) {
			
			//This is my column variable specifically for my min value and is also where I declare both my
			//min and minLoc variables
			for(int k = 0; k < gridNums[0].length-1; k++) {
				
				double min = gridNums[j][k];
				int minLoc = k;
				
				//This is my other column variable for when searching through for if the next double is
				//smaller than the min which is why it starts at k+1, since the min can't be less than itself
				for(int i = k+1; i < gridNums[0].length; i++) {
					
					//This swaps the min with the number that ends up being less than it
					if(gridNums[j][i] < min) {
						min = gridNums[j][i];
						minLoc = i;
					}
				}
				
				//This actually swaps the two numbers that are found to be in the wrong order and sorts them
				double temp = gridNums[j][minLoc];
				gridNums[j][minLoc] = gridNums[j][k];
				gridNums[j][k] = temp;
			}
		}
		
		//This just prints out my grid
		for(int i = 0; i < gridNums.length; i++) {
			int count = 0;
			
			for(int o = 0; o < gridNums[0].length; o++) {
				
				System.out.print(gridNums[i][o] + " ");
				count++;
				
				if(count == 2) {
					count = 0;
					System.out.println("");
				}
			}
		}
		return gridNums;
	}

}
