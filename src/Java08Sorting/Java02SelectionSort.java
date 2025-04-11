package Java08Sorting;

public class Java02SelectionSort {

    /*
     * Selection Sort - notStable Sorting
     * Selection Sort - Inplace Sorting
     */

    // Ques 1: Program to Sort Array increasing Order
    // Time Complexity: O(N^2)
    // Space Complexity: O(1)
    public static void increaseSelection(int[] arr) {
        int len = arr.length;

        for (int i = 0; i < len - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // Ques 1: Program to Sort Array increasing Order
    // Time Complexity: O(N^2)
    // Space Complexity: O(1)
    public static void decreaseSelection(int[] arr) {
        int len = arr.length;

        for (int i = 0; i < len - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] > arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
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
        int[] arr = { 7, 5, 4, 1, 3 };

        System.out.print("Increasing Selection: ");
        increaseSelection(arr);
        printArray(arr);

        System.out.print("Decreasing Selection: ");
        decreaseSelection(arr);
        printArray(arr);

    }
}
