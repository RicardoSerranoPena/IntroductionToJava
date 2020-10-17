//First we have to import the Scanner class
import java.util.Scanner;

/**
 * This input class showcases the use of user input into a program
 */
public class Input {
    
    public static void main(String[] args) {

        //Second we have to make a new Scanner instance
        Scanner keyboard = new Scanner(System.in);

        System.out.println("How many pets do you have?");
        //Third we need to store the user input in a variable
        int numberOfPets = keyboard.nextInt(); //we use the function nextInt() for storing ints
        System.out.println("number of pets: " + numberOfPets);

        System.out.println("Type 2 words: ");
        //The next() function will take only a word denoted by a space or end of line character
        String word1 = keyboard.next();
        String word2 = keyboard.next();

        System.out.println("word 1: " + word1 + ", word 2: " + word2);

        //We have to use nextLine() function to consume the \n character left over
        keyboard.nextLine();

        System.out.println("Write a sentence");
        //We can use the function nextLine to take the whole line 
        //typed denoted until the end of line character
        String line = keyboard.nextLine();

        System.out.println("You wrote: " + line);
    }
}
