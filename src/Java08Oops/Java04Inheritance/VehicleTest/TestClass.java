package Java08Oops.Java04Inheritance.VehicleTest;

import Java08Oops.Java04Inheritance.VehicleTest.Car;
import Java08Oops.Java04Inheritance.VehicleTest.Motorcycle;

public class TestClass {

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2022, 4);
        myCar.start();
        myCar.honk();
        myCar.displayInfo();
        myCar.stop();

        System.out.println();

        Motorcycle myMotorcycle = new Motorcycle("Harley Davidson", 2023, true);
        myMotorcycle.start();
        myMotorcycle.wheelie();
        myMotorcycle.displayInfo();
        myMotorcycle.stop();
    }
}
