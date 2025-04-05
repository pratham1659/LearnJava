package Java08Oops.Java03Constructor;

public class CarFinal {
    final int noOfWheel;

    final String model;

    final int engineInLitres;

    public CarFinal(int noOfWheel, String model, int engineInLitres) {
        this.noOfWheel = noOfWheel;
        this.model = model;
        this.engineInLitres = engineInLitres;
    }

    void display() {
        System.out.println("No of Wheel: " + noOfWheel);
        System.out.println("Model: " + model);
        System.out.println("Engine Litres: " + engineInLitres);
    }

    public static void main(String[] args) {
        CarFinal cf = new CarFinal(4, "Toyata", 15);

        // cf.engineInLitres = 56;The final CarFinal.engineInLitres cannot be assigned
        cf.display();
    }

}
