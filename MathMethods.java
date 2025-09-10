/**
 
 * Before calling any methods, initialize at least one positive double variable and one negative double variable. 
 Also do this for ints. Call them posInt, negInt, posDouble, and negDouble. 
 
1. Use the abs() method to print out the absolute value of all your variables. 
In a comment, say whether or not this method is overloaded and how you know your answer. 

2. Use the pow() method in order to find the result of the positive int to the power of the negative int, 
and to find the negative int to the power of the positive one. In a comment, say whether or not this method 
is overloaded and how you know your answer. 

3. Use the sqrt() method to find the square root of each variable you declared. 
In a comment, answer whether or not you expected any errors and why you think there weren't any. 

4. Use the random() method to generate a random number from 11 to 20. 
Try to accomplish this without the use of any online aid and only by looking at the Math class' documentation. 
 */

public class MathMethods {

	public static void main(String[] args) {
	//Initialized variables	
	int posInt = 1;
	int negInt = -1;
	double posDouble = 1.0;
	double negDouble = -1.0;
		/**
		 * This method is overloaded because Math defines multiple versions of abs()
		 * with different types of parameters. 
		 */
		System.out.println(Math.abs(posInt));
		System.out.println(Math.abs(negInt));
		System.out.println(Math.abs(posDouble));
		System.out.println(Math.abs(negDouble));
		
		System.out.println();
		
		/**
	 	*"If both arguments are integers, then the result is exactly equal to the mathematical result of raising 		
	 	*the first argument to the power of the second argument if that result can in fact be represented exactly
	 	*as a double value."
	 	*/
		System.out.println(Math.pow(posInt, negInt));
		System.out.println(Math.pow(negInt, posInt));
		System.out.println(Math.pow(posDouble, negDouble));
		System.out.println(Math.pow(negDouble, posDouble));
		/**
		 * This line fails because Math.pow() only accepts numeric values.
		 * System.out.print(Math.pow(negDouble, true));
     * Additionally, I don't believe it's overloaded since it converts the final number as a double.
		 */
		
		System.out.println();
		
		//Testing
		System.out.println(Math.sqrt(posInt));
		System.out.println(Math.sqrt(posDouble));
		//"If the argument is NaN or less than zero, then the result is NaN (Not a Number)."
		System.out.println(Math.sqrt(negInt)); 	//NaN
		System.out.println(Math.sqrt(negDouble));  //NaN
		/**
		 * I didn't expect any errors because algebraically speaking, a negative square root
		 * returns as a imaginary number. So naturally, I assumed the same would apply in the code in a way.
		 * Instead, Math.sqrt() returns NaN for negative numbers.
		 */
		
		System.out.println();
		
		/**
		 *Looking at the code, I saw that Math.random() gave a random double between 0.0 and 1.0. 
		 * I thought of multiplying the given double by 10 and adding 11, 
		 * this prevents it from being lower than 11 or higher than 21.
		 * Finally, I casted it as an int.
		 */
		System.out.println((int)(Math.random() * 10 + 11));

	}
}
