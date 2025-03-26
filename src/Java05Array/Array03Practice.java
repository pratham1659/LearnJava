package Java05Array;

import java.util.HashMap;
import java.util.Scanner;

public class Array03Practice {

    // Ques 1: Sum of two Number
    public static int sumOfTwo(int num1, int num2) {
        int sum = 0;
        sum = num1 + num2;
        return sum;
    }

    // Ques 2: swap With Temp
    public static void swapTemp(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("First Element: " + a + " Second Element: " + b);
    }

    // Ques 3: Swap without Temp
    public static void swapWithoutTemp(int a, int b) {

        a = a + b; // 2+3 = 5
        b = a - b; // 5-3 = 2
        a = a - b; // 5-2 = 3

        System.out.println("First Element: " + a + " Second Element: " + b);
    }

    // Ques 4: Sum of Arrays
    public static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    // Ques 5: print 2d Array
    public static void print2dArray(int[][] arr2d) {
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d.length; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Ques 6: Maximum Array
    public static int maxArray(int[] arr) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    // Ques 7: Minimum Array
    public static int minArray(int[] arr) {

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // Ques 7: Find elements in Array
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

    public static void inputArray() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Ques 8: Program to print the elements of an array present on even position
    public static void printArrayEven(int[] arr) {
        for (int i = 0; i < arr.length; i = i + 2) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Ques 9: Program to print the elements of an array present on odd position
    public static void printArrayOdd(int[] arr) {
        for (int i = 1; i < arr.length; i = i + 2) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Ques 10: Program to copy all elements of one array into another array
    public static int[] copyArray(int[] array) {
        int[] array2 = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        return array2;
    }

    // Ques 11: Program to find the frequency of each element in the array
    public static void frequency(int[] array) {

        int[] freq = new int[array.length];
        int visited = -1;
        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    freq[j] = visited;
                }
            }
            if (freq[i] != visited) {
                freq[i] = count;
            }
        }

        // Display the frequency of each element
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != visited) {
                System.out.println(" " + array[i] + " " + freq[i]);
            }
        }
    }

    // 3. frequency of the element using HashMap
    public static void frequencyHash(int[] array) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            if (freq.containsKey(element)) {
                freq.put(element, freq.get(element) + 1);
            } else {
                freq.put(element, 1);
            }
        }

        // Display the frequency of each element
        System.out.println("Element : Frequency");
        for (int element : freq.keySet()) {
            System.out.println(element + " : " + freq.get(element));
        }
    }

    // Function to print an array
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = { 2, 3, 9, 5, 6, 7 };
        int[][] arr2d = { { 23, 34, 34 }, { 34, 78, 98 }, { 56, 76, 67 } };

        int[] array = { 1, 2, 4, 5, 6, 6, 9, 8, 7 };

        System.out.println("Sum of Array: " + sumOfArray(arr));
        System.out.println("Matrix of Array: ");
        print2dArray(arr2d);
        swapTemp(23, 89);
        swapWithoutTemp(23, 89);
        System.out.println("Maximumn Element: " + maxArray(arr));
        System.out.println("Minimum Array: " + minArray(arr));
        findElements(arr, 7);
        displayArray(arr);
        printArrayEven(arr);
        printArrayOdd(arr);

        // displayArray(copyArray(array));
        // frequencyHash(array);
        // frequency(array);
        // leftRotateFromArrayIndex(array, 3);
        // Print left rotated array
        System.out.println("\nArray after left rotation from index " + 3 + ":");
        printArray(array);

    }
}
