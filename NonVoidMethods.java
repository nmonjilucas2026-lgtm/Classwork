
/**
	 *1. Create a nonvoid method called giveName() that returns your name. 
	 *Repeat this task for giveEyeColor(), giveHairStyle(), giveBestFriend(), and giveFavoriteFood(). 
	 *Then, call giveName(), giveHairStyle, and giveFavoriteFood(). Use the calls to make a full print statement. 

2. Create a nonvoid method getCircleStats() that is passed a double (meant to represent a circle's radius) and calculates 
then returns the radius, diameter, circumference, and area of the circle. Call the method in a print statement or variable 
declaration in order to make a complete print statement of all the properties. 

3. Create nonvoid methods that are passed two ints and returns their sum, difference, product, quotient, and the remainder 
(using modulus) of the first number modulus the second number; all operations should be their own respective methods. 
Call them inside print statements to make sure they work. 
	 */

public class NonVoidMethodsIntro {

	   
	    // Calls the stated non-void method
	public static void main(String[] args) {
	        System.out.println(giveName());
	        System.out.println(giveHairStyle());
	        System.out.println(giveFavoriteFood());
	        System.out.println();
	        System.out.print(getCircleStats(5.0));
	        System.out.println();
	        System.out.println(getMathStuffs(2, 3));
	              
	    }
	    /**
	     * Non-Void Method to return my name as a String
	     */
	    public static String giveName() {
	        return "My name is Ichiro.";
	    }

	    /**
	     * Non-Void Method to return a description of my eye color as a String
	     */
	    public static String giveEyeColor() {
	        return "My eye color is dark brown.";
	    }

	    /**
	     * Non-Void Method to return a description of my hairstyle as a String
	     */
	    public static String giveHairStyle() {
	        return "My hairstyle is short and wavey.";
	    }

	    /**
	     * Non-Void Method to return the name of my best friend(s) as a String
	     */
	    public static String giveBestFriend() {
	        return "I have a lot of bestfriends: Chase, Madison, Camryn, Avri, Nicholas, and Edison.";
	    }

	    /**
	     * Non-Void Method to return my favorite food(s) as a String
	     */
	    public static String giveFavoriteFood() {
	        return "Two of my favorite food are sushi and pasta.";
	    }
	   
	    /**
	     * Non-Void Method to return the circle statistics as a String
	     */
	    public static String getCircleStats(double radius) {
	    	// States the final value for PI
	    	final double pi = 3.14;

	    	// Formula for Diameter
	    	double diameter = radius * 2;

	    	// Formula for Area of a circle
	    	double area = (radius * radius) * pi;

	    	// Formula for Circumference of a circle
	    	double circumference = 2.0 * pi * radius;

	    	return "Radius: " + radius + ", " +
	    	"Diameter: " + diameter + ", " +
	    	"Area: " + area + ", " +
	    	"Circumference: " + circumference + ".";
	    }
	    /**
	     * Non-Void Method to return the mathStuffs as a String
	     */
	    	public static String getMathStuffs(int num1, int num2) {
	    		//Calculates the sum, difference, product, quotient, and remainder.
	    		    int sum = num1 + num2;
	    		    int difference = num1 - num2;
	    		    int product = num1 * num2;
	    		    int quotient = num1 / num2;
	    		    int remainder = num1 % num2;
	    		//States the sum, difference, product, quotient, and remainder.
	    		    return "Sum: " + sum + ", " +
	    	    	"Difference: " + difference + ", " +
	    	    	"Product: " + product + ", " +
	    	    	"Quotient: " + quotient + ", " + "Remainder: " + remainder;
	    	}
}
