package MakeYourChoiceGame;

/*
 * Represents enemies in the game
 */
public class Enemies {
	
	
	private int damage;	//damage amount they can deal 
	private String enemyName; //name of the enemy
	
		//constructor to create the enemy
		public Enemies(String enemyName, int damage) {
			this.enemyName = enemyName;
			this.damage = damage;
		}
		
		//returns the enemy name
			public String getEnemyName() {
			return enemyName;
		}
			
		//returns the enemy damage
			public int getDamage() {
			return damage;
		}	
			
	}

