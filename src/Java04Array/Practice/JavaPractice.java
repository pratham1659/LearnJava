package Java04Array.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class JavaPractice {
    static void smallestArr(int[] arr){ ///Complexity Big O(1) constant
        Arrays.sort(arr);
        System.out.println("Smallest number is: " + arr[0]);

    }

    static void smallArr(int[] arr){
        int n = arr.length;
        int min = arr[0];
        for (int i : arr) {
            if (min > i) {
                min = i;
            }
        }
        System.out.println(min);
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

//        int x = sc.nextInt();
//        int y = sc.nextInt();
        int[] arr = {5, 0, 5, 7, -1};

       smallArr(arr);


    }
}
