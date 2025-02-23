package Java05Array;

import java.util.Arrays;

public class Array02Swap {
    // Printing Array Methods
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // 1. swap in Array Methods
    public static void swapInArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // 2. swap in Array Methods
    public static int[] swapOutArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            swapInArray(arr, i, j);
            i++;
            j--;
        }
        return arr;

    }

    // 3. Rotate the given array 'a' by k steps, where k is non-negative.
    public static int[] rotateA(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;

        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }

        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }

    // 4. Program to left rotate the elements of an array
    public static void leftRotateFromArrayIndex(int[] arr, int index) {
        int n = arr.length;
        int temp = arr[index];
        for (int i = index; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp;
    }

    // 5. Program to left rotate the elements of an array
    public static int[] rotateLeft(int[] arr, int key) {

        int n = arr.length;
        int[] rotatedArray = new int[n];

        for (int i = 0; i < n; i++) {
            rotatedArray[(i + n - key) % n] = arr[i];
        }
        return rotatedArray;
    }

    // 6. Program to left rotate the elements of an array
    public static int[] rightRotate(int[] arr, int key) {
        int n = arr.length;
        int[] rotatedArray = new int[n];
        for (int i = 0; i < n; i++) {
            rotatedArray[(i + key) % n] = arr[i];
        }
        return rotatedArray;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 5, 6, 8, 9, 4, 2 };

        System.out.println("Swapping in Array Reverse: ");
        printArray(swapOutArray(arr));

        int[] ans = rotateA(arr, 2);
        printArray(ans);

        System.out.println(Arrays.toString(rotateLeft(arr, 3)));
        System.out.println(Arrays.toString(rightRotate(arr, 3)));

    }

}
