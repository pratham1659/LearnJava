package Java05Array;

import java.util.Scanner;

public class SolveArray {
    static int pairSum(int[] arr, int x){
    int ans = 0;

    for(int i=0; i<arr.length; i++){
        for(int j=i+1; j< arr.length; j++ ){

        }
    }
        return ans;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N: ");
        int n = sc.nextInt();
        System.out.println("Enter Elements: ");
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

//        System.out.println("Enter X: ");
//        int x = sc.nextInt();

        System.out.println(pairSum(arr, x));

    }
}
