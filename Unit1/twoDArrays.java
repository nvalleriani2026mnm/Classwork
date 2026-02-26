package semester2;

public class twoDArrays {

	public static void main(String[] args) {
		
		int[][] gridNums = new int[4][6];
		int[][] anotherArray = {
				{4,5,7},
				{2,-1,8},
				{0,1,3}
		};
		
		//First row and column to 17
		System.out.println(gridNums[0][0]);
		System.out.println(anotherArray[0][0]);
		gridNums[0][0] = 17;
		anotherArray[0][0] = 17;
		System.out.println(gridNums[0][0]);
		System.out.println(anotherArray[0][0]);
		
		//Second row third column to 20
		System.out.println(gridNums[1][2]);
		System.out.println(anotherArray[1][2]);
		gridNums[1][2] = 20;
		anotherArray[1][2] = 20;
		System.out.println(gridNums[1][2]);
		System.out.println(anotherArray[1][2]);
		
		//Last element first row to -5
		System.out.println(gridNums[0][gridNums[0].length-1]);
		System.out.println(anotherArray[0][anotherArray[0].length-1]);
		gridNums[0][gridNums[0].length-1] = -5;
		anotherArray[0][anotherArray[0].length-1] = -5;
		System.out.println(gridNums[0][gridNums[0].length-1]);
		System.out.println(anotherArray[0][anotherArray[0].length-1]);
		
		//First element last row to -7
		System.out.println(gridNums[gridNums.length-1][0]);
		System.out.println(anotherArray[anotherArray.length-1][0]);
		gridNums[gridNums.length-1][0] = -7;
		anotherArray[anotherArray.length-1][0] = -7;
		System.out.println(gridNums[gridNums.length-1][0]);
		System.out.println(anotherArray[anotherArray.length-1][0]);
		
		//Last element last row to -30
		System.out.println(gridNums[gridNums.length-1][gridNums[gridNums.length-1].length-1]);
		System.out.println(anotherArray[anotherArray.length-1][anotherArray[anotherArray.length-1].length-1]);
		gridNums[gridNums.length-1][gridNums[gridNums.length-1].length-1] = -30;
		anotherArray[anotherArray.length-1][anotherArray[anotherArray.length-1].length-1] = -30;
		System.out.println(gridNums[gridNums.length-1][gridNums[gridNums.length-1].length-1]);
		System.out.println(anotherArray[anotherArray.length-1][anotherArray[anotherArray.length-1].length-1]);
		
		//This just runs my methods and cretes spaces in between
		elementsFirstRow(anotherArray);
		System.out.println("");
		elementsFirstColumn(anotherArray);
		System.out.println("");
		byRows(anotherArray);
		System.out.println("");
		byColumns(anotherArray);
	}
	
	public static void elementsFirstRow(int[][] anotherArray) {
		
		//This prints out every element in only the first row
		for(int i = 0; i < anotherArray[0].length; i++) {
			System.out.print(anotherArray[0][i] + " ");
		}
	}
	
	public static void elementsFirstColumn(int[][] anotherArray) {
		
		//This prints out every element in the first column in the whole array
		for(int i = 0; i < anotherArray.length; i++) {
			System.out.print(anotherArray[i][0] + " ");
		}
	}
	
	public static void byRows(int[][] anotherArray) {
		
		//This prints out every element in the whole array in order from rows
		for(int j = 0; j < anotherArray.length; j++) {
			for(int i = 0; i < anotherArray[j].length; i++) {
				System.out.print(anotherArray[i][j] + " ");
			}
		}
	}
	
	public static void byColumns(int[][] anotherArray) {
		
		//This prints out every element in the whole array in order from columns
		for(int j = 0; j < anotherArray.length; j++) {
			for(int i = 0; i < anotherArray[j].length; i++) {
				System.out.print(anotherArray[j][i] + " ");
			}
		}
	}

}
