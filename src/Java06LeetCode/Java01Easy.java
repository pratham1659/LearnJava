package Java06LeetCode;

import java.util.Scanner;

public class Java01Easy {

    // Function to get input from the user
    public static long[] getInputNumbers(long n) {
        Scanner sc = new Scanner(System.in);

        if (n <= 1) {
            sc.close();
            System.out.println("Please enter a number greater than 1.");
            return new long[0]; // Return an empty array
        }

        long[] numbers = new long[(int) (n - 1)];
        System.out.println("Enter " + (n - 1) + " numbers:");

        for (long i = 0; i < n - 1; i++) {
            numbers[(int) i] = sc.nextLong();
        }

        sc.close();
        return numbers; // Return the array of numbers
    }

    // Ques 1: You are given all numbers between 1,2,....n except one.
    // find the missing number. https://cses.fi/problemset/task/1083
    public static long findMissing(long[] numbers, long n) {

        long expectedSum = n * (n + 1) / 2;
        long actualSum = 0;

        for (long num : numbers) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    // Ques 2: Power of Two
    // https://leetcode.com/problems/power-of-two
    // Without using loops or recursion
    public static boolean powerOfTwo1(int n) {

        return n > 0 && (n & (n - 1)) == 0;
    }

    public static boolean powerOfTwo2(int n) {

        while (n % 2 == 0) {
            n = n / 2;
        }

        if (n == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // long[] numbers = getInputNumbers(n);
        // System.out.println(findMissing(numbers, n));

        System.out.println(powerOfTwo2(n));

        sc.close();

    }

}
