package Java14Stack.Java13HashSet;
import java.util.*;
public class HashSet02Problems {
    // Given an unsorted array of integers nums, return the length of the longest
    // consecutive elements sequence.

    public static int longestLength(int[] nums) {

        HashSet<Integer> hs = new HashSet<>();

        for (int num : nums) {
            hs.add(num);
        }

        int maxStreak = 0;
        for (int num : hs) {
            if (!hs.contains(num - 1)) { // num is starting point of a sequence
                int currNum = num;
                int currStreak = 1; // length of current consecutive sequence
                while (hs.contains(currNum + 1)) {
                    currStreak++;
                    currNum++;
                }
                maxStreak = Math.max(maxStreak, currStreak);
            }
        }
        return maxStreak;
    }

    // You are given n distinct pairs. Each pair is numbered from 1 to n. All these
    // pairs are initially put in a bag.
    // You need to pair up each number. You take numbers one by one from the bag and
    // for each number you look
    // whether the pair of this number has already been taken out of the bag, or
    // not. If not (that means the pair of
    // this number is still in the bag), you put the current number on the table in
    // front of him. Otherwise, you put
    // both numbers from the pair aside. Print the maximum number of numbers that
    // were on the table at the same
    // time.

    public static int distinctPair(int[] nums) {

        HashSet<Integer> table = new HashSet<>();
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (table.contains(num)) {
                table.remove(num);
            } else {
                table.add(num);
                max = Math.max(max, table.size());
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] nums = { 100, 4, 200, 1, 3, 2 };
        System.out.println(longestLength(nums));

        int[] arr = { 2, 1, 1, 3, 2, 3 };
        System.out.println(distinctPair(arr));
    }
}

