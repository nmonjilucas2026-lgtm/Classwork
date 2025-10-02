/*
 * This class defines the attributes and properties of a circle
 */

public class Circle {
		
	private final double pi = 3.14;
	private double radius;
		
	// Constructor
	public Circle(double r)
	{
		radius = r;
	}
			
	/*
	 *  Returns the radius of this circle
	 */
	public double getRadius() 
	{
		return radius;
	}
			
	/*
	 * Calculates and returns the circumference of this circle
	 */
	public double getCircumference() 
	{
		return (2 * pi * radius);
	}
			
	/*
	 * Calculates and returns the area of this circle
	 */
	public double getArea() 
	{
		return (pi * radius * radius);
	}
		
	/*
	 *  Returns the total degrees of a circle
	 */
	public static int getDegrees()
	{
		return 360;
	}
			
	/*
	 * Prints out the description of a circle
	 */
	public static void stateShape()
	{
		System.out.println("This class generates Circular shapes.");
	}
			
	/*
	 * Sets new radius
	 */
	public void setRadius(double newRadius) 
	{
		radius = newRadius;
	}
}



