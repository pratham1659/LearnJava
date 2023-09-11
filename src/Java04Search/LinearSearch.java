package Java04Search;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        System.out.println("Enter " + size + " elements array: ");
        int[] array = new int[size];

        // Input the array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Input the element to search
        System.out.print("Enter the element to search: ");
        int searchElement = scanner.nextInt();

        int index = linearSearch(array, searchElement);

        if (index != -1) {
            System.out.println("Element " + searchElement + " found at index " + index);
        } else {
            System.out.println("Element " + searchElement + " not found in the array.");
        }
    }

    public static int linearSearch(int[] array, int searchElement) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchElement) {
                return i; // Return the index if element is found
            }
        }
        return -1; // Return -1 if element is not found
    }
}
