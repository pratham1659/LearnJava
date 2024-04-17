package Java07Sorting;

public class Java06CountSort {
    public static void countSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        // Find the maximum element in the array
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Create a count array to store the count of each element
        int[] count = new int[max + 1];

        // Store the count of each element in the count array
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Modify the count array to store the actual position of each element in the sorted array
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // Create a temporary array to store the sorted elements
        int[] temp = new int[arr.length];

        // Build the sorted array using the count array
        for (int i = arr.length - 1; i >= 0; i--) {
            temp[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // Copy the sorted elements back to the original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        System.out.println("Array before sorting:");
        printArray(arr);

        countSort(arr);

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
