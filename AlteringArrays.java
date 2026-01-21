/*
 * 1) Create a method subract5FromAll4() that is passed an array nums and returns a new array. 
 * The new array will consist of the values of nums, except that each element must be 5 less than
 *  its corresponding element in nums. 

Ex:  subtract5FromAll4( {5, 0, 8, 20}  )   -------returns----->     {0, -5, 3, 15}
 */



public class AlteringArraysProblem {
	
	public static void main(String[] args) {
		int[] nums = {5, 0, 8, 20};
		int[] newNums = subtract5FromAll4(nums);
	
		for (int i = 0; i < newNums.length; i++) {
			System.out.print((i + 1) + ". ");

				System.out.println(newNums[i]);
			}
		}
	
	
	public static int[] subtract5FromAll4(int[] nums) {
	    
	    // Creates a new array to store modified values
	    int[] result = new int[nums.length];

	    // Loops through each element of array
	    for (int i = 0; i < nums.length; i++) {
	        
	        // Subtract 5 from the current element
	        result[i] = nums[i] - 5;
	    }

	    // Returns the new values
	    return result;
	}

}


