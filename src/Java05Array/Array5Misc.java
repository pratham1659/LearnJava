package Java05Array;

import java.util.Scanner;

public class Array5Misc {

    static void printArray(int[] arr){
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

//    Given 2 integers a and b. Swap the 2 given values using temporary
//    variables
    static void swap(int a, int b){
        System.out.println("Original Values: ");
        System.out.println("a " + a);
        System.out.println("b " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap Values: ");
        System.out.println("a " + a);
        System.out.println("b " + b);

    }

//    Given 2 integers a and b. Swap the 2 given values using sum and difference
//    method

    static void swapWithoutTemp(int a, int b){
        System.out.println("Original Values: ");
        System.out.println("a " + a);
        System.out.println("b " + b);

       a = a + b; // 11 = 9 + 3
       b = a - b; // 9 = 11 - 3
       a = a - b; // 3 = 11 - 9

        System.out.println("After Swap Values: ");
        System.out.println("a " + a);
        System.out.println("b " + b);
    }

//    Reverse an array consisting of integer values.

    static int[] reverseArray(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;

        for(int i=n-1 ; i>=0; i--){
            ans[j++] = arr[i];
        }

        return ans;
    }

    static void swapInArray(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    //Reverse Given Array
    static int[] reverseGivenArray(int[] arr){
        int i = 0, j = arr.length-1;

       while(i < j){
           swapInArray(arr, i, j);
           i++;
           j--;
       }
        return arr;
    }

//    Rotate the given array 'a' by k steps, where k is non-negative.
//    Note: k can be greater than n as well.

    static int[] rotateA(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;

        for(int i=n-k; i<n; i++){
            ans[j++] = arr[i];
        }

        for(int i=0; i<n-k; i++){
            ans[j++] = arr[i];
        }

        return ans;
    }

//    Rotate the given array 'a' by k steps, where k is non-negative without using
//    extra space.
//    Note: k can be greater than n as well.

//    static  int[] rotateB(int[] arr, int k){
//
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 3;
        int b = 9;

        int[] arr = {1, 2, 3, 4, 5, 6};

//        swap(a, b);
//        swapWithoutTemp(a, b);
//        System.out.println(Arrays.toString(reverseArray(arr)));

//        int[] ans = reverseGivenArray(arr);
//        int[] ans = rotateA(arr, 100);
        int[] ans = rotateA(arr, 2);
        printArray(ans);

    }
}
