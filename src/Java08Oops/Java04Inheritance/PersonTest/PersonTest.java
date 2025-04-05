package Java08Oops.Java04Inheritance.PersonTest;

// Example usage
public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);
        Person person3 = new Person("Alice", 30);

        // Testing equals method
        System.out.println("person1 equals person2: " + person1.equals(person2)); // false
        System.out.println("person1 equals person3: " + person1.equals(person3)); // true

        // Testing hashCode method
        System.out.println("person1 hashCode: " + person1.hashCode());
        System.out.println("person2 hashCode: " + person2.hashCode());
        System.out.println("person3 hashCode: " + person3.hashCode());
    }
}
