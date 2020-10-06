import java.util.Scanner;
/**
 * This is a class used to test the student on their Selection Staments knowledge
 */
public class Siblings {
    
    /**
     * main method
     * @param args
     */
    public static void main(String[] args) {
        //Ask the user how many siblings do they have
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How Many siblings do you have?");
        //Store the user's response as an int
        int numSiblings = keyboard.nextInt();
        //If they don't have any siblings print out "Lucky you!" or something else
        if (numSiblings == 0) {
            System.out.println("that sucks!");
        } else if (numSiblings == 1){  //If the user response is 1, then ask what is their sibling's name and store it in a variable
            System.out.println("What is their name?");
            String siblingName = keyboard.next();
            System.out.println(siblingName + " what a unique name.");
        } else { 
        //If the user has more than 1 ask for their names
        //Example: You have 8 siblings! What are their names?
        //Store their response as a String
        //Print out their names back to the user and say something about their names
            System.out.println("You have " + numSiblings + " siblings. What are their names?");
            //keyboard.next() takes the next word but does not consume the \n
            //to get rid of \n we have to use the nextLine method
            keyboard.nextLine(); //to consume return character \n left behind
            String siblingNames = keyboard.nextLine();
            System.out.println(siblingNames + " what a beautiful family!");
        }
        keyboard.close();
    }
}
