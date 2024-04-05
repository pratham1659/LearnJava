package Java10Oops.Java01Class;

public class Driver {

    static int minimumAgeOfDriving = 18;

    String name;
    String dateOfLicence;
    int age;

    public boolean isAllowedToDrive() {
        return this.age >= minimumAgeOfDriving;
    }


    public static void main(String[] args) {
        Car thar = new Car();
        Car swift = new Car("Red", 6);

//        swift.addFuel(6);
//        Car swiftCar = swift.start();
//        swiftCar.drive();
        System.out.println();
        thar.start().drive();
        System.out.println("Fuel level : " + thar.getCurrentFuelLevel());
        System.out.println("Car Default Colour: " + thar.color);
        System.out.println();

        swift.start().drive();
        System.out.println("Fuel level : " + swift.getCurrentFuelLevel());
        System.out.println("Car Default Colour: " + swift.color);


        Driver myDriver = new Driver();
        myDriver.name = "PrathamKr.";
        myDriver.dateOfLicence = "29-01-2023";

        System.out.println("Minimum Age: " + minimumAgeOfDriving);
    }
}
