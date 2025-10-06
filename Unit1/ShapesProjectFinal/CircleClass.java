
public class CircleB {

	
	private double radius;
	private final double pi = 3.14;

	public CircleB(double r) {
		
		radius = r;
	}
	// This is a public, nonstatic (since it depends on what circle we're talking about), with a return of a double number that takes the radius from ShapesMain parameters.
	public double getRadius() {
				
		return radius;
	}
			
		// This is a public, nonstatic, return type double method that gives the circumference of the circle.
		public double getCircumf() {
				
		return 2 * pi * radius;
	}
		
		// This is public, static (since all circles have the same degree so it doesn't matter which one we specify), return type int method of the degrees of the circle.
		public static int getDegrees() {
				
		return 360;
	}
		
		// This method right here sets the radius to a new number so that when I print it again it uses this radius value instead.
		public double setRadius(double newRadius) {
			
			return radius = newRadius;
		}
			
}
