package Java09Recursion;

import java.util.Scanner;

public class JavaClass {
    static Scanner sc = new Scanner(System.in);

    //Factorial in Java using Loops
    public static long factorialWithLoop(int num) {
        long ans = 1;
        for (int i = 1; i <= num; i++) {
            ans *= i;
        }
        return ans;
    }

    public static int[] inputArray() {
        System.out.print("Enter the Size of an Array: ");
        int index = 0;
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i : arr) {
            arr[index++] = sc.nextInt();
            if (index >= num)
                break;
        }
        return arr;
    }

    public static String[] inputString() {
        System.out.print("Enter Size of an Array: ");
        int index = 0;
        int num = sc.nextInt();
        String[] str = new String[num];
        for (String i : str) {
            str[index++] = sc.next();
            if (index >= num)
                break;
        }
        return str;
    }

    //Factorial in Java Using Recursion Calls
    public static long factorial(int num) {
        System.out.println("Function called for: " + num);
        if (num == 1) {
            return 1;
        }

        return num * factorial(num - 1);
    }

//    Create a program using do-while to find password checker until a valid password is entered.

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

    // Create a program using do-while to implement a number guessing game.
    public static void guessGame() {
        int num = 5, guess;
        do {
            System.out.print("Please Guess the Number: ");
            guess = sc.nextInt();
        } while (num != guess);
        System.out.println("You Have Successfully Guess the Number");
    }

    //    Create a program using for loop multiplication table for a number.
    public static void multiplicationTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "X" + i + "=" + num * i);
        }
    }


    //    Create a program using for to display if a number is prime or not.
    public static boolean isPrime(int num) {
        if (num == 0 || num == 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    //    Create a program using for-each to find the maximum value in an integer array.
    public static void maxArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (max < num) {
                max = num;
            }
        }

        System.out.println("Maximum Number is " + max);
    }

    //    Create a program using for-each to the occurrences of a specific element in an array.
    public static int occurrencesCheck(int[] arr, int num) {
        int count = 0;
        for (int i : arr) {
            if (i == num) {
                count++;
            }
        }
        return count;
    }

    //    Create a program using break to read inputs from the user in a loop and break
//the loop if a specific keyword (like "exit") is entered.
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
//    Create a program using continue to sum all positive numbers entered by the
//    user; skip any negative numbers.

    public static void skipNegative() {
        int[] arr = inputArray();
        int sum = 0;
        for (int i : arr) {
            if (i < 0) {
                continue;
            }
            sum += i;
        }
        System.out.println("Sum of positive number: " + sum);
    }

    //    Create a program using continue to print only even numbers using continue for
//    odd numbers.
    public static void skipOddEven() {
        int[] arr = inputArray();

        for (int i : arr) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }

    //    Create a program using recursion to display the Fibonacci series upto a certain number.
    public static int fibonacci(int position) {
//        System.out.print(".");
        if (position == 1) {
            return 0;
        }
        if (position == 2) {
            return 1;
        }
        return fibonacci(position - 1)
                + fibonacci(position - 2);
    }

//    Create a program using recursion to check if a string is a palindrome using
//    recursion.

    public static boolean checkPalindrome(String str) {
        if(str.length() <= 1){
            return true;
        }
        int lastPos = str.length() - 1;
        if(str.charAt(0) != str.charAt(lastPos)){
            return false;
        }
        String newStr = str.substring(1, lastPos);
        return checkPalindrome(newStr);
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("please Enter your num: ");
//        int num = sc.nextInt();

        System.out.print("Enter your String: ");
        String str = sc.next();
//        System.out.println("Factorial of " + num + " is " + factorial(num));

//        checkPassword();

//        guessGame();

//        multiplicationTable(num);

//        System.out.println("Your number is " + (isPrime(num) ? "prime" : "Not Prime"));

//        maxArray(inputArray());

//        System.out.println(occurrencesCheck(inputArray(), 5));

//        inputOnExit();

//        skipNegative();

//        skipOddEven();

//        for (int i = 1; i <= num; i++) {
//            System.out.print(fibonacci(i) + " ");
//        }


        System.out.println(checkPalindrome(str) ? "Palindrome":"not Palindrome");
    }
}
