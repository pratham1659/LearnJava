package Java09Recursion;

public class Recursion02Problems {

    // Ques 1: Program to sum of its digits using recursion
    public static int sumOfDigit(int n) {

        // baseCase
        if (n >= 0 && n <= 9)
            return n;

        // subProblems
        int shortNum = sumOfDigit(n / 10);

        // selfWork
        return shortNum + (n % 10);
    }

    // Ques 2: Program to finder power
    // Time complexity O(q) times
    public static int findPower(int p, int q) {

        // baseCase
        if (q == 0)
            return 1;

        // subProblems
        int pow = findPower(p, q - 1);

        // self work
        return pow * p;
    }

    // Approach 2
    // Time complexity O(logq) times
    public static int powNum(int p, int q) {
        if (q == 0)
            return 1;

        int smalPaw = powNum(p, q / 2);

        if (q % 2 == 0) {
            return smalPaw * smalPaw;
        }

        return p * smalPaw * smalPaw;
    }

    // Given a number num and a value k. Print k multiples of num.
    public static void multiples(int num, int k) {

        // baseCase
        if (k == 1) {
            System.out.print(num + " ");
            return;
        }

        // subCase recursive work
        multiples(num, k - 1);

        // self work
        System.out.print(num * k + " ");

    }

    public static void main(String[] args) {

        int n = 523;
        System.out.println("Sum of Digits: " + sumOfDigit(n));

        System.out.println("Power of Digit: " + findPower(5, 4));
        System.out.println("Power of Digit: " + powNum(2, 5));

        multiples(12, 4);

    }
}
