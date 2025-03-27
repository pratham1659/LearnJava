package Java10Oops.Java02Keyword;

public class JavaVariable {

    String name; // instance variable
    int rollno; // instance variable
    static String schoolName = "DAV public School"; // Static Variable
    final int MAX_AGE = 100;

    JavaVariable(String n, int r) {
        this.name = n;
        this.rollno = r;
    }

    void showLocal() {
        int x = 10; // local Variable
        System.out.println("Value of x is: " + x);
        // MAX_AGE = 120; // ❌ ERROR: Cannot modify a final variable
        System.out.println("Max Age: " + MAX_AGE);
    }

    void setValue(String n, int r) {
        name = n;
        rollno = r;
    }

    void display() {
        System.out.println("Name : " + name + "\nRoll No: " + rollno + "\nSchool Name: " + schoolName);
    }

    public static void main(String[] args) {

        JavaVariable vr = new JavaVariable("Pratham", 2345);

        vr.showLocal();

        // vr.name = "Pratham";
        // vr.rollno = 1234;

        vr.display();

        vr.setValue("Rahul", 2345);

        vr.display();

        vr.setValue("Pratham", 456);

        JavaVariable.schoolName = "XYZ School";

        vr.display();

        JavaVariable jv = new JavaVariable("Ankita", 8980);

        JavaVariable.schoolName = "ABC School";

        jv.display();
    }
}
