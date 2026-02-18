/*
 * Create methods that are passed an array of ints and 
 * accomplish the following tasks:

1. Return the smallest number in the array. 

2. Return the index of the smallest number in the array. 

3. Return the average of all numbers in the array. 

4. Return true if all numbers in the array are even, and 
return false otherwise.

5. If the array ever has two consecutive 5's, change them 
to 0's. (For example, passing {4, 5, 5, 2, 1} changes the 
array to {4, 0, 0, 2, 1} ).

6. Return true if any number shows up three times in a row,
 and return false otherwise. 

7. Pass an array of ints and an int to be searched for. Return
 how many times that int shows up in the array. (For example, 
 passing ( {4, 5, 5, 2, 1} , 5) returns 2 because 5 shows up twice)

8. Alter an array so that is the backwards version of the array
 initially passed (for example, passing {4, 5, 5, 2, 1} changes
  the array to {1, 2, 5, 5, 4})

9. Shift all elements in an array to the right. (For example, 
passing {4, 5, 5, 2, 1} changes the array to {1, 4, 5, 5, 2})

10. Use either selection sort or insertion sort to sort an array.
 (For example, passing {4, 5, 5, 2, 1} changes the array to {1, 2, 4, 5, 5})
 */

public class Algorithm_Project {
	
	
	public static void main(String[] args) {
		
		int[] nums = {1, 9, 4, 2, 7, 5, 0, 8, 6, 3};
		int[] nums5 = {4, 5, 5, 2, 1};
		int[] nums6 = {1, 2, 2, 2, 6};
		int[] nums7 = {4, 5, 5, 2, 1};

		int smallest = returnSmallestNumber(nums);
		int index = returnSmallestNumberLoc(nums);
		double average = returnAverage(nums);
		boolean evenCheck = allEven(nums);
		int[] checkConsecutivesFives = consecutive5s(nums5);
		boolean threeCheck = threeInARow(nums6);
		int numCounter = countNum(nums7);
		int[] makeBackwards = backwardsArray(nums);
		int[] shiftRight = shiftRight(nums);
		int[] selectionSort = selectionSort(nums);

		
		System.out.println("Smallest value: " + smallest);
		System.out.println("Index of smallest value: " + index);
		System.out.println("Average of the array: " + average);
		System.out.println("All even = " + evenCheck);	
		System.out.print("Altered array: ");		
		for (int num = 0; num < nums5.length; num++) {
			System.out.print(checkConsecutivesFives[num] + " ");
		}
		System.out.println();
		System.out.println("Three in a row = " + threeCheck);
		System.out.println("The amount of 5's in the array: " + numCounter);
		System.out.print("Reversed Array: ");
		for (int num = 0; num < nums.length; num++) {
			System.out.print(makeBackwards[num] + " ");
		}
		System.out.println();
		System.out.print("Shifted Array: ");
		for (int num = 0; num < nums.length; num++) {
			System.out.print(shiftRight[num] + " ");
		}
		System.out.println();
		System.out.print("Sorted Array: ");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(selectionSort[i] + " ");
			}
		
	}
	
	/*
	 * Returns the smallest value in the array
	 */
	public static int returnSmallestNumber(int nums[]) {
		
		int min = nums[0]; // Assumes that the first element is the smallest
		
		for (int elements : nums) {
			if (min > nums[elements])  //compares current min to current element value
			{
				min = nums[elements]; // updates min if smaller value is found
			}
		}
		
		return min; // returns smallest number
	}
	
	/*
	 * Returns the index of the smallest value in the array
	 */
	public static int returnSmallestNumberLoc(int nums[]) {	
		
		int min = nums[0]; //assumes first element is the smallest
		int minLoc = 0; //stores index of smallest value
		
		for (int elements : nums) {
			if (min > nums[elements]) //if smaller value is found
			{
				min = nums[elements]; //updates value
				minLoc = elements; //updates index
			}
		}
		
		return minLoc; //returns index of smallest value
	}
	
	/*
	 * Returns the average of all numbers in the array
	 */
	public static double returnAverage(int nums[]) {
		
		double value = 0; //stores total sum
		
		//adds each element to total
		for (int elements : nums) {
			value += nums[elements];
		}
		
		//divides total by total number of elements
		double average = value / nums.length;
		
		return average; //returns average
	}	
	
	/*
	 * Returns true if all numbers are even, false otherwise
	 */
	public static boolean allEven(int nums[]) {
		
		for (int elements : nums) {
			if (nums[elements] % 2 != 0) 
			{
				return false;
			}
		}
		return true;
	}
	
	// Changes consecutive 5s to 0s
	public static int[] consecutive5s(int nums[]) {	
		
		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i] == 5) 
			{
				if (nums[i] == nums[i+1]) 
				{
					nums[i] = 0; //Changes first 5 to 0
					nums[i + 1] = 0; //Changes second 5 to 0
				}
			}
		}
		
		return nums; // returns modified array
	}
	
	/*
	 *  Returns true if any number appears three times in a row
	 */
	public static boolean threeInARow(int nums[]) {
		
		for (int i = 0; i < nums.length-2; i++) {
			if (nums[i] == nums[i+1] && nums[i+1] == nums[i+2]) 
			{
				return true;
			}
		}
		
		return false;
	}
	
	/*
	 * Counts and returns the amount of times the number
	 *  5 appears in the array
	 */
	public static int countNum(int nums[]) {
		
		int count = 0; //stores how many time value appears
		int value = 5; //target 
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == value) 
			{
				count++;
			}
		}
		
		return count; //returns total occurrences
	}
	
	/*
	 * Returns a new array that is the reverse of the original
	 */
	public static int[] backwardsArray(int nums[]) {
		
		int[] result = new int[nums.length];
		
		for (int i = 0; i < nums.length; i++) {
			result[i] = nums[nums.length-1 - i];
		}
		
		return result; //returns reversed array
	}
	
	/*
	 * Returns a new array where all elements is shifted once
	 *  towards the right
	 */
	public static int[] shiftRight(int nums[]) {
		
		int[] result = new int[nums.length];
		
		for (int i = 0; i < nums.length-1; i++) {
			result[i+1] = nums[i];
		}
		result[0] = nums[nums.length-1];
		
		return result; // returns shifted array
	}
	
	/*
	 * Sorts the array using Selection Sort
	 */
	public static int[] selectionSort(int[] nums) {
		//loops through each position in array
		for (int i = 0; i < nums.length; i++) {
			int min = nums[i];
			int minLoc = i;
			//finds smallest value in unsorted array
			for (int j = i; j < nums.length; j++) {
				if (min > nums[j]) 
				{
					min = nums[j];
					minLoc = j;
				}
			}	
			//Swaps smallest value with current position
			int temp = nums[minLoc];
			nums[minLoc] = nums[i];
			nums[i] = temp;
		}
		return nums; // returns sorted array
	}
	
}
