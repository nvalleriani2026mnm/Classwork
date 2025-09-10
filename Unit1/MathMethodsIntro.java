
public class MathMethodsIntro {

	public static void main(String[] args) {
		
		
		// These are my four variables that I'll be using throughout the code
		int posInt = 3;
		int negInt = -4;
		double posDouble = 2.0;
		double negDouble = -7.0;
		
		
		// These call onto my abs() method
		
		getAbs(posInt);
		getAbs(negInt);
		getAbs(posDouble);
		getAbs(negDouble);
		
		
		// These call onto my pow() method
		
		getPow(posInt, negInt);
		getPow(negInt, posInt);
		
		// These call onto my sqrt() method
		
		getSqrt(posInt);
		getSqrt(negInt);
		getSqrt(posDouble);
		getSqrt(negDouble);
		
		System.out.println((int)(Math.random() * 10 + 11));
		
		
	}
	
	/**
	 * This method prints out the absolute value of my positive and negative ints using the math method abs
	 */
	/**
	 * I would say this method is overloaded since it can handle multiple primitives
	 *  like ints and doubles
	 */
	public static void getAbs(int num) {
		
		System.out.println("The absolute value is: " + java.lang.Math.abs(num));
		
	}
	
	/**
	 * This method prints out the absolute value of my positive and negative doubles using the math method abs
	 */
	public static void getAbs(double num) {
		
		System.out.println("The absolute value is: " + java.lang.Math.abs(num));
		
	}
	
	
	
	/**
	 * This method prints out the power of both the pos int to the neg int, and the neg int to the pos int
	 */
	/**
	 * I would say this method is not overloaded since it only handles one type of primitive (int)
	 */
	public static void getPow(int num1, int num2) {
		
		System.out.println("The power: " + java.lang.Math.pow(num1, num2));
		
	}
		
	
	/**
	 * This method prints out the square root of the ints I declared
	 * 
	 * I didn't expect an actual error from this, but I wasn't surprised to see that the output said "NaN" since you can't get the 
	 * square root of a negative number, in algebra it's just: " i square root # "
	 */
	public static void getSqrt(int num) {
		
		System.out.println("The square root is: " + java.lang.Math.sqrt(num));
		
	}
	
	/**
	 * This method here prints out the square root of the doubles I declared
	 */
	public static void getSqrt(double num) {
		
		System.out.println("The square root is: " + java.lang.Math.sqrt(num));
	}
	
	
		
		
	
}








