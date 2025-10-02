/*
 * This class defines the attributes and properties of a cylinder
 */


public class Cylinder {
		
	private final double pi = 3.14;
	private double radius;
	private double height;
	
	// Constructor
	public Cylinder(double r, double h)
	{
		radius = r;
		height = h;
	}
			
	/*
	 *  Returns the radius of this cylinder
	 */
	public double getRadius() 
	{
		return radius;
	}
	
	/*
	 *  Returns the height of this cylinder
	 */
	public double getHeight() {
		return height;
	}
	
	/*
	 * Calculates and returns the base circumference of this cylinder
	 */
	public double getCircumference() 
	{
		return (2 * pi * radius);
	}
			
	/*
	 * Calculates and returns the base area of this cylinder
	 */
	public double getArea() 
	{
		return (pi * radius * radius);
	}
	
	/*
	 * Calculates and returns the surface area of this cylinder
	 */
	public double getSurfaceArea() 
	{
		return (2 * pi * radius * height) + (2 * pi * radius * radius);
	}
			
	/*
	 * Calculates and returns the volume of this cylinder
	 */
	public double getVolume() 
	{
		return (pi * radius * radius * height);
	}
		
		
	/*
	 *  Returns the total degrees of a cylinder
	 */
	public static int getDegrees()
	{
		return 360;
	}
			
	/*
	 * Prints out the description of a cylinder
	 */
	public static void stateShape()
	{
		System.out.println("This class generates Cylinder shapes.");
	}
			
	/*
	 * Sets new radius
	 */
	public void setRadius(double newRadius) 
	{
		radius = newRadius;
	}
	
	/*
	 * Sets new Height
	 */
	public void setHeight(double newHeight) 
	{
		height = newHeight;
	}	
}
