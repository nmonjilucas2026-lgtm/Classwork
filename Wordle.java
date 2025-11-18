/* A Wordle game where the user has to guess a 5-letter word.
* After each guess, it gives feedback: 
* 'c' = correct letter in the correct spot, '?' = letter exists but wrong spot, 'X' = letter not in the word.
*/
import java.util.Scanner;

public class wordle {

    static Scanner inputReader = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        String solution = "triad"; // word to guess
        String userInput;
        boolean userInputStatus = false; // guess correct or not
        
        System.out.println("Correctly guess the word.");
    
        while (!userInputStatus) {  
            userInput = inputReader.nextLine(); // get guess
            
            if (userInput.length() == 5) { // only runs if response is 5 letters
                if (userInput.equalsIgnoreCase(solution)) { // if user correctly guesses, userInputStatus is true
                    System.out.println("You got it!");
                    userInputStatus = true;
                } else {
                    String feedback = checkGuess(userInput, solution); // checks, then give hints
                    System.out.println(feedback);
                }
            }
            else {
                System.out.print("Invalid Response. Guess has to consist of 5 letters.");
            }
        }
    }   
    
    public static String checkGuess(String guess, String solution) {
        String result = ""; // feedback
        
        for (int i = 0; i < guess.length(); i++) {
            char word = guess.charAt(i); // letter
            
            if (word == solution.charAt(i)) {
                result += "c"; // correct letter and it's in the correct spot
            } else if (solution.indexOf(word) != -1) {
                result += "?"; // correct letter, but in the wrong spot
            } else {
                result += "X"; // not in the word
            }
        }
        
        return result; // return hints
    }
}
