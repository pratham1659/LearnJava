package Java05Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Array08Find {
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

    // 1. check Armstrong Number
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

    // 2. without recursive -- use for loop
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

    // 3. with Recursive function: a function is calling itself
    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return (num * factorial(num - 1));
        }
    }

    // 4. Find Duplicate Element of the Array.
    public static void findDuplicateElement(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate element: " + arr[i]);
                }
            }
        }
    }

    // 5. Find Last Occurence of the Element
    public static void findLastOccurence(int[] arr, int key) {
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                lastIndex = i;
            }
        }
        System.out.println("Index of LastOccurence: " + lastIndex);
    }

    // 6. Count the number of elements strictly greater than value x.
    public static int countStrictlyMax(int[] arr, int key) {

        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > key) {
                maxCount++;
            }
        }
        return maxCount;
    }

    // 7. check if the given array is sorted or not.
    public static boolean isSorted(int[] arr) {

        boolean check = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                check = false;
            }
        }
        return check;
    }

    // 8. find small and Largest from the given array
    public static int[] getSmallestAndLargest(int[] arr) {

        Arrays.sort(arr);
        int[] ans = { arr[0], arr[arr.length - 1] };
        return ans;
    }

    // 9. find kth smallest and largest from the given array
    public static int[] getSmallestAndLargest(int[] arr, int kth) {

        Arrays.sort(arr);

        int min = arr[kth - 1];
        int max = arr[arr.length - kth];

        int[] ans = { min, max };

        return ans;

    }

    // 10 find the frequnecy of the elements in the O(N) time.
    public static void frequnecyON(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Traverse the HashMap and print the frequencies
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Element " + entry.getKey() + " occurs " + entry.getValue() + " times");
        }

    }

    // 3. find Unique number in Array
    public static int findUnique(int[] arr) {
        int ans = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                ans = arr[i];
            }
        }

        return ans;

    }

    // 4. Find Max Number in Array
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // 5. Find Max Number in Array
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // 6. find Second Max Number in Array
    public static int secondMax(int[] arr) {
        int max = findMax(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                arr[i] = -1;
            }
        }
        return findMax(arr);
    }

    // 7. find First Repetitive number in Array
    public static int findFirstRepeat(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    // 8 find missing number in Array
    // https://leetcode.com/problems/missing-number
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sumArr = 0;
        int totalSum = (n * (n + 1)) / 2;
        for (int i = 0; i < n; i++) {
            sumArr = sumArr + nums[i];
        }
        return totalSum - sumArr;
    }

    public static void main(String[] args) {

        System.out.println("Check ArmStrong: " + checkArmstring(153));
        System.out.println("Find Factorial: " + findFactorial(4));
        System.out.println("Find Recursion Factorial: " + factorial(4));

        int[] arr = { 2, 7, 8, 9, 4, 9, 8, 7 };
        int[] sortedArr = { 2, 3, 3, 4, 5, 6, 7, 7, 8 };
        findDuplicateElement(arr);
        // findLastOccurence(arr, 9);

        // System.out.println("Find Stricly Maximum than 9: " + countStrictlyMax(arr,
        // 8));
        System.out.println("Check Array is Sorted or Not: " + isSorted(sortedArr));

        // int[] result = getSmallestAndLargest(arr);
        // System.out.println("Smallest in Array: " + result[0]);
        // System.out.println("Largest in Array: " + result[1]);

        frequnecyON(arr);

        int[] duplicateArray = { 2, 3, 4, 2, 6, 3, 4, 7, 9, 8 };

        System.out.println("Find Unique Array: " + findUnique(duplicateArray));

        System.out.println("Find Max in Array: " + findMax(arr));
        System.out.println("Find Min in Array: " + findMin(arr));

        System.out.println("Second Maximum Array: " + secondMax(arr));

        System.out.println("First Repetitive Array: " + findFirstRepeat(duplicateArray));

        int miss[] = { 3, 0, 1 };
        System.out.println(missingNumber(miss));

    }
}
