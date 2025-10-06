
public class Triangle {

	private double side1;
	private double side2;
	private double base;
	private double height;
	
	public Triangle(double s1, double s2, double b1, double h1) {
		
		side1 = s1;
		side2 = s2;
		base = b1;
		height = h1;
	}

	// This non static method finds the height of the triangle by using the value inside the parameters of the method caller
	public double getHeight() {
		
		return height;
	}
	
	// This non static method finds the perimeter of the triangle by adding all three of the sides together
	public double getTriPerimeter() {
		
		return side1 + side2 + base;
	}
	
	// This non static method finds the area of the triangle by using both the height and base of the triangle and dividing by 2
	public double getTriArea() {
		
		return (height * base) / 2;
	}
	
	// This static method simply says how many sides there are on any given triangle
	public static int getSidesOnceAgain() {
		
		return 3;
	}
	
	// This non static method resets the value of the height of the triangle by using the new one in the shapes main
	public double setHeight(double newHeight) {
		
		return height = newHeight;
	}
	
	
	
}
