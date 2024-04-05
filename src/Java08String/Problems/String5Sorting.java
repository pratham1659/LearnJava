package String.Problems;

import java.util.*;

public class String5Sorting {

    /*
     * To Sort String Chatacters
     * In Alphabetical Order
     */

    // Approach - without using sort Method
    public static void charcterSort(String str) {

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

    public static void charcterMethodSort(String str) {

        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        System.out.println(new String(charArray));
    }

    // Approach - using sort Method

    public static void main(String[] args) {

        charcterSort("rock");
        charcterMethodSort("rock");
    }
}
