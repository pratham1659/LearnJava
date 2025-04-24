package Java09Oops.Java05Inheritance;
// package Java09Oops.Java04Inheritance;

// // Parent class (Base class)
// class Animal {
// String name;

// // Constructor of Animal class
// public Animal(String name) {
// this.name = name;
// }

// public void eat() {
// System.out.println(name + " is Eating");
// }
// }

// class Mammal extends Animal {
// int legs;

// // Constructor of Mammal class
// public Mammal(String name, int legs) {
// super(name);
// this.legs = legs;
// }

// public void walk() {
// System.out.println(name + " is walking on " + legs + " legs.");
// }
// }

// class Dog extends Mammal {
// String breed;

// public Dog(String name, int legs, String breed) {
// super(name, legs);
// this.breed = breed;
// }

// public void bark() {
// System.out.println(name + " is barking. Breed: " + breed);
// }

// // Overriding display method to show all details
// public void displayInfo() {
// super.eat(); // Calling eat() method from Animal class
// super.walk(); // Calling walk() method from Mammal class
// System.out.println("Breed: " + breed);
// }
// }

// public class Java02MultiLevel {
// public static void main(String[] args) {
// Dog myDog = new Dog("Candy", 4, "Street Dog");

// myDog.displayInfo(); // Calls eat() and walk() internally
// myDog.bark(); // Specific to Dog class
// }
// }
