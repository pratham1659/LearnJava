package Java05Array;

import java.util.Arrays;
import java.util.HashMap;

public class Array02Swap {

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
    public static int[] leftRotateFromArrayIndex(int[] arr, int index) {
        int n = arr.length;

        if (index < 0 || index >= n) {
            System.out.println("Invalid index");
            return arr;
        }

        int[] temp = new int[n];

        // Copy the elements from index to end
        int k = 0;
        for (int i = index; i < n; i++) {
            temp[k++] = arr[i];
        }

        // Copy the elements from start to index - 1
        for (int i = 0; i < index; i++) {
            temp[k++] = arr[i];
        }

        // Copy back to original array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

        return arr;
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

    // 7: Program to find the frequency of each element in the array
    public static void frequency(int[] arr) {

        int n = arr.length;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i])
                continue;

            int count = 1;
            for (int j = i + 1; j < n; j++) {

                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }

            System.out.println("Element" + arr[i] + "Freq" + count);
        }
    }

    // 8. frequency of the element using HashMap
    public static void frequencyHash(int[] array) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            if (freq.containsKey(element)) {
                freq.put(element, freq.get(element) + 1);
            } else {
                freq.put(element, 1);
            }
        }

        // Display the frequency of each element
        System.out.println("Element : Frequency");
        for (int element : freq.keySet()) {
            System.out.println(element + " : " + freq.get(element));
        }
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 5, 6, 8, 9, 4, 2 };

        System.out.println(Arrays.toString(swapOutArray(arr)));

        System.out.println(Arrays.toString(rotateA(arr, 2)));

        System.out.println(Arrays.toString(rotateLeft(arr, 3)));
        System.out.println(Arrays.toString(rightRotate(arr, 3)));

        int[] arr2 = { 1, 2, 3, 5, 6, 8, 9, 4, 2 };
        frequency(arr2);

    }

}
