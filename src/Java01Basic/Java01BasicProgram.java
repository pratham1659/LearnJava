package Java01Basic;

import java.io.IOException;

public class Java01BasicProgram {

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

        double ans = Math.pow(value, pow);

        // System.out.println(ans);

        return ans;
    }

    // Ques 5 : program to find cube of a number using for loop function
    public static void findPowerLoop(int value, int pow) {

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

        int c = cube(n);
        System.out.println(c);
    }

    // Ques 7: program to find square root of a number
    public static void findSquareRoot(int n) {

        double sq = Math.sqrt(n);

        System.out.println((int) sq);
    }

    // Ques 8: program to find angles of triangle if two angles are given
    public static void findAngle(int a1, int a2) {

        int a3 = 180 - (a1 + a2);

        System.out.println(a3);
    }

    // Ques 9 program to find area of a triangle
    public static void areaTriangle(int h, int b) {

        double area = 0.5 * (h * b);

        System.out.println((int) area + " sq.units");
    }

    // Ques 10: program to find area of an equilateral triangle
    public static void equilTriangle(int side) {

        double area = (Math.sqrt(3) / 4) * (side * side);

        System.out.println(area);
    }

    // Ques 11: program to calculate total average and percentage of five subjects
    public static void calciSubject(int[] sub) {

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

        double SI = (p * r * t) / 100;
        System.out.println(SI);
    }

    // Ques 13: program to calculate Compound Interest
    public static void compoundInterest(double p, double r, double t) {

        double CI = p * findPower((1 + r / 100), t);

        System.out.printf("%.2f%n", CI);
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
    }
}
