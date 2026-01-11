/*
 * Create a method called "buildMultTable( num )" that is passed an in num and prints out a 
 * multiplication table for all numbers with num rows and columns. (By the way, you should use
 *  the "\t" escape sequence while printing the numbers in each row to space them out with a tab.
 */

	public class NestedLoops {

	    public static void main(String[] args) {
	        buildMultTable(5);
	    }

	    public static void buildMultTable(int x) {
	        for (int number = 1; number <= x; number++) {
	            for (int num = 1; num <= x; num++) {
	                System.out.print(number * num + " ");
	            }
	            System.out.println();
	        }
	    }
	}
