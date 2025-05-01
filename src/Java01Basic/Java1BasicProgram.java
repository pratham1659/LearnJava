package Java01Basic;

import java.io.IOException;
import java.util.Scanner;

public class Java1BasicProgram {

    // Ques 1: Logic to find diameter, circumference and area of circle
    public static void areaCircle(int rad) {
        System.out.println("Ques 1: Logic to find diameter, circumference and area of circle");

        double diameter = 2 * rad;
        double pi = Math.PI;
        double circumference = 2 * pi * rad;
        double area = pi * (rad * rad);

        System.out.printf("%.2f%n", diameter);
        System.out.printf("%.2f%n", circumference);
        System.out.printf("%.2f%n", area);

    }

    // Ques 2 : program to convert centimeter to meter and kilometer
    public static void centiToKm(int cm) {
        System.out.println("Ques 2 : program to convert centimeter to meter and kilometer");

        double meter = cm / 100.0;
        double kilometer = meter / 1000.0;

        System.out.println(meter);
        System.out.println(kilometer);
    }

    // Ques 3 : program to find convert temperature from Fahrenheit to Celsius
    public static void CelsiusToFarhenheit(double c, double f) {
        System.out.println("Ques 3 : program to find convert temperature from Fahrenheit to Celsius");

        double fahrenheit = (9.0 / 5.0 * c) + 32.0;
        double celcius = (5.0 / 9.0) * (f - 32.0);

        System.out.printf("%.2f%n", celcius);
        System.out.printf("%.2f%n", fahrenheit);
    }

    // Ques 4: program to find power of a number using pow function
    public static double findPower(double value, double pow) {
        System.out.println("Ques 4: program to find power of a number using pow function");

        double ans = Math.pow(value, pow);

        return ans;
    }

    // Ques 5 : program to find cube of a number using for loop function
    public static void findPowerLoop(int value, int pow) {
        System.out.println("Ques 5 : program to find cube of a number using for loop function");

        double ans = 1;
        for (int i = 1; i <= pow; i++) {
            ans = ans * value;
        }

        System.out.println(ans);
    }

    // Ques 6: Program to find cube using function
    public static int cube(int n) {
        return n * n * n;
    }

    public static void findCube(int n) {
        System.out.println("Ques 6: Program to find cube using function");

        int c = cube(n);
        System.out.println(c);
    }

    // Ques 7: program to find square root of a number
    public static void findSquareRoot(int n) {
        System.out.println("Ques 7: program to find square root of a number");

        double sq = Math.sqrt(n);

        System.out.println((int) sq);
    }

    // Ques 8: program to find angles of triangle if two angles are given
    public static void findAngle(int a1, int a2) {
        System.out.println("Ques 8: program to find angles of triangle if two angles are given");

        int a3 = 180 - (a1 + a2);

        System.out.println(a3);
    }

    // Ques 9 program to find area of a triangle
    public static void areaTriangle(int h, int b) {
        System.out.println("Ques 9 program to find area of a triangle");

        double area = 0.5 * (h * b);

        System.out.println((int) area + " sq.units");
    }

    // Ques 10: program to find area of an equilateral triangle
    public static void equilTriangle(int side) {
        System.out.println("Ques 10: program to find area of an equilateral triangle");

        double area = (Math.sqrt(3) / 4) * (side * side);

        System.out.println(area);
    }

    // Ques 11: program to calculate total average and percentage of five subjects
    public static void calciSubject(int[] sub) {
        System.out.println("Ques 11: program to calculate total average and percentage of five subjects");

        double sum = 0;
        int n = sub.length;
        for (int i = 0; i < n; i++) {
            sum = sum + sub[i];
        }

        double percentage = (sum / n * 100) / 100;

        System.out.println(sum + " Total");
        System.out.println(percentage + " %");

    }

    // Ques 12: program to calculate Simple Interest
    public static void simpleInterest(double p, double r, double t) {
        System.out.println("Ques 12: program to calculate Simple Interest");

        double SI = (p * r * t) / 100;
        System.out.println(SI);
    }

    // Ques 13: program to calculate Compound Interest
    public static void compoundInterest(double p, double r, double t) {
        System.out.println("Ques 13: program to calculate Compound Interest");

        double CI = p * findPower((1 + r / 100), t);

        System.out.printf("%.2f%n", CI);
    }

    // Ques 14: program to find maximum between two numbers
    public static void maxNum(int num1, int num2) {
        System.out.println("Ques 14: program to find maximum between two numbers");

        if (num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }

    // Ques 15: program to find maximum between three numbers
    public static void threeMaxNum(int num1, int num2, int num3) {
        System.out.println("Ques 15: program to find maximum between three numbers");

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }
    }

    // Ques 16 : program to check whether a number is positive, negative or zero
    public static void checkNumber(int num) {
        System.out.println("Ques 16 : program to check whether a number is positive, negative or zero");

        if (num < 0) {
            System.out.println("Negative");
        } else if (num == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Positive");
        }
    }

    // Ques 17: program to check whether a number is divisible by 5 and 11 or not
    public static void divisibleBy5And11(int num) {
        System.out.println("Ques 17: program to check whether a number is divisible by 5 and 11 or not");
        if (num % 5 == 0 && num % 11 == 0) {
            System.out.println("Its Divisible");
        } else {
            System.out.println("Not Divisible");
        }
    }

    // Ques 18: Program to check EvenOrOdd
    public static void isEvenOrOdd(int num) {
        System.out.println("Ques 18: Program to check EvenOrOdd");
        if (num % 2 == 0) {
            System.out.println("Even");
            ;
        } else {
            System.out.println("Odd");
        }
    }

    // Ques 19: program to check Leap Year
    public static void isLeapYearOrNot(int num) {
        System.out.println("Ques 19: program to check Leap Year");
        if ((num % 4 == 0) && (num % 100 != 0) || (num % 400 == 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not Leap Year");
        }
    }

    // Ques 20: program to check whether a character is alphabet or not
    public static void checkAlphabet(char ch) {
        System.out.println("Ques 20: program to check whether a character is alphabet or not");

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("its Character");
        } else {
            System.out.println("Its not Character");
        }
    }

    // Ques 21 : program to check vowel or consonant
    public static void checkVowel(char ch) {
        System.out.println("Ques 21 : program to check vowel or consonant");

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Vowels");
        } else {
            System.out.println("Consonant");
        }
    }

    // Ques 22: program to check whether a character is alphabet, digit or special
    // character

    public static void checkDigit(char ch) {

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Character");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        } else {
            System.out.println("Special");
        }
    }

    // Ques 23 : program to check whether a character is Uppercase or Lowercase
    public static void checkUppercase(char ch) {

        if ((ch >= 'a' && ch <= 'z')) {
            System.out.println("Lowercase");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase");
        }
    }

    // Ques 24: program to enter week number and print day of week
    public static void findDaysWeek(int week) {

        if (week == 1) {
            System.out.println("Monday");
        } else if (week == 2) {
            System.out.println("Tuesday");
        } else if (week == 3) {
            System.out.println("Wednesday");
        } else if (week == 4) {
            System.out.println("Thursday");
        } else if (week == 5) {
            System.out.println("Friday");
        } else if (week == 6) {
            System.out.println("Saturday");
        } else if (week == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid Input! Please enter week number between 1-7.");
        }
    }

    // Ques 25: program to find number of days in month
    public static void findDaysInMonth(int month) {

        System.out.println("Ques 25: program to find number of days in month");

        if (month == 1) {
            System.out.println("31 days");
        } else if (month == 2) {
            System.out.println("28 or 29 days");
        } else if (month == 3) {
            System.out.println("31 days");
        } else if (month == 4) {
            System.out.println("30 days");
        } else if (month == 5) {
            System.out.println("31 days");
        } else if (month == 6) {
            System.out.println("30 days");
        } else if (month == 7) {
            System.out.println("31 days");
        } else if (month == 8) {
            System.out.println("31 days");
        } else if (month == 9) {
            System.out.println("30 days");
        } else if (month == 10) {
            System.out.println("31 days");
        } else if (month == 11) {
            System.out.println("30 days");
        } else if (month == 12) {
            System.out.println("31 days");
        } else {
            System.out.println("Invalid Input! Please enter week number between 1-7.");
        }
    }

    // Ques 26: Find EvenOdd of integer
    static void evenOdd(int num) {
        System.out.println("Ques 26: Find EvenOdd of integer");
        if (num % 2 == 0) {
            System.out.println("This is Even Number");
        } else {
            System.out.println("This is Odd Number");
        }
    }

    // Ques 27: print the absolute value of that integer A
    static void absoluteInt(int num) {
        System.out.println("Ques 27: print the absolute value of that integer A");
        if (num < 0) {
            num = num * (-1);
        }
        System.out.println("This is Absolute " + num);
    }

    // Ques 28: If cost price and selling price of an item is
    // input through the keyboard, write a program to
    // determine whether the seller has made profit or
    // incurred loss. Also determine how much profit he
    // made or loss he incurred.
    static void profitLoss(int cp, int sp) {
        System.out.println("Ques 5: cost price and selling price");
        int profit = 0;
        profit = sp - cp;
        if (sp > profit) {
            System.out.println("You are in " + profit + " Profit");
        } else {
            int loss = cp - sp;
            System.out.println("You Are in Loss " + loss);
        }
    }

    // Ques 29: Given the length and breadth of a rectangle,
    // write a program to find whether the area of the
    // rectangle is greater than its perimeter.
    public static void maxRectangle(int l, int b) {
        System.out.println("Ques 29: Given the length and breadth of a rectangle");
        int area = 0;
        int peri = 0;

        area = l * b;
        peri = 2 * (l + b);

        if (area > peri) {
            System.out.println("Area is Greater");
        } else if (peri > area) {
            System.out.println("Perimeter is Greater");
        } else {
            System.out.println("Both are Equal");
        }
    }

    // Ques 30: Take input percentage of a student and
    // print the Grade according to marks:
    // 1) 90-100 Excellent
    // 2) 80-90 Very Good
    // 3) 70-80 Good
    // 4) 60-70 Can do better
    // 5) 50-60 Average
    // 40-50 Below Average
    // 7) ‹40 Fail 0-100
    public static void marks(int marks) {
        System.out.println("Ques 30: Use of Swtich Keyword");
        if (marks <= 100) {
            if (marks >= 90) {
                System.out.println("Excellent");
            } else if (marks >= 80) {
                System.out.println("Very Good");
            } else if (marks >= 70) {
                System.out.println("Good");
            } else if (marks >= 60) {
                System.out.println("Can do better");
            } else if (marks >= 50) {
                System.out.println("Average");
            } else if (marks >= 40) {
                System.out.println("Below Average");
            } else {
                System.out.println("Fail");
            }
        } else {
            System.out.println("Invalid Input");
        }
    }

    // Ques 31: Advance problem in ifElse
    // even which are greater than 2 (YES)
    // ODD or == 2 (NO)
    public static void AdvanceProblem1(int n) {

        if (n >= 4 && n % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("No");
        }
    }

    // Ques 32 : Print Multiplication Table
    public static void MultiTable(int num) {

        for (int i = 1; i <= num; i++) {
            System.out.println(num + "X" + i + "=" + num * i);
        }
    }

    // Ques 11 : Count the digit in number
    public static void countDigit(int num) {
        System.out.println("Ques 11 : Count the digit in number");

        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println(count);
    }

    // Ques 12 : Sum of Positive Number
    public static void sumOfDigit(int num) {
        System.out.println("Ques 12 : Sum of Positive Number");

        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num = num / 10;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) throws IOException {

        areaCircle(10);
        centiToKm(173);
        CelsiusToFarhenheit(32, 205);
        findPower(5, 2);
        findPower(5, 3);
        findPowerLoop(5, 4);
        findCube(5);
        findSquareRoot(25);
        findAngle(60, 30);
        areaTriangle(10, 15);
        equilTriangle(10);

        int sub[] = { 95, 76, 85, 90, 89, 90 };
        calciSubject(sub);

        simpleInterest(1200, 2, 5.4);
        compoundInterest(1200, 2, 5.4);
        maxNum(23, 45);
        threeMaxNum(12, 89, 67);
        checkNumber(90);
        divisibleBy5And11(45);
        isEvenOrOdd(34);
        isLeapYearOrNot(2000);
        checkAlphabet('%');
        checkVowel('w');
        checkDigit('A');
        checkUppercase('a');
        findDaysWeek(7);
        findDaysInMonth(12);
        evenOdd(34);
        absoluteInt(-34);
        profitLoss(230, 270);
        maxRectangle(25, 50);
        marks(89);

        absoluteInt(-89);
        profitLoss(230, 290);
        maxRectangle(35, 50);
        marks(78);
        AdvanceProblem1(34);
        MultiTable(9);
        countDigit(456);
        sumOfDigit(890);

    }
}
