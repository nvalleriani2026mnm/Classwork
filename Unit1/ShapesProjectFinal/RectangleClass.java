
public class Rectangle {

	private double length;
	private double width;
	
	public Rectangle(double l, double w) {
		
		length = l;
		width = w;
		
}

	// This non static method uses the value given in the shapes main and equals it to the width of the specific rectangle
	public double getWidth() {
		
		return width;
	}
	
	// This non static method uses the length and width of the given rectangle and multiplies it by 2 to find the perimeter
	public double getRecPerimeter() {
		
		return 2 * (length + width);
	}
	
	// This non static method finds the area of the rectangle by using both the length and width
	public double getRecArea() {
		
		return length * width;
	}
	
	// This static method gives the number of sides on any given rectangle
	public static int getSidesAgain() {
		
		return 4;
	}

	// This non static method resets the width value to whatever is given in the shapes main
	public double setWidth(double newWidth) {
		
		return width = newWidth;
	}
}
