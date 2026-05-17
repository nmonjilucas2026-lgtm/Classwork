import java.util.Arrays;

public class RecursiveAlgorithms {

	public static void main(String[] args) {

		int[] arr = {7, 2, 9, 1, 5, 3};

		System.out.println("Original Array: " + Arrays.toString(arr));

		// Test merge sort
		mergeSort(arr);
		System.out.println("Sorted Array: " + Arrays.toString(arr));

		// Test binary search
		int target = 5;

		int result = binarySearch(arr, target, 0, arr.length - 1);

		System.out.println("Index of " + target + ": " + result);
	}
	
	/*
	 * Merge Sort
	 * Sorts the array using divide-and-conquer.
	 */
	public static void mergeSort(int[] arr) {

		// array of size 1 is returned
		if (arr.length <= 1) {
			return;
		}

		// Split array into two halves
		int mid = arr.length / 2;

		//.copyOfRange creates a new array from a section of an existing array
		int[] left = Arrays.copyOfRange(arr, 0, mid);
		int[] right = Arrays.copyOfRange(arr, mid, arr.length);

		// Recursively sort both halves
		mergeSort(left);
		mergeSort(right);

		// Merge sorted halves back into original array
		merge(arr, left, right);
	}

	/*
	 * Merges two sorted arrays into one sorted array
	 */
	public static void merge(int[] result, int[] left, int[] right) {

		int i = 0; // pointer for left array
		int j = 0; // pointer for right array
		int k = 0; // pointer for result array

		// Compare elements from both arrays
		while (i < left.length && j < right.length) {

			if (left[i] <= right[j]) {
				result[k] = left[i];
				i++;
			} else {
				result[k] = right[j];
				j++;
			}

			k++;
		}

		// Copy remaining elements from left side
		while (i < left.length) {
			result[k] = left[i];
			i++;
			k++;
		}

		// Copy remaining elements from right side
		while (j < right.length) {
			result[k] = right[j];
			j++;
			k++;
		}
	}
	
	/*
	 * Binary Search
	 * Returns the index of the target value in a sorted array.
	 * Returns -1 if the value is not found.
	 */
	public static int binarySearch(int[] arr, int target, int left, int right) {

		// search space is invalid (not found)
		if (left > right) {
			return -1;
		}

		// Finds middle index
		int mid = (left + right) / 2;

		// If middle element is the target, return it
		if (arr[mid] == target) {
			return mid;
		}

		// If target is smaller, search left half
		if (target < arr[mid]) {
			return binarySearch(arr, target, left, mid - 1);
		}

		// If target is larger, search right half
		return binarySearch(arr, target, mid + 1, right);
	}

	
}
