public class PassingArray {

    //Does not modify the array
    //Simply reasigns the variable to myArr
    public static void doesNotModify(int[] newArr) {
        int[] myArr = {5, 10, 15, 20, 25};
        newArr = myArr;
    }

    //Proper way of coping an array
    public static void copyArray(int[] newArr) {
        int[] myArr = {5, 10, 15, 20, 25};
        for (int i = 0; i < myArr.length; i++) {
            newArr[i] = myArr[i];
        }
    }

    //Checking to see if two arrays hold the same values | are equal
    public static boolean equalsArray(int[] a, int[] b) {
        if (a.length != b.length) { 
            return false;
        } else {
            int i = 0;
            while (i < a.length) {
                if (a[i] != b[i]) {
                    return false;
                }
                i++;
            }
        }
        return true;
    }

    //Printing the values of any size array
    public static void printArray(int[] arrayToPrint) {
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i] + " ");
        }
        System.out.println();
    }

    //Doubling the value of each element in an array
    public static int[] doubleArray(int[] newArr) {
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = newArr[i] * 2;
        }
        return newArr;
    }

    //Printing the values of any array using for-each loop
    public static void printArrayForEachLoop(int[] arrayToPrint) {
        for (int element: arrayToPrint) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {

        //initializing an array
        int[] importantNumbers = {1, 2, 3, 5, 8};

        //printing the array
        printArray(importantNumbers);

        //printing the array which is a copy
        //see how we can combine methods
        doesNotModify(importantNumbers);
        
        printArray(importantNumbers);

    }
}
