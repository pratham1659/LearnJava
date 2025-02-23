package Java05Array;

import java.util.Arrays;

public class Array09Search {

    // 1. Find Missing Number in Array
    public static void findMissingNumber(int[] arr) {

        int[] missingArr = arr;
        int sum = 0;
        for (int i = 0; i < missingArr.length; i++) {
            sum += missingArr[i];
        }
        int newSum = 0;
        for (int i = 1; i <= 10; i++) {
            newSum += i;
        }

        System.out.println("Missing Number: " + (newSum - sum));
    }

    // 2. Find Largest and Smallest in array
    public static int[] findLargestAndSmallest(int[] arr) {

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        return new int[] { min, max };
    }

    // 12. Search elements in Matrix 2d Array
    public static boolean searchElement(int[][] matrix, int target) {

        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int row = 0;
        int col = cols - 1;

        while (row < rows && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] num = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };
        findMissingNumber(num);

        int[] num2 = { -10, 24, 50, 123, 88 };
        System.out.println("Find Largest and Smallest: " + Arrays.toString(findLargestAndSmallest(num2)));
    }
}
