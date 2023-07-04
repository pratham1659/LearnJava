package Java01Basic;

import java.util.Scanner;

public class Fact {
    public static long calculateFactorial(int num){
        if(num < 0){
            throw new IllegalArgumentException("Negative Expression");
        }

        long factorial = 1;
        for(int i = 1; i <= num; i++){
            factorial *= i;
        }

        return  factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        long facto = calculateFactorial(num);
        System.out.println(facto);
    }
}
