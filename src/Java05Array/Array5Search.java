package Java05Array;

import java.util.Arrays;

public class Array5Search {
    // 1. Find Missing Number in Array
    public static int findMissingNumber(int[] missingArr) {

        int sum = 0;
        for (int i = 0; i < missingArr.length; i++) {
            sum += missingArr[i];
        }
        int newSum = 0;
        for (int i = 1; i <= 10; i++) {
            newSum += i;
        }
        return (newSum - sum);
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
        return new int[]{min, max};
    }

    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 5, 7, 8, 9, 10};
        System.out.println("Find Missing no: " + findMissingNumber(num));

        int[] num2 = {-10, 24, 50, 123, 88};
        System.out.println("Find Largest and Smallest: " + Arrays.toString(findLargestAndSmallest(num2)));
    }
}
