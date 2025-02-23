package Java10Oops.Java04Inheritance.VehicleTest;

// The base class
public class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void start() {
        System.out.println("The vehicle is starting.");
    }

    public void stop() {
        System.out.println("The vehicle is stopping.");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
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

// Subclass 2: Motorcycle
class Motorcycle extends Vehicle {
    private boolean hasFairing;

    public Motorcycle(String brand, int year, boolean hasFairing) {
        super(brand, year);
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
}


