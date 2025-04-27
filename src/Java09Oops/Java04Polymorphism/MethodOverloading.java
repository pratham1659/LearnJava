package Java09Oops.Java04Polymorphism;

public class MethodOverloading {

    // 1. Overloading by changing number of parameters
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // 2. Overloading by changing parameter types
    public double add(double a, double b) {
        return a + b;
    }

    // 3. Overloading by changing parameter order
    public void display(String s, int a) {
        System.out.println("String: " + s + ", int: " + a);
    }

    public void display(int a, String s) {
        System.out.println("Int: " + a + ", String: " + s);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();

        // Using different overloaded methods
        System.out.println(obj.add(5, 10)); // Output: 15
        System.out.println(obj.add(5, 10, 15)); // Output: 30
        System.out.println(obj.add(5.5, 10.5)); // Output: 16.0

        obj.display("Hello", 100); // Output: String: Hello, int: 100
        obj.display(100, "World"); // Output: Int: 100, String: World
    }
}
