package Java01Basic;

import java.util.Scanner;

public class Prime {

    public static boolean checkPrime(int n){
        if(n <= 1){
            return false;
        }

        for(int i = 2; i < Math.sqrt(n); i++){
            if(n % 2 == 0){
                return false;
            }
        }
        return  true;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        if(checkPrime(num)){
            System.out.println("Is Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}
