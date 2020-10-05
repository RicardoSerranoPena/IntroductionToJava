public class Car {
    
    /**
     * Make a car class
     * Make the car class have 4 attributes:
     * color, make, model, and fuel 
     * Write the setter and getter methods
     * Make a CarTester class to make a new object of the car class 
     */
    private String color;
    private String make;
    private String model;
    private String fuel;
    private int kmDriven = 0;
    private int fuelLevel = 100;
    private boolean isOff = true;

    //Constructor
    public Car(String newColor, String newMaker, String newModel, String newFuel) {
        color = newColor;
        make = newMaker;
        model = newModel;
        fuel = newFuel;
    }

    public String go(int trip) {
        if (trip <= fuelLevel) {
            kmDriven = kmDriven + trip;
            fuelLevel = fuelLevel - trip;
            isOff = false;
            return "You rode for " + trip + " km. Your gas tank is at " + fuelLevel + " fuel level.";
        } else {
            return "You don't have enough gas to make this " + trip + " km trip.";
        }

    }

    public String stop() {
        isOff = true;
        return "Your turned off your car";
    }

    public String refuel(){
        String refuelMessage; 
        if (isOff) {
            fuelLevel = 100;
            refuelMessage = "Refueling... ... Your tank is full!";
        } else {
            refuelMessage = "You have to turn off your car first to refuel";
        }
        return refuelMessage;
    }

    public String toString() {
        String ret = "My car is a " + color + " " + make + " "
                    + model + " that runs on " + fuel + ".";
        ret += " Km driven: " + kmDriven;
                
        return ret;
    }


}
