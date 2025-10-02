/*
 * This class defines the attributes and properties of a square
 */


public class Square {
		
	private double sideLength;
		
	
		public Square(double s)
	{
			sideLength = s;
	}
			
	/*
	 * Returns the side length of a square
	 */
		public double getSideLength() 
	{
		return sideLength;
	}
			
	/*
	 * Calculates and returns the perimeter of a square
	 */
		public double getPerimeter() 
	{
		return (4 * sideLength);
	}
			
	/*
	 * Calculates and returns the area of a square
	 */
		public double getArea() 
	{
		return (sideLength * sideLength);
	}	
		
	/*
	 * Returns the total degrees of a square
	 */
		public static int getDegrees()
	{
		return 360;
	}
			
	/*
	 *  Prints the description of a square
	 */
		public static void stateShape()
	{
		System.out.println("This class generates Square shapes.");
	}
			
	/*
	 *  Sets new side length
	 */
		public void setSideLength(double newSideLength) 
	{
		sideLength = newSideLength;
	}	
}


