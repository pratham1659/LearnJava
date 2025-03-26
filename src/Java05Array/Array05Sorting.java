package Java05Array;

import java.util.Arrays;

public class Array05Sorting {
    // 1. Program to sort in ascending order: Time Complexity O(NxN), Space
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

    // 6. Sort an Array using Two Pointer Methods
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

    // Given an array of integers 'arr', move all the even integers at the
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

    // Given an integer array 'a' sorted in non-decreasing
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
    }
}

