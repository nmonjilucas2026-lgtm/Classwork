/*
 * Create a method noNegatives() that is passed a double array nums 
 * and returns a copy of that array, except any negative elements are changed to 0.

Ex: noNegatives( {-5, 0, -8, 20}  )   -------returns----->     {0, 0, 0, 20}

2. Create a method dropLowest() that is passed an int array nums and returns a copy 
of that array, except the lowest number in the array has been changed to 0.

Ex: subtract5FromAll4( {9, -2, 12, 8}  )   -------returns----->     {9, 0, 12, 8}
 */

public class AlteringArrays2 {

    public static void main(String[] args) {

        // Original array
        int[] nums = {-5, 0, -8, 20};

        // Call methods and stores the returned arrays
        int[] newNums = noNegatives(nums);
        int[] newNumsTwo = dropLowest(nums);

        // Prints the originl array
        System.out.println("Original Array:");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        // Print array with no negatives
        System.out.println("\nNo Negatives:");
        for (int i = 0; i < newNums.length; i++) {
            System.out.println(newNums[i]);
        }

        // Print array with lowest value dropped
        System.out.println("\nDrop Lowest:");
        for (int i = 0; i < newNumsTwo.length; i++) {
            System.out.println(newNumsTwo[i]);
        }
    }

    /**
     * Replaces all negative values in the array with 0.
     */
    public static int[] noNegatives(int[] nums) {

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            // If value is negative, set to 0
            if (nums[i] < 0) {
                result[i] = 0;
            } else {
                result[i] = nums[i];
            }
        }
        return result;
    }

    /**
     * Finds the lowest value in the array and replaces it with 0
     */
    public static int[] dropLowest(int[] nums) {

        int[] result = new int[nums.length];

        // Assumes first element is the lowest
        int lowest = nums[0];

        // Checks if there are other valeus lower than the 'lowest value'
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < lowest) {
                lowest = nums[i];
            }
        }

        // Copies the array and replaces the lowest value with 0
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == lowest) {
                result[i] = 0;
                lowest = Integer.MAX_VALUE; // ensures only one value is changed
            } else {
                result[i] = nums[i];
            }
        }

        return result;
    }
}
