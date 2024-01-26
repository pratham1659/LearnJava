package Java08Oops.JavaClass;

public class Car {

    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    public void drive(){
        System.out.println("Car is Drive");
        currentFuelInLiters --;
    }

    public void addFuel(float fuel){
        currentFuelInLiters +=  fuel;
    }

    public float getCurrentFuelLevel(){
        return currentFuelInLiters;
    }

    public static void main(String[] args) {
        Car car = new Car();
    }
}
