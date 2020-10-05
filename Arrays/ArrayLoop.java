public class ArrayLoop {
    
    public static void main(String[] args) {

        //creating the array | similar to the way we create objects
        int[] myArray = new int[5];
        
        //Initializing the array | assigning the values
        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 3;
        myArray[3] = 5;
        myArray[4] = 8;

        //Printing the array using a for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Array item " + i + " = " + myArray[i] );
        }

        //A better way is to use the instance variable length.
        // for (int i = 0; i < myArray.length; i++) {
        //     System.out.println("Array item " + i + " = " + myArray[i] );
        // }
    }
}
