public class Variables {
    
    public static void main (String[] args) {
        System.out.println("This is a demo of variables in Java");

        //This is how you declare a variable
        int age;
        boolean hasACat;
        /**
        You can also declare multiple variables within
        the same line as long as they are the same type
        */
        double temperature, speed;
        boolean over18, paid;
        
        //This is how you assing a value(data) to a variable
        age = 26;
        hasACat = true;
        temperature = 25.8;
        speed = 45;
        over18 = true;
        paid = false;

        //You can also declare a variable and assing a value to it at the same time
        char middleNameInitial = 'A';
        String name = "Alex";

        System.out.print(name);
        System.out.print(" is ");
        System.out.print(age);
        System.out.println(" years old.");

        System.out.print(name + " has a cat: ");
        System.out.println(hasACat);
        System.out.print("He is over 18: ");
        System.out.println(over18);

        //You can also concatonate strings to make them easier to read and easier to print
        String introduction = name + " " + middleNameInitial + " is " + age + " years old.";
        String weather = "The weather is " + temperature + " C" + " with a wind speed of " + speed + " km/H";
        String sentence3 = name + " is over 18: " + over18 + ", and paid for ticket: " + paid;

        System.out.println(introduction);
        System.out.println(weather);
        System.out.println(sentence3);

    }
}
