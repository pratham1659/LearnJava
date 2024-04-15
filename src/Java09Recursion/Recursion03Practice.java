package Java09Recursion;

import java.util.Scanner;

public class Recursion03Practice {

    static Scanner sc = new Scanner(System.in);

    //Ques 1: Factorial in Java using for Loops
    public static long factorialWithLoop(int num) {
        long ans = 1;
        for (int i = 1; i <= num; i++) {
            ans *= i;
        }
        return ans;
    }

    //Ques 2: Factorial in Java Using Recursion Calls
    public static long factorial(int num) {
        System.out.println("Function called for: " + num);
        if (num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    //Ques 3: Create a program to find password checker until a valid password is entered.
    public static boolean isValidPassword(String password) {
        return password.length() > 6;
    }

    public static void checkPassword() {
        String password;
        do {
            System.out.print("Please Enter your Password: ");
            password = sc.next();
        } while (!isValidPassword(password));
        System.out.println("Thanks for Entering a valid password");
    }

    //Ques 4: Create a program using do-while to implement a number guessing game.
    public static void guessGame() {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = (int) (Math.random() * 100) + 1; // Generate a random number between 1 and 100
        int attempts = 0;
        int guess = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it.");

        while (guess != secretNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Too low. Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high. Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }
        }

        scanner.close();
    }


    //Ques 5: Create a program using break to read inputs from the user in a loop and break
    // the loop if a specific keyword (like "exit") is entered.
    public static void inputOnExit() {
        String str;
        while (true) {
            System.out.print("Enter your Command: ");
            str = sc.nextLine();
            if (str.equalsIgnoreCase("exit")) {
                System.out.println("You Have Successfully Exited");
                break;
            }
        }
    }

    //Ques 6: Create a program using continue to sum all positive numbers entered by the
    //user skip any negative numbers.
    public static void skipNegative(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i < 0) {
                continue;
            }
            sum += i;
        }
        System.out.println("Sum of positive number: " + sum);
    }

    public static void main(String[] args) {

        System.out.println("Factorial: " + factorialWithLoop(8));
        System.out.println("Factorial: " + factorial(12));
        inputOnExit();
        checkPassword();
        guessGame();

        int[] arr = {-1, 2, 4, 5, -8, -5};
        skipNegative(arr);
    }
}
