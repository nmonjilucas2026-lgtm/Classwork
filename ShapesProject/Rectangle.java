/*
 * This class defines the attributes and properties of a rectangle
 */


public class Rectangle {
		
	private double width;
	private double length;
		
	// Constructor
	public Rectangle(double l, double w)
	{
		length = l;
		width = w;
	}
			
	/*
	 *  Returns the width of a rectangle
	 */
	public double getWidth() 
	{
		return width;
	}
			
	/*
	 *  Returns the length of a rectangle
	 */
	public double getLength() 
	{
		return length;
	}
			
	/*
	 *  Calculates and returns the area of a rectangle
	 */
		public double getArea() 
	{
		return (width * length);
	}
			
	/*
	 * Calculates and returns the perimeter of a rectangle
	 */
		public double getPerimeter() 
	{
		return (2 * (length + width));
	}
		
	/*
	 * Returns the total degrees of a rectangle
	 */
	public static int getDegrees()
	{
		return 360;
	}
			
	/*
	 * Prints out the description of a rectangle
	 */
	public static void stateShape()
	{
		System.out.println("This class generates Rectangular shapes.");
	}
			
	/*
	 *  Sets new width
	 */
	public void setWidth(double newWidth) 
	{
		width = newWidth;
	}
			
	/*
	 *  Sets new length
	 */
	public void setLength(double newLength) 
	{
		length = newLength;		
	}			
}

