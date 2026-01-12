
/*
 * You are to make a method randomizeUntilNum() with two ints called num and iters as formal parameters. 
 * When called, the method begins printing random numbers 0-9 inclusive on a line. 
 * It should print random numbers until a number equal to num is printed. Once that number is printed, 
 * it skips to the next line and then repeats the process iters amount of times. The method should not return anything.  
 */
public class NestedLoopsFRQ {

	public static void main(String[] args) {
		randomizeUntilNum(5, 8);
	}
	
	/*
	 * This method generates a randomize number of 0-9 until it successfully
	 * prints out num. Then, it'll reproce the process iters amount of times.
	 */
	public static void randomizeUntilNum(int num, int iters) {
		//repeats the process 'iters' amount of times
		for (int i = 0; i < iters; i++) {
			int rand = 1;
			//loops the code until random is equal to the num
			while (num != rand) {
				rand = (int)(Math.random()*10);
				System.out.print(rand);
			}
			System.out.println();
		}
	}
}
