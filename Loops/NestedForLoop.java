/**
 * A class that shows the usage of Nested For Loops
 */
public class NestedForLoop {
    
    public static void main(String[] args) {
        int rowNum, columnNum;
        for (rowNum = 1; rowNum <=3; rowNum++)
        {
            for (columnNum = 1; columnNum <=2; columnNum++)
                System.out.print("| row " + rowNum + " column " + columnNum + " |");
            
            System.out.println(); //jumps down to the next line
        }
    }
}
