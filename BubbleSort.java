
public class BubbleSort2 {

	public static void main(String[] args) {
		
		int[] nums = {4, 7, 3, 2, 8, 31, 23, 10, 14, 13, 0, 5, 12, 54, 99, 21, 21};
		
		//Loops for each element 
		for (int n : nums) {
			for (int i = 0; i < nums.length-1; i++) {
				//Checks and swaps each element if current element is bigger than the next
				if (nums[i] > nums[i + 1]) {
					int temp = nums[i];
					nums[i] = nums[i + 1];
					nums[i+1] = temp;
				}
			}
		}
		//Prints out the sorted array
		for (int n : nums) {
			System.out.println(n);
		}
	}

}
