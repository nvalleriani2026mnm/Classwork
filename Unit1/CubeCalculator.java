
public class cubeCalculator {

	public static void main(String[] args) {
		
		/**
		 * This is where you can change the double value of s to whatever number you like
		 * in order to find the surface area of any cube side length.
		 */
    
		double s = 3.0;
		int surfaceArea = (int) (6 * (s*s));
		
		/**
		 * These SOPs are here to create a proper sentence when giving the output of
		 * the surface area.
		 */
		
		System.out.print("The surface area of the cube is ");
		System.out.print(surfaceArea);
		System.out.print(".");
		System.out.print("\n");
		
		/**
		 * Right here is the formula used for finding the volume of the cube,
		 * however you don't need to change anything here.
		 */
		
		int volume = (int) (s*s*s);
		
		/**
		 * These SOPs are here to also create a proper sentence when giving the output
		 * of the volume.
		 */
		
		System.out.print("The volume of the cube is ");
		System.out.print(volume);
		System.out.print(".");

	}

}
