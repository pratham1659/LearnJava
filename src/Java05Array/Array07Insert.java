package Java05Array;

import java.util.Arrays;

public class Array07Insert {

    // Ques 1: Insert element in Array
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

    // Ques 2: Delete element in Array
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

    // Ques 3 : Insert element in new Array
    public static int[] checkArray(int[] arr, int value, int position) {

        int n = arr.length;
        int ans[] = new int[n + 1];
        int i = 0;
        int j = 0;

        while (i < n + 1) {
            if (i == position - 1) {
                ans[i] = value;
            } else {
                ans[i] = arr[j];
                j++;
            }
            i++;
        }

        return ans;

    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 4, 5, 6 }; // Example array
        System.out.println("Insert in Array:" + Arrays.toString(insertInArray(arr, 2, 3)));
        System.out.println("Delete in Array: " + Arrays.toString(deleteElement(arr, 3)));

        System.out.println(Arrays.toString(checkArray(arr, 3, 3)));

    }
}
