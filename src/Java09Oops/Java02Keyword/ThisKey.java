package Java09Oops.Java02Keyword;

public class ThisKey {

    String sname;
    int rollNo;

    // Constructor with one parameter
    ThisKey(String name) { // Constructor parameter (same name as instance variable)
        this(name, 234); // Calls another constructor
    }

    // Constructor with two parameters
    ThisKey(String name, int rollNo) {
        this.sname = name;
        this.rollNo = rollNo;
    }

    ThisKey getThisKey() {
        return this;
    }

    void startEngine() {
        System.out.println("Engine Started...");
    }

    void drive() {
        this.startEngine();// Calls another method in the same class
        System.out.println("Car is Moving...");
    }

    void display() {
        System.out.println("Student Name: " + sname + "\nRoll No: " + 234);
    }

    public static void main(String[] args) {

        ThisKey tk = new ThisKey("Pratham", 0);

        tk.display();

        tk.drive();

        tk.getThisKey().display();

    }
}
