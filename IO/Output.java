/**
 * This is a class that showcases how to use print function
 * to out text into the console
 */
public class Output {
    
    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {

        double price = 19.8;
        System.out.print("$");
        System.out.printf("%6.2f", price);
        System.out.println(" each");
    }
}
