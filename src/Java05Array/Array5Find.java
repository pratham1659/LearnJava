package Java05Array;

import java.util.Arrays;

public class Array5Find {
    /*
     * Find Armstrong Number
     * 153
     * 1*1*1 = 1
     * 5*5*5 = 125
     * 3*3*3 = 27
     * 1+125+27 = 153
     *
     * 407 = 4*4*4 + 0 + 7*7*7 = 407
     *
     */

    public static boolean checkArmstring(int num) {

        // Count the number of digits
        int noOfDigit = String.valueOf(num).length();
        int originalNum = num;
        int sum = 0;

        // Calculate the sum of digits raised to the power of the number of digits
        while (num > 0) {
            int digit = num % 10;
            sum = sum + (int) Math.pow(digit, noOfDigit);
            num = num / 10;
        }

        // Check if the sum is equal to the original number
        return sum == originalNum;
    }

    // 1. without recursive -- use for loop
    public static int findFactorial(int num) {
        int fact = 1;
        if (num == 0) {
            return 1;
        }
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;

    }

    // 2. with Recursive function: a function is calling itself
    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return (num * factorial(num - 1));
        }
    }

    // 3. Find Duplicate Element of the Array.
    public static void findDuplicateElement(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate element: " + arr[i]);
                }
            }
        }
    }

    // 3. Find Last Occurence of the Element
    public static void findLastOccurence(int[] arr, int key) {
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                lastIndex = i;
            }
        }
        System.out.println("Index of LastOccurence: " + lastIndex);
    }

    // 4. Count the number of elements strictly greater than value x.
    public static int countStrictlyMax(int[] arr, int key) {

        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > key) {
                maxCount++;
            }
        }
        return maxCount;
    }

    // 5. check if the given array is sorted or not.
    public static boolean isSorted(int[] arr) {

        boolean check = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                check = false;
            }
        }
        return check;
    }

    // 6. find small and Largest from the given array
    public static int[] getSmallestAndLargest(int[] arr) {

        Arrays.sort(arr);
        int[] ans = { arr[0], arr[arr.length - 1] };
        return ans;
    }

    // 7. find kth smallest and largest from the given array
    public static int[] getSmallestAndLargest(int[] arr, int kth) {

        Arrays.sort(arr);

        int min = arr[kth - 1];
        int max = arr[arr.length - kth];

        int[] ans = { min, max };

        return ans;

    }

    public static void main(String[] args) {

        System.out.println("Check ArmStrong: " + checkArmstring(153));
        System.out.println("Find Factorial: " + findFactorial(4));
        System.out.println("Find Recursion Factorial: " + factorial(4));

        int[] arr = { 2, 7, 8, 9, 4, 9, 8, 7 };
        int[] sortedArr = { 2, 3, 3, 4, 5, 6, 7, 7, 8 };
        findDuplicateElement(arr);
        findLastOccurence(arr, 9);

        System.out.println("Find Stricly Maximum than 9: " + countStrictlyMax(arr, 8));
        System.out.println("Check Array is Sorted or Not: " + isSorted(sortedArr));

        int[] result = getSmallestAndLargest(arr);
        System.out.println("Smallest in Array: " + result[0]);
        System.out.println("Largest in Array: " + result[1]);

    }
}