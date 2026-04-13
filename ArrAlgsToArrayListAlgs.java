/*
 * Create methods that are passed an ArrayList of Integers and accomplish the following tasks:

1. Return the smallest number in the ArrayList. 

2. Return the index of the smallest number in the ArrayList. 

3. Return the average of all numbers in the ArrayList. 

4. Return true if all numbers in the ArrayList are even, and return false otherwise.

5. If the ArrayList ever has two consecutive 5's, change them to 0's. (For example, passing {4, 5, 5, 2, 1} changes the array to {4, 0, 0, 2, 1} ).

6. Return true if any number shows up three times in a row, and return false otherwise. 

7. Pass an ArrayList of Integers and a value to be searched for. Return how many times that int shows up in the ArrayList. (For example, passing ( {4, 5, 5, 2, 1} , 5) returns 2 because 5 shows up twice)

8. Alter an ArrayList so that is the backwards version of the ArrayList initially passed (for example, passing {4, 5, 5, 2, 1} changes the array to {1, 2, 5, 5, 4})

9. Shift all elements in an ArrayList to the right. (For example, passing {4, 5, 5, 2, 1} changes the array to {1, 4, 5, 5, 2})

10. Use either selection sort or insertion sort to sort an ArrayList. (For example, passing {4, 5, 5, 2, 1} changes the array to {1, 2, 4, 5, 5})
 */

import java.util.ArrayList;

public class ArrAlgsProject {

	public static void main(String[] args) {
		ArrayList<Integer> intArrList = new ArrayList<Integer>();
		intArrList.add(5);
		intArrList.add(5);
		intArrList.add(0);
		intArrList.add(8);
		intArrList.add(5);
		intArrList.add(20);
		
		System.out.println(returnSmallestNumber(intArrList));
		System.out.println(returnSmallestNumberLoc(intArrList));
		System.out.println(returnAverage(intArrList));
		System.out.println(allEven(intArrList));
		consecutive5s(intArrList);
		System.out.println(threeInARow(intArrList));
		System.out.println(countNum(intArrList));
		backwardsArray(intArrList);
		shiftRight(intArrList);
		selectionSort(intArrList);
	}
	/*
	 * Returns the smallest value in the array
	 */
	public static int returnSmallestNumber(ArrayList<Integer> nums) {
		int min = nums.get(0); // Assumes that the first element is the smallest
		
		for (int i = 1; i < nums.size(); i++) {
			if (min > nums.get(i)) 
			{
				min = nums.get(i);
			}
		}
		return min; // returns smallest number
	}
	
	/*
	 * Returns the index of the smallest value in the array
	 */
	public static int returnSmallestNumberLoc(ArrayList<Integer> nums) {	
		int min = nums.get(0); //assumes first element is the smallest
		int minLoc = 0; //stores index of smallest value
		
		for (int i = 1; i < nums.size(); i++) {
			if (min > nums.get(i)) 
			{
				min = nums.get(i);
				minLoc = i;
			}
		}
		return minLoc; //returns index of smallest value
	}
	
	/*
	 * Returns the average of all numbers in the array
	 */
	public static double returnAverage(ArrayList<Integer> nums) {
		double value = 0; //stores total sum
		
		//adds each element to total
		for (Integer item: nums) {
			value += item;
		}
		
		//divides total by total number of elements
		double average = value / nums.size();
		
		return average; //returns average
	}	
	
	/*
	 * Returns true if all numbers are even, false otherwise
	 */
	public static boolean allEven(ArrayList<Integer> nums) {
		for (Integer item : nums) {
			if (item % 2 != 0) 
			{
				return false;
			}
		}
		return true;
	}
	
	// Changes consecutive 5s to 0s
	public static void consecutive5s(ArrayList<Integer> nums) {		
		System.out.println("Before: " + nums);
		for (int i = 0; i < nums.size()-1; i++) {
			if (nums.get(i).equals(5)) 
			{
				if (nums.get(i).equals(nums.get(i+1)))
				{
					nums.set(i, 0); //Changes first 5 to 0
					nums.set(i + 1, 0); //Changes second 5 to 0
				}
			}
		}
		System.out.println("After: " + nums);
	}
	
	/*
	 *  Returns true if any number appears three times in a row
	 */
	public static boolean threeInARow(ArrayList<Integer> nums) {
		for (int i = 0; i < nums.size()-2; i++) {
			if (nums.get(i).equals(nums.get(i+1)) && nums.get(i+1).equals(nums.get(i+2)))
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
	public static int countNum(ArrayList<Integer> nums) {	
		int count = 0; //stores how many time value appears
		int value = 5; //target 
		
		for (int i = 0; i < nums.size(); i++) {
			if (nums.get(i) == value) 
			{
				count++;
			}
		}
		return count; //returns total occurrences
	}
	
	/*
	 * Returns a new array that is the reverse of the original
	 */
	public static void backwardsArray(ArrayList<Integer> nums) {
		
		ArrayList<Integer> result = new ArrayList<Integer>();

		for (int i = 0; i < nums.size(); i++) {
			result.add(nums.get(nums.size() - 1 - i));
		}
		System.out.println(result);
	}
	
	/*
	 * Returns a new array where all elements is shifted once
	 *  towards the right
	 */
	public static void shiftRight(ArrayList<Integer> nums) {
		System.out.println("Before Shift: " + nums);
		int last = nums.get(nums.size()-1);
		nums.remove(nums.size()-1);
		nums.add(0, last);
		// returns shifted array
		System.out.println("After Shift: " + nums);
	}
	
	/*
	 * Sorts the array using Selection Sort
	 */
	public static void selectionSort(ArrayList<Integer> nums) {
		
		//loops through each position in array
		for (int i = 0; i < nums.size(); i++) {
			int min = nums.get(i);
			int minLoc = i;
			//finds smallest value in unsorted array
			for (int j = i; j < nums.size(); j++) {
				if (min > nums.get(j)) 
				{
					min = nums.get(j);
					minLoc = j;
				}
			}	
			//Swaps smallest value with current position
			int temp = nums.get(minLoc);
			nums.set(minLoc, nums.get(i));
			nums.set(i, temp);
		}
		System.out.println(nums);
	}
}
