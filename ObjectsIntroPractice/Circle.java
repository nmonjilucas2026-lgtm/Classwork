
/**
 * 1. Make a Circle class withOUT a main method. 

2. Give it some private data attributes: radius, pi. 

3. Give it a public constructor that sets the radius to 
whatever value is passed to it.

4. Give it some public nonstatic methods: getRadius(), 
setRadius(), getDimensions(), getCircumference(), and getArea().

5. Give it some public static methods: declareShape() (this method should simply print 
"This shape is a circle.") and tellHowCircleWorks() (this method should be passed a String to use as a name, 
then it prints "Hello (name), a circle is made by ensuring all created points are a radius length away from a set point.")

6. Create a ShapesMain class WITH a main method. In that main method, create 3 circles with different radius values. 
Test each object's method to make sure they work. 
 */

public class Circle {
		
		private final double pi = 3.14;
		private double radius;
		
		//declares radius
			public Circle(double r)
		{
				radius = r;
		}
			
		//returns radius
			public double getRadius() 
		{
			return radius;
		}
			
		//returns Circumference
			public double getCircumference() 
		{
			return (2 * pi * radius);
		}
			
		//returns Area
			public double getArea() 
		{
			return (pi * radius * radius);
		}
		
		//returns the degrees of a circle
			public static int getDegrees()
		{
			return 360;
		}
			
		//method to print out Shape	
			public static void stateShape()
		{
			 System.out.println("This class generates Circle shapes.");
		}
			
		//assigns previous radius a new value
			public void setRadius(double newRadius) 
		{
				radius = newRadius;
		}
	}
