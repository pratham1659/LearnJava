package Java08Sorting;

public class Java03InsertionSort {

    /*
     * Insertion Sort - Stable Algorithm
     * Insertion Sort -
     */

    // Ques 1: Program to Sort Array Increasing Order
    // Time Complexity: O(N^2)
    // Space Complexity: O(1)
    public static void increaseInsertion(int[] arr) {
        int len = arr.length;

        for (int i = 1; i < len; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }

    // Ques 1: Program to Sort Array Decreasing Order
    // Time Complexity: O(N^2)
    // Space Complexity: O(1)
    public static void decreaseInsertion(int[] arr) {
        int len = arr.length;

        for (int i = 1; i < len; i++) {
            int j = i;
            while (j > 0 && arr[j] > arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }

    // printArray
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = { 8, 3, 6, 5, 4, 2 };
        System.out.print("Increasing Insertion: ");
        increaseInsertion(arr);
        printArray(arr);
        System.out.print("Decreasing Insertion: ");
        decreaseInsertion(arr);
        printArray(arr);

    }
}
