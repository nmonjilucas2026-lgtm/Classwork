
public class ShapesMain {

	public static void main(String[] args) 
	{
		/**
		 * CIRCLE CLASS
		 */
		Circle myCirc1 = new Circle(3.0); //instantiates my circ1's radius
		Circle myCirc2 = new Circle(5.0); //instantiates my circ2's radius
		Circle myCirc3 = new Circle(6.0); //instantiates my circ3's radius
		
		System.out.println("--- Circle 1 ---");
		
		System.out.println("Circle Radius: " + myCirc1.getRadius());
		System.out.println("Circumference: " + myCirc1.getCircumference());
		System.out.println("Area: " + myCirc1.getArea());
		myCirc1.setRadius(7.0);
		System.out.println("Updated Radius: " + myCirc1.getRadius());
		System.out.println("Updated Circumference: " + myCirc1.getCircumference());
		System.out.println("Updated Area: " + myCirc1.getArea());
		System.out.println("Circle Degrees: " + Circle.getDegrees() + " degrees");
		Circle.stateShape();
		
		System.out.println();
		System.out.println();
		
		/**
		 * SQUARE CLASS
		 */
		Square mySquare1 = new Square(5.0); //instantiates my square1's side length
		Square mySquare2 = new Square(9.0); //instantiates my square2's side length
		Square mySquare3 = new Square(10.0); //instantiates my square3's side length
	
		System.out.println("--- Square 1 ---");
		
		System.out.println("Square Length: " + mySquare1.getSideLength());
		System.out.println("Perimeter: " + mySquare1.getPerimeter());
		System.out.println("Area:  " + mySquare1.getArea());
		mySquare1.setSideLength(6.5);
		System.out.println("Updated Length: " + mySquare1.getSideLength());
		System.out.println("Updated Perimeter: " + mySquare1.getPerimeter());
		System.out.println("Updated Area: " + mySquare1.getArea());
		System.out.println("Square Degrees: " + Square.getDegrees());
		Square.stateShape();
		
		System.out.println();
		System.out.println();
		
		/**
		 * RECTANGLE CLASS
		 */
		Rectangle myRectangle1 = new Rectangle(20.5, 10); //instantiates my rectangle1's length and width
		Rectangle myRectangle2 = new Rectangle(9.0, 3.5); //instantiates my rectangle2's length and width
		Rectangle myRectangle3 = new Rectangle(2, 4); //instantiates my rectangle3's length and width
	
		System.out.println("--- Rectangle 1 ---");
		
		System.out.println("Rectangle Length: " + myRectangle1.getLength());
		System.out.println("Rectangle Width: " + myRectangle1.getWidth());
		System.out.println("Perimeter: " + myRectangle1.getPerimeter());
		System.out.println("Area: " + myRectangle1.getArea());
		myRectangle1.setLength(30);
		myRectangle1.setWidth(17.5);
		System.out.println("Updated Length: " + myRectangle1.getLength());
		System.out.println("Updated Perimeter: " + myRectangle1.getPerimeter());
		System.out.println("Updated Area: " + myRectangle1.getArea());
		System.out.println("Rectangle Degrees: " + Rectangle.getDegrees());
		Rectangle.stateShape();
		
		System.out.println();
		System.out.println();
		
		/**
		 * TRIANGLE CLASS
		 */
		Triangle myTriangle1 = new Triangle(10, 5); //instantiates my triangle1's base and height
		Triangle myTriangle2 = new Triangle(8, 4); //instantiates my triangle2's base and height
		Triangle myTriangle3 = new Triangle(6, 3); //instantiates my triangle3's base and height

		System.out.println("--- Triangle 1 ---");
		
		System.out.println("Triangle Base: " + myTriangle1.getBase());
		System.out.println("Triangle Height: " + myTriangle1.getHeight());
		System.out.println("Area: " + myTriangle1.getArea());
		System.out.println("Perimeter : " + myTriangle1.getPerimeter());
		myTriangle1.setBase(12);
		myTriangle1.setHeight(7);
		System.out.println("Updated Base: " + myTriangle1.getBase());
		System.out.println("Updated Area: " + myTriangle1.getArea());
		System.out.println("Triangle Degrees: " + Triangle.getDegrees());
		Triangle.stateShape();
		
		System.out.println();
		System.out.println();
		
		/**
		 * CUBE CLASS
		 */
		Cube myCube1 = new Cube(12); //instantiates my cube1's side length
		Cube myCube2 = new Cube(4.5); //instantiates my cube2's side length
		Cube myCube3 = new Cube(8); //instantiates my cube3's side length

		System.out.println("--- Cube 1 ---");
		
		System.out.println("Cube Side Length: " + myCube1.getSideLength());
		System.out.println("Cube Face: " + myCube1.getFace());
		System.out.println("Cube Perimeter: " + myCube1.getPerimeter());
		System.out.println("Cube Surface Area: " + myCube1.getSurfaceArea());
		System.out.println("Cube Volume: " + myCube1.getVolume());
		System.out.println("Cube Diagonal: " + myCube1.getDiagonal());
		myCube1.setSideLength(30);
		System.out.println("Updated Side Length: " + myCube1.getSideLength());
		System.out.println("Updated Face: " + myCube1.getFace());
		System.out.println("Updated Perimeter: " + myCube1.getPerimeter());
		System.out.println("Updated Surface Area: " + myCube1.getSurfaceArea());
		System.out.println("Updated Volume: " + myCube1.getVolume());
		System.out.println("Updated Diagonal: " + myCube1.getDiagonal());
		System.out.println("Cube Degrees: " + Cube.getDegrees());
		Cube.stateShape();
		
		System.out.println();
		System.out.println();
		
		/**
		 * SPHERE CLASS
		 */
		Sphere mySphere1 = new Sphere(14.0); //instantiates my sphere1's radius
		Sphere mySphere2 = new Sphere(35.0); //instantiates my sphere2
		Sphere mySphere3 = new Sphere(20.3); //instantiates my sphere3'
		
		System.out.println("--- Sphere 1 ---");
		
		System.out.println("Sphere Radius: " + mySphere1.getRadius());
		System.out.println("Circumference: " + mySphere1.getCircumference());
		System.out.println("Surface Area: " + mySphere1.getArea());
		System.out.println("Volume: " + mySphere1.getVolume());
		mySphere1.setRadius(54.0);
		System.out.println("Updated Radius: " + mySphere1.getRadius());
		System.out.println("Updated Circumference: " + mySphere1.getCircumference());
		System.out.println("Updated Area: " + mySphere1.getArea());
		System.out.println("Updated Volume: " + mySphere1.getVolume());
		System.out.println("Sphere Degrees: " + Sphere.getDegrees() + " degrees");
		Sphere.stateShape();
		
		System.out.println();
		System.out.println();
		
		/**
		 * CYLINDER CLASS
		 */
		Cylinder myCylinder1 = new Cylinder(14.0, 12.0); //instantiates my cylinder1
		Cylinder myCylinder2 = new Cylinder(20.0, 20.0); //instantiates my cylinder2
		Cylinder myCylinder3 = new Cylinder(13, 10); //instantiates my cylinder3
		
		System.out.println("--- Cylinder 1 ---");
		
		System.out.println("Cylinder Radius: " + myCylinder1.getRadius());
		System.out.println("Cylinder Height: " + myCylinder1.getHeight());
		System.out.println("Circumference: " + myCylinder1.getCircumference());
		System.out.println("Base Area: " + myCylinder1.getArea());
		System.out.println("Volume: " + myCylinder1.getVolume());
		System.out.println("Surface Area: " + myCylinder1.getSurfaceArea());
		myCylinder1.setRadius(12.0);
		myCylinder1.setHeight(30.0);
		System.out.println("Updated Radius: " + myCylinder1.getRadius());
		System.out.println("Updated Height: " + myCylinder1.getHeight());
		System.out.println("Updated Circumference: " + myCylinder1.getCircumference());
		System.out.println("Updated Area: " + myCylinder1.getArea());
		System.out.println("Updated Volume: " + myCylinder1.getVolume());
		System.out.println("Updated Surface Area: " + myCylinder1.getSurfaceArea());
		System.out.println("Cylinder Degrees: " + Cylinder.getDegrees() + " degrees");
		Cylinder.stateShape();
		
		System.out.println();
		System.out.println();
		
		/*
		 * PRISM CLASS
		 */
		Prism myPrism1 = new Prism(14.0, 12.0, 10); //instantiates my prism1
		Prism myPrism2 = new Prism(20.0, 20.0, 20); //instantiates my prism2
		Prism myPrism3 = new Prism(13, 10, 7); //instantiates my prism3
		
		System.out.println("--- Prism 1 ---");
		
		System.out.println("Prism Length: " + myPrism1.getLength());
		System.out.println("Prism Width: " + myPrism1.getWidth());
		System.out.println("Prism Height: " + myPrism1.getHeight());
		System.out.println("Prism Area: " + myPrism1.getArea());
		System.out.println("Prism Perimeter: " + myPrism1.getPerimeter());
		System.out.println("Prism Volume: " + myPrism1.getVolume());
		System.out.println("Prism Surface Area: " + myPrism1.getSurfaceArea());
		myPrism1.setLength(12.0);
		myPrism1.setWidth(24.0);
		myPrism1.setHeight(36.0);
		System.out.println("Updated Length: " + myPrism1.getLength());
		System.out.println("Updated Width: " + myPrism1.getWidth());
		System.out.println("Updated Height: " + myPrism1.getHeight());
		System.out.println("Updated Area: " + myPrism1.getArea());
		System.out.println("Updated Perimeter: " + myPrism1.getPerimeter());
		System.out.println("Updated Volume: " + myPrism1.getVolume());
		System.out.println("Updated Surface Area: " + myPrism1.getSurfaceArea());
		Prism.stateShape();
	}
}
