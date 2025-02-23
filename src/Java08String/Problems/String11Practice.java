package Java08String.Problems;

import java.util.Scanner;

public class String11Practice {
    static Scanner sc = new Scanner(System.in);

    // Concatenate and Convert: Take two strings, concatenate them,
    // ánd convert the result to uppercase.
    public static void StringName() {
        String firstName = "Rakesh";
        String lastName = "Kumar";
        String fullName = firstName.concat(" ").concat(lastName);

        System.out.println(fullName.toUpperCase());
    }

    // Calculate the area and circumference of a circle for a given radius using
    // Math.PI
    double radiusInMm;

    // StringPractice(){
    // //Empty Constructor
    // }
    String11Practice(double radiusInMm) {
        this.radiusInMm = radiusInMm;
    }

    double getCircumference() {
        return 2 * Math.PI * radiusInMm;
    }

    double getArea() {
        return (Math.PI * Math.pow(radiusInMm, 2));
    }

    @Override
    public String toString() {
        return "StringPractice{" +
                "radiusInMm=" + radiusInMm +
                ", Circumference of Circle=" + getCircumference() +
                ", Area Of Circle=" + getArea() +
                '}';
    }

    // Simulate a dice roll using Math.random) and display the outcome (1 to 6).
    int diceRoll() {
        double random = Math.random() * 6;
        return (int) Math.ceil(random);
    }

    // Create a number guessing game where the program selects a random number, and
    // the user has to guess it.
    int random;

    String11Practice() {
        random = (int) Math.ceil(Math.random() * 100);
    }

    int guess(int num) {
        return num - random;
    }

    public static void main(String[] args) {
        // StringName();

        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Radius: ");
        // double num = sc.nextDouble();

        // StringPractice str = new StringPractice();
        // for(int i = 1; i<20; i++){
        // System.out.print(str.diceRoll() + " ");
        // }

        int guess;
        int result;
        String11Practice game = new String11Practice();
        do {
            System.out.print("Guess the number: ");
            guess = sc.nextInt();
            result = game.guess(guess);
            if (result == 0) {
                System.out.println("Congrats your guess is correct, Hurray");
            } else if (result < 0) {
                System.out.println("Please guess Higher number, ------");
            } else {
                System.out.println("Please guess lower, ------");
            }
        } while (result != 0);
        sc.close();

    }
}
