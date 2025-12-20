package MakeYourChoiceGame;

/*
 * Represents the user's character in game
 */
public class Character {
	
	private int health;	//health value
	private String name; //character's name
	
	//constructor to create a character
	public Character(int health, String name) {
		this.health = 100;
		this.name = name;
	}
	
	//returns character name
		public String getName() {
		return name;
	}
	
	//returns character health
		public int getHealth() {
		return health;
	}	
	
	//changes character name
		public void setName(String newName) {	
		name = newName;
	}
	
	//changes character health
	public void setHealth(int newHealth) {
		health = newHealth;
	}
}


