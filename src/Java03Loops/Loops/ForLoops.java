package Java03Loops.Loops;

import java.util.Scanner;

public class ForLoops {

    // Q 8. put even and odd array in seperate array in Java

    public static void seperateOddEven(int n, int[] nums) {
        int countEven = 0;
        int countOdd = 0;

        for (int i = 0; i < n; i++) {

            if (nums[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }

        if (countEven > 0) {
            for (int i = 0; i < n; i++) {
                if (nums[i] % 2 == 0) {
                    System.out.print(nums[i] + " ");
                }
            }
        }

        System.out.println();

        if (countOdd > 0) {
            for (int i = 0; i < n; i++) {
                if (nums[i] % 2 != 0) {
                    System.out.print(nums[i] + " ");
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Write number to print: ");
        int num = sc.nextInt();
        int sum = 0;

        for (int i = num; i >= 1; i -= 3) {
            sum = sum + i;
            System.out.print(sum + " ");
            System.out.print(i + " ");
        }
        System.out.println(sum);
        // Note: Initialisation in For loop is not necessary but semicolon is necessary;

        int[] oddEven = { 2, 3, 4, 5, 6, 7, 8, 9 };
        seperateOddEven(oddEven.length, oddEven);

        sc.close();
    }
}
