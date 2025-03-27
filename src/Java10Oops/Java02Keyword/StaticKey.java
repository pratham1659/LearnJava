package Java10Oops.Java02Keyword;

public class StaticKey {

    static int staticInt = 20;
    int instanceVar = 30;

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

    public static void main(String[] args) {

        StaticKey st = new StaticKey();

        StaticKey.staticMethod();

        st.nonStaticMethod();

        StaticNestedClass obj = new StaticNestedClass();

        obj.display();

    }
}
