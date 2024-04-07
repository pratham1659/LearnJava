package Java05Array;

import java.util.Arrays;

public class Array05Sorting {
    // 1. Program to sort in ascending order: Time Complexity O(NxN), Space
    // Complexity O(1)
    public static int[] sortAscending(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    // 2. Program to sort the elements of an array in descending order
    public static int[] sortDescending(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    // 3. Java Program to find Third Largest Number in an Array
    public static int findThirdLargestNumber(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }

        }
        return arr[n - 3];
    }

    // 5. Java Program to find Third Largest Number in an Array
    public static int findSecondLargestNumber(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }

        }
        return arr[n - 2];
    }

    public static void main(String[] args) {

        int[] arr = { 5, 3, 7, 8, 9, 2, 4 };

        System.out.println("Sort in Ascending: " + Arrays.toString(sortAscending(arr)));
        System.out.println("Sort in Descending: " + Arrays.toString(sortDescending(arr)));

        System.out.println("Find Third Largest: " + findThirdLargestNumber(arr));
        System.out.println("Find Second Largest: " + findSecondLargestNumber(arr));
    }
}

