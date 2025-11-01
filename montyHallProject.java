/*
 * A simulation of the Monty Hall problem.
 * There are three doors: behind one is a prize and the others have nothing.
 * When the player chooses a door, the Host reveals an empty one.
 * The player can then choose to switch or stay.
 * Finally, the Host reveals if they have won or lost.
*/

import java.util.Scanner; 

public class MontyHallProject {

	static Scanner inputReader = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Welcoming Message + Explanation of the Game
		System.out.println("Welcome to Monty Hall Game Show!");
		System.out.println("There are three doors... One containing a car behind it.");		
		System.out.println("When you choose one of these doors, I the game host will reveal a false one.");
		System.out.println("Then you can either choose to switch or stay.");
		System.out.println("Let's begin!");
		
		gameBegin(); //Starts the game
		inputReader.close(); 
	}
	
	/*
	 * Randomly selects the winning door.                          
	 */
		public static void gameBegin () {
			int winDoor = (int)(Math.random() * (3) + 1); // Randomly assign one of the three doors to hide the prize.
			chooseDoor(winDoor); //Asks and allows the user to then choose the door of their liking.		
	}
		
		/*
		 * Allows the user to choose a door from 1-3.
		 * If the user gives an invalid answer, it ends the game.
		 */
		public static void chooseDoor(int winDoor) {
			System.out.println("Choose a door! 1, 2, or 3.");
			String playerAnswer = inputReader.nextLine(); 
			
			//Converts text to door number
			int playerDoor = 0;
			if ((playerAnswer.equalsIgnoreCase("one")) || playerAnswer.equals("1")) {
				playerDoor = 1;
			}
			else if ((playerAnswer.equalsIgnoreCase("two")) || playerAnswer.equals("2")) {
				playerDoor = 2;
			}
			else if ((playerAnswer.equalsIgnoreCase("three")) || playerAnswer.equals("3")) {
				playerDoor = 3;
			}
			else {
			System.out.print("User didn't give a proper answer. End :(");
			return; 
			}
			
			//Host reveals the empty door
			int doorToReveal = revealDoor(playerDoor, winDoor);
			System.out.println("The Host reveals a door... It's door " + doorToReveal + "! It's empty!");
			
			//Asks the user to either switch or stay with the door they chose
			switchOrStay(playerDoor, doorToReveal, winDoor);
	}
	
		/*
		 * It reveals a door that is neither the winning door or the player's answer.
		 */
		public static int revealDoor(int playerDoor, int winDoor) {	
			int doorToReveal = 0;
			
			if (1 != playerDoor && 1 != winDoor) {
				doorToReveal = 1;			
			}
			else if (2 != playerDoor && 2 != winDoor) {
				doorToReveal = 2;
			}
			else if (3 != playerDoor && 3 != winDoor) {
				doorToReveal = 3;
			}
		
			return doorToReveal;
		}	
		
		/*
		 * Allows the player the choice of switching or staying
		 */
		public static void switchOrStay(int playerAnswer, int doorToReveal, int winDoor) {
			System.out.println("Would you like to switch your choice? Yes or no.");
			String playerSwitch = inputReader.nextLine();
			
			// Switch the player's choice to the door that is neither the player's answer or the revealed door.
			int finalDoor = 0;
			if (playerSwitch.equalsIgnoreCase("yes")) {
				if (playerAnswer == 1) {
					if (doorToReveal == 2) {
						finalDoor = 3;
					}
					else {
						finalDoor = 2;
					}
				}
				else if (playerAnswer == 2) {
					if (doorToReveal == 1) {
						finalDoor = 3;
					}
					else {
						finalDoor = 1;
					}
				}
				else if (playerAnswer == 3) {
					if (doorToReveal == 1) {
						finalDoor = 2;
					}
					else {
						finalDoor = 1;
					}
				}
			}
			
			//If player answers "no" then it will stay on the player's choice.
			else if ((playerSwitch.equalsIgnoreCase("no"))) {
				finalDoor = playerAnswer;
			}
			
			// Shows the results of the game.
			if (finalDoor == winDoor) {
				System.out.print("You chose door " + finalDoor + ". Congratulations! You win!");
			}
			else {
				System.out.print("You chose door " + finalDoor + ". Sorry... It was door " + winDoor + ". You lost.");
			}
			
		}
}

