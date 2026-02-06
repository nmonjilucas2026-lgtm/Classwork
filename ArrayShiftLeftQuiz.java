
public class ArrayShiftLeft {

    
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10};
		int lol = nums[0];
		
		for (int i = 0; i < nums.length-1; i++) {
			//Assigns the next element's value to the current one
			nums[i] = nums[i + 1];
		}
		
		//Changes the last element in the array to the value of the first element
		nums[nums.length-1] = lol;		
		
		//Prints out the sorted array
		for (int n : nums) {
			System.out.println(n);
		}
	}
}
