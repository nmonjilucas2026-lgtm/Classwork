/*
*You will be making a final project that is a Make Your Choice game. 
The user will be prompted to make choices that should change the final outcome of the game. 
It must meet the following requirements:

1. It must contain at least two classes: A Main class and something akin to a Character class. 
The main class will handle the logic, and the other class(es) will create objects with setters
and getters to determine how your character(s) change as the game progresses. 

2. It should prompt the user for info that will become the attributes of a Character object.
For example, the user should immediately be prompted about things like thier age, name, HP, etc. 

The character class should have attributes, a constructor that includes all attributes, and setters and getters. 

3. It must contain a path with at least 4 different decisions to make (not including deciding character 
attributes) and have at least 4 unique endings. 

4. It must include a while loop in which the user is prompted for an input, but if they do not put a 
valid input then they are reprompted. If the input is valid, then the loop ends. 

5. It must include at least one for loop. Its placement is totally at your own discretion.
*/

package MakeYourChoiceGame;
import java.util.Scanner; 

public class Game {

	static Scanner inputReader = new Scanner(System.in);
	
    static Character player; 
    //Main Method that starts the game
	public static void main(String[] args) {
		
		gameBegin(); //Starts the game
		inputReader.close(); 
	}
	
	//How the player will be able to play the game
	static boolean playerIsAlive = true;
	
	//Items available in the game
	static Items potion = new Items("Healing Potion", "Heal", 100);
	static Items bandages = new Items("Bandages", "Heal/Cure", 25);
	static Items pills = new Items("Pills", "Cure", 0);
	
	//Enemies available in the game
	static Enemies vampire = new Enemies("Vampire", 1);
	static Enemies werewolf = new Enemies("Werewolf", 35);
	static Enemies zombie = new Enemies("Zombie", 20);
	static Enemies mummy = new Enemies("Mummy", 10);

	//Inventory for the player
	static Items[] inventory = new Items[5];
	
	//Story intro -> player setup
	public static void gameBegin () {
		System.out.println("You wake up in a bleak room...");
		try {
		    Thread.sleep(1500);
		    System.out.println("In front of you... there are five doors.");
		    Thread.sleep(2000);
		    System.out.println("Behind you... there is a wall.");
		    Thread.sleep(1000);
		    System.out.println("You don't know how you got here, but you do know something.");
		    Thread.sleep(1000);
		       
		    System.out.print("You are... ");
	      
		    String playerName = inputReader.nextLine();
		    player = new Character(100, playerName);

		    Thread.sleep(500);
	        System.out.println("You are " + player.getName() + " and your maximum health is " + player.getHealth() + ".");
	        Thread.sleep(1000);
	        System.out.println("What will you do now?");
	        

	        //Loops player's decisions and gameplay
		    while (playerIsAlive) {
		    	statsAndChoices();
		    	String playerAnswer = inputReader.nextLine();
				if (playerAnswer.equalsIgnoreCase("Inventory")) {
					Inventory(); //Manages inventory
				}
				else if (playerAnswer.equalsIgnoreCase("Act")) {
					Act(); //Make an action
				}
				else {
					System.out.println("Not an option.");
				}
		    }
		    
		} catch (InterruptedException e) {
		    Thread.currentThread().interrupt();
	}	
}
	
	 /*
	  * Displays player's health and options in the current game state
	  */
	public static void statsAndChoices() {
		System.out.print( "| " + player.getName() + " | " + player.getHealth() + "/100 | Inventory | Act |");
	}
	
	/*
	 * Handles inventory display and use of item actions
	 * Doesn't work
	 */
	public static void Inventory() {
		
	System.out.print("Current Inventory:");
	
	for (int i = 0; i < inventory.length; i++) {
	    System.out.print((i + 1) + ". ");

	    if (inventory[i] == null) {
	        System.out.println("Empty");
	    } else {
	        System.out.println(inventory[i].getName());
	    }
	}
	
	System.out.println("| Return | Use |");
	
	String playerAnswer = inputReader.nextLine();
	
	if (playerAnswer.equalsIgnoreCase("return")) {
		statsAndChoices();
	} 
	else if (playerAnswer.equalsIgnoreCase("use")) {
	//uses item from inventory
		System.out.print("What do you want to use?");
			if (item.getName().equalsIgnoreCase("Healing Potion")) {
	            player.setHealth(Math.min(100, player.getHealth() + 100));
	            System.out.println("You used a Healing Potion."); //Heals the player
	        }
	        else if (item.getName().equalsIgnoreCase("Bandages")) {
	            player.setHealth(Math.min(100, player.getHealth() + 25));
	            System.out.println("You used Bandages."); //Heals the player and cures bleed status
	            isBleeding(false);
	        }
	        else if (item.getName().equalsIgnoreCase("Pills")) {
	            System.out.println("You used Pills. Infection cured."); //Cures infected status
	            isInfected(false);
	        }
			else {
				System.out.println("Not an option. Try again.");
				statsAndChoices();
			}
		}
	}

   
	/*
	 * Action menu (Check doors or return)
	 */
	public static void Act() {
		
		System.out.println("| Check | Return |");
		String playerAnswer = inputReader.nextLine();
		
		if (playerAnswer.equalsIgnoreCase("Return")) {
			statsAndChoices(); //goes back to main options
		}
		else if (playerAnswer.equalsIgnoreCase("Check")) {
			checkDoors(); // Check the doors
		}
		else {
			System.out.println("Not an option. Try again.");
			Act(); //Loops until valid input
		}
	}
	
	/*
	 * Handle the choice of checking doors
	 */
	public static void checkDoors() {
		System.out.println("What door would you like to choose? (1-5)");
		doors();
		}
	
	 /*
	  * Generates random events for each door (1-5)
	  */
	public static void doors () {
		int doorOne = randomEvent(); // Randomly assigns an event.
		int doorTwo = randomEvent(); // Randomly assigns an event.
		int doorThree = randomEvent(); // Randomly assigns an event.
		int doorFour = randomEvent(); // Randomly assigns an event.
		int doorFive = randomEvent(); // Randomly assigns an event.
			
		chooseDoor(doorOne, doorTwo, doorThree, doorFour, doorFive); 		
}
	
	/*
	 * Generates a number from 1-10 to decide the event
	 */
	public static int randomEvent() {
	    // Random number between 1 and 3 (or however many events you want)
	    return (int)(Math.random() * 10) + 1; // Random between 1-10
	}
	
	/*
	 * Triggers a random event after choosing a door
	 */
	public static void triggerRandomEvent(int event) {
	    try {
	    System.out.print("You walk through the door and...");
	    Thread.sleep(1500);
	    
		if (event <= 4) {
	    	System.out.println("Nothing happened.");
	    }
	    else if (event <= 8) {
	    	Enemies[] enemies = {vampire, werewolf, zombie, mummy};
	    	Enemies randomEnemy = enemies[(int)(Math.random() * enemies.length)];
	    	encounterEnemy(randomEnemy);
	    }
	    else {
	    	Items[] items = {potion, bandages, pills};
	    	Items randomItem = items[(int)(Math.random() * items.length)];
	    	acquireItems(randomItem);
	    }
	    } catch (InterruptedException e) {
		    Thread.currentThread().interrupt();
	}	
	   System.out.println("What will you do now?l");
}
	
	
	/*
	 *  Player chooses a door and an event is triggered
	 */
	public static void chooseDoor(int doorOne, int doorTwo, int doorThree, int doorFour, int doorFive) {
		String playerAnswer = inputReader.nextLine(); 
		int event = 0;
		
		//Maps door choices to event
		int playerDoor = 0;
		if ((playerAnswer.equalsIgnoreCase("one")) || playerAnswer.equals("1")) {
			event = doorOne;
		}
		else if ((playerAnswer.equalsIgnoreCase("two")) || playerAnswer.equals("2")) {
			event = doorTwo;
		}
		else if ((playerAnswer.equalsIgnoreCase("three")) || playerAnswer.equals("3")) {
			event = doorThree;
		}
		else if ((playerAnswer.equalsIgnoreCase("four")) || playerAnswer.equals("4")) {
			event = doorFour;
		}
		else if ((playerAnswer.equalsIgnoreCase("five")) || playerAnswer.equals("5")) {
			event = doorFive;
		}
		else {
		System.out.print("Not an option.");
		Act();
		}
		triggerRandomEvent(event); // Trigger event after door selection
	}
	
	/*
	 * Adds an item to the inventory
	 */
	public static void acquireItems(Items item) {
		for (int i = 0; i < inventory.length; i++) {
			if (inventory[i] == null) {
		        inventory[i] = item;
		        System.out.println(item.getName() + " has been acquired");
		        break;
		    } else {
		       System.out.print("Inventory is full! " + item.getName() + " dropped.");
		       break;
		    }
		}
	}
	
	/*
	 * Handles enemy encounters and outcomes
	 */
	public static void encounterEnemy(Enemies enemy) {
	
	if (enemy.getEnemyName().equalsIgnoreCase("Vampire")) {
		player.setHealth(player.getHealth() - enemy.getDamage());
		System.out.println("A Vampire bit you on the neck! You take " + enemy.getDamage()
		+ ". Your health is now at " + player.getHealth() + "/100.");
		if (player.getHealth() <= 0) {
			System.out.print(player.getName() + "got turned into a vampire. Turned into a Vampire Ending!");
			playerIsAlive = false;
		}
		isBleeding(false);	
	}
	else if (enemy.getEnemyName().equalsIgnoreCase("Werewolf")) {
		player.setHealth(player.getHealth() - enemy.getDamage());
		System.out.println("A Werewolf mauls you! You take " + enemy.getDamage() 
		+ ". Your health is now at " + player.getHealth() + "/100.");
		if (player.getHealth() <= 0) {
			System.out.print(player.getName() + "died from a werewolf. Death by Werewolf Ending!");
			playerIsAlive = false;
		}
		isBleeding(false);
	}
	
	if (enemy.getEnemyName().equalsIgnoreCase("Zombie")) {
		player.setHealth(player.getHealth() - enemy.getDamage());
		System.out.println("A Zombie bit your arm! You take " + enemy.getDamage() 
		+ ". Your health is now at " + player.getHealth() + "/100.");
		if (player.getHealth() <= 0) {
			System.out.print(player.getName() + "died from a zombie. Death by Zombie Ending!");
			playerIsAlive = false;
		}
		isInfected(false);
	}
	
	if (enemy.getEnemyName().equalsIgnoreCase("Mummy")) {
		player.setHealth(player.getHealth() - enemy.getDamage());
		System.out.println("A Mummy lunges at you! You take " + enemy.getDamage()
		+ ". Your health is now at " + player.getHealth() + "/100.");
		if (player.getHealth() <= 0) {
			System.out.print(player.getName() + "died from a mummy. Death by Mummy Ending!");
			playerIsAlive = false;
			
		}
	}
}
	
	/*
	 * Continuous status effect (broken) 
	 */
	public static void isBleeding (boolean bleed) {
		if (bleed) {
			System.out.println("You've been inflicted with bleeding! Your health is now continually decreasing by 1 per second");
				 while (player.getHealth() > 0 && bleed) {
					 try {
					 Thread.sleep(1000);
			         player.setHealth(Math.max(0, player.getHealth() - 1));
			          System.out.println("Your health is now: " + player.getHealth() + "/100");
					 } catch (InterruptedException e) {
						Thread.currentThread().interrupt();
					 }	
				 }
			}
		if (player.getHealth() <= 0 && bleed) {
	        System.out.println(player.getName() + " bled out. Bled Out Ending.");
	        playerIsAlive = false;
	    }
	}
		
	/*
	 * Timed status effect (broken)
	 */
		public static void isInfected (boolean infection) {
			statsAndChoices();
			if (infection) {
				try { 
				System.out.println("You're infected! You need pills to cure it, hurry! You only have 20 seconds.");
				Thread.sleep(20000);
				System.out.println("You have been turned into a zombie. Infected Ending.");
				playerIsAlive = false;
				} catch (InterruptedException e) {
				    Thread.currentThread().interrupt();
				}		
			}
		}
}


