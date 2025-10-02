/*
 * This class defines the attributes and properties of a prism
 */

public class Prism {
	
	private double length;
	private double width;
	private double height;

	// Constructor
	public Prism(double l, double w, double h) {
		length = l;
		width = w;
		height = h;
	}

	/*
	 *  Returns the length of this prism
	 */
	public double getLength() {
		return length;
	}
	
	/*
	 *  Returns the width of this prism
	 */
	public double getWidth() {
		return width;
	}

	/*
	 *  Returns the height of this prism
	 */
	public double getHeight() {
		return height;
	}

	/*
	 * Calculates and returns the area of this prism's base
	 */
	public double getArea() {
		return (length * width);
	}

	// Calculates and returns the perimeter of this prism's base
	public double getPerimeter() {
		return (2 * (length + width));
	}

	// Calculates and returns the surface area of this prism
		public double getSurfaceArea() {
			return (2 * (length * width + length * height + width * height));
	}
		
	// Calculates and returns the volume of this prism
	public double getVolume() {
		return (length * width * height);
	}

	// Prints out the description of this prism
	public static void stateShape() {
		System.out.println("This class generates Prism shapes.");
	}
	
	/*
	 * Sets new length
	 */
	public void setLength(double newLength) {
		length = newLength;
	}
	
	/*
	 * Sets new width
	 */
	public void setWidth(double newWidth) {
		width = newWidth;
	}

	/*
	 *  Sets new height
	 */
	public void setHeight(double newHeight) {
		height = newHeight;
	}
}
