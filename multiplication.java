
/*
 * This class simulates multiplication through repeated addition or subtraction for negative numbers/
 */

public class multiply {

	public static void main(String[] args) {
	
		//calls the method
		multiplicity(0, 0, 0);
		multiplicity(6, 6, 0);
		multiplicity(-6, 5, 0);
		multiplicity(-3, -5, 0);

	}
		
		public static int multiplicity(int a, int b, int sum) {	
		//If b is greater than 0:
			// repeatedly adds a to sum
			// decreased b by one each time, until b reaches 0
		if (b > 0) {
			while (b > 0) {
				sum += a;
				b--;
				System.out.println(sum);
			}
		}
		//If b is less than 0:
			// repeatedly minuses a to sum
			// increases b by one each time, until b reaches 0
		else if (b < 0) {
			while (b < 0) {
				sum -= a;
				b++;
				System.out.println(sum);
			}
		}
		//if b is equal to 0, just prints out 0.
		else {
			System.out.println("0");		
		}
		return sum;		
	}

}
