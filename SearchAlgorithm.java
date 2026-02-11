
public class BinarySearch {

	public static void main(String[] args) {
		
		int nums[] = {1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121, 144,
				169, 196, 225, 256, 289, 324, 361, 400, 441, 484, 529,
				576, 625, 676, 729, 784, 841, 900};
		int guess = 0;
		int index = 0;
		
		int[] newNums = binarySearch(nums, index, guess);
		 for (int i = 0; i < newNums.length; i++) {
				System.out.println(newNums[i]);
				}
	}
		
	/*
	 * This method searches and returns the index of where that that int shows up in the array
	 */
		public static int[] binarySearch(int[] nums, int index, int guess) {
				
		    int min = 0;
		    int max = nums.length - 1;
		    int mid = (nums.length / 2);

		    int target = nums[0];

		    int array[] = new int[3];

		    boolean targetIsFound = false;
		    
		    while (!targetIsFound) {
		    	
		        if (target < nums[mid]) { //if target is less than mid...
		            max = mid;
		            mid = max / 2; //halves the original array and looks toward the left
		            index = mid; 
		            guess++; //Adds one to int guess
		        } else if (target > nums[mid]) { //else if target is bigger than mid...
		            min = mid;
		            mid = min + (max - min) / 2; //halves the original array
		            index = mid; //looks toward the right
		            guess++;
		        } else { //Else, target is equal to element
		            guess++;
		            targetIsFound = true; //Stops the while loop
		            index = mid;
		        }
		    }
		    array[0] = nums[mid];
		    array[1] = index;
		    array[2] = guess;
		    return array;
		}

	}
