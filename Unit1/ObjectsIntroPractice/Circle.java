
public class Circle {

	// These declare the radius and pi that will be a double value and they are private since they will never have to be accessed.
	private double radius;
	private final double pi = 3.14;
	
	// This is opening up a spot for what double r can be in the Circle class
	public Circle(double r) {
		
		radius = r;
		
	}
		// This is a public, nonstatic (since it depends on what circle we're talking about), with a return of a double number that takes the radius from ShapesMain parameters.
		public double getRadius() {
			
			return radius;
	}
		// This is a public, nonstatic, void return (since it's just changing a number) method that changes the radius.
		public void setRadius(double newRadius) {
			
			radius = newRadius;
		}
		
		// This is a public, nonstatic, return type double method that gives the circumference of the circle.
		public double getCircumf() {
			
			return 2 * pi * radius;
		}
		 
		// This is a public, nonstatic, return type double method that gives the area of the circle.
		public double getArea() {
			
			return pi * radius * radius;
		}
	
		// This is public, static (since all circles have the same degree so it doesn't matter which one we specify), return type int method of the degrees of the circle.
		public static int getDegrees() {
			
			return 360;
		}
		
		// This is a public, static, return type void (since the method will directly print a statement), method that prints a statement on the circle.
		public static void stateShape() {
			
			System.out.print("This class generates circle shapes.");
		}
		
		

		
}






