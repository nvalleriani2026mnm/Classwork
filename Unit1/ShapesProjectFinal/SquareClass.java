
public class Square {

	
	private double length;
	private double width;
	
	public Square(double l, double w) {
		
		length = l;
		width = w;
		
}
	// This non static method gets the length that was put into the method caller's parameters
	public double getLength() {
		
		return length;
	}
	
	// This non static method uses the length and width of the square and double them to find the perimeter of the square
	public double getSqPerimeter() {
		
		return 2 * (length + width);
	}
	
	// This non static method uses the length and width of the square to find its area
	public double getSqArea() {
		
		return length * width;
	}
	
	// This static method simply gives the number of sides on any given square
	public static int getSideCount() {
		
		return 4;
	}
	
	// This non static method resets the length value by changing it to whatever the new value is in the shapes main
	public double setLength(double newLength) {
		
		return length = newLength;
	}

	
	
}
