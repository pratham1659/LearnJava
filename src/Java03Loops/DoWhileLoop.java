package Java03Loops;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Write number to print: ");
//        int num = sc.nextInt();
        int i = 1;

        do{
            System.out.print(i + " ");
            i++;
        }while(i <= 10);

    }
}
