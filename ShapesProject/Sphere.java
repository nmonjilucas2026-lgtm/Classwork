/*
 * This class defines the attributes and properties of a sphere
 */


public class Sphere {
		
	private final double pi = 3.14;
	private double radius;
		
	
	public Sphere(double r)
	{
		radius = r;
	}
			
	/*
	 *  Returns the radius of a sphere
	 */
	public double getRadius() 
	{
		return radius;
	}
			
	/*
	 * Calculates and returns the circumference of a sphere's equator
	 */
	public double getCircumference() 
	{
		return (2 * pi * radius);
	}
			
	/*
	 * Calculates and returns the surface area of a sphere
	 */
	public double getArea() 
	{
		return (4 * pi * radius * radius);
	}
	
	/*
	 * Calculates and returns the volume of a sphere
	 */
	public double getVolume() 
	{
		return (4.0/3.0 * pi * radius * radius * radius);
	}
		
	/*
	 *  Returns the total degrees of a sphere
	 */
	public static int getDegrees()
	{
		return 360;
	}
			
	/*
	 * Prints out the description of a sphere
	 */
	public static void stateShape()
	{
		System.out.println("This class generates Spherical shapes.");
	}
			
	/*
	 * Sets new radius
	 */
	public void setRadius(double newRadius) 
	{
		radius = newRadius;
	}
}
