
public class ShapesMain {

	public static void main(String[] args) {
		
	
	// These myCircs are all different object circles for our big mama Circle
		Circle myCirc1 = new Circle(3.0);
		Circle myCirc2 = new Circle(4.0);
		
		//These print out the reference code for two specific circles.
		System.out.println(myCirc1);
		System.out.println(myCirc2);
		
		//These print out the radius that the method calculated, then it provides a double for the setRadius method to change he radius to, then prints the radius again of Circ1.
		System.out.println(myCirc1.getRadius());
		myCirc1.setRadius(7.0);
		System.out.println(myCirc1.getRadius());
		
		//These print out the circumference and area of Circ1 that my methods calculated in Circle.java
		System.out.println(myCirc1.getCircumf());
		System.out.println(myCirc1.getArea());
		
		//This prints out the degrees of a circle which will always be 360 as the method stated. Then calls on the method stateShape
		System.out.println(Circle.getDegrees());
		Circle.stateShape();
	}
	


}
