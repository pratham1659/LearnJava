package Java04Search;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the sorted array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];


        // Input the sorted array elements
        System.out.println("Enter the sorted array elements in ascending order:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Input the element to search
        System.out.print("Enter the element to search: ");
        int searchElement = scanner.nextInt();

        int index = binarySearch(array, searchElement);

        if (index != -1) {
            System.out.println("Element " + searchElement + " found at index " + index);
        } else {
            System.out.println("Element " + searchElement + " not found in the array.");
        }
    }

    public static int binarySearch(int[] array, int searchElement) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == searchElement) {
                return mid; // Element found at the middle index
            } else if (array[mid] < searchElement) {
                left = mid + 1; // Search in the right half of the array
            } else {
                right = mid - 1; // Search in the left half of the array
            }
        }

        return -1; // Element not found in the array
    }
}
