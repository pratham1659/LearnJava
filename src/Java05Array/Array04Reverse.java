package Java05Array;

import java.util.Arrays;

public class Array04Reverse {

    // Program to Display Array
    public static void displayArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    // 1. Reverse In Array Methods
    public static int[] reverseArray(int[] arr) {
        int[] reverse = new int[arr.length];
        int j = 0;

        int n = arr.length;

        for (int i = n - 1; i >= 0; i--) {
            reverse[j++] = arr[i];
        }

        return reverse;
    }

    // 2. Program to Reverse Integer
    public static int reverseInteger(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        return rev;
    }

    // 3. Program to Reverse String Integer
    public static void reverseStringInteger(int num) {
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        sb.reverse();
        System.out.println(sb);
    }

    // 4. check Palindrome Number
    public static boolean checkPalindrome(int num) {

        int newNum = 0;
        int sum = 0;
        int temp = num;
        while (num > 0) {
            newNum = num % 10;
            sum = (sum * 10) + newNum;
            num = num / 10;
        }

        return temp == sum;
    }

    // 5. check palindrom number using String Builder
    public static boolean isPalindrome(String str) {
        // Convert the number to a string
        // String str = Integer.toString(num);

        // Reverse the string
        StringBuilder reversed = new StringBuilder(str).reverse();
        return str.equals(reversed.toString());
    }

    // 6: To find palindrome numbers within a long integer using an array,
    public static boolean isPalindrome(int number) {

        char[] digits = Integer.toString(number).toCharArray();

        int start = 0;
        int end = digits.length - 1;

        while (start < end) {
            if (digits[start] != digits[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;

    }

    // 7. Reverse of an Array
    public static int[] reverseArrayTemp(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return arr;
    }

    // 8. Count the number of elements strictly greater than value x.
    public static int strictlyGreater(int[] arr, int key) {

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > key) {
                return arr[i];
            }
        }

        return -1;
    }

    // 9. Reverse the digits in Descending Order TimeComplexity O(Nlog N)
    public static void reverseMax(int num) {

        String str = Integer.toString(num);

        char[] digits = str.toCharArray();

        Arrays.sort(digits);

        StringBuffer sb = new StringBuffer(new String(digits));

        sb.reverse();

        System.out.println(sb);

    }

    // 8. Reverse of Array
    public static void reverseArraySwap(int[] arr) {
        int i = 0;
        while (i < arr.length / 2) {
            int swap = arr[i];
            arr[i] = arr[(arr.length - i) - 1];
            arr[(arr.length - i) - 1] = swap;
            i++;
        }
    }

    // 9. Create a program to check is the array is palindrome or not.
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

    public static void main(String[] args) {

        int[] arr = { 2, 7, 8, 9, 4, 10, 8, 5 };

        System.out.println("Reverse Integer: " + reverseInteger(123));
        reverseStringInteger(456);
        System.out.println("Check Palindrome String: " + isPalindrome("AMA"));
        System.out.println("Check Palindrome: " + isPalindrome(121897));

        System.out.println("Stricly greater: " + strictlyGreater(arr, 5));
        System.out.println(Arrays.toString(reverseArray(arr)));

        reverseMax(37489842);
    }
}
