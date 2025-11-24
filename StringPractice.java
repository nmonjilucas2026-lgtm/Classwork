/*
 * 1. Create a while loop that prompts the user to input text into the console, and then the console prints
 *  out what they inputted and a number representing how many times the loop has run. Unless the player types "stop" 
 *  in which case the loop should end. (For those of you that know the break keyword, you are forbidden from using it). 

2. Use your previously created shapes classes to complete the following task: Choose one of the shape objects you created, 
for example Circle1. Make a for loop that will run 5 times. Each time, the user should be prompted to input a double. Then,
 the double should be added to one of the object's attributes. After the loop is done, print the shape's original attribute value 
 and its final attribute value. 

( instead of .next() or .nextLine(), use nextDouble() )

Example (with assumption that a Circle object has been instantiated with a radius of 4.0):

Input a number: 2.1

Input a number: 3.2

Input a number: 5.1

Input a number: 8.3

Input a number: 3.0

Your shape started with a radius of 4.0 and ended with a radius of 25.7.
 */


import java.util.Scanner; 

public class StringsPractice {

    static Scanner inputReader = new Scanner(System.in);

    public static void main(String[] args) {

        boolean nope = false;
        int count = 0;

        //While nope is false, it runs an if statement until user stops the loop
        while (!nope) {

            String playerAnswer = inputReader.nextLine();
            //if the player answer isn't "stop", it'll continually count how many times the player wrote
            //and will return what they wrote
            if (!playerAnswer.equalsIgnoreCase("stop")) {
                count++;
                System.out.println("Typed: " + playerAnswer);
                System.out.println("Loop count: " + count);
            } 
            //if the player is "stop", it'll return how much times the player wrote and it'll change nope
            //to true--closing the while loop
            else {
                System.out.println("Final count: " + count);
                nope = true; 
            }
        }
        
        //instantiates a circle class object
        Circle myCirc3 = new Circle(6.0);
        //starting radius is equal to circle class object's radius
        double startingRadius = myCirc3.getRadius();
        System.out.println("How much do you want to add to the current radius: " + myCirc3.getRadius() + "Only use numbers... Exmp: 1, 2, 3");
        //for loop that reads the users numbers and adds them to myCirc3 radius
        for (int num = 0; num < 5; num++) {
        	
        	//reads the user's next numbers and adds them to myCirc3
			double playerDouble = inputReader.nextDouble(); 
			myCirc3.setRadius(myCirc3.getRadius() + playerDouble);
        }	
        //returns final radius
        System.out.println("Your shape starts with a radius of " + startingRadius + ", "
        		+ "and ended with a radius of " + myCirc3.getRadius());
    }
}
