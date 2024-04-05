package Java05Array;

import java.util.Scanner;

public class Array7Practice {

    public static int arraySum(int[] arr) {
        int sum = 0;
        int i = 0;
        while (i < arr.length) {
            sum += arr[i];
            i++;
        }

        return sum;
    }

    public static int arrayAverage(int[] arr) {
        int sum = arraySum(arr);
        return (sum / arr.length);
    }

    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Array Size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Elements in Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int[][] input2DArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Please Enter the number of columns: ");
        int columns = sc.nextInt();

        int[][] numArray = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++){
                numArray[i][j] = sc.nextInt();
            }
        }
        return numArray;
    }

    public static void displayArray(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
    }

    public static void checkBooleanResult(int[] arr) {
        boolean result = checkPalindrome(arr);

        if (result) {
            System.out.println("The array is palindrome");
        } else {
            System.out.println("The array is not palindrome");
        }
    }

    //  Create a program to find number of occurrences of an element in an array.
    public static int occurrencesArray(int[] arr, int num) {
        int count = 0;
        int i = 0;

        while (i < arr.length) {
            if (arr[i] == num) {
                count++;
            }
            i++;
        }
        return count;
    }

    //Create a program to find the maximum and minimum element in an array.
    public static int minArray(int[] arr) {
        if (arr.length == 0) {
            return Integer.MIN_VALUE;
        }
        int min = arr[0];
        int i = 1;
        while (i < arr.length) {
            if (min > arr[i]) {
                min = arr[i];
            }
            i++;
        }
        return min;
    }

    public static int maxArray(int[] arr) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }
        int max = arr[0];
        int i = 1;
        while (i < arr.length) {
            if (max < arr[i]) {
                max = arr[i];
            }
            i++;
        }
        return max;
    }

    public static boolean isIncreasedArray(int[] arr) {
        int i = 1;
        while (i < arr.length) {
            if (arr[i] >= arr[i - 1]) {
                return true;
            }
            i++;
        }
        return false;
    }

    public static boolean isDecreasedArray(int[] arr) {
        int i = 1;
        while (i < arr.length) {
            if (arr[i] <= arr[i - 1]) {
                return true;
            }
            i++;
        }
        return false;
    }

    //    Create a program to return a new array deleting a specific element.
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

//    Create a program to reverse an array.

    public static void reverseArray(int[] arr) {
        int i = 0;
        while (i < arr.length / 2) {
            int swap = arr[i];
            arr[i] = arr[(arr.length - i) - 1];
            arr[(arr.length - i) - 1] = swap;
            i++;
        }
    }

    //    Create a program to check is the array is palindrome or not.
    public static boolean checkPalindrome(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != arr[(arr.length - 1) - i]) {
                return false;
            }
            i++;
        }
        return true;
    }

    /*

    public static boolean checkPalindrome(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (arr[i] != arr[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
     */


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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] arr = inputArray();
//        int[] numArray = inputArray();
        int[][] num2DArray = input2DArray();


//        int sum = arraySum(numArray);
//        int avg = arrayAverage(numArray);
//        System.out.println("Sum of Array: " + sum);
//        System.out.println("Average of Array: " + avg);

//        System.out.print("Enter the element to find: ");
//        int num = sc.nextInt();
//        System.out.println( occurrencesArray(numArray, num));

//        System.out.println(minArray(numArray));
//        System.out.println(maxArray(numArray));

//        System.out.println(isIncreasedArray(numArray));
//        System.out.println(isDecreasedArray(numArray));


//        System.out.println("Enter Element to be delete: ");
//        int numToDel = sc.nextInt();
//        int[] newArr = deleteArray(numArray, numToDel);
//        displayArray(newArr);

//        reverseArray(numArray);
//        displayArray(numArray);

//        checkPalindrome(numArray);
//        checkBooleanResult(numArray);

//        displayArray(mergeArray(arr, numArray));

//        System.out.println(searchElement(num2DArray, 8));

//        calculateSumAndAverage(num2DArray);

        int sum = calculateDiagonalSum(num2DArray);
        System.out.println("Sum of diagonal elements: " + sum);

    }
}
