package Java03Loops.Loops;

import java.util.Scanner;

public class ForLoops {
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

        sc.close();
    }
}
