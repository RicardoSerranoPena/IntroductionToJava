public class Variables {
    
    public static void main (String[] args) {
        //To print we use System.out.println()
        System.out.println("This is a demo of variables in Java" + ". And this is the first lesson");

        //This is how you declare a variable
        String name;
        
        //Multiple variables in the same line
        int age, height;
        
        //This is how you assing a value(data) to a variable
        name = "Larry";
        age = 26;
        height = 175; //cm

        //You can also declare a variable and assing a value to it at the same time
        boolean hasDarkHair = true;
        double weight = 60.5; //double is the type of data for values with decimals

        System.out.println(name + " has dark hair: " + hasDarkHair);
        System.out.print(name + " is " + age + " years old.");
        System.out.println(" He weighs " + weight + "kg and has a height of " + height + "cm");

        // String description = name + " is " + age + " years old. He weighs " + weight
        //                     + "kg and has a height of " + height + "cm.";

        // System.out.println(description);
    }
}
