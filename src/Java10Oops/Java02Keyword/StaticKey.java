package Java10Oops.Java02Keyword;

public class StaticKey {

    static int staticInt = 20;
    int instanceVar = 30;
    int rollNo; // instance variable
    String name;
    static String college = "Chitkara University";

    static int count = 0;

    StaticKey() {
        count++;
        System.out.println("Single Parameter");
        System.out.println("count: " + count);
    }

    StaticKey(int r, String n) {
        rollNo = r;
        name = n;
    }

    // static method to change the value of static variable
    static void change() {
        college = "LPU College";
    }

    static void staticMethod() {
        System.out.println("Static Method: " + staticInt);
    }

    void nonStaticMethod() {
        System.out.println("Non Static Method: " + instanceVar);
    }

    static class StaticNestedClass {
        void display() {
            System.out.println("Static Nested Class: " + staticInt);
        }
    }

    void display() {
        System.out.println("RollNo: " + rollNo + "\nName: " + name + "\nCollege: " + college);
    }

    public static void main(String[] args) {

        StaticKey st = new StaticKey();
        StaticKey st2 = new StaticKey();

        StaticKey.staticMethod();

        st.nonStaticMethod();
        st2.nonStaticMethod();

        StaticNestedClass obj = new StaticNestedClass();

        obj.display();

        StaticKey st3 = new StaticKey(12, "Pratham");
        st3.display();

        StaticKey.change();

        StaticKey st4 = new StaticKey(12, "Pratham");
        st4.display();

    }
}
