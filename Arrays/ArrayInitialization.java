public class ArrayInitialization {
 
    public static void main(String[] args){

        //initializing an array using curly braces
        double[] importantNumbers = {4.5, 16.333, 5.45, 8.99};

        //printing the array
        for (int i = 0; i < importantNumbers.length; i++) {
            System.out.print(importantNumbers[i] + " ");
        }
        System.out.println();

        //creating a new array using the length instance variable of the importantNumbers array
        double[] numbersDoubled = new double[importantNumbers.length];

        //initializing an array to have the values of important numbers but doubled
        for (int i = 0; i < numbersDoubled.length; i++) {
            numbersDoubled[i] = importantNumbers[i] * 2;
        }

        //printing the array
        for (int i = 0; i < numbersDoubled.length; i++) {
            System.out.print(numbersDoubled[i] + " "); 
        }
        System.out.println();
    }
}
