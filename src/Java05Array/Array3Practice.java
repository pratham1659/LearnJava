package Java05Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array3Practice {

    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Ques 1: Calculate the sum of all the elements in the given array.
    public static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        return sum;
    }

    // Ques 2: Calculate the maximum value out of all the elements in the array.
    public static int maxArray(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void findElements(int[] arr, int key) {
// Search the given element x in the array. If present then return the index else return -1.
// Linear Search
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                ans = i;
                break;
            }
        }
        System.out.println("Found: " + key + " at " + ans);
    }


    void inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("original array");
        printArray(arr);


//        Trying to copy arr1 to arr2;
//        Copied Array without clone
//        int[] arr2 = arr;
        int[] arr2 = arr.clone();
        System.out.println("original array after cloning arr2");
        printArray(arr2);

        //New Array
        arr2[0] = 0;
        arr2[1] = 0;

        System.out.println("copied arr_2 after changing arr2");
        printArray(arr2);

        // Trying to copy arr to arr2
//        arr2 = Arrays.copyOf(arr, arr.length);
        arr2 = Arrays.copyOf(arr, 2);
        System.out.println("Genuine Copied Array: ");
        printArray(arr2);


        System.out.println("Print Range to Copied Array: ");
        arr2 = Arrays.copyOfRange(arr, 1, 3);
        printArray(arr2);
    }


    public static void main(String[] args) {
        Array3Practice obj = new Array3Practice();
        obj.inputArray();

    }
}
