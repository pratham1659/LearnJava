package Java03Loops.Loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoopLecture {

    public static void doWhileLoop(int nums) {
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= nums);
    }

    public static void forLoopInput(int nums) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i >= 1; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.println("found");
                break;
            }
        }
        sc.close();
    }

    public static int[] takeInput(int n) {
        Scanner sc = new Scanner(System.in);
        int[] result = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            result[i] = sc.nextInt();
        }

        sc.close();

        return result;
    }

    public static void whileLoopContinous() {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.println("Enter numbers (0 to stop):");
        int num;
        while ((num = sc.nextInt()) != 0) {
            list.add(num);
        }

        System.out.println("You entered:");
        for (int val : list) {
            System.out.print(val + " ");
        }

        sc.close();

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // how many inputs

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // take input one by one
        }

        System.out.println("Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        takeInput(5);
        doWhileLoop(10);
        forLoopInput(5);
        whileLoopContinous();

        sc.close();
    }

}