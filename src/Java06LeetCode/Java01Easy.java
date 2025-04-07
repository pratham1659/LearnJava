package Java06LeetCode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

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

    // Ques 3: Chracter Repetiton
    // https://cses.fi/problemset/task/1069
    public static void CharRepetition() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String dna = br.readLine();

        long maxLength = 1;
        long currentLength = 1;

        for (int i = 1; i < dna.length(); i++) {
            if (dna.charAt(i) == dna.charAt(i - 1)) {
                currentLength++;
            } else {
                currentLength = 1;
            }
            maxLength = Math.max(maxLength, currentLength);
        }

        System.out.println(maxLength);
    }

    // Ques 4: Increasing Array
    // https://cses.fi/problemset/task/1094/
    public static void IncreasingArr() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        long moves = 0;
        int prev = Integer.parseInt(st.nextToken());

        for (int i = 1; i < n; i++) {
            int current = Integer.parseInt(st.nextToken());

            if (current < prev) {
                moves += (prev - current);
            } else {
                prev = current;
            }
        }

        System.out.println(moves);
    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // long[] numbers = getInputNumbers(n);
        // System.out.println(findMissing(numbers, n));

        // System.out.println(powerOfTwo2(n));
        CharRepetition();
        IncreasingArr();

        sc.close();

    }

}
