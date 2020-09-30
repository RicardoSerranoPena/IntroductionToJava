/**
 * A class that shows the while loop
 */
import java.util.Scanner;

public class WhileDemo {
    
    public static void main (String[] args) {

        Boolean endProgram = false;
        Scanner keyboard = new Scanner(System.in);

        while (!endProgram) {
            System.out.println("Do you want to end this program?");
            String userAnswer = keyboard.next();
            
            if (userAnswer.equalsIgnoreCase("yes") || userAnswer.equalsIgnoreCase("sure")) {
                endProgram = true;
            }
        }
    }
}
