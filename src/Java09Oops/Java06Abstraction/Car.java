package Java09Oops.Java06Abstraction;

public class Car {

    private void moveBreakPads() { // Hiding the implements

    }

    private void changePistonSpeed() { // Hiding the implements
    }

    private void createSpark() { // Hiding the implements
    }

    public void turnOnCar() {
        createSpark();
    }

    public void accelerate() {
        changePistonSpeed();
    }

    public void brake() {
        moveBreakPads();
    }

    public static void main(String[] args) {

        Car ca = new Car(); // Create Object

        ca.turnOnCar();
        ca.accelerate();
        ca.brake();
    }

}
