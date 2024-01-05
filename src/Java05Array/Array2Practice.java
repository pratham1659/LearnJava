package Java05Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array2Practice {

    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    //    Count the number of occurrences of a particular element x.
    static int countNum(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;
    }

    //    Find the last occurrence of an element x in a given array.
    static int lastOccurrence(int[] arr, int x) {
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    //    Count the number of elements strictly greater than value x.
    static int maxNum(int[] arr, int x) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                max++;
            }
        }

        return max;
    }

    //    Check if the given array is sorted or not.
    static boolean sortedArray(int[] arr) {
        boolean check = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                check = false;
                break;
            }
        }
        return check;
    }

    //Find smallestAndLargestElement in Array
    static int[] smallestAndLargest(int[] arr) {

        Arrays.sort(arr);
        int[] ans = {arr[0], arr[arr.length - 1]};
        return ans;
    }

    static int[] KthSmallestAndLargest(int[] arr, int k) {
        Arrays.sort(arr);
        int smallest = arr[k - 1];
        int largest = arr[arr.length - k];

        int[] ans = {smallest, largest};

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N: ");
        int n = sc.nextInt();
        System.out.println("Enter Elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter X: ");
        int x = sc.nextInt();

//        System.out.println("COUNT OF X: " + countNum(arr, x));
//        System.out.println("COUNT OF X: " + lastOccurrence(arr, x));
//        System.out.println("Max Count of X " + maxNum(arr, x));

//        System.out.println("Is Sorted: " + sortedArray(arr));

//        System.out.println("Small and Large in Array: " + Arrays.toString(smallestAndLargest(arr)));
        System.out.println("Small and Large in Array: " + Arrays.toString(KthSmallestAndLargest(arr, x)));

    }
}
