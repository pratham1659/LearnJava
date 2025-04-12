package Java05Array;

import java.util.Scanner;

public class Array01Basic {

    // Array concept
    void singleArray() {
        // Representation of Arrays
        // int[] uid = new int[2];
        String[] name = { "Raj", "Vikash", "Ball", "Hero" };
        // String roll[];
        // float price[];

        // Array literals
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] age = new int[10]; // Size of an Array
        arr[1] = 34;
        age[0] = 12;
        System.out.println(arr[2]);
        int[] ages = { 45, 56, 67, 89, 32, 76, 54 };
        System.out.println(ages.length);

        for (int i = 0; i < ages.length; i++) {
            System.out.print(ages[i] + " ");
        }

        // forEach Loops
        for (int i : ages) {
            System.out.print(i + " ");
        }

        int k = 0;
        while (k < ages.length) {
            System.out.print(ages[k] + " ");
            k++;
        }

        System.out.println(name[1]);

    }

    void multiArray() {
        // int[][] arr2d = new int [3][3];

        int[][] arr2d = { { 23, 34, 34 }, { 34, 78, 98 }, { 56, 76, 67 } };

        System.out.println(arr2d[0][0]); // 23
        System.out.println(arr2d[1][1]); // 78

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Input Array
    public static void inputArray() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    // Printing Array Methods
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Ques 1. Find Sum of Array
    public static int sumOfArray(int[] arr) {

        int sum = 0;
        int i = 0;
        while (i < arr.length) {
            sum += arr[i];
            i++;
        }
        return sum;
    }

    // Ques 2. Find the Average of Array
    public static int averageArray(int[] arr) {

        int sum = sumOfArray(arr);
        return (sum / arr.length);
    }

    // Ques 3. inputArray using Scanner Class
    public static int[] inputArray(int num) {

        int[] arr = new int[num];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array here: ");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        return arr;
    }

    // Ques 4. Create a program to find number of occurrences of an element in an
    // array.
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

    // Ques 5. check Array in Incresing order or not
    public static boolean isIncreasedArray(int[] arr) {
        int i = 1;
        while (i < arr.length) {
            if (arr[i] >= arr[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }

    // Ques 6. check Array in Decreasing order or not
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

    // Ques 7: check array is sorted or not
    public static boolean checkArray(int[] arr) {

        int n = arr.length;
        boolean isArrSorted = true;
        for (int i = 0; i < n - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                isArrSorted = false;
                break;
            }
        }
        return isArrSorted;
    }

    // Ques 8: Sum of two Number
    public static int sumOfTwo(int num1, int num2) {
        int sum = 0;
        sum = num1 + num2;
        return sum;
    }

    // Ques 9: swap With Temp
    public static void swapTemp(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("First Element: " + a + " Second Element: " + b);
    }

    // Ques 10: Swap without Temp
    public static void swapWithoutTemp(int a, int b) {

        a = a + b; // 2+3 = 5
        b = a - b; // 5-3 = 2
        a = a - b; // 5-2 = 3

        System.out.println("First Element: " + a + " Second Element: " + b);
    }

    // Ques 11: print 2d Array
    public static void print2dArray(int[][] arr2d) {
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d.length; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Ques 12: Maximum Array
    public static int maxArray(int[] arr) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    // Ques 13: Minimum Array
    public static int minArray(int[] arr) {

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // Ques 14: Find elements in Array
    public static void findElements(int[] arr, int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                int idx = i;
                System.out.println("Elements found at index " + idx);
                return;
            }
        }
        System.out.println("Element Not Found");
    }

    // Ques 15: Program to print the elements of an array present on even position
    public static void printArrayEven(int[] arr) {
        for (int i = 0; i < arr.length; i = i + 2) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Ques 16: Program to print the elements of an array present on odd position
    public static void printArrayOdd(int[] arr) {
        for (int i = 1; i < arr.length; i = i + 2) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Ques 17: Program to copy all elements of one array into another array
    public static int[] copyArray(int[] array) {
        int[] array2 = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        return array2;
    }

    public static void main(String[] args) {

        Array01Basic obj = new Array01Basic();

        obj.singleArray();
        obj.multiArray();

        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(checkArray(arr));

    }
}
