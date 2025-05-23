package Java05Array;

import java.util.Arrays;

public class Array04Sorting {

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void swapArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // 1. Program to Simple sort in ascending order: Time Complexity O(NxN), Space
    // Complexity O(1)
    public static int[] sortAscending(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    // 2. Program to sort the elements of an array in descending order
    public static int[] sortDescending(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    // 3. Java Program to find Third-Largest Number in an Array
    public static int findThirdLargestNumber(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }

        }
        return arr[n - 3];
    }

    // 5. Java Program to find Second-Largest Number in an Array
    public static int findSecondLargestNumber(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }

        }
        return arr[n - 2];
    }

    // 6. Java Progarm for BUBBLE SORT
    // How it works: Repeatedly swap adjacent elements if they are in the wrong
    // order.
    // Time complexity: O(n²)
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // 7. Java Program for SELECTION SORT
    // How it works: Repeatedly select the minimum element and put it in the correct
    // position.
    // Time complexity: O(n²)
    public static void selectionSort(int[] arr) {

        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // 8. Java Program for INSERTION SORT
    // How it works: Build the sorted array one item at a time by inserting each
    // item into its correct position.
    // Time complexity: O(n²)
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i]; // Current element to be inserted
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key; // Place key at the correct position
        }
    }

    // 9. Java Program for MERGE SORT
    // How it works: Divide the array into halves, sort each recursively, and merge.
    // Time complexity: O(n log n)

    // Main function that sorts arr[l..r] using merge()
    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;

            // Sort first half
            mergeSort(arr, l, m);

            // Sort second half
            mergeSort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    // Merge two sorted subarrays arr[l..m] and arr[m+1..r]
    public static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1; // Size of left subarray
        int n2 = r - m; // Size of right subarray

        // Create temporary arrays
        int[] left = new int[n1];
        int[] right = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++)
            left[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            right[j] = arr[m + 1 + j];

        // Merge temp arrays back into arr[l..r]
        int i = 0, j = 0;
        int k = l;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of left[], if any
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // Copy remaining elements of right[], if any
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    // 10. Java Program for QUICK SORT
    // How it works: Choose a pivot, partition array, sort the partitions
    // recursively.
    // Time complexity:
    // A) Best & Avg: O(n log n)
    // B) Worst: O(n²) — happens when pivot is worst case
    // Function to perform quicksort on arr between indices low and high
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Partition function to place pivot element at correct position
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose the last element as pivot
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller or equal to pivot
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and pivot (arr[high])
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return the pivot index
    }

    // 11. Java Program for HEAP SORT
    // How it works: Convert array to heap, repeatedly extract max and rebuild the
    // heap.
    // Time complexity: O(n log n)
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extract elements from heap
        for (int i = n - 1; i > 0; i--) {
            // swap root with last element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0); // heapify reduced heap
        }
    }

    private static void heapify(int[] arr, int size, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < size && arr[left] > arr[largest])
            largest = left;
        if (right < size && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, size, largest);
        }
    }

    // 12. Sort an Array using Two Pointer Methods
    // Sort an Array consisting of only 0s and 1s.
    public static int[] sortZeroOneArray(int[] arr) {
        int n = arr.length;
        int zeros = 0;

        // count method
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zeros++;
            }
        }

        // 1/0 to zeroes-1 : 0, zeroes to n-1 : 1
        for (int i = 0; i < n; i++) {
            if (i < zeros) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }

        return arr;
    }

    // Appraoch 2 sort 0 and 1 in Array
    public static int[] sortTwoPointerArray(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swapArray(arr, left, right);
                left++;
                right--;
            }

            if (arr[left] == 0) {
                left++;
            }

            if (arr[right] == 1) {
                right--;
            }
        }

        return arr;
    }

    // 13. Given an array of integers 'arr', move all the even integers at the
    // beginning of the array followed by all the odd integers. The
    // relative order of odd or even integers does not matter. Return
    // any array that satisfies the condition.
    public static int[] sortOddArray(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
                swapArray(arr, left, right);
                left++;
                right--;
            }

            if (arr[left] % 2 == 0) {
                left++;
            }

            if (arr[right] % 2 == 1) {
                right--;
            }
        }

        return arr;
    }

    // 14. Given an integer array 'a' sorted in non-decreasing
    // order, return an array of the squares of each numbe
    // sorted in non-decreasing order.
    public static int[] sortSquareArray(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int[] ans = new int[n];
        int k = 0;

        while (left <= right) {

            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k++] = arr[left] * arr[left];
                left++;
            } else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }

        }

        bubbleSort(ans);

        return ans;

    }

    // 15. Java program for Sorted Squared Array
    public static int[] sortedSquaredArray(int[] arr) {
        // Create a new array to store the squared values
        int[] squaredArr = new int[arr.length];

        // Square each element and store it in squaredArr
        for (int i = 0; i < arr.length; i++) {
            squaredArr[i] = arr[i] * arr[i];
        }

        // Arrays,sort method
        Arrays.sort(squaredArr);
        // Sort the squared array
        // bubbleSort(squaredArr);

        return squaredArr;
    }

    public static void main(String[] args) {

        int[] arr = { 5, 3, 7, 8, 9, 2, 4 };

        System.out.println("Sort in Ascending: " + Arrays.toString(sortAscending(arr)));
        System.out.println("Sort in Descending: " + Arrays.toString(sortDescending(arr)));

        System.out.println("Find Third Largest: " + findThirdLargestNumber(arr));
        System.out.println("Find Second Largest: " + findSecondLargestNumber(arr));

        int[] arr1 = { 1, 0, 0, 0, 1, 1, 0 };
        System.out.println("Sort Array: " + Arrays.toString(sortZeroOneArray(arr1)));
        System.out.println("Sort Array: " + Arrays.toString(sortTwoPointerArray(arr1)));

        int[] oddArr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(Arrays.toString(sortOddArray(oddArr)));

        int[] squareArr = { -10, -3, -2, 6, 4, 5 };
        System.out.println(Arrays.toString(sortSquareArray(squareArr)));
        System.out.println(Arrays.toString(sortedSquaredArray(squareArr)));

        mergeSort(arr, 0, arr.length - 1);
        quickSort(arr, 0, arr.length - 1);
        heapSort(arr);
    }
}
