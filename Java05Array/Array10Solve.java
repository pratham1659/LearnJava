package Java05Array;

import java.util.Arrays;

public class Array10Solve {
    // 1. Find the total number of pairs in the Array whose sum is equal key.
    public static int countPairs(int[] arr, int key) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == key) {
                    count++;
                }
            }
        }

        return count;
    }

    // 2. Count the number of triplets whose sum is equal to the given value x.
    public static int countTriplets(int[] arr, int key) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == key) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    // 3. Delete Element from Array
    public static int[] deleteArray(int[] arr, int numToDel) {
        int count = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == numToDel) {
                count++;
            }
            i++;
        }

        if (count == 0) {
            return arr;
        }

        int newSizeOfArray = arr.length - count;
        int[] newArray = new int[newSizeOfArray];

        int j = 0, k = 0;
        while (j < arr.length) {
            if (arr[j] != numToDel) {
                newArray[k] = arr[j];
                k++;
            }
            j++;
        }

        return newArray;
    }

    // 4. Merge Two array in one new Array
    public static int[] mergeArray(int[] arr1, int[] arr2) {
        int size1 = arr1.length;
        int size2 = arr2.length;
        int[] mergedArray = new int[size1 + size2];

        int i = 0, j = 0, k = 0;
        while (i < size1 && j < size2) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        while (i < size1) {
            mergedArray[k++] = arr1[i++];
        }

        while (j < size2) {
            mergedArray[k++] = arr2[j++];
        }
        return mergedArray;
    }

    // 5. Calculate Diagonal Sum of Matrix
    public static int calculateDiagonalSum(int[][] matrix) {
        // Check for edge case where the matrix is not square
        if (matrix.length != matrix[0].length) {
            System.out.println("Matrix is not square.");
            return 0;
        }

        int size = matrix.length;
        int sum = 0;

        // Calculate the sum of the main diagonal (top-left to bottom-right)
        for (int i = 0; i < size; i++) {
            sum += matrix[i][i];
        }

        // Calculate the sum of the secondary diagonal (top-right to bottom-left)
        for (int i = 0; i < size; i++) {
            sum += matrix[i][size - 1 - i];
        }

        return sum;
    }

    // 6. Calculate sum and Average of Diagonal 2D Array
    public static void calculateSumAndAverage(int[][] matrix) {
        // Check for edge case where the matrix is empty
        if (matrix.length == 0 || matrix[0].length == 0) {
            System.out.println("Matrix is empty.");
            return;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int sum = 0;

        // Calculate sum and average
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += matrix[i][j];
            }
        }

        double average = (double) sum / (rows * cols);

        // Print the results
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Average of all elements: " + average);
    }

    // 7. Find Substing of Max Sum Sub Array
    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    // 8. Find Substing of Max Product Sub Array
    public static int maxProductSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxNum = nums[0];
        int minNum = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int tempMax = Math.max(nums[i], Math.max(maxNum * nums[i], minNum * nums[i]));
            int tempMin = Math.min(nums[i], Math.min(maxNum * nums[i], minNum * nums[i]));

            maxNum = tempMax;
            minNum = tempMin;

            ans = Math.max(ans, maxNum);
        }

        return ans;
    }

    // 9. Maximum Three Digits in Array
    public static int maximumProduct(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length;

        // Case 1: All three largest elements are positive
        int maxProduct1 = nums[n - 1] * nums[n - 2] * nums[n - 3];

        // Case 2: Two smallest elements (if they exist) and the largest element
        int maxProduct2 = nums[0] * nums[1] * nums[n - 1];

        return Math.max(maxProduct1, maxProduct2);
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 5, 6, 8, 9, 4, 2 };

        int[] subArr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        int[] sortedArray = { 1, 2, 3, 4 };
        int[] productArr = { 2, 3, -2, 4 };

        System.out.println("Count Sum of pairs: " + countPairs(arr, 8));
        System.out.println("COunt triplte Pair: " + countTriplets(arr, 9));
        System.out.println("Substring Max Array: " + maxSubArray(subArr));
        System.out.println("Substing Max product Array: " + maxProductSubArray(productArr));

        System.out.println("Maximum Three Product: " + maximumProduct(sortedArray));

    }
}
