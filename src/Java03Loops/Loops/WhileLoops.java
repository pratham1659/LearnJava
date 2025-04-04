package Java03Loops.Loops;

import java.util.Scanner;

public class WhileLoops {

    // Ques 1: Multiplication Table of 2
    public static void multiplyTable(int num) {
        int i = 1;
        while (i <= 10) {
            System.out.printf("5 X %d = %d%n", i, i * num);
            i++;
        }
    }

    // Ques 2: Check Palindrome or not
    public static void checkPalin(int num) {
        System.out.println("Ques 2: Check Palindrome or not");
        int NewNum = 0;
        int finalNum = num;
        while (num > 0) {
            int digit = num % 10;
            NewNum = NewNum * 10 + digit;
            num = num / 10;
        }
        if (NewNum == finalNum) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }

    // Ques 3: Print the sum of the first n natural numbers, where n is the input.
    public static void sumOfFirst(int num) {
        int i = 0;
        int sum = 0;
        while (i <= num) {
            sum = sum + i;
            System.out.print(sum + " ");
            i++;
        }
        System.out.print(sum);
    }

    // Ques 4 : Check number is armstrong or not

    public static int checkCube(int num) {

        if (num == 0)
            return 0; // Base case
        return num * num * num;
    }

    public static boolean checkArmstrong(int num) {
        int digit = 0;
        int sum = 0;
        int finalNum = num;
        while (num > 0) {
            digit = num % 10;
            sum += checkCube(digit);
            num = num / 10;
        }

        if (sum == finalNum) {
            return true;
        } else {
            return false;
        }
    }

    // Ques 5 : Check armstrong from first number to last
    public static void checkArmstrongBetween(int first, int last) {

        int i = first;
        while (i <= last) {
            if (checkArmstrong(i) == true) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();

        // checkPalin(num);
        // sumOfFirst(num);
        // checkArmstrong(num);
        checkArmstrongBetween(1, 1000);

        sc.close();

    }

}
