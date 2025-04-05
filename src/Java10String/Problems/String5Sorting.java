package Java10String.Problems;

import java.util.*;

public class String5Sorting {

    /*
     * To Sort String Characters
     * In Alphabetical Order
     */

    // Approach - without using sort Method
    // Time Complexity: O(n^2)
    // Space Complexity: O(n)
    public static void characterSort(String str) {

        char[] arr = str.toCharArray();
        char temp;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr);
    }

    // Approach - using sort Method
    // Time Complexity: O(n log n)
    // Space Complexity: O(n)
    public static void characterMethodSort(String str) {

        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        System.out.println(new String(charArray));
    }

    public static void main(String[] args) {

        characterSort("rock");
        characterMethodSort("rock");
    }
}
