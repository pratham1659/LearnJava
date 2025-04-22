package Java01Basic;

import java.util.Scanner;

public class Java02AdvanceProgram {

    // Ques 1: program to find the Least Common Multiple (LCM) of two numbers.
    public static int leastCommonMultiplier(int num1, int num2) {
        int max = Math.max(num1, num2);
        while (true) {
            if (max % num1 == 0 && max % num2 == 0) {
                return max;
            }
            max++;
        }
    }

    // Ques 2: program to find the Greatest Common Divisor (GCD) of two numbers.
    public static int greatestCommonDivisor(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    // Ques 3: Multiplication Table of 2
    public static void multiplyTable(int num) {
        int i = 1;
        while (i <= 10) {
            System.out.printf("5 X %d = %d%n", i, i * num);
            i++;
        }
    }

    // Ques 4: Print the sum of the first n natural numbers, where n is the input.
    public static int sumOfNatural(int num) {
        int i = 1;
        int sum = 0;
        while (i <= num) {
            sum += i;
            i++;
        }
        return sum;
    }

    // Ques 5: program to sum all odd numbers from 1 to a specified number N.
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

    // Ques 6: program that calculates the factorial of a given number.
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

    // Ques 7: program that computes the sum of the digits of an integer.
    public static int noOfDigits(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    // Ques 8: program that computes the sum of the digits of an integer.
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }

    // Ques 9: Program to check Absolute Integer
    public static int isAbsoluteInteger(int num) {
        if (num < 0) {
            num = num * (-1);
        }
        return num;
    }

    // Ques 10: Program to check cost price and selling price of an item check
    // profit and Loss.
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

    // Ques 11: program that computes the sum of the digits of an integer.
    public static boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }
        double val = Math.sqrt(num);
        for (int i = 2; i < val; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Ques 12: program to reverse the digits of a number.
    public static int reverseDigit(int num) {
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num = num / 10;
        }
        return newNum;
    }

    // Ques 13: swap in digits
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

    // Ques 14: swap Without Temp
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

    // Ques 15: Count the number of digits for a given number
    public static int countNum() {
        long num = 982436986L;
        int ans = 0;

        while (num > 0) {
            num = num / 10;
            ans++;
        }
        return ans;
    }

    // Ques 16: Prefix and Postfix of digits
    public static void prefixPostfix(int n) {
        System.out.println("Ques 19 : Prefix and Postfix of digits");

        int temp1 = n;
        int a = ++temp1;
        System.out.println(a); // prefix

        int temp2 = n;
        int b = temp2++;
        System.out.println(b);
    }

    // Ques 17: program to print the Fibonacci series up to a certain number.
    public static void fibonacciSeries(int num) {
        int firstTerm = 0, secondTerm = 1;

        if (num <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
            return;
        }

        for (int i = 1; i <= num; i++) {
            int nextTerm = firstTerm + secondTerm;

            System.out.print(nextTerm + " ");

            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

    }

    // Ques 18: Program to check Palindrome Number.
    public static boolean checkPalindromeNumber(int num) {

        int original = num;
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num = num / 10;
        }

        return original == newNum;
    }

    // Ques 19: Program to check Power.
    public static int pow(int num1, int num2) {
        int result = num1;
        int i = 1;

        while (i < num2) {
            result = result * num1;
            i++;
        }
        return result;
    }

    // Ques 5: Program to check Armstrong
    public static boolean checkArmstrong(int num) {
        int originalNumber = num;
        int finalNumber = 0;
        int noOfDigit = noOfDigits(num);

        while (num > 0) {
            int lastDigit = num % 10;
            num = num / 10;
            finalNumber = finalNumber + pow(lastDigit, noOfDigit);
        }

        return finalNumber == originalNumber;
    }

    // Ques 6: Program to print Star Right Triangle
    public static void starPrintRightTriangle(int maxRows) {
        int rows = 0;
        while (rows < maxRows) {
            System.out.print("*");
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }

    // Ques 6: Program to print Reverse Right Triangle
    public static void reverseRightTriangle(int maxRows) {
        int rows = maxRows;
        while (rows > 0) {
            System.out.print("*");
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows--;
        }
    }

    // Ques 7: Program to print Left Half Triangle
    public static void printLeftHalfPyramid(int maxRows) {
        int rows = maxRows;
        while (rows > 0) {
            // this loop print spaces
            int j = 0;
            while (j < rows) {
                System.out.print("  ");
                j++;
            }
            // this loop print star
            int i = 0;
            while (i <= (maxRows - rows)) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }
    }

    // Ques 8: find median of an array
    public static void findMedian(int[] arr) {
        int n = arr.length;
        if (n % 2 != 2) {
            System.out.println(arr[n / 2]);
        } else {
            double median = (double) (arr[n / 2] + arr[(n / 2) - 1] / 2.0);
            System.out.println(median);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        fibonacciSeries(9);
        System.out.println("\nCheck Palindrome: " + checkPalindromeNumber(121));
        System.out.println("Power of Two Number: " + pow(5, 3));
        System.out.println("Check Armstrong: " + checkArmstrong(9474));
        starPrintRightTriangle(5);
        reverseRightTriangle(5);
        printLeftHalfPyramid(5);

        int[] arrMedian = { 1, 2, 3, 4, 5 };
        findMedian(arrMedian);

        sc.close();
    }

}
