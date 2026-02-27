/*
 * 1. Instantiate a 2-D array gridNums that consists of 4 rows
 *  and 6 columns using the new keyword. 
 *  
 * 2. Instantiate a 2-D array with the following values:

		4   5    7

		2  -1   8

		0  1   3

	For the following problems, print out those elements before and after to verify it worked. 

		3. For both of those arrays, change the element in the first row, first column to a 17.

		4. For both of those arrays, change the element in the second row, third column into a 20. 

		5. For both of those arrays, change the last element in the first row to a -5. Accomplish this using .length 

		6. For both of those arrays, change the first element in the last row to a -7. Accomplish this using .length 

		7. For both of those arrays, change the last element in the last row to a -30. Accomplish this using .length 

		8. Create a method that is passed a 2-D array of ints and one by one prints out each element in the first row. 

		9. Create a method that is passed a 2-D array of ints and one by one prints out each element in the first column.

		10. Create a method that is passed a 2-D array of ints and one by one prints out each element in row-major order. 

		11. Create a method that is passed a 2-D array of ints and one by one prints out each element in column-major order. 

 */

public class ArrayIntroAssignment {

	public static void main(String[] args) {
		//1 Creates a 2d array with 4 rows and 6 columns
		int[][] gridNums = new int[4][6];
		//2 Create and initializes a 2d array
		int[][] gridNums2 = {
				{4,  5, 7},
				{2, -1, 9},
				{0,  1, 3}
		};
		
		
		//3 Changes the first element in the first row of both arrays to 17 and then prints it
		System.out.println(gridNums[0][0]);
		System.out.println(gridNums2[0][0]);
		
		gridNums[0][0] = 17;
		gridNums2[0][0] = 17;
		
		System.out.println(gridNums[0][0]);
		System.out.println(gridNums2[0][0]);
		
		
		//4 Changes the third element in the second row of both arrays to 20 and then prints it
		System.out.println(gridNums[1][2]);
		System.out.println(gridNums2[1][2]);
		
		gridNums[1][2] = 20;
		gridNums2[1][2] = 20;
		
		System.out.println(gridNums[1][2]);
		System.out.println(gridNums2[1][2]);
		
		
		//5 Changes the last element in the first row of both arrays to -5 and then prints it
		System.out.println(gridNums[0][gridNums[0].length-1]);
		System.out.println(gridNums2[0][gridNums2[0].length-1]);
		
		gridNums[0][gridNums[0].length-1] = -5;
		gridNums2[0][gridNums2[0].length-1] = -5;
		
		System.out.println(gridNums[0][gridNums[0].length-1]);
		System.out.println(gridNums2[0][gridNums2[0].length-1]);
		
		
		//6 Changes the first element in the last row of both arrays to -7 and then prints it
		System.out.println(gridNums[gridNums.length-1][0]);
		System.out.println(gridNums[gridNums2.length-1][0]);
		
		gridNums[gridNums.length-1][0] = -7;
		gridNums2[gridNums2.length-1][0] = -7;
		
		System.out.println(gridNums[gridNums.length-1][0]);
		System.out.println(gridNums2[gridNums2.length-1][0]);
		
		//7 Changes the last element in the last row of both arrays to -30 and then prints it
		System.out.println(gridNums[gridNums.length-1][gridNums.length-1]);
		System.out.println(gridNums2[gridNums2.length-1][gridNums2.length-1]);
		
		gridNums[gridNums.length-1][gridNums.length-1] = -30;
		gridNums2[gridNums2.length-1][gridNums2.length-1] = -30;
		
		System.out.println(gridNums[gridNums.length-1][gridNums.length-1]);
		System.out.println(gridNums2[gridNums2.length-1][gridNums2.length-1]);
		
		//8 Prints out all of the elements n the first row of both arrays
			for (int i = 0; i < gridNums[0].length; i++) {
				System.out.print(gridNums[0][i] + " ");
			}
			System.out.println();
			for (int i = 0; i < gridNums2[0].length; i++) {
				System.out.print(gridNums2[0][i] + " ");
			}
			System.out.println();
			
		//9 Prints out all the elements in both arrays
			for (int i = 0; i < gridNums.length; i++) {
				System.out.print(gridNums[i][0] + " ");
			}
			System.out.println();
			for (int i = 0; i < gridNums2.length; i++) {
				System.out.print(gridNums2[i][0] + " ");
			}
			
		//10 Prints out all the elements in both arrays row by row 
			System.out.println();
			System.out.println();
			for (int j = 0; j < gridNums.length; j++) {
				for (int i = 0; i < gridNums[j].length; i++) {
					System.out.print(gridNums[j][i] + " ");
				}
				System.out.println();
			}
			for (int j = 0; j < gridNums2.length; j++) {
				for (int i = 0; i < gridNums2[j].length; i++) {
					System.out.print(gridNums2[j][i] + " ");
				}
				System.out.println();
			}
		
		//11 Prints out all the elements in both arrays column by column
			System.out.println();
			System.out.println();
			 for (int j = 0; j < gridNums[0].length; j++) {
			    for (int i = 0; i < gridNums.length; i++) {
			        System.out.print(gridNums[i][j] + " ");
			 }
			    System.out.println();
			 }
			 System.out.println();
			 for (int j = 0; j < gridNums2[0].length; j++) {
				    for (int i = 0; i < gridNums2.length; i++) {
				        System.out.print(gridNums2[i][j] + " ");
				 }
				    System.out.println();
				 }	
	}

}
