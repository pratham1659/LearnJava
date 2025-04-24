package Java09Oops.Java01ClassAndObj;

public class Car {

    String brand;
    int speed;
    static int numberOfTyres;

    void printSpeed() {
        System.out.println("Vehicle speed: " + speed);
    }

    static void printTyres() { // This can be called wihout objects
        System.out.println("Number of Tyres: " + numberOfTyres);
    }

    void displayInfo() {
        System.out.println("Brand:" + brand + " \nSpeed:" + speed + " \nNumber Of Tyres:" + numberOfTyres);
    }

    // Non Static -- > non shareable
    // static -> shareable
    // If you change that property on object
    // it will reflect in another object;

    public static void main(String[] args) {

        Car car = new Car();
        car.brand = "Toyota";
        car.speed = 120;
        Car.numberOfTyres = 4;

        car.printSpeed();

        Car bmw = new Car();
        bmw.brand = "Toyota";
        bmw.speed = 100;
        Car.numberOfTyres = 8;

        bmw.printSpeed();

        Car.printTyres();

        car.displayInfo(); // it change the previous value of CAR

    }

}
