package Java10Oops.Java01Class;

public class Car {

    String brand;
    int speed;

    void displayInfo() {
        System.out.println("Brand:" + brand + " , Speed:" + speed);
    }

    public static void main(String[] args) {

        Car c = new Car();

        c.brand = "Toyota";
        c.speed = 120;

        c.displayInfo();
    }

}
