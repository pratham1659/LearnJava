package Java08Sorting;

public class Java04MergeSort {

    /*
     * Merge Sort - Divide the array in two halves
     * sort 2 sub arrays separately using Recursion
     * Merge the 2 sorted sub arrays to create an overall sorted array
     */

    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // No need to sort if the array has 0 or 1 element
        }
        int n = arr.length;
        int[] temp = new int[n];
        mergeSortHelper(arr, 0, n - 1, temp);
    }

    private static void mergeSortHelper(int[] arr, int left, int right, int[] temp) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSortHelper(arr, left, mid, temp); // Sort left half
            mergeSortHelper(arr, mid + 1, right, temp); // Sort right half
            merge(arr, left, mid, right, temp); // Merge the sorted halves
        }
    }

    private static void merge(int[] arr, int left, int mid, int right, int[] temp) {
        int i = left; // Index for the left subarray
        int j = mid + 1; // Index for the right subarray
        int k = left; // Index for the merged array

        // Merge the two sorted arrays into temp array
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy the remaining elements from the left subarray to temp
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy the remaining elements from the right subarray to temp
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // Copy elements from temp back to the original array
        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
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
        System.out.print("Increasing MergeSort: ");
        mergeSort(arr);
        printArray(arr);
    }
}
