package Practice.Mitsogo;

import java.util.*;
public class MinOperationsToPalindrome {
    public static int[] stringQuery(String input1, int input2, int[][] input3, int input4) {
        int[] result = new int[input4];
        for (int i = 0; i < input4; i++) {
            int left = input3[i][0] - 1;
            int right = input3[i][1] - 1;
            String substring = input1.substring(left, right + 1);
            result[i] = minOperations(substring);
        }
        return result;
    }
    public static int minOperations(String substring) {
        int operations = 0;
        int[] freq = new int[26];
        for (char c : substring.toCharArray()) {
            freq[c - 'a']++;
        }
        int oddCount = 0;
        for (int count : freq) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }
        return Math.max(0, oddCount - 1);
    }

    public static void main(String[] args) {
        String input1 = "abadabcd";
        int input2 = 8;
        int[][] input3 = {{1, 3}, {2, 5}};
        int input4 = 2;

        int[] result = stringQuery(input1, input2, input3, input4);
        System.out.println(Arrays.toString(result));  // Output: [0, 1]
    }
}
