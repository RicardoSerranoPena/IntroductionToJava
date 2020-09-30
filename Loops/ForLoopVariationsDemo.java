/**
 * A Class that shows the For Loop variations
 */
public class ForLoopVariationsDemo {

    public static void main(String[] args) {

        //decrementing loop
        System.out.println("\nCounting down");
        for (int i=5; i>0; i--) {
			System.out.println("Counter (i) = " + i);
        }

        //powers of two
        System.out.println("\nPowers of two");
		for (int i=1; i < 10; i *= 2)
		{
			System.out.println("Counter (i) = " + i);
		}
    }
}
