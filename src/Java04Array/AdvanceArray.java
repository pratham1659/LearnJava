package Java04Array;

import java.util.Scanner;

public class AdvanceArray {

    public static int arraySum(int[] arr) {
        int sum = 0;
        int i = 0;
        while (i < arr.length) {
            sum += arr[i];
            i++;
        }

        return sum;
    }

    public static int arrayAverage(int[] arr) {
        int sum = arraySum(arr);
        return (sum / arr.length);
    }

    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Array Size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Elements in Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    //  Create a program to find number of occurrences of an element in an array.
    public static int occurrencesArray(int[] arr, int num) {
        int address = 0;
        int count = 0;
        int i = 0;

        while (i < arr.length) {
            if (arr[i] == num) {
                count++;
            }
            i++;
        }
        return count;
    }

    //Create a program to find the maximum and minimum element in an array.
    public static int minArray(int[] arr) {
        if (arr.length == 0) {
            return Integer.MIN_VALUE;
        }
        int min = arr[0];
        int i = 1;
        while (i < arr.length) {
            if (min > arr[i]) {
                min = arr[i];
            }
            i++;
        }
        return min;
    }

    public static int maxArray(int[] arr){
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }
        int max = arr[0];
        int i = 1;
        while (i < arr.length) {
            if (max < arr[i]) {
                max = arr[i];
            }
            i++;
        }
        return max;
    }

//    Create a program to check if the given array is sorted.
//    public static boolean checkSortedArray(int[] arr){
//        int i = 1;
//        int num  = arr[0];
//        while (i < arr.length){
//            if(num > arr[i]){
//                return false;
//            }
//            i++;
//        }
//        return  true;
//    }

    public static boolean isIncreasedArray(int[] arr){
        int i = 1;
        while(i < arr.length){
            if(arr[i] >= arr[i-1]){
                return true;
            }
            i++;
        }
        return false;
    }

    public static boolean isDecreasedArray(int[] arr){
        int i = 1;
        while(i < arr.length){
            if(arr[i] <= arr[i-1]){
                return true;
            }
            i++;
        }
        return false;
    }
//    Create a program to return a new array deleting a specific element.
//    public static int[] deleteArray(int[] arr){
//
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArray = inputArray();
//        int sum = arraySum(numArray);
//        int avg = arrayAverage(numArray);
//        System.out.println("Sum of Array: " + sum);
//        System.out.println("Average of Array: " + avg);

//        System.out.print("Enter the element to find: ");
//        int num = sc.nextInt();
//        System.out.println( occurrencesArray(numArray, num));

//        System.out.println(minArray(numArray));
//        System.out.println(maxArray(numArray));

        System.out.println(isIncreasedArray(numArray));
        System.out.println(isDecreasedArray(numArray));



    }
}
