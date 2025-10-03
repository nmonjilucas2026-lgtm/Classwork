
public class ShapesMain {

	public static void main(String[] args) 
	{
		/**
		 * CIRCLE CLASS
		 */
		Circle myCirc1 = new Circle(3.0); //instantiates new circle object
		Circle myCirc2 = new Circle(5.0); //instantiates new circle object
		Circle myCirc3 = new Circle(6.0); //instantiates new circle object
		
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

		System.out.println("--- Circle 2 ---");
		System.out.println("Circle Radius: " + myCirc2.getRadius());
		System.out.println("Circumference: " + myCirc2.getCircumference());
		System.out.println("Area: " + myCirc2.getArea());
		myCirc2.setRadius(10.0);
		System.out.println("Updated Radius: " + myCirc2.getRadius());
		System.out.println("Updated Circumference: " + myCirc2.getCircumference());
		System.out.println("Updated Area: " + myCirc2.getArea());
		System.out.println("Circle Degrees: " + Circle.getDegrees() + " degrees");
		Circle.stateShape();

		System.out.println();

		System.out.println("--- Circle 3 ---");
		System.out.println("Circle Radius: " + myCirc3.getRadius());
		System.out.println("Circumference: " + myCirc3.getCircumference());
		System.out.println("Area: " + myCirc3.getArea());
		myCirc3.setRadius(31.0);
		System.out.println("Updated Radius: " + myCirc3.getRadius());
		System.out.println("Updated Circumference: " + myCirc3.getCircumference());
		System.out.println("Updated Area: " + myCirc3.getArea());
		System.out.println("Circle Degrees: " + Circle.getDegrees() + " degrees");
		Circle.stateShape();

		
		System.out.println();
		System.out.println();

		
		/**
		 * SQUARE CLASS
		 */
		Square mySquare1 = new Square(5.0); //instantiates new square object
		Square mySquare2 = new Square(9.0); //instantiates new square object
		Square mySquare3 = new Square(10.0); //instantiates new square object

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
		
		System.out.println("--- Square 2 ---");
		System.out.println("Square Length: " + mySquare2.getSideLength());
		System.out.println("Perimeter: " + mySquare2.getPerimeter());
		System.out.println("Area:  " + mySquare2.getArea());
		mySquare2.setSideLength(12.0);
		System.out.println("Updated Length: " + mySquare2.getSideLength());
		System.out.println("Updated Perimeter: " + mySquare2.getPerimeter());
		System.out.println("Updated Area: " + mySquare2.getArea());
		System.out.println("Square Degrees: " + Square.getDegrees());
		Square.stateShape();

		System.out.println();
		
		System.out.println("--- Square 3 ---");
		System.out.println("Square Length: " + mySquare3.getSideLength());
		System.out.println("Perimeter: " + mySquare3.getPerimeter());
		System.out.println("Area:  " + mySquare3.getArea());
		mySquare3.setSideLength(24.0);
		System.out.println("Updated Length: " + mySquare3.getSideLength());
		System.out.println("Updated Perimeter: " + mySquare3.getPerimeter());
		System.out.println("Updated Area: " + mySquare3.getArea());
		System.out.println("Square Degrees: " + Square.getDegrees());
		Square.stateShape();

		
		System.out.println();
		System.out.println();

		
		/**
		 * RECTANGLE CLASS
		 */
		Rectangle myRectangle1 = new Rectangle(20.5, 10); //instantiates new rectangle object
		Rectangle myRectangle2 = new Rectangle(9.0, 3.5); //instantiates new rectangle object
		Rectangle myRectangle3 = new Rectangle(2, 4); //instantiates new rectangle object
	
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
		
		System.out.println("--- Rectangle 2 ---");
		System.out.println("Rectangle Length: " + myRectangle2.getLength());
		System.out.println("Rectangle Width: " + myRectangle2.getWidth());
		System.out.println("Perimeter: " + myRectangle2.getPerimeter());
		System.out.println("Area: " + myRectangle2.getArea());
		myRectangle2.setLength(27);
		myRectangle2.setWidth(83);
		System.out.println("Updated Length: " + myRectangle2.getLength());
		System.out.println("Updated Perimeter: " + myRectangle2.getPerimeter());
		System.out.println("Updated Area: " + myRectangle2.getArea());
		System.out.println("Rectangle Degrees: " + Rectangle.getDegrees());
		Rectangle.stateShape();

		System.out.println();
		
		System.out.println("--- Rectangle 3 ---");
		System.out.println("Rectangle Length: " + myRectangle3.getLength());
		System.out.println("Rectangle Width: " + myRectangle3.getWidth());
		System.out.println("Perimeter: " + myRectangle3.getPerimeter());
		System.out.println("Area: " + myRectangle3.getArea());
		myRectangle3.setLength(53);
		myRectangle3.setWidth(72);
		System.out.println("Updated Length: " + myRectangle3.getLength());
		System.out.println("Updated Perimeter: " + myRectangle3.getPerimeter());
		System.out.println("Updated Area: " + myRectangle3.getArea());
		System.out.println("Rectangle Degrees: " + Rectangle.getDegrees());
		Rectangle.stateShape();

		
		System.out.println();
		System.out.println();

		
		/**
		 * TRIANGLE CLASS
		 */
		Triangle myTriangle1 = new Triangle(10, 5); //instantiates new triangle object
		Triangle myTriangle2 = new Triangle(8, 4); //instantiates new triangle object
		Triangle myTriangle3 = new Triangle(6, 3); //instantiates new triangle object

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
		
		System.out.println("--- Triangle 2 ---");
		System.out.println("Triangle Base: " + myTriangle2.getBase());
		System.out.println("Triangle Height: " + myTriangle2.getHeight());
		System.out.println("Area: " + myTriangle2.getArea());
		System.out.println("Perimeter : " + myTriangle2.getPerimeter());
		myTriangle2.setBase(26);
		myTriangle2.setHeight(91.2);
		System.out.println("Updated Base: " + myTriangle2.getBase());
		System.out.println("Updated Area: " + myTriangle2.getArea());
		System.out.println("Triangle Degrees: " + Triangle.getDegrees());
		Triangle.stateShape();

		System.out.println();
		
		System.out.println("--- Triangle 3 ---");
		System.out.println("Triangle Base: " + myTriangle3.getBase());
		System.out.println("Triangle Height: " + myTriangle3.getHeight());
		System.out.println("Area: " + myTriangle3.getArea());
		System.out.println("Perimeter : " + myTriangle3.getPerimeter());
		myTriangle3.setBase(13.8);
		myTriangle3.setHeight(12);
		System.out.println("Updated Base: " + myTriangle3.getBase());
		System.out.println("Updated Area: " + myTriangle3.getArea());
		System.out.println("Triangle Degrees: " + Triangle.getDegrees());
		Triangle.stateShape();

		
		System.out.println();
		System.out.println();

		
		/**
		 * CUBE CLASS
		 */
		Cube myCube1 = new Cube(12); //instantiates new cube object
		Cube myCube2 = new Cube(4.5); //instantiates new cube object
		Cube myCube3 = new Cube(8); //instantiates new cube object

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

		System.out.println("--- Cube 2 ---");
		System.out.println("Cube Side Length: " + myCube2.getSideLength());
		System.out.println("Cube Face: " + myCube2.getFace());
		System.out.println("Cube Perimeter: " + myCube2.getPerimeter());
		System.out.println("Cube Surface Area: " + myCube2.getSurfaceArea());
		System.out.println("Cube Volume: " + myCube2.getVolume());
		System.out.println("Cube Diagonal: " + myCube2.getDiagonal());
		myCube2.setSideLength(42);
		System.out.println("Updated Side Length: " + myCube2.getSideLength());
		System.out.println("Updated Face: " + myCube2.getFace());
		System.out.println("Updated Perimeter: " + myCube2.getPerimeter());
		System.out.println("Updated Surface Area: " + myCube2.getSurfaceArea());
		System.out.println("Updated Volume: " + myCube2.getVolume());
		System.out.println("Updated Diagonal: " + myCube2.getDiagonal());
		System.out.println("Cube Degrees: " + Cube.getDegrees());
		Cube.stateShape();
		
		System.out.println("--- Cube 3 ---");
		System.out.println("Cube Side Length: " + myCube3.getSideLength());
		System.out.println("Cube Face: " + myCube3.getFace());
		System.out.println("Cube Perimeter: " + myCube3.getPerimeter());
		System.out.println("Cube Surface Area: " + myCube3.getSurfaceArea());
		System.out.println("Cube Volume: " + myCube3.getVolume());
		System.out.println("Cube Diagonal: " + myCube3.getDiagonal());
		myCube3.setSideLength(37);
		System.out.println("Updated Side Length: " + myCube3.getSideLength());
		System.out.println("Updated Face: " + myCube3.getFace());
		System.out.println("Updated Perimeter: " + myCube3.getPerimeter());
		System.out.println("Updated Surface Area: " + myCube3.getSurfaceArea());
		System.out.println("Updated Volume: " + myCube3.getVolume());
		System.out.println("Updated Diagonal: " + myCube3.getDiagonal());
		System.out.println("Cube Degrees: " + Cube.getDegrees());
		Cube.stateShape();

		
		System.out.println();
		System.out.println();

		
		/**
		 * SPHERE CLASS
		 */
		Sphere mySphere1 = new Sphere(14.0); //instantiates new sphere object
		Sphere mySphere2 = new Sphere(35.0); //instantiates new sphere object
		Sphere mySphere3 = new Sphere(20.3); //instantiates  new sphere object
		
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
		
		System.out.println("--- Sphere 2 ---");
		System.out.println("Sphere Radius: " + mySphere2.getRadius());
		System.out.println("Circumference: " + mySphere2.getCircumference());
		System.out.println("Surface Area: " + mySphere2.getArea());
		System.out.println("Volume: " + mySphere2.getVolume());
		mySphere2.setRadius(21.0);
		System.out.println("Updated Radius: " + mySphere2.getRadius());
		System.out.println("Updated Circumference: " + mySphere2.getCircumference());
		System.out.println("Updated Area: " + mySphere2.getArea());
		System.out.println("Updated Volume: " + mySphere2.getVolume());
		System.out.println("Sphere Degrees: " + Sphere.getDegrees() + " degrees");
		Sphere.stateShape();

		System.out.println();
		
		System.out.println("--- Sphere 3 ---");
		System.out.println("Sphere Radius: " + mySphere3.getRadius());
		System.out.println("Circumference: " + mySphere3.getCircumference());
		System.out.println("Surface Area: " + mySphere3.getArea());
		System.out.println("Volume: " + mySphere3.getVolume());
		mySphere3.setRadius(49.0);
		System.out.println("Updated Radius: " + mySphere3.getRadius());
		System.out.println("Updated Circumference: " + mySphere3.getCircumference());
		System.out.println("Updated Area: " + mySphere3.getArea());
		System.out.println("Updated Volume: " + mySphere3.getVolume());
		System.out.println("Sphere Degrees: " + Sphere.getDegrees() + " degrees");
		Sphere.stateShape();

		
		System.out.println();
		System.out.println();

		
		/**
		 * CYLINDER CLASS
		 */
		Cylinder myCylinder1 = new Cylinder(14.0, 12.0); //instantiates new cylinder object
		Cylinder myCylinder2 = new Cylinder(20.0, 20.0); //instantiates new cylinder object
		Cylinder myCylinder3 = new Cylinder(13, 10); //instantiates new cylinder object
		
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
		
		System.out.println("--- Cylinder 2 ---");
		System.out.println("Cylinder Radius: " + myCylinder2.getRadius());
		System.out.println("Cylinder Height: " + myCylinder2.getHeight());
		System.out.println("Circumference: " + myCylinder2.getCircumference());
		System.out.println("Base Area: " + myCylinder2.getArea());
		System.out.println("Volume: " + myCylinder2.getVolume());
		System.out.println("Surface Area: " + myCylinder2.getSurfaceArea());
		myCylinder2.setRadius(63.0);
		myCylinder2.setHeight(28.0);
		System.out.println("Updated Radius: " + myCylinder2.getRadius());
		System.out.println("Updated Height: " + myCylinder2.getHeight());
		System.out.println("Updated Circumference: " + myCylinder2.getCircumference());
		System.out.println("Updated Area: " + myCylinder2.getArea());
		System.out.println("Updated Volume: " + myCylinder2.getVolume());
		System.out.println("Updated Surface Area: " + myCylinder2.getSurfaceArea());
		System.out.println("Cylinder Degrees: " + Cylinder.getDegrees() + " degrees");
		Cylinder.stateShape();

		System.out.println();
		
		System.out.println("--- Cylinder 3 ---");
		System.out.println("Cylinder Radius: " + myCylinder3.getRadius());
		System.out.println("Cylinder Height: " + myCylinder3.getHeight());
		System.out.println("Circumference: " + myCylinder3.getCircumference());
		System.out.println("Base Area: " + myCylinder3.getArea());
		System.out.println("Volume: " + myCylinder3.getVolume());
		System.out.println("Surface Area: " + myCylinder3.getSurfaceArea());
		myCylinder3.setRadius(43.0);
		myCylinder3.setHeight(29.0);
		System.out.println("Updated Radius: " + myCylinder3.getRadius());
		System.out.println("Updated Height: " + myCylinder3.getHeight());
		System.out.println("Updated Circumference: " + myCylinder3.getCircumference());
		System.out.println("Updated Area: " + myCylinder3.getArea());
		System.out.println("Updated Volume: " + myCylinder3.getVolume());
		System.out.println("Updated Surface Area: " + myCylinder3.getSurfaceArea());
		System.out.println("Cylinder Degrees: " + Cylinder.getDegrees() + " degrees");
		Cylinder.stateShape();
		
		System.out.println();
		System.out.println();

		
		/*
		 * PRISM CLASS
		 */
		Prism myPrism1 = new Prism(14.0, 12.0, 10); //instantiates new prism object
		Prism myPrism2 = new Prism(20.0, 20.0, 20); //instantiates new prism object
		Prism myPrism3 = new Prism(13, 10, 7); //instantiates new prism object
		
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

		System.out.println();
		
		System.out.println("--- Prism 2 ---");
		System.out.println("Prism Length: " + myPrism2.getLength());
		System.out.println("Prism Width: " + myPrism2.getWidth());
		System.out.println("Prism Height: " + myPrism2.getHeight());
		System.out.println("Prism Area: " + myPrism2.getArea());
		System.out.println("Prism Perimeter: " + myPrism2.getPerimeter());
		System.out.println("Prism Volume: " + myPrism2.getVolume());
		System.out.println("Prism Surface Area: " + myPrism2.getSurfaceArea());
		myPrism2.setLength(63.0);
		myPrism2.setWidth(54.0);
		myPrism2.setHeight(4.0);
		System.out.println("Updated Length: " + myPrism2.getLength());
		System.out.println("Updated Width: " + myPrism2.getWidth());
		System.out.println("Updated Height: " + myPrism2.getHeight());
		System.out.println("Updated Area: " + myPrism2.getArea());
		System.out.println("Updated Perimeter: " + myPrism2.getPerimeter());
		System.out.println("Updated Volume: " + myPrism2.getVolume());
		System.out.println("Updated Surface Area: " + myPrism2.getSurfaceArea());
		Prism.stateShape();

		System.out.println();

		System.out.println("--- Prism 3 ---");
		System.out.println("Prism Length: " + myPrism3.getLength());
		System.out.println("Prism Width: " + myPrism3.getWidth());
		System.out.println("Prism Height: " + myPrism3.getHeight());
		System.out.println("Prism Area: " + myPrism3.getArea());
		System.out.println("Prism Perimeter: " + myPrism3.getPerimeter());
		System.out.println("Prism Volume: " + myPrism3.getVolume());
		System.out.println("Prism Surface Area: " + myPrism3.getSurfaceArea());
		myPrism3.setLength(8.0);
		myPrism3.setWidth(43.0);
		myPrism3.setHeight(14.0);
		System.out.println("Updated Length: " + myPrism3.getLength());
		System.out.println("Updated Width: " + myPrism3.getWidth());
		System.out.println("Updated Height: " + myPrism3.getHeight());
		System.out.println("Updated Area: " + myPrism3.getArea());
		System.out.println("Updated Perimeter: " + myPrism3.getPerimeter());
		System.out.println("Updated Volume: " + myPrism3.getVolume());
		System.out.println("Updated Surface Area: " + myPrism3.getSurfaceArea());
		Prism.stateShape();
	}
}
