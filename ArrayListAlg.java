/*
 * 1. Create a method checkFor4() that is passed an ArrayList and returns the index of the first 4 
 * if that array has a 4 and -1 if that array has no 4's. 
 * 
 * v2. Create a method ridAllFives() that is passed an ArrayList nums and altars that
 * ArrayList without returning anything. The ArrayList will have any 5’s deleted from nums.
 * Ex: 
 * subtract5FromAll4( {5, 5, 0, 8, 5, 20}  )   -------turns nums into----->     {0, 8, 20}
 * 
 * 3. Create a method bubbleSort() that is passed an ArrayList and sorts it using bubblesort.
 */

import java.util.ArrayList;

public class ArrayListAlgs {
	
	public static void main(String[] args) {
		ArrayList<Integer> intArrList = new ArrayList<Integer>();
		intArrList.add(5);
		intArrList.add(5);
		intArrList.add(0);
		intArrList.add(8);
		intArrList.add(5);
		intArrList.add(20);
		
		System.out.println(checkFor4(intArrList));
		ridAllFives(intArrList);
		bubbleSort(intArrList);
	}
	//1
	/*
	 * Traverses the entire array until it reaches an element with the value of 4
	 * If there are no elements with the value of 4, return -1
	 */
	public static int checkFor4(ArrayList<Integer> intArrList) {
		for (int i = 0; i < intArrList.size()-1; i++) {
			if (intArrList.get(i) == 4) 
			{
				return i;
			}
		}
		return -1;
	}
	
	//2
	/*
	 * Traverses the entire array and when it reaches an element with the value of 5
	 * it will delete it from the ArrayList.
	 */
	public static void ridAllFives(ArrayList<Integer> intArrList) {
		System.out.println("Before: " + intArrList);
		for (int i = 0; i < intArrList.size()-1; i++) {
			if (intArrList.get(i) == 5) 
			{
				intArrList.remove(i);
			}
		}
		System.out.println("After: " + intArrList);
	}
	
	//3
	public static void bubbleSort(ArrayList<Integer> intArrList) {
		System.out.println("Before: " + intArrList);
		for (Integer item: intArrList) {
			for (int i = 0; i < intArrList.size()-1; i++) {
				//Checks and swaps each element if current element is bigger than the next
				if (intArrList.get(i) > intArrList.get(i+1)) {
					int temp = intArrList.get(i);
					intArrList.set(i, intArrList.get(i + 1));
					intArrList.set(i+1, temp);
				}
			}
		}
		System.out.println("After: " + intArrList);
	}
	
}
