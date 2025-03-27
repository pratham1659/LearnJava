# Chapter 1 JAVA OOPS Fundamentals

[Topic 1 - Class and Object in Java](#Topic-1-Notes)

### [Topic 1 Notes]

### Class and Object in Java

**What is a Class?**

- A class in Java is a blueprint or template for creating objects. It defines the variables (attributes) and methods (behaviors) that the objects will have.

```
class Car {
    // Attributes (Variables)
    String brand;
    int speed;

    // Method (Behavior)
    void displayInfo() {
        System.out.println("Brand: " + brand + ", Speed: " + speed);
    }
}
```

Here, Car is a class that defines:

- brand (String) and speed (int) → Attributes
- displayInfo() → Method to print car details

**What is an Object?**

- An object is an instance of a class. It is a real-world entity that has its own values for the class attributes.

```
public class Main {
    public static void main(String[] args) {
        // Creating an Object of Car
        Car myCar = new Car();  // Object creation

        // Assigning values to the object
        myCar.brand = "Toyota";
        myCar.speed = 120;

        // Calling a method using the object
        myCar.displayInfo();
    }
}
```

Here:

- myCar is an object of the Car class.
- It has its own values for brand and speed.
- We called the displayInfo() method using myCar.

#### Analogy:

- Think of a class as a recipe and an object as the actual cake made from that recipe.
- - Class (Recipe) → Defines how a cake should be made (ingredients & steps).

- - Object (Cake) → A real cake baked using that recipe.
