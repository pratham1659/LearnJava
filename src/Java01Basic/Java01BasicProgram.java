package Java01Basic;

public class Java01BasicProgram {

    // Ques Multiplication Table of 2
    public static void multiplyTable(int num) {
        int i = 1;
        while (i <= 10) {
            System.out.printf("5 X %d = %d%n", i, i * num);
            i++;
        }
    }

    // Ques: Print the sum of the first n natural numbers, where n is the input.
    public static int sumOfNatural(int num) {
        int i = 1;
        int sum = 0;
        while (i <= num) {
            sum += i;
            i++;
        }
        return sum;
    }

    // Ques: program to sum all odd numbers from 1 to a specified number N.
    public static int sumOfOddNumbers(int num) {
        int i = 1;
        int sumOfOdd = 0;
        while (i <= num) {
            if (i % 2 != 0) {
                sumOfOdd += i;
            }
            i++;
        }
        return sumOfOdd;
    }

    // Ques: program that calculates the factorial of a given number.
    public static long factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Number must be positive");
        }
        long fact = 1;
        int i = 1;
        while (i <= num) {
            fact = fact * i;
            i++;
        }
        return fact;
    }

    // Ques: program that computes the sum of the digits of an integer.
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }

    // Ques: program to find the Least Common Multiple (LCM) of two numbers.
    public static int leastCommonMultiplier(int num1, int num2) {
        int max = Math.max(num1, num2);
        while (true) {
            if (max % num1 == 0 && max % num2 == 0) {
                return max;
            }
            max++;
        }
    }

    // Ques: program to find the Greatest Common Divisor (GCD) of two numbers.
    public static int greatestCommonDivisor(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    public static boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % 2 == 0) {
                return false;
            }
        }
        return true;

        // int i = 2;
        // while (i < num) {
        // if (num % 2 == 0) {
        // return false;
        // }
        // i++;
        // }
        // return true;
    }

    // Ques: program to reverse the digits of a number.
    public static int reverseDigit(int num) {
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num = num / 10;
        }
        return newNum;
    }

    public static void main(String[] args) {

        System.out.println("Sum of 10 Natural numbers: " + sumOfNatural(10));
        System.out.println("Sum of Odd numbers: " + sumOfOddNumbers(100));
        System.out.println("Factorial of 5: " + factorial(5));
        System.out.println("Sum of Digits: " + sumOfDigits(123));
        System.out.println("Lcm of 10 and 20: " + leastCommonMultiplier(3, 180));
        System.out.println("Gcd of 5 and 6: " + greatestCommonDivisor(5, 16));
        System.out.println("Check Prime of 49: " + checkPrime(49));
        System.out.println("Reverse Digit 123: " + reverseDigit(123));

    }
}
