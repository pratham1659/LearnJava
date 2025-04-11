package Java09Oops.Java03Constructor;

public class Bike {

    int id;
    String name;
    int roll;

    // creating a default constructor
    Bike() {
        System.out.println("Bike is Created");
    }

    // Constructor Overloading in Java
    Bike(int i, String n) {
        // creating two arg constructor
        id = i;
        name = n;
    }

    Bike(Bike s) {
        id = s.id;
        name = s.name;
    }

    // Constructor Overloading in Java
    Bike(int i, String n, int r) {
        // creating Three arg constructor
        // Copying Values Without Constructor
        id = i;
        name = n;
        roll = r;
    }

    void display() {
        // method to display the value of id and name
        System.out.println(id + " " + name + " " + roll);
    }

    public static void main(String[] args) {
        // calling a default constructor
        Bike b1 = new Bike();
        Bike b2 = new Bike(123, "Pratham");
        Bike b3 = new Bike(2, "Rahul", 234);
        Bike b4 = new Bike(b3);
        b1.display();
        b2.display();
        b3.display();
        b4.display();

    }

}
