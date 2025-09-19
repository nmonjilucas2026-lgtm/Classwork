/*
 * Calls constructor to generate a new
 * Circle object with a radius of 3.0
 */
public class ShapesMain {

	public static void main(String[] args) 
	{
		Circle myCirc1 = new Circle(3.0); //instantiates my circ1
		Circle myCirc2 = new Circle(5.0); //instantiates my circ2
		Circle myCirc3 = new Circle(6.0); //instantiates my circ3
		
		System.out.println(myCirc1.getRadius());
		System.out.println(myCirc1.getCircumference());
		System.out.println(myCirc1.getArea());
		myCirc1.setRadius(7.0);
		System.out.println(myCirc1.getRadius());
		System.out.println(myCirc1.getCircumference());
		System.out.println(myCirc1.getArea());
		System.out.println(Circle.getDegrees());
		Circle.stateShape();
		
	}	
}
