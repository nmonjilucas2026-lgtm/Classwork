/*
 * Today you will be declaring variables that store an array of elements. 
 * Create code that accomplishes the following tasks and submit it via github:

1. Create an empty array that is meant to represent doubles. Name it doubArr.
Repeat this for arrays that represent ints, booleans, String objects, and Circle objects. 

2. Create an array of ints with the following represented values: 7, -12, 88, -88, 0, 5, 2000.

3. Create an array that represents 5 String objects with default values. Name the array fruitsArr. 
In the comment for this task, state what each element's default value is. State what the default 
value for ints, doubles, booleans, and any reference data type is as well. 

4. Change the 2nd element in fruitsArr to "Bapple" .

5. Change the last element in fruitsArr to "Zanana" . Accomplish this without typing the number "4"
 and instead accessing the array's length.

6. To verify you did number 4 correctly, print out the second element of fruitsArr.

7. Create a loop that one by one prints out each element in fruitsArr.
 */

public class ArraysIntro {

	public static void main(String[] args) {
		
	// Question 1: Empty Arrays for each data type
		double[] doubArr;
		int[] intArr;
		boolean[] booleanArr;
		String[] strArr;
		Circle[] circArr;
		
	// Question 2: Int Array that stores int values
		int integers[] = {7, -12, 88, -88, 0, 5, 2000};
	
	// Question 3: Array that represents th efive string objects with default values
		String fruitsArr[] = new String[4];
		fruitsArr[0] = "Apple";
		fruitsArr[1] = "Banana";
		fruitsArr[2] = "Cantaloupe";
		fruitsArr[3] = "Dragon Fruit";
	//Ints: 0, Doubles: 0.0, Booleans: False, Strings: False, Char: \u0000
		
	// Question 4: Changes the 2nd element in fruitsArr to "Bapple"
		fruitsArr[1] = "Bapple";
		
	// Question 5: Changes the last element in fruitsArr to "Zanana"
		fruitsArr[fruitsArr.length-1] = "Bapple";
	
	//Question 6: Prints out the second element of fruitsArr
		System.out.println(fruitsArr[1]);	
		
	//Question 7: For Loop that prints out each element in fruitsArr
		for (int i = 0; i < fruitsArr.length; i++) {
			System.out.print((i + 1) + ". ");

				System.out.println(fruitsArr[i]);
			}
		}
	}		
