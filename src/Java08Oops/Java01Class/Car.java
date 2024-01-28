package Java08Oops.Java01Class;

public class Car {

    static int noOfCarsAvail = 0;
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    static{
        noOfCarsAvail = 0;
        System.out.println("Blocks with static run once when the class is Loaded");
    }{
        noOfCarsAvail++;
        System.out.println("Code blocks f} determine the scope of variables");
    }

    Car(String color, int noOfSeats) {       // Default Constructor
        noOfWheels = 4;
        this.color = color;             //Parametrized Constructor
        maxSpeed = 120;
        currentFuelInLiters = 2;
        this.noOfSeats = noOfSeats;
    }

    Car() {       // Default Constructor
        this("Black", 7);
        currentFuelInLiters = 5;
    }


    public Car start() {
        if (currentFuelInLiters <= 0) {
            System.out.println("Car is Out of Fuel, cannot Start");
        } else if (currentFuelInLiters < 5) {
            System.out.println("Car is in Reserved Mode, Please Refuel!");
        } else {
            System.out.println("Car is Started.... Bruhhh");
        }
        return this;
    }

    public void drive() {
        currentFuelInLiters--;
        System.out.println("Car is Driving");

    }

    public void addFuel(float currentFuelInLiters) {
        this.currentFuelInLiters += currentFuelInLiters;
    }

    public float getCurrentFuelLevel() {
        return currentFuelInLiters;
    }
}
