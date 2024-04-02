package Java04Array;

import java.util.Scanner;

public class Array6Solve {
    // 1. Find the total number of pairs in the Array whose sum is equal key.
    public static int countPairs(int[] arr, int key) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == key) {
                    count++;
                }
            }
        }

        return count;
    }

    // 2. Count the number of triplets whose sum is equal to the given value x.
    public static int countTriplets(int[] arr, int key) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == key) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    // 3. find Unique number in Array
    public static int findUnique(int[] arr) {
        int ans = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                ans = arr[i];
            }
        }

        return ans;

    }

    // 4. Find Max Number in Array
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // 5. Find Max Number in Array
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // 6. find Second Max Number in Array
    public static int secondMax(int[] arr) {
        int max = findMax(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                arr[i] = -1;
            }
        }
        return findMax(arr);
    }

    // 7. find First Repetitive number in Array
    public static int findFirstRepeat(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 5, 6, 8, 9, 4, 2 };

        int[] duplicateArray = { 2, 3, 4, 2, 6, 3, 4, 7, 9, 8 };

        System.out.println("Count Sum of pairs: " + countPairs(arr, 8));
        System.out.println("Count triple Pair: " + countTriplets(arr, 9));

        System.out.println("Find Unique Array: " + findUnique(duplicateArray));

        System.out.println("Find Max in Array: " + findMax(arr));
        System.out.println("Find Min in Array: " + findMin(arr));

        System.out.println("Second Maximum Array: " + secondMax(arr));

        System.out.println("First Repetitive Array: " + findFirstRepeat(duplicateArray));

    }

}