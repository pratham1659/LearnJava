package Java05Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Array10LeetCode {

    // Ques 1: Leetcode - Majority Element
    // Find the element that appears more than ⌊n / 2⌋ times in the array.
    // Boyer-Moore Voting Algorithm. Runs in linear time O(n) and uses O(1) space.
    // https://leetcode.com/problems/majority-element
    public static int majorityElement(int[] nums) {

        int count = 0;
        int answer = -1;
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            if (count == 0) {
                answer = nums[i];
                count++;
            } else {

                if (answer == nums[i]) {
                    count++;
                } else {
                    count--;
                }
            }
        }

        if (count > n / 2) {
            System.out.println("Majority element: " + answer);
        } else {
            System.out.println("No majority element");
        }

        return answer;
    }

    // Ques 2 : Leetcode - Majority Element 2
    // Input: nums = [3,2,3]
    // Output: [3]
    // https://leetcode.com/problems/majority-element-ii
    public static List<Integer> majorityElementII(int[] nums) {

        int n = nums.length;
        int count1 = 0;
        int count2 = 0;
        int answer1 = 0;
        int answer2 = 1;

        for (int num : nums) {
            if (num == answer1) {
                count1++;
            } else if (num == answer2) {
                count2++;
            } else if (count1 == 0) {
                answer1 = num;
                count1++;
            } else if (count2 == 0) {
                answer2 = num;
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == answer1)
                count1++;
            else if (num == answer2)
                count2++;
        }

        List<Integer> result = new ArrayList<>();
        if (count1 > n / 3)
            result.add(answer1);
        if (count2 > n / 3)
            result.add(answer2);

        Collections.sort(result);
        return result;
    }

    // Ques 3: Leetcode - MaxConsecutiveOnes
    // input: {1,1,0,1,1,1};
    // output: 3
    // https://leetcode.com/problems/max-consecutive-ones
    public static int findMaxConsecutiveOnes(int[] nums) {

        int n = nums.length;
        int count = 0;
        int answer = 0;

        for (int i = 0; i < n; i++) {

            if (nums[i] == 1) {
                count++;
            } else {
                count = 0;
            }

            if (count > answer) {
                answer = count;
            }
        }

        return answer;
    }

    // Ques 1: LeetCode - EASY 2D Array
    // Pascal Triangle
    // Input: numRows = 5
    // Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
    // https://leetcode.com/problems/pascals-triangle

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();

        firstRow.add(1);

        ans.add(new ArrayList<>(firstRow));

        int middleElem = 0;

        for (int i = 1; i < numRows; i++) {

            List<Integer> currentRows = new ArrayList<>();
            currentRows.add(1);

            for (int j = 1; j <= middleElem; j++) {

                int element = ans.get(i - 1).get(j) + ans.get(i - 1).get(j - 1);
                currentRows.add(element);
            }

            currentRows.add(1);

            ans.add(new ArrayList<>(currentRows));
            middleElem++;
        }

        return ans;

    }

    /*
     * Input: time = [1,2,3], totalTrips = 5
     * Output: 3
     * Explanation:
     * - At time t = 1, the number of trips completed by each bus are [1,0,0].
     * The total number of trips completed is 1 + 0 + 0 = 1.
     * - At time t = 2, the number of trips completed by each bus are [2,1,0].
     * The total number of trips completed is 2 + 1 + 0 = 3.
     * - At time t = 3, the number of trips completed by each bus are [3,1,1].
     * The total number of trips completed is 3 + 1 + 1 = 5.
     * So the minimum time needed for all buses to complete at least 5 trips is 3.
     */

    public static int minimumTime(int[] time, int totalTrips) {

        int maxTime = Integer.MIN_VALUE;
        for (int t : time) {
            maxTime = Math.max(t, maxTime);
        }

        int left = 0, right = maxTime * totalTrips;
        while (left < right) {
            int mid = left + (right - left) / 2;
            int trips = 0;
            for (int t : time) {
                trips += mid / t;
            }
            if (trips >= totalTrips) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    // 2. find permutation
    public static void nextPermutation(int[] nums) {

        int n = nums.length;
        int i = n - 2;

        // Find the first element from the right that is smaller than the next element
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = n - 1;

            // Find the smallest element to the right of nums[i] that is greater than
            // nums[i]
            while (nums[j] <= nums[i]) {
                j--;
            }

            // Swap nums[i] and nums[j]
            swap(nums, i, j);
        }

        // Reverse the subarray to the right of nums[i]
        reverse(nums, i + 1);

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int[] arr, int start) {
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    // Kth Largest Element in an Array
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);

        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the smallest element if the size exceeds k
            }
        }

        return minHeap.peek();
    }

    // find kth smallest element in array
    public static int findKthLargest(int[] nums, int start, int end, int k) {

        return -1;
    }

    // Rotate the array from the target index element and print the results
    public static void rotateA(int[] nums, int target) {
        int n = nums.length;
        int[] reverse = new int[n];

        int t = target % n;

        for (int i = 0; i < n; i++) {

            int newIndex = i - t;
            if (newIndex < 0) {
                newIndex = newIndex + n;
            }
            reverse[newIndex] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = reverse[i];
        }

        System.out.println(Arrays.toString(nums));
    }

    // Rotate the array upto target times and print the array
    // Input: nums = [1,2,3,4,5,6,7], k = 3
    // Output: [5,6,7,1,2,3,4]
    // Explanation:
    // rotate 1 steps to the right: [7,1,2,3,4,5,6]
    // rotate 2 steps to the right: [6,7,1,2,3,4,5]
    // rotate 3 steps to the right: [5,6,7,1,2,3,4]
    // https://leetcode.com/problems/rotate-array
    public static void rotateTimes(int[] nums, int k) {
        int n = nums.length;
        int[] reverse = new int[n];

        int target = k % n;

        for (int i = 0; i < n; i++) {
            int newIndex = (i + target) % n;
            reverse[newIndex] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = reverse[i];
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {

        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(majorityElement(nums));
        System.out.println(majorityElementII(nums));

        // int[] nums = { 1, 1, 0, 1, 1, 1 };
        // System.out.println(findMaxConsecutiveOnes(nums));

        // System.out.println(generate(5));

        // int[] arr = { 1, 2, 3 };
        // System.out.println("Minimum time: " + minimumTime(arr, 5));

        // int[] arr2 = { 1, 2, 3 };
        // int[] arr3 = { 3, 2, 1 };
        // int[] arr4 = { 1, 1, 5 };
        // nextPermutation(arr2);
        // nextPermutation(arr3);
        // nextPermutation(arr4);

        // int[] minHeap = { 3, 2, 1, 5, 6, 4 };
        // int k = 2;
        // System.out.println("Kth Largest Element: " + findKthLargest(minHeap, k));

        // int[] rotate = { 1, 2, 3, 4, 5, 6 };
        // // rotateA(rotate, 3);
        // rotateTimes(rotate, 3);
    }
}
