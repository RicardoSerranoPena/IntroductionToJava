import java.util.Scanner;

public class ComparingStrings {
    
    public static void main(String[] args) {

        String name = "Ricardo";

        System.out.println("What's your first name?");
        Scanner keyboard = new Scanner(System.in);
        String userName = keyboard.next();
        
        if (name.equals(userName)) {
            System.out.println("Wow, we have the same name!");
        } else {
            System.out.println("Your name is " + userName + ". My name is " + name);
        }

        keyboard.close();
    }
}
