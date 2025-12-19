package MakeYourChoiceGame;

public class Items {

    private String name;   
    private String type;
    private int value;   
    
    public Items(String name, String type, int value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }
 
     
    public String getName() { 
    	return name; 
    }
   
    public String getType() {
    	return type;
    }
   
    public int getValue() { 
    	return value; 
    }
    
}



