package Java10Oops.Java04Inheritance.VehicleTest;

// The base class
public class Vehicle {
    private String brand;
    private int launchYear;

    public Vehicle(String brand, int launchYear) {
        this.brand = brand;
        this.launchYear = launchYear;
    }

    public void start() {
        System.out.println("The vehicle is starting.");
    }

    public void stop() {
        System.out.println("The vehicle is stopping.");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + launchYear);
    }
}

// Subclass 1: Car
class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, int year, int numDoors) {
        super(brand, year);
        this.numDoors = numDoors;
    }

    public void honk() {
        System.out.println("Honk! Honk!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numDoors);
    }
}

// Subclass 2: Two Wheeler
class TwoWheeler extends Vehicle {
    private int mileage;

    public TwoWheeler(String brand, int launchYear, int mileage) {
        super(brand, launchYear);
        this.mileage = mileage;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Mileage capacity: " + mileage);
    }
}

// Subclass 2: Motorcycle
class MotorCycle extends TwoWheeler {
    private boolean hasFairing;

    public MotorCycle(String brand, int launchYear, int mileage, boolean hasFairing) {
        super(brand, launchYear, mileage);
        this.hasFairing = hasFairing;
    }

    public void wheelie() {
        System.out.println("Performing a wheelie!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Fairing: " + hasFairing);
    }

    public static void main(String[] args) {

        Car c1 = new Car("Toyata", 2024, 4);

        c1.start();
        c1.displayInfo();
        c1.displayInfo();

        TwoWheeler tw = new TwoWheeler("Honda", 2023, 45);

        tw.displayInfo();

        MotorCycle mc = new MotorCycle("Suzuki", 2024, 23, false);

        mc.displayInfo();
        c1.stop();
    }
}
