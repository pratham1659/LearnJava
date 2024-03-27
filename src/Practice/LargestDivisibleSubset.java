package Temp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestDivisibleSubset {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        List<Integer> result = new ArrayList<>();
        int[] dp = new int[nums.length];
        int maxIndex = 0, maxSize = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j >= 0; j--) {
                if (nums[i] % nums[j] == 0 && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    if (dp[i] > maxSize) {
                        maxSize = dp[i];
                        maxIndex = i;
                    }
                }
            }
        }

        int currSize = maxSize;
        int currNum = nums[maxIndex];
        for (int i = maxIndex; i >= 0; i--) {
            if (currSize > 0 && currNum % nums[i] == 0 && dp[i] == currSize) {
                result.add(nums[i]);
                currNum = nums[i];
                currSize--;
            }
        }

        Collections.reverse(result); // Reverse the list to get the correct order
        return result;
    }

    public static void main(String[] args) {
        LargestDivisibleSubset solution = new LargestDivisibleSubset();

        int[] nums1 = { 1, 2, 3 };
        System.out.println(solution.largestDivisibleSubset(nums1)); // Output: [1, 2] or [1, 3]

        int[] nums2 = { 1, 2, 4, 8 };
        System.out.println(solution.largestDivisibleSubset(nums2)); // Output: [1, 2, 4, 8]
    }
}
