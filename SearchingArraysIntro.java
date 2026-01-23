/* 1. Create a method checkFor4() that is passed an int array
 *  and returns true if that array has a 4 and false if that 
 *  array has no 4's. 

2. Create a method countFor4() that is passed an int array and
 returns how many times 4 shows up in the array. 

3. Create a method checkForFour4() that is passed an int array
 and return true if the array has exactly four 4's in it. 
*/


public class SearchingArraysIntro {

    public static void main(String[] args) {
    	int[] nums = {0, 1, 2, 3, 4, 4, 4};
    	System.out.println(checkFor4(nums)); //checks if array has 4
    	System.out.println(countForFour4(nums)); //counts how many fours in the array 
    	System.out.println(checkForFour4(nums)); //checks if there are exactly four 4's
    }

 /*
  * Returns true if the array contains a 4
  */
    public static boolean checkFor4(int nums[]) {
        boolean HasFour = false;			
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                HasFour = true;
            }
        }
        return HasFour;
    }

    /*
     * Returns how many fours appears 
     */
    public static int countForFour4(int nums[]) {
        int count = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 4) {
                count++;
            }
        }
        return count;
    }

    /*
     * Returns true if there are four fours
     */
    public static boolean checkForFour4(int nums[]) {
        int count = 0;
        boolean checkForFour4 = false;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 4) {
                count++;
            }
        }
        if (count == 4) {
            checkForFour4 = true;
        }
        return checkForFour4;
    }
}

