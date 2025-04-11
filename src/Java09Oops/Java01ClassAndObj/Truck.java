package Java09Oops.Java01ClassAndObj;

public class Truck {

    static int noOfCarsAvail = 0;
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;
    static int minimumAgeOfDriving = 18;

    String name;
    String dateOfLicence;
    int age;

    public boolean isAllowedToDrive() {
        return this.age >= minimumAgeOfDriving;
    }

    static {
        noOfCarsAvail = 0;
        System.out.println("Blocks with static run once when the class is Loaded");
    }
    {
        noOfCarsAvail++;
        System.out.println("Code blocks f} determine the scope of variables");
    }

    Truck(String color, int noOfSeats) { // Default Constructor
        noOfWheels = 4;
        this.color = color; // Parametrized Constructor
        maxSpeed = 120;
        currentFuelInLiters = 2;
        this.noOfSeats = noOfSeats;
    }

    Truck() { // Default Constructor
        this("Black", 7);
        currentFuelInLiters = 5;
    }

    public Truck start() {
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

    public static void main(String[] args) {
        Truck thar = new Truck();
        Truck swift = new Truck("Red", 6);

        // swift.addFuel(6);
        // Car swiftCar = swift.start();
        // swiftCar.drive();
        System.out.println();
        thar.start().drive();
        System.out.println("Fuel level : " + thar.getCurrentFuelLevel());
        System.out.println("Car Default Colour: " + thar.color);
        System.out.println();

        swift.start().drive();
        System.out.println("Fuel level : " + swift.getCurrentFuelLevel());
        System.out.println("Car Default Colour: " + swift.color);

        Truck tr = new Truck();
        tr.name = "PrathamKr.";
        tr.dateOfLicence = "29-01-2023";

        System.out.println("Minimum Age: " + minimumAgeOfDriving);
    }
}
