package Java03Loops.Loops;

import java.util.Scanner;

public class InfiniteLoop {

    public static void main(String[] args) {
        // Ques 20 : Infinte Loop until find the even number
        Scanner sc = new Scanner(System.in);
        System.out.println("Infinte Loop until find the even number");

        for (int i = 1; i >= 1; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.println("found");
                break;
            }
        }
        sc.close();
    }

}
