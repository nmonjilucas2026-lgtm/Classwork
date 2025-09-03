public class Main {

    // Void Method to print out my name.
    public static void stateName() {
        System.out.println("My name is Ichiro.");
    }

    // Void Method to print out description of my eye color.
    public static void stateEyeColor() {
        System.out.println("My eye color is dark brown.");
    }

    // Void Method to print out what hairstyle I have.
    public static void stateHairStyle() {
        System.out.println("My hairstyle is short and wavey.");
    }

    // Void Method to print out the name of my best friend(s)
    public static void stateBestFriend() {
        System.out.println("I have a lot of bestfriends: Chase, Madison, Camryn, Avri, Nicholas, and Edison.");
    }

    // Void Method to print out my favorite food,
    public static void stateFavoriteFood() {
        System.out.println("Two of my favorite food are sushi and pasta.");
    }
    
    // Void Method to print out circle stats.
    public static void printCircleStats() {
//States the final value for PI.
 final double pi = 3.14;
//States radius
    double radius = 4.0; 
//Formula for Diameter
    double diameter = radius * 2;
//Formula for area of a circle 
    double area = ((radius * radius) * pi);
//Formula for circumference of a circle
    double circumference = (2.0*pi*radius);
//States the radius, diameter, area of a circle, and circumference of a circle. 
    System.out.println("Radius: " + radius);
    System.out.println("Diameter: " + diameter);
    System.out.println("Area of the Circle: " + area);
    System.out.println("Circumference of the Circle: " + circumference);
    }

// Void Method to print out sum, difference, product, quotient, and remainder.
public static void printMathStuffs(int num1, int num2) {
//Calculates the sum, difference, product, quotient, and remainder.
    int sum = num1 + num2;
    int difference = num1 - num2;
    int product = num1 * num2;
    int quotient = num1 / num2;
    int remainder = num1 % num2;
//States the sum, difference, product, quotient, and remainder.
    System.out.println("Sum: " + sum);
    System.out.println("Difference: " + difference);
    System.out.println("Product: " + product);
    System.out.println("Quotient: " + quotient);
    System.out.println("Remainder: " + remainder);
  
}
  
    // Calls the stated Void method
    public static void main(String[] args) {
        stateName();
        stateHairStyle();
        stateFavoriteFood();
        System.out.println();
        printCircleStats();
        System.out.println();
        printMathStuffs(5, 3);       
    }
}
