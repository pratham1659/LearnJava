package Java10Oops.Java04Inheritance;

class Animal {

    String name;

    void eat() {
        System.out.println(name + " is eating");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println(name + "is Barking");
    }
}

public class Java01Single {

    public static void main(String[] args) {

        Dog myDog = new Dog();
        myDog.name = "Buddy";

        myDog.eat();
        myDog.bark();
    }

}
