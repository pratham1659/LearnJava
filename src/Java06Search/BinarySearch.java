package Java06Search;

import java.util.ArrayList;

public class BinarySearch {

    // 1. binary Search using Array: Time Complexity O(logN), Space Complexity O(1)
    public static int binarySearchArray(int[] arr, int key) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the target is present at mid
            if (arr[mid] == key) {
                return mid;
            }

            // If the target is greater, ignore the left half
            if (arr[mid] < key) {
                left = mid + 1;
            }

            // If the target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static int binarySearchArrayList(ArrayList<Integer> arr, int key) {

        int left = 0;
        int right = arr.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr.get(mid) == key) {
                return mid;
            }

            if (arr.get(mid) < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int recursiveBinarySearch(int[] arr, int left, int right, int target) {
        if (left <= right) {

            int mid = left + (right - left) / 2; //better way to prevent overflow in binary search.

            if (arr[mid] == target)
                return mid;

            if (arr[mid] < target) {
                return recursiveBinarySearch(arr, mid + 1, right, target);
            }

            return recursiveBinarySearch(arr, left, mid - 1, target);
        }
        return -1;
    }


    // Find the first occurrence of a given element x, given that the given array is sorted.
    // If no occurrence of x is found, then return -1.
    public static int findFirstOccurrence(int[] arr, int target) {
        int len = arr.length;
        int start = 0;
        int end = len - 1;
        int firstIndex = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                firstIndex = mid;
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return firstIndex;
    }

    public static int findLastOccurrence(int[] arr, int target) {
        int len = arr.length;
        int start = 0;
        int end = len - 1;
        int lastIndex = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                lastIndex = mid;
                start = mid + 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return lastIndex;
    }

    // Find the square root of given non-negative value x. Round it off to the nearest floor integer.
    public static int squareRootBinarySearch(int target) {
        int start = 0, end = target;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long value = (long) mid * mid; // Calculate square using long to prevent overflow

            if (value == target) {
                return mid; // Found exact square root
            } else if (value < target) {
                ans = mid; // Update answer to potential square root
                start = mid + 1; // Search in the right half
            } else {
                end = mid - 1; // Search in the left half
            }
        }

        return ans; // Return the nearest floor square root
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        System.out.println("Binary Search Array at index: " + binarySearchArray(arr, 12));

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(8);
        arrayList.add(10);
        arrayList.add(12);
        arrayList.add(14);

        System.out.println("Binary Search ArrayList: " + binarySearchArrayList(arrayList, 10));
        System.out.println("Recursion Binary: " + recursiveBinarySearch(arr, 0, arr.length - 1, 12));


        int[] findArr = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int target = 5;
        System.out.println("First Occurrence index: " + findFirstOccurrence(findArr, target));
        System.out.println("Last Occurrence index: " + findLastOccurrence(findArr, target));

        System.out.println("Square Root: " + squareRootBinarySearch(12));

    }
}
