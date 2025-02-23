package Java05Array;

import java.util.Arrays;

public class Array07Insert {

    // Insert in Array
    public static int[] insertInArray(int[] arr, int index, int value) {
        if (index >= 0 && index < arr.length) {

            int[] newArr = new int[arr.length + 1];
            for (int i = 0, j = 0; i < newArr.length; i++) {
                if (i == index) {
                    newArr[i] = value;
                } else {
                    newArr[i] = arr[j++];
                }
            }
            return newArr;
        } else {
            return arr;
        }

    }

    // Delete in Array
    public static int[] deleteElement(int[] array, int index) {
        if (index >= 0 && index < array.length) {
            int[] newArray = new int[array.length - 1];
            for (int i = 0, j = 0; i < array.length; i++) {
                if (i != index) {
                    newArray[j++] = array[i];
                }
            }
            return newArray;
        } else {
            System.out.println("Invalid index. Element not deleted.");
            return array; // Return original array if index is invalid
        }
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 4, 5, 6 }; // Example array
        System.out.println("Insert in Array:" + Arrays.toString(insertInArray(arr, 2, 3)));
        System.out.println("Delete in Array: " + Arrays.toString(deleteElement(arr, 3)));
    }
}

