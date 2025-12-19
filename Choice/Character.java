package MakeYourChoiceGame;

public class Character {
	private int health;	
	private String name;
	
	public Character(int health, String name) {
		this.health = 100;
		this.name = name;
	}
	
	
		public String getName() {
		return name;
	}
			
		public int getHealth() {
		return health;
	}	
	
		public void setName(String newName) {	
		name = newName;
	}
	
	public void setHealth(int newHealth) {
		health = newHealth;
	}
}

