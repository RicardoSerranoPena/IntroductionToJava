import java.util.ArrayList;

/**
 * A class to show usages of ArrayList Functions
 */
public class ArrayListExamples {
	
	public static void main(String [] args) {
		
		ArrayList<Double> listOfDoubles = new ArrayList<Double>();

		listOfDoubles.add(1.11);
		listOfDoubles.add(2.22);
		listOfDoubles.add(3.33);
		System.out.println("Current ArrayList: " + listOfDoubles);

		listOfDoubles.add(1, 4.44);
		System.out.println("ArrayList after adding 4.44 at index 1: " + listOfDoubles);

		listOfDoubles.set(1, 5.55);
		System.out.println("ArrayList after setting 5.55 at index 1: " + listOfDoubles);

		System.out.println("Getting value of ArrayList at index 1: " + listOfDoubles.get(1));

		ArrayList<Double> listOfDoubles2 = (ArrayList<Double>) listOfDoubles.clone();
		System.out.println("You can also clone an ArrayList");
		System.out.println("ArrayList 2: " + listOfDoubles2);

		listOfDoubles.remove(1);
		System.out.println("Removing value of Arraylist at index 1: " + listOfDoubles);

		listOfDoubles.remove(2.22);
		System.out.println("You can also remove specific values: " + listOfDoubles);

		listOfDoubles.clear();
		System.out.println("You can also clear the array: " + listOfDoubles);
		
		System.out.println("And using our cloned ArrayList2, I can show you the old values before we started removing: " + listOfDoubles2);
	}
}
