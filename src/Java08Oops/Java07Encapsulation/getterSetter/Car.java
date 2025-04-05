package Java10Oops.Java07Encapsulation.getterSetter;

public class Car {
    private String colour;
    private String model;
    private double fuelLevel;
    private double costOfPurchase;

    public Car() {
        //Empty Constructor
    }

    public Car(String color, String model, double fuelLevel, double costOfPurchase) {
        this.colour = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

    public String getColor() {
        return colour;
    }

    public String getModel() {
        return model;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public double getCostOfPurchase(){
        return costOfPurchase;
    }

    public void setColour(String colour) {
        if(colour.equals("Yellow")){
            System.out.println(false);
        }else{
            this.colour = colour;
        }

    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public void setCostOfPurchase(double costOfPurchase) {
        this.costOfPurchase = costOfPurchase;
    }
}
