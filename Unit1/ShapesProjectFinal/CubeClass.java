
public class Cube {

	private double edge1;
	
	public Cube(double e1) {
		
		edge1 = e1;
	}
	
	// This non static method finds the surface area of the cube by using the edge value and multiplying it by 6
	public double getSurfaceArea() {
		
		return 6 * (edge1 * edge1);
	}
	
	// This non static method finds the volume of the cube by taking the edge and cubing it
	public double getVolume() {
		
		return edge1 * edge1 * edge1;
	}
	
	// This static method simply states the number of faces on any given cube
	public static int getSidesLastTime() {
		
		return 6;
	}
}
