//importing the Scanner class into the AgeChallenge class
import java.util.Scanner; 

public class AgeChallenge {
    
    public static void main (String[] args) {

        //declaring a new object of type Scanner
        Scanner keyboard = new Scanner(System.in);

        //printing to console, asking for age of user
        System.out.println("You might qualify for a discount. How old are you?");

        //storing user input into variable
        int userInput = keyboard.nextInt();

        //1. if userInput is below 2 years old, print they don't have to pay
        //2. if userInput is below 12 years old, print they get a 25% discount
        //3. if userInput is above 65 years old, print they get a 25% discount
        //4. any other age should print they don't get a discount
    }
}
