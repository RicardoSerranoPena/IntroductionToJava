public class CarTester{

    public static void testingCar(Car myFirstCar){
        System.out.println(myFirstCar.go(55));
        System.out.println(myFirstCar.go(40));
        System.out.println(myFirstCar.stop()); 
        System.out.println(myFirstCar.refuel());
        System.out.println(myFirstCar.go(99));
        System.out.println(myFirstCar.go(2));
        System.out.println(myFirstCar.refuel());
        System.out.println(myFirstCar.stop());
        System.out.println(myFirstCar.refuel());
        System.out.println(myFirstCar.go(100));
        System.out.println(myFirstCar.go(10));
        System.out.println(myFirstCar.stop());
        System.out.println(myFirstCar.refuel());
    }

    public static void menuCar(){
        System.out.pritnln("Select what to do:");
        System.out.println("0: quit program");
    }

    public static void main(String[] args) {
        //Make a new Car object
        Car myFirstCar = new Car("green", "Ford", "Mustang", "Gasoline");

        System.out.println(myFirstCar);

        testingCar(myFirstCar);

        System.out.println(myFirstCar);

        boolean endProgram = false;
        
        while (!endProgram) {
            printMenu();
            String userAnswer = keyboard.next();
            if (userAnswer.equalsIgnoreCase("go")) {
                System.out.println("Trip of how many kms?");
                String userTrip
                myFirstCar.go()
            }
        }


    }
}