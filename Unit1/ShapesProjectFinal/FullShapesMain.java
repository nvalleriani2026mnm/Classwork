
public class EntireShapesMain {

	public static void main(String[] args) {
		
		
		CircleB myCircle1 = new CircleB(4.0);
		CircleB myCircle2 = new CircleB(5.0);
		CircleB myCircle3 = new CircleB(6.2);
		
		Square mySquare1 = new Square(5.0, 6.7);
		Square mySquare2 = new Square(7.1, 4.1);
		Square mySquare3 = new Square(7.5, 5.2);
		
		Rectangle myRec1 = new Rectangle(9.4, 5.1);
		Rectangle myRec2 = new Rectangle(10.3, 8.5);
		Rectangle myRec3 = new Rectangle(12.8, 10.2);
		
		Triangle myTri1 = new Triangle(2.1, 2.1, 4.0, 5.2);
		Triangle myTri2 = new Triangle(3.5, 3.6, 7.22, 9.12);
		Triangle myTri3 = new Triangle(12.4, 12.4, 10.15, 8.72);
		
		Cube myCube1 = new Cube(19.5);
		
		// -----------------------------------------------------------------------------------------
		// -----------------------------------------------------------------------------------------
		// Circle
		
		System.out.println("The radius of the circle is " + myCircle1.getRadius());
		System.out.println("The circumference of the circle is " + myCircle1.getCircumf());
		System.out.println("The circle is " + CircleB.getDegrees() + " degrees.");
		myCircle1.setRadius(4.8);
		System.out.println("The new radius of this circle is " + myCircle1.getRadius());
		
		System.out.println("");
		
		System.out.println("The radius of the circle is " + myCircle2.getRadius());
		System.out.println("The circumference of the circle is " + myCircle2.getCircumf());
		System.out.println("The circle is " + CircleB.getDegrees() + " degrees.");
		myCircle2.setRadius(6.2);
		System.out.println("The new radius of this circle is " + myCircle2.getRadius());
		
		System.out.println("");
		
		System.out.println("The radius of the circle is " + myCircle3.getRadius());
		System.out.println("The circumference of the circle is " + myCircle3.getCircumf());
		System.out.println("The circle is " + CircleB.getDegrees() + " degrees.");
		myCircle3.setRadius(8.19);
		System.out.println("The new radius of this circle is " + myCircle3.getRadius());
		
		System.out.println("");
		
		// -----------------------------------------------------------------------------------------
		// -----------------------------------------------------------------------------------------
		// Square
		
		System.out.println("The length of this square " + mySquare1.getLength());
		System.out.println("The perimeter of the square is " + mySquare1.getSqPerimeter()); 
		System.out.println("The area of the square is " + mySquare1.getSqArea());
		System.out.println("The square has " + Square.getSideCount() + " sides.");
		mySquare1.setLength(7.56);
		System.out.println("The new length is " + mySquare1.getLength());
		
		System.out.println("");
		
		System.out.println("The length of this square is " + mySquare2.getLength());
		System.out.println("The perimeter of the square is " + mySquare2.getSqPerimeter()); 
		System.out.println("The area of the square is " + mySquare2.getSqArea());
		System.out.println("The square has " + Square.getSideCount() + " sides.");
		mySquare2.setLength(24.3);
		System.out.println("The new length is " + mySquare2.getLength());
		
		System.out.println("");
		
		System.out.println("The length of this square " + mySquare3.getLength());
		System.out.println("The perimeter of the square is " + mySquare3.getSqPerimeter()); 
		System.out.println("The area of the square is " + mySquare3.getSqArea());
		System.out.println("The square has " + Square.getSideCount() + " sides.");
		mySquare3.setLength(45.7);
		System.out.println("The new length is " + mySquare3.getLength());
		
		System.out.println("");
		
		// -----------------------------------------------------------------------------------------
		// -----------------------------------------------------------------------------------------
		// Rectangle
		
		System.out.println("The width of the rectangle is " + myRec1.getWidth());
		System.out.println("The perimeter of the rectangle is " + myRec1.getRecPerimeter());
		System.out.println("The area of the rectangle is " + myRec1.getRecArea());
		System.out.println("The rectangle has " + Rectangle.getSidesAgain() + " sides.");
		myRec1.setWidth(12.6);
		System.out.println("The new width is " + myRec1.getWidth());
		
		System.out.println("");
		
		System.out.println("The width of the rectangle is " + myRec2.getWidth());
		System.out.println("The perimeter of the rectangle is " + myRec2.getRecPerimeter());
		System.out.println("The area of the rectangle is " + myRec2.getRecArea());
		System.out.println("The rectangle has " + Rectangle.getSidesAgain() + " sides.");
		myRec2.setWidth(15.77);
		System.out.println("The new width is " + myRec2.getWidth());
		
		System.out.println("");
		
		System.out.println("The width of the rectangle is " + myRec3.getWidth());
		System.out.println("The perimeter of the rectangle is " + myRec3.getRecPerimeter());
		System.out.println("The area of the rectangle is " + myRec3.getRecArea());
		System.out.println("The rectangle has " + Rectangle.getSidesAgain() + " sides.");
		myRec3.setWidth(20.34);
		System.out.println("The new width is " + myRec3.getWidth());
		
		System.out.println("");
		
		// -----------------------------------------------------------------------------------------
		// -----------------------------------------------------------------------------------------
		// Triangle
		
		System.out.println("The height of the triangle is " + myTri1.getHeight());
		System.out.println("The perimeter of the triangle is " + myTri1.getTriPerimeter());
		System.out.println("The area of the triangle is " + myTri1.getTriArea());
		System.out.println("The triangle has " + Triangle.getSidesOnceAgain() + " sides.");
		myTri1.setHeight(9.15);
		System.out.println("The new height is " + myTri1.getHeight());
		
		System.out.println("");
		
		System.out.println("The height of the triangle is " + myTri2.getHeight());
		System.out.println("The perimeter of the triangle is " + myTri2.getTriPerimeter());
		System.out.println("The area of the triangle is " + myTri2.getTriArea());
		System.out.println("The triangle has " + Triangle.getSidesOnceAgain() + " sides.");
		myTri2.setHeight(30.7);
		System.out.println("The new height is " + myTri2.getHeight());
		
		System.out.println("");
		
		System.out.println("The height of the triangle is " + myTri3.getHeight());
		System.out.println("The perimeter of the triangle is " + myTri3.getTriPerimeter());
		System.out.println("The area of the triangle is " + myTri3.getTriArea());
		System.out.println("The triangle has " + Triangle.getSidesOnceAgain() + " sides.");
		myTri3.setHeight(9.15);
		System.out.println("The new height is " + myTri3.getHeight());
		
		System.out.println("");
		
		// -----------------------------------------------------------------------------------------
		// -----------------------------------------------------------------------------------------
		// Cube
		
		System.out.println("The surface area of the cube is " + myCube1.getSurfaceArea());
		System.out.println("The volume of the cube is " + myCube1.getVolume());
		System.out.println("The cube has " + Cube.getSidesLastTime() + " faces.");
		
	}			

}
