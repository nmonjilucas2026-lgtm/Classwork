/**
 * 1. In the main method, instantiate a Scanner object and then instantiate a String object equal to a scanned input. 
 * Be sure to close the scanner at the bottom of your main method before testing any code. 

2. Make and test a void method printSecondAndLastLetter that will print the second character and last character in the passed String.  

3. Make and test a method findTheEthat returns the index of the first 'e' character in a passed String. 

4. Make and test a method getLength that returns the amount of characters (the length) of a passed String. 

5. Make and test a void method printFirstAndLastThree that is passed a string and prints the first three and last three 
characters in a passed String. 
 */
import java.util.Scanner;

public class StringIntro {

	public static void main(String[] args) {
		
		Scanner myReader = new Scanner(System.in);
		String myName = new String(myReader.nextLine());
		
		printSecondAndLast(myName); //prints second and last letter of myName
		System.out.println(findTheE(myName)); //prints the first e of myName
		System.out.println(getLength(myName)); //prints the total number of characters of myName
		printFirstAndLastThree(myName); //prints the first three and the last three letters of myName
		//Finalizes Scanner
		myReader.close();
		
	}
	
	/*
	 * Prints out the second character and last character in a passed string when called
	 * I looked online about the "" because I was confused why it only printed ints.
	 */
		public static void printSecondAndLast(String str) {
		
		 System.out.println("" + str.charAt(1) + str.charAt(str.length()-1));		
		
		}
		
		/*
		 * Returns the location of the first e in a String as an integer
		 * Wasn't too hard to figure out, just didn't know I had to use str instead
		 */
		public static int findTheE(String str) {
			int eLocation = str.indexOf('e');
		    return eLocation;
		}
		
		/*
		 * Returns the length of the string as a integer
		 * I didn't really know what I had to input, so I had to look online.
		 */
		public static int getLength(String str) {
			return str.length();
		}
		
		/*
		 * Prints out the first three and last three letters in a String
		 * I just copied and pasted the str.charAt() and str.charAt(str.length()));
		 */
		public static void printFirstAndLastThree(String str) {
			System.out.println("" + str.charAt(0) + str.charAt(1) + str.charAt(2) +
		    str.charAt(str.length()-3) + str.charAt(str.length()-2) + str.charAt(str.length()-1));
		}

	}
	
