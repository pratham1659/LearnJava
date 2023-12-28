package Java03Loops;

import java.util.Scanner;

public class LoopsPractice {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        //  Print the sum of the stream of integers in the input.
        while(num != -1){
            sum += num;
            num = sc.nextInt();

        }
        System.out.println("Return sum " + sum);
    }
}
