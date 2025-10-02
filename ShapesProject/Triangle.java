/*
 * This class defines the attributes and properties of a triangle
 */

public class Triangle {

	private double base;
	private double height;

	// Constructor
	public Triangle(double b, double h) {
		base = b;
		height = h;
	}

	/*
	 *  Returns the base of this triangle
	 */
	public double getBase() {
		return base;
	}

	/*
	 *  Returns the height of this triangle
	 */
	public double getHeight() {
		return height;
	}

	/*
	 * Calculates and returns the area of this triangle
	 */
	public double getArea() {
		return (0.5 * base * height);
	}

	/*
	 *  Calculates and returns the perimeter of this triangle
	 */
	public double getPerimeter() {
		return (3 * base);
	}

	/*
	 *  Returns the total degrees of a triangle
	 */
	public static int getDegrees() {
		return 180;
	}

	/*
	 *  Prints out the description of a triangle
	 */
	public static void stateShape() {
		System.out.println("This class generates Triangular shapes.");
	}
	
	/*
	 * Sets new base
	 */
	public void setBase(double newBase) {
		base = newBase;
	}

	/*
	 *  Sets new height
	 */
	public void setHeight(double newHeight) {
		height = newHeight;
	}
}
