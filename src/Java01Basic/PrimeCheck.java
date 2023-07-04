package Java01Basic;

import java.util.Scanner;

public class PrimeCheck {

    public static boolean isPrime(int number){
        if(number <= 1){
            return false;
        }

        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Lower Bound: ");
        int lowerNum = sc.nextInt();

        System.out.println("Enter Higher Bound: ");
        int upperNum = sc.nextInt();

        System.out.println("Prime number between " + lowerNum + " and " + upperNum);

        for(int i = lowerNum; i<=upperNum; i++){
            if(isPrime(i)){
                System.out.print(i);
                System.out.print(" ");
            }
        }
    }
}
