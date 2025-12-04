
/*
 * Create a class with a main method. Inside the class, create the following methods:

1. Create a method countLetters() that is passed a String and a char and returns how many times
 that passed char shows up in the passed String. Examples:

countLetters( "abqcdqefghqqijk" , q ) -----returns----> 4

countLetters ( "aaabaabaab" , b ) ----returns---> 3

2. Create a method getFactorial() that is passed an int and returns the factorial of that int 
(a factorial is a number multiplied by each number before it. For example, 5! = 5 x 4 x 3 x 2 x 1)

Examples:

getFactorial ( 5 ) ----returns---> 120

3. Create a method getIfRepeats() that will return true if the passed String has two of the same
 letter next to each other, and returns false if not.

Examples:

printIfRepeats ( "abcde" ) ---returns---> false

printIfRepeats ( "abcce" ) ---returns---> true
 */

public class loopsIntro {

	public static void main(String[] args) {
		System.out.println(countLetters("abracadabrabbbbbb", 'b'));
		getFactorial(10);
		System.out.println(getIfRepeats("jqjerehqerhhiq"));
	}
	
	/*
	 * Counts and returns the amount of a chosen char in a word
	 */
	public static int countLetters(String str, char something) {
	   int count = 0;
		
	   
		for (int num = 0; num < str.length(); num++) {
	        char word = str.charAt(num); //
	       
	        if (word == something) { //if char is equal to the chosen word, add one.
	            count++;
	        }
	    }
	    return count;
	}

	/*
	 * Returns the total of a factorial number
	 */
	public static int getFactorial(int num) {	
			int sum = 1;
			
			while (num > 0) { //While num is greater than 0
				sum *= num; //repeatedly multiplies to sum
				num--; //decreased num by one each time, until num reaches 0
			}
			System.out.println(sum);
			return sum;		
	}
	
	/*
	 * Checks if the passed string has two of the same letters next to each other and returns false if not.
	 */
	public static boolean getIfRepeats(String str) {
	    for (int num = 0; num < str.length() - 1; num++) {
	        char word = str.charAt(num); //

	        if (word == str.charAt(num + 1)) { //if word is equal to the previous char... return true
	            return true;
	        }
	    }
	    return false; //if not, return false
	}

}
