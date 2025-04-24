package Java09Oops.Java04Polymorphism;

public class Calculator {

    // 1. Compile-Time Polymorphism (Static Polymorphism)
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    // 2. Runtime Polymorphism (Dynamic Polymorphism)
}

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(2, 3)); // 5
        System.out.println(c.add(2.5, 3.5)); // 6.0
        System.out.println(c.add(1, 2, 3)); // 6

        Animal a1 = new Dog(); // Upcasting
        Animal a2 = new Cat();

        a1.sound(); // Dog barks
        a2.sound(); // Cat meows
    }

}
