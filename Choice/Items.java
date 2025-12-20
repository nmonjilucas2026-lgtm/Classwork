package MakeYourChoiceGame;

/*
 * Represents an item in the game
 */
public class Items {

    private String name;  //name of the item 
    private String type;  //type of item (heal/cure)
    private int value;    //value of the item (healing)
    
    //constructor to make an item
    public Items(String name, String type, int value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }
 
    //returns the item name
    public String getName() { 
    	return name; 
    }
 
   //returns the item type
    public String getType() {
    	return type;
    }
   
    //returns the item value
    public int getValue() { 
    	return value; 
    }
    
}



