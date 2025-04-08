package Java05Array;

import java.util.Scanner;

public class Array01Basic {

    static void sum(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

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

    void sumOfArray() {

        int[] arr = { 1, 2, 3, 4, 6, 7, 8 };
        int sum = 0;

        for (int i : arr) {
            sum = sum + i;
        }
        System.out.print(sum);
    }

    // 1. Find Sum of Array
    public static int sumOfArray(int[] arr) {

        int sum = 0;
        int i = 0;
        while (i < arr.length) {
            sum += arr[i];
            i++;
        }
        return sum;
    }

    // 2. Average Array
    public static int averageArray(int[] arr) {

        int sum = sumOfArray(arr);
        return (sum / arr.length);
    }

    // 3. inputArray using Scanner Class
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

    // 4. Create a program to find number of occurrences of an element in an array.
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

    // 5. Create a program to find the maximum and minimum element in an array.
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

    // 6. check Array in Incresing order or not
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

    // 7. check Array in Decreasing order or not
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

    // Ques 8: check array is sorted or not
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

    public static void main(String[] args) {

        Array01Basic obj = new Array01Basic();

        sum(23, 34);
        obj.singleArray();
        obj.multiArray();
        obj.sumOfArray();

        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(checkArray(arr));

    }
}
