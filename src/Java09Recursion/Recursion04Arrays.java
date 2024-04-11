package Java09Recursion;

import java.util.ArrayList;

public class Recursion04Arrays {

    //1: Print the array recursively
    public static void printArray(int[] arr, int idx) {

        //baseCase
        if (idx == arr.length) return;

        //subCase
        System.out.print(arr[idx] + " ");

        //selfWork
        printArray(arr, idx + 1);

    }

    //2: Found max in Array
    public static int maxArray(int[] arr, int idx) {

        //baseCase
        if (idx == arr.length - 1) return arr[idx];

        //subCase
        int currElement = maxArray(arr, idx + 1);

        //selfWork
        return Math.max(arr[idx], currElement);

    }

    //3: Found Total Sum in Array
    public static int sumArray(int[] arr, int idx) {

        //baseCase
        if (idx == arr.length - 1) return arr[idx];

        //subCase
        int currElement = sumArray(arr, idx + 1);

        //selfWork
        return arr[idx] + currElement;

    }

    //4: Found x element in array or not
    public static boolean foundArray(int[] arr, int x, int idx) {

        //baseCase
        if (idx >= arr.length) return false;

        //subCase
        if (arr[idx] == x) return true;

        //selfWork
        return foundArray(arr, x, idx + 1);
    }

    //4: Found x element in array or not
    public static int foundIndex(int[] arr, int x, int idx) {

        //baseCase
        if (idx >= arr.length) return -1;

        //selfWork
        if (arr[idx] == x) return idx;

        return foundIndex(arr, x, idx + 1);
    }

    //5: Given an array arr of size N and an integer X. The task is to find all the indices of
    // the integer X in the array.
    public static ArrayList<Integer> foundAllIndex(int[] arr, int x, int idx) {
        ArrayList<Integer> ans = new ArrayList<>();


        // Base case
        if (idx >= arr.length) {
            return ans;
        }

        // Recursive call
        ArrayList<Integer> smallAns = foundAllIndex(arr, x, idx + 1);

        // SubCase
        if (arr[idx] == x) {
            ans.add(idx);
        }

        ans.addAll(smallAns);

        return ans;
    }


    public static void main(String[] args) {

        int[] arr = {5, 6, 7, 8, 9};
        printArray(arr, 0);

        int[] maxArr = {6, 3, 8, 10, 4};
        System.out.println("\nMax in Array: " + maxArray(maxArr, 0));

        int[] sumArr = {10, 20, 30, 40};
        System.out.println("Sum of Array: " + sumArray(sumArr, 0));

        int[] foundArr = {3, 6, 2, 9, 5};
        System.out.println("Found Array: " + foundArray(foundArr, 0, 0));
        System.out.println("Found Array: " + foundIndex(foundArr, 9, 0));

        int[] foundAll = {3, 6, 2, 9, 5};
        System.out.println("Indices of " + foundAllIndex(arr, 6, 0));

    }
}
