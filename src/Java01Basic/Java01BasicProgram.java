package Java01Basic;


public class Java01BasicProgram {

    // Ques 1: Program to check EvenOrOdd
    public static boolean isEvenOrOdd(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Ques 2: Program to check divideBy5
    public static boolean isDivideBy5(int num) {
        if (num % 5 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Ques 3: Program to check Leap Year Or Not
    public static boolean isLeapYearOrNot(int num) {
        if ((num % 4 == 0) && (num % 100 != 0) || (num % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    // Ques 4: Program to check Absolute Integer
    public static int isAbsoluteInteger(int num) {
        if (num < 0) {
            num = num * (-1);
        }
        return num;
    }

    // Ques 5: Program to check cost price and selling price of an item check profit
    // and Loss.
    public static void isProfitAndLoss(int cp, int sp) {
        int profit = 0;
        int loss = 0;
        if (cp < sp) {
            profit = sp - cp;
            System.out.println("Profit will be " + profit);
        } else if (sp < cp) {
            loss = cp - sp;
            System.out.println("Loss will be " + loss);
        }

    }

    // Ques 6: Multiplication Table of 2
    public static void multiplyTable(int num) {
        int i = 1;
        while (i <= 10) {
            System.out.printf("5 X %d = %d%n", i, i * num);
            i++;
        }
    }

    // Ques 7: Print the sum of the first n natural numbers, where n is the input.
    public static int sumOfNatural(int num) {
        int i = 1;
        int sum = 0;
        while (i <= num) {
            sum += i;
            i++;
        }
        return sum;
    }

    // Ques 8: program to sum all odd numbers from 1 to a specified number N.
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

    // Ques 9: program that calculates the factorial of a given number.
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

    // Ques 10: program that computes the sum of the digits of an integer.
    public static int noOfDigits(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    // Ques 11: program that computes the sum of the digits of an integer.
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }

    // Ques 12: program to find the Least Common Multiple (LCM) of two numbers.
    public static int leastCommonMultiplier(int num1, int num2) {
        int max = Math.max(num1, num2);
        while (true) {
            if (max % num1 == 0 && max % num2 == 0) {
                return max;
            }
            max++;
        }
    }

    // Ques 13: program to find the Greatest Common Divisor (GCD) of two numbers.
    public static int greatestCommonDivisor(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    // Ques 14: program that computes the sum of the digits of an integer.
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

    // Ques 15: program to reverse the digits of a number.
    public static int reverseDigit(int num) {
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num = num / 10;
        }
        return newNum;
    }

    // Ques 16: swap in digits
    public static void swap(int a, int b) {
        System.out.println("Original Values: ");
        System.out.println("a " + a);
        System.out.println("b " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap Values: ");
        System.out.println("a " + a);
        System.out.println("b " + b);

    }

    // Ques 17: swap Without Temp
    public static void swapWithoutTemp(int a, int b) {
        System.out.println("Original Values: ");
        System.out.println("a " + a);
        System.out.println("b " + b);

        a = a + b; // 11 = 9 + 3
        b = a - b; // 9 = 11 - 3
        a = a - b; // 3 = 11 - 9

        System.out.println("After Swap Values: ");
        System.out.println("a " + a);
        System.out.println("b " + b);
    }

    public static void main(String[] args) {

        System.out.println("Check EvenOrOdd: " + isEvenOrOdd(34));
        System.out.println("Check DivideBy5: " + isDivideBy5(34));
        System.out.println("Check LeapYearOrNot: " + isLeapYearOrNot(1997));
        System.out.println("The Absolute Integer: " + isAbsoluteInteger(-1));
        isProfitAndLoss(200, 300);
        System.out.println("Sum of 10 Natural numbers: " + sumOfNatural(10));
        System.out.println("Sum of Odd numbers: " + sumOfOddNumbers(100));
        System.out.println("Factorial of 5: " + factorial(5));
        System.out.println("Sum of Digits: " + sumOfDigits(123));
        System.out.println("No of Digits: " + noOfDigits(321));
        System.out.println("Lcm of 10 and 20: " + leastCommonMultiplier(3, 180));
        System.out.println("Gcd of 5 and 6: " + greatestCommonDivisor(5, 16));
        System.out.println("Check Prime of 49: " + checkPrime(49));
        System.out.println("Reverse Digit 123: " + reverseDigit(123));
    }

}
