package Java09Sorting;

public class Java01BubbleSort {

    /*
     * Bubble Sort - Stable Algorithm arr = [1, 2, 3, 3*, 5]
     * Bubble Sort - inPlace Algorithm
     */
    // Ques 1: Program to Sort Array increasing Order
    // Time Complexity: O(N^2)
    // Space Complexity: O(1)
    public static void increaseSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Ques 2: Program to Sort Array decreasing Order
    // Time Complexity: O(N^2)
    // Space Complexity: O(1)
    public static void decreaseSort(int[] arr) {
        int len = arr.length;

        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Ques 2: Program to Sort Array increasing Order another Approach but not
    // bubble sort
    // Time Complexity: O(N^2)
    // Space Complexity: O(1)
    public static void sorting(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

    // Ques 2: Program to Sort Array optimiseBubble
    // Time Complexity: O(N^2)
    // Space Complexity: O(1)
    public static void optimiseBubble(int[] arr) {
        int len = arr.length;

        for (int i = 0; i < len - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) { // Have any swaps Happened
                return;
            }
        }
    }

    // Ques 4: Maximum no of swaps in the worst case in Bubble Sort

    // printArray Approach
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        System.out.print("Increasing Order: ");
        increaseSort(arr);
        printArray(arr);

        System.out.print("Decreasing Order: ");
        decreaseSort(arr);
        printArray(arr);

        System.out.println("Another Approach: ");
        sorting(arr);
        printArray(arr);

        optimiseBubble(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
