package Java03Loops;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Write Number to Print sum of number: ");
        int num = sc.nextInt();

//     Print the sum of the first n natural numbers, where n is the input.
        int i = 0;
        int sum = 0;
        while (i <= num) {
            sum = sum + i;
            System.out.print(sum + " ");
            i++;
        }
        System.out.print(sum);

    }

}
