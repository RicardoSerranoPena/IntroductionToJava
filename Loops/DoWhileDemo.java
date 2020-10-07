/**
 * A class that shows the Do While loop
 */
import java.util.Scanner;

public class DoWhileDemo {
    
    public static void main(String[] args) {

        Boolean endProgram = false;
        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.println("Do you want to end this program?");
            String userAnswer = keyboard.next();

            if (userAnswer.equalsIgnoreCase("yes") || userAnswer.equals("sure")) {
                endProgram = true;
            } 
            if (userAnswer.equalsIgnoreCase("No")) {
                endProgram = false;
            }
        } while (!endProgram);
    }
}
