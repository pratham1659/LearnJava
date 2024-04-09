package Java09Recursion;

public class Recursion01Basic {

    // Ques 1: Program to find Factorial Array
    // Time Complexity per call: O(1)
    // Space Complexity per call:
    // With tail call optimization: O(1)
    // Without tail call optimization: O(n)
    public static int factorial(int n) {

        // Base case
        if (n == 0)
            return 1;

        // smaller problem
        int ans = factorial(n - 1);

        // big problem - self problem
        int factAns = n * ans;
        return factAns;
    }

    // Ques 2: program to find Factorial Array
    // time complexity - O(2^n) time complexity
    // space Complexity - O(2^n) space complexity
    public static int fibonacci(int n) {

        // Base case
        if (n == 0 || n == 1) {
            return n;
        }
        // SubProblems
        int prev = fibonacci(n - 1);
        int prevPrev = fibonacci(n - 2);

        // Self Work
        return prev + prevPrev;
    }

    public static void main(String[] args) {

        System.out.println("Factorial: " + factorial(4));

        for (int i = 0; i <= 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}

