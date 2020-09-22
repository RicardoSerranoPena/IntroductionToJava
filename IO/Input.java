import java.util.Scanner;

public class Input {
    
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        int numberOfPets = keyboard.nextInt();
        System.out.println("number of pets: " + numberOfPets);

        String word1 = keyboard.next();
        String word2 = keyboard.next();

        System.out.println("word 1: " + word1 + ", word 2: " + word2);
        //We have to use nextLine to consume the \n character left over
        keyboard.nextLine();

        System.out.println("Write a sentence");
        String line = keyboard.nextLine();

        System.out.println("You wrote: " + line);
    }
}
