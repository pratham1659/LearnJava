package Java04Array;

import java.util.Arrays;

public class Array5Search {

    /*
     * How to find Missing Number In Array
     */

    public static void missingNumber(int[] num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        int newSum = 0;
        for (int j = 1; j <= 10; j++) {
            newSum += j;
        }
        System.out.println("Missing Number: " + (newSum - sum));
    }

    /*
     * Largest & Smallest Numbers In Array
     */

    public static void largestSmallestNumber(int[] num) {

        int largest = num[0];
        int smallest = num[0];

        System.out.println("Given Array: " + Arrays.toString(num));
        for (int i = 1; i < num.length; i++) {
            if (num[i] > largest) {
                largest = num[i];
            } else if (num[i] < smallest) {
                smallest = num[i];
            }
        }
        System.out.println("Smallest Number: " + smallest);
        System.out.println("Largest Number: " + largest);
    }

    public static void main(String[] args) {

        int[] num = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };
        missingNumber(num);

        int[] num2 = { -10, 24, 50, 123, 88 };
        largestSmallestNumber(num2);
    }
}
