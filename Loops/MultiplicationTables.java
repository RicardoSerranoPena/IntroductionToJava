import java.util.Scanner;

public class MultiplicationTables {
    
    public static void tableOf(int numberToShow) {
        //you can use a loop to print and multiply at the same time

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + numberToShow + " = " + numberToShow * i);
        }
    }

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Which multiplication table do you want to see? Type a number");
        /**
         * Make a method that will print the multiplication table of any number
         * Up to ten numbers, call the method here but write the code in the method
         */
        int userInput = keyboard.nextInt(); //grab user number word until we hit enter/return \n or space
        tableOf(userInput);

    }
}
