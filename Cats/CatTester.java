/**
 * This method exists to demonstrate how the Cat class works
 *
 */
public class CatTester {

	public static void main(String[] args) {
		
		//create a Cat; instance of a Cat class; a Cat object
		Cat myCat = new Cat("Larry", false, new Date(11, 5, 2005));
		Cat mySecondCat = new Cat("Snuggles", true, new Date(10, 2, 2009));

		System.out.println(myCat);
		System.out.println(mySecondCat);
	}

}
