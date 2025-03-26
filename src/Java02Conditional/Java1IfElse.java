package Java02Conditional;

import java.util.Scanner;

public class Java1IfElse {

    // Ques: Find EvenOdd of integer
    static void evenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("This is Even Number");
        } else {
            System.out.println("This is Odd Number");
        }
    }

    // Ques: Take positive integer input and tell if it is divisible by 5 or not.
    static void divideBy5(int num) {
        if (num % 5 == 0) {
            System.out.println("Its Divisible By 5");
        } else {
            System.out.println("Its Not Divisible by 5");
        }
    }

    // Any year is input through the keyboard. Write a program to determine whether
    // the year is a leap
    // year or not. (Considering leap year occurs after
    // every 4 years)
    static void leapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("This is Leap Year");
        } else {
            System.out.println("This is Not Leap Year");
        }
    }

    // Ques: Take integer input and print the
    // absolute value of that integer A
    static void absoluteInt(int num) {
        if (num < 0) {
            num = num * (-1);
        }
        System.out.println("This is Absolute " + num);
    }

    // Ques: If cost price and selling price of an item is
    // input through the keyboard, write a program to
    // determine whether the seller has made profit or
    // incurred loss. Also determine how much profit he
    // made or loss he incurred.
    static void profitLoss(int cp, int sp) {
        int profit = 0;
        profit = sp - cp;
        if (sp > profit) {
            System.out.println("You are in " + profit + " Profit");
        } else {
            int loss = cp - sp;
            System.out.println("You Are in Loss " + loss);
        }
    }

    // Ques: Given the length and breadth of a rectangle,
    // write a program to find whether the area of the
    // rectangle is greater than its perimeter.
    static void maxRectangle(int l, int b) {
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

    // Ques: Take input percentage of a student and
    // print the Grade according to marks:
    // 1) 90-100 Excellent
    // 2) 80-90 Very Good
    // 3) 70-80 Good
    // 4) 60-70 Can do better
    // 5) 50-60 Average
    // 40-50 Below Average
    // 7) ‹40 Fail 0-100

    static void marks(int marks) {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number Here: ");
        int A = sc.nextInt();
        // int B = sc.nextInt();
        // evenOdd(A);
        // divideBy5(A);
        // leapYear(A);
        // absoluteInt(A);
        // profitLoss(A, B);
        // maxRectangle(A, B);
        marks(A);

        sc.close();
    }
}
