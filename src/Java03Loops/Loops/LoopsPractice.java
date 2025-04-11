package Java03Loops.Loops;

import java.util.Scanner;

public class LoopsPractice {

    // Ques 1: Sum the previous integer, when user enter negative loop will break
    public static void checkNegativeInteger() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter negative to break: ");
        int num = sc.nextInt();
        int sum = 0;

        // Print the sum of the stream of integers in the input.
        while (num != -1) {
            sum += num;
            num = sc.nextInt();

        }
        System.out.println("Return sum " + sum);

        sc.close();
    }

    // Ques 2: when user Enter 5, loop will break
    public static int loopBreak(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
            if (i == 5) {
                break;
            }
        }
        return num;
    }

    // Ques 3: Print the first multiple of 5 which is also a multiple of 7.
    static void multipleOf5and7() {
        int num = 1;
        while (true) {
            if ((num % 5 == 0) && (num % 7 == 0)) {
                System.out.println("Found ans: " + num);
                break;
            }
            num++;
        }
    }

    // Ques 4: Print all the values between 1 and 50 except for the multiples of 3.
    public static int expectThree(int num) {
        for (int i = 0; i < num; i++) {
            if (i % 3 == 0) {
                System.out.println("Removed element:" + i);
                continue;
            }
            System.out.println(i + " ");
        }
        return num;
    }

    // Ques 4: Program to find the prime factors of a numbers
    public static boolean isPrime(int num) {

        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void primeFactor(int num) {

        for (int i = 1; i <= num; i++) {
            if (num % i == 0 && isPrime(i) == true) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Ques 5: Convert number from binary to Decimal
    // 0 * 2^0, 1 * 2^1, 0 * 2^2, 1 * 2^3
    public static void binaryToDecimal(int num) {

        int sumNum = 0;
        int power = 1;
        while (num > 0) {
            int lastDigit = num % 10;
            sumNum = sumNum + lastDigit * power;
            power = power * 2;
            num = num / 10;
        }

        System.out.println(sumNum);

    }

    // Ques 7: Check n^Cr value for the two integer
    // n^Cr = n! / (r! * (n - r)!)
    public static long factorial(long num) {
        long fact = 1;
        for (long i = 1; i <= num; i++) {

            fact = fact * i;
        }
        return fact;
    }

    public static void valueNcr(int num1, int num2) {

        long n = factorial(num1);
        long r = factorial(num2);
        long nr = factorial(num1 - num2);

        long value = n / r;
        value = value / nr;

        System.out.println(value);
    }

    public static void main(String[] args) {

        // checkNegativeInteger();
        // loopBreak(6);
        // multipleOf5and7();
        // expectThree(45);
        // primeFactor(200);
        // findFibonnaci(12);
        binaryToDecimal(1011);
        valueNcr(5, 2);
    }
}
