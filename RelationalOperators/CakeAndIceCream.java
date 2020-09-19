import java.util.Scanner;

public class CakeAndIceCream {

    public static void main(String[] args) {

        boolean likesCake, likesIceCream;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Do you like cake? yes or no?");
        String likesCakeAnswer = keyboard.next();
        System.out.println("Do you like ice cream? yes or no?");
        String likesIceCreamAnswer = keyboard.next();

        if (likesCakeAnswer.equalsIgnoreCase("yes")) {
            likesCake = true;
        } else {
            likesCake = false;
        }
        if (likesIceCreamAnswer.equalsIgnoreCase("yes")) {
            likesIceCream = true;
        } else {
            likesIceCream = false;
        }

        System.out.print("This person likes both cake and ice cream: ");
        if (likesCake && likesIceCream) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}