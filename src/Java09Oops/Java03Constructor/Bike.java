package Java09Oops.Java03Constructor;

public class Bike {

    int id;
    String name;
    int roll;

    // creating a default constructor
    Bike() {
        System.out.println("This is non parametried Constructor");
    }

    // parametried Constructor in Java
    Bike(int id, String name) {
        // creating two arg constructor
        this.id = id;
        this.name = name;
        System.out.println("This is parametried Constructor");
    }

    // // Constructor Overloading in Java
    // Bike(int i, String n) {
    // // creating two arg constructor
    // id = i;
    // name = n;
    // }

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
        b1.display();

        Bike b2 = new Bike(123, "Pratham");
        b2.display();

        Bike b3 = new Bike(2, "Rahul", 234);
        b3.display();

        Bike b4 = new Bike(b3);
        b4.display();

    }

}
