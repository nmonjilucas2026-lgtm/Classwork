/*
 * This class defines the attributes and properties of a cube
 */

public class Cube {
		
	private double sideLength;
		
	// Constructor
	public Cube(double s)
	{
		sideLength = s;
	}
			
	/*
	 * Returns the side length of this cube.
	 */
	public double getSideLength() 
	{
		return sideLength;
	}
		
	/*
	 * Calculates and returns the area of one face of this cube
	 */
	public double getFace() 
	{
		return (sideLength * sideLength);
	}	
		
	/*
	 *  Calculates and returns the perimeter of one face of this cube
	 */
	public double getPerimeter() 
	{
		return (4 * sideLength);
	}
		
	/*
	 * Calculates and returns the surface area of this cube
	 */
	public double getSurfaceArea() 
	{
		return (6 * sideLength * sideLength);
	}	
	
	/*
	 * Calculates the volume of this cube
	 */
	public double getVolume() 
	{
		return (sideLength * sideLength * sideLength);
	}	
			
		
	/*
	 * Calculates and returns the diagonal of one face of this cube
	 */
	public double getDiagonal() 
	{
		return sideLength *  Math.sqrt(2);
	}
		
	/*
	 * Returns the total Degrees of a cube
	 */
	public static int getDegrees()
	{
		return 1080;
	}
			
	/*
	 *  Prints the description of a cube
	 */
	public static void stateShape()
	{
		System.out.println("This class generates Cubic shapes.");
	}
			
	/*
	 * Sets new side length
	 */
		public void setSideLength(double newSideLength) 
	{
		sideLength = newSideLength;
	}
}
