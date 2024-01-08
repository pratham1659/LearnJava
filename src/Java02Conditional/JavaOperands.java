package Java02Conditional;

import java.util.Scanner;

public class JavaOperands {

//    Ques: Take positive integer input and tell if it
//    is a three-digit number or not.
    static void ThreeDigit(int num){
        if(num > 9 && num < 100){
            System.out.println("Two Digit Number");
        } else if  (num > 99 && num < 1000){
            System.out.println("Three Digit Number");
        }else{
            System.out.println("Invalid Number");
        }
    }

//    Ques: Take positive integer input and tell if it
//    is divisible by 5 and 3.

    static void divideBy5and3(int num){
        if(num % 5 == 0 || num % 3 == 0){
            System.out.println("Its Divisible");
        }else{
            System.out.println("Invalid Number");
        }
    }

//    Ques: Take 3 positive integers input and print
//    the greatest of them.

    static void GreatestNum(int A, int B, int C){
       if(A > B && A > C){
           System.out.println(A + " is Greatest");
       } else if (B > A && B > C) {
           System.out.println(B + " is Greatest");
       }else{
           System.out.println(C + " is Greatest");
       }
    }

//    HW: If the ages of Ram, Shyam and Ajay are input
//    through the keyboard, write a program to
//    determine the youngest of the three.
    static void YoungAge(int A, int B, int C){
            if(A < B && A < C){
                System.out.println(A + " is Younger");
            } else if (B < A && B < C) {
                System.out.println(B + " is Younger");
            }else {
                System.out.println(C + " is Younger");
            }
    }

//    Ques: Take 3 numbers input and tell if they
//    can be the sides of a triangle.
    static  void checkTriangle(int A, int B, int C){
        if((A + B) > C && (A + C) > B && (B + C) > A){
            System.out.println("Valid Triangle");
        }else {
            System.out.println("Invalid Triangle");
        }

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Here");
//        int num = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

//        ThreeDigit(num);
//        divideBy5and3(num);
//        GreatestNum(A, B, C);
//        YoungAge(A, B, C);

        checkTriangle(A, B, C);

    }
}
