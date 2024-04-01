package Java04Array;

public class Array5Find {

    /*
     * Find Armstrong Number
     * 153
     * 1*1*1 = 1
     * 5*5*5 = 125
     * 3*3*3 = 27
     * 1+125+27 = 153
     * 
     * 407 = 4*4*4 + 0 + 7*7*7 = 407
     * 
     */

    public static boolean findArmstrong(int num) {
        // Count the number of digits
        int numberOfDigits = String.valueOf(num).length();
        int originalNum = num;
        int sum = 0;

        // Calculate the sum of digits raised to the power of the number of digits
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numberOfDigits);
            num /= 10;
        }

        // Check if the sum is equal to the original number
        return sum == originalNum;
    }

    /*
     * Find Factorial
     * fact of 3 = 3 * 2 * 1 = 6
     * fact of 4 = 4 * 3 * 2 * 1 = 24
     */

    public static int findFactorial(int num) {

        // 1. without recursive -- use for loop
        int fact = 1;
        if (num == 0) {
            return 1;
        }
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;

    }

    // 2. with Recursive function: a function is calling itself
    public static int fact(int num) {

        if (num == 0) {
            return 1;
        } else {
            return (num * fact(num - 1));
        }
    }

    public static void main(String[] args) {

        int num = 153;
        System.out.println(num + " is Armstrong? " + findArmstrong(num));

        System.out.println("Factorial of " + 4 + " is " + findFactorial(4));

        System.out.println("Factorial of " + 4 + " is " + fact(4));

    }
}
