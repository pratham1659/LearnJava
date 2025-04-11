package Java08Sorting;

public class Java05QuickSort {
    public static void quickSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int n = arr.length;
        quickSortHelper(arr, 0, n - 1);
    }

    private static void quickSortHelper(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSortHelper(arr, low, pivotIndex - 1); // Sort left subarray
            quickSortHelper(arr, pivotIndex + 1, high); // Sort right subarray
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose the last element as pivot
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j); // Swap arr[i] and arr[j]
            }
        }

        swap(arr, i + 1, high); // Swap arr[i+1] and pivot (arr[high])
        return i + 1; // Return the partitioning index
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        System.out.println("Array before sorting:");
        printArray(arr);

        quickSort(arr);

        System.out.println("\nArray after sorting:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
