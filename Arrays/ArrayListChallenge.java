import java.util.ArrayList;

public class ArrayListChallenge {
    
    	/**
	 * This method creates a new array list with all strings in one and two.
	 * Lists one and two should not be changed!!!
	 * @param one The first list
	 * @param two The second list
	 * @return The merged list with everything from one and two.
	 */
	public static ArrayList<String> merge(ArrayList<String> one, ArrayList<String> two) {
        ArrayList<String> mergedList = new ArrayList<String>();
        for (String element : one) {
            mergedList.add(element);
        }
        for (String element : two) {
            mergedList.add(element);
        }
        return mergedList;
	}
	
	/**
	 * This returns the sum of all Doubles in list
	 * @param list The list to sum
	 * @return The sum of all values in list
	 */
	public static double getTotal(ArrayList<Double> list) {
        double listSum = 0;
        for (Double element : list ) {
            listSum += element; 
        }

		return listSum;
	}
	
	/**
	 * This returns the number of strings that contain the string hello.  
	 * Case should be ignored.
	 * @param list The list to count.
	 * @return The number of String that contain hello
	 */
	public static int countAllHellos(ArrayList<String> list) {
        int numOfHellos = 0;
        for (String element : list) {
            if(element.contains("Hello") || element.contains("hello")) {
                numOfHellos++;
            }
        }
        return numOfHellos;
	}
	
	public static void main(String [] args) {
		ArrayList<String> one = new ArrayList<String>();
		one.add("eh");
		one.add("bee");
		ArrayList<String> two = new ArrayList<String>();
		two.add("cee");
		two.add("dee");
		two.add("eff");
		
		ArrayList<String> merged = merge(one,two);
		System.out.println("Testing merge");
		System.out.println("Expecting: [eh,bee,cee,dee,eff] in some order");
		System.out.println("Received " + merged);
		
		
		if (merged.equals(one) || merged.equals(two))
		{
			System.out.println("Error: original strings modified!");
		}
		
		
		ArrayList<Double> list = new ArrayList<Double>();
		list.add(2.0);
		list.add(3.1);
		System.out.println("\nTesting getTotal");
		System.out.println("Expecting 5.1");
		System.out.println("Received " + getTotal(list));
		
		ArrayList<String> three = new ArrayList<String>();
		three.add("cee");
        three.add("hello");
        three.add("hello");
		three.add("dee");
		three.add("eff");
		three.add("Hello I like letters");
		three.add("hel I like Jello");
		System.out.println("\nTesting count hellos");
		System.out.println("Expecting 3");
		System.out.println("Received " + countAllHellos(three));
	}
}
