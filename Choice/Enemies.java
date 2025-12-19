package MakeYourChoiceGame;

public class Enemies {
	
	private int damage;	
	private String enemyName;
	
		
		public Enemies(String enemyName, int damage) {
			this.enemyName = enemyName;
			this.damage = damage;
		}
		
			public String getEnemyName() {
			return enemyName;
		}
				
			public int getDamage() {
			return damage;
		}	
			
	}


