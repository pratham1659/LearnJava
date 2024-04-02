package Java05Search;

import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearch {

    // 1. binary Search using Array : Time Complexity O(logN), Space Complexity O(1)
    public static int binarySearchArray(int[] arr, int key) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (arr[mid] == key) {
                return mid;
            }

            // If target is greater, ignore left half
            if (arr[mid] < key) {
                left = mid + 1;
            }

            // If target is smaller, ignore right half
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
    }

}
