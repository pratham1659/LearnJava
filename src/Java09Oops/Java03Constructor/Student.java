package Java09Oops.Java03Constructor;

public class Student {

    int roll;
    String name;
    static String college = "Chandigarh University";
    int age;

    void changeCollege() {
        college = "LPU University";
    }

    Student() {
        System.out.println("Student is Created:");
    }

    // creating two arg constructor
    Student(int r, String n) { // creating a parameterized constructor
        this.roll = r;
        this.name = n;
    }

    Student(int r, String n, int a) {
        this.roll = r;
        this.name = n;
        this.age = a;
    }

    // Constructor Overloading
    void display() { // method to display the value of id and name
        System.out.println("RollNo: " + roll + "\nAge: " + age + "\nName: " + name + "\nCollege: " + college);
    }

    // Main class to create objects and calling methods
    public static void main(String[] args) {

        Student st = new Student(12, "Pratham");

        st.display();

        st.changeCollege();

        st.display();

        Student st2 = new Student(12, "Pratham", 23);

        st2.display();
    }

}
