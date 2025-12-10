/*
 * This class contains a method reverses a sentence
 */
public class ReturnBackwards {

    public static void main(String[] args) {
    	System.out.println(giveBackwards("Hello World!"));
    	System.out.println(giveBackwards("supercalifragilisticexpialidocious"));
    }

    /*
     * This method returns the reverse of a string
     */
    public static String giveBackwards(String str) {
      int n = 1;
    	String result = "";
    	
    	//Loops through the string to build the reversed version
        for (int num = 0; num < str.length() - 1; num++) {
        	//Extracts the next char
        	String backwards = str.substring((str.length() - 1) - n, (str.length()) - n);
        	result += backwards; //adds the last char to result
        	n++; //adds one to variable n, moving one left in the string
        }
        return result; //returns the reversed string
    }
}
