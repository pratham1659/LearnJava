package Java05Array;

import java.util.*;

public class Array09Advance {

    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Array Size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Elements in Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }

    public static void printArray(int[] nums) {

        Arrays.toString(nums);
    }

    // Ques 1: Remove Duplicates from Sorted Array
    // Input: nums = [1,1,2]
    // Output: 2, nums = [1,2,_]
    // https://leetcode.com/problems/remove-duplicates-from-sorted-array
    public static int removeDuplicatesArray(int[] nums) {
        int i = 0;
        int j = 0;
        int index = 0;
        int n = nums.length;

        while (i < n) {
            while (j < n && nums[i] == nums[j]) {
                j++;

                nums[index] = nums[i];
                index++;
                i = j; // shift to next new element
            }
        }
        return index;
    }

    // Ques 2: Remove Duplicates from Sorted Array II
    // /Input:nums=[1,1,1,2,2,3]
    // Output:5,
    // nums=[1,1,2,2,3,_]
    // https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii
    public static int removeDuplicatesArrayII(int[] nums) {

        int n = nums.length;
        int i = 0;
        int j = 0;
        int index = 0;

        while (i < n) {
            while (j < n && nums[i] == nums[j]) {
                j++;
            }

            int freq = j - i;
            if (freq == 1) {
                nums[index] = nums[i];
                index++;
            } else {
                nums[index] = nums[i];
                index++;
                nums[index] = nums[i];
                index++;
            }

            i = j;
        }
        return index;
    }

    // Ques 3: Max Sum Subarray of size K
    // Input:arr[]=[100,200,300,400],k=2
    // Output:700 Explanation:arr3+arr4=700, which is maximum.
    // https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1
    public static int maximumSumSubarray(int[] nums, int k) {
        // Code here
        int n = nums.length;
        int currentSum = 0;

        int i = 0;
        while (i < k) {
            currentSum += nums[i];
            i++;
        }

        int maxSum = currentSum;

        while (i < n) {

            currentSum = currentSum + nums[i];
            currentSum = currentSum - nums[i - k];

            maxSum = Math.max(maxSum, currentSum);
            i++;

        }

        return maxSum;
    }

    // Ques 4: Running Sum of 1d Array (Prefix Array)
    // Input: nums = [1,2,3,4]
    // Output: [1,3,6,10]
    // Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
    // Time and Space : O(N) and O(N)
    // https://leetcode.com/problems/running-sum-of-1d-array
    public static int[] runningSum(int[] nums) {

        int n = nums.length;
        int[] prefix = new int[n];
        int i = 0;
        int sum = 0;
        while (i < n) {
            sum += nums[i];
            prefix[i] = sum;
            i++;
        }

        return prefix;
    }

    // Ques 5: Running Sum of 1d Array (Suffix Array)
    // Input: nums = [1,2,3,4]
    // Output: [10,9,7,4]
    // Explanation: Running sum is obtained as follows: [1+2+3+4, 2+3+4, 3+4, 4].
    // Time and Space : O(N) and O(N)
    // https://leetcode.com/problems/running-sum-of-1d-array
    public static int[] runningSumII(int[] nums) {

        int n = nums.length;
        int[] prefix = new int[n];
        int i = n - 1;
        int sum = 0;
        while (i >= 0) {
            sum += nums[i];
            prefix[i] = sum;
            i--;
        }

        return prefix;
    }

    // Ques 6 : Range Sum Query - Immutable
    // Input: ["NumArray","sumRange","sumRange","sumRange"]
    // [[[-2,0,3,-5,2,-1]], [0,2], [2,5], [0,5]]
    // Output[null,1,-1,-3]
    // NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
    // https://leetcode.com/problems/range-sum-query-immutable
    static int[] prefix;

    public static void NumArray(int[] nums) {

        int n = nums.length;
        prefix = new int[n];

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + nums[i];
            prefix[i] = sum;

        }
    }

    public int sumRange(int left, int right) {
        if (left == 0) {
            return prefix[right];
        } else {
            return prefix[right] - prefix[(left - 1)];
        }
    }

    // Ques 7 : Sort Colors
    // Input: nums = [2,0,2,1,1,0]
    // Output: [0,0,1,1,2,2]
    // https://leetcode.com/problems/sort-colors
    public void sortColors(int[] nums) {
        int zero = 0;
        int one = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {

            if (nums[i] == 0) {
                zero++;
            } else if (nums[i] == 1) {
                one++;
            }
        }

        // int two = n - (zero + one);

        int i = 0;
        while (i < zero) {
            nums[i] = 0;
            i++;
        }

        while (i < (zero + one)) {
            nums[i] = 1;
            i++;
        }

        while (i < n) {
            nums[i] = 2;
            i++;
        }
    }

    // Ques 8: Rotate Array
    // Input: nums = [1,2,3,4,5,6,7], k = 3
    // Output: [5,6,7,1,2,3,4]
    // Explanation:
    // rotate 1 steps to the right: [7,1,2,3,4,5,6]
    // rotate 2 steps to the right: [6,7,1,2,3,4,5]
    // rotate 3 steps to the right: [5,6,7,1,2,3,4]
    // https://leetcode.com/problems/rotate-array
    public static void reverse(int[] nums, int start, int end) {

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {

        int n = nums.length;

        k = k % n;

        // reverse entire array
        reverse(nums, 0, n - 1);

        // reverse first k elements
        reverse(nums, 0, k - 1);

        // reverse end k elements
        reverse(nums, k, n - 1);

    }

    // Ques 9 : Difference in subArray
    // Please Enter Array Size: 5
    // Enter Elements in Array: 1 2 3 4 5
    // Print Result Array: [11,22,18,9,0]
    public static int[] differenceArray(int[] nums) {

        int n = nums.length;

        // Initialize difference array
        int[] diff = new int[n + 1];

        int[][] queries = {
                { 1, 3, 10 },
                { 2, 4, -5 },
                { 0, 2, 10 }
        };

        // Process each update
        System.out.println("Print Result Array: ");
        for (int[] q : queries) {
            int l = q[0];
            int r = q[1];
            int val = q[2];

            diff[l] += val;
            if (r + 1 < diff.length) {
                diff[r + 1] -= val;
            }
        }

        // Build result using prefix sum
        int[] result = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += diff[i];
            result[i] = nums[i] + sum;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = inputArray();

        // System.out.println(removeDuplicatesArray(nums));

        // System.out.println(removeDuplicatesArrayII(nums));

        // System.out.println(maximumSumSubarray(nums, 2));

        // System.out.println(Arrays.toString(runningSum(nums)));

        // System.out.println(Arrays.toString(runningSumII(nums)));

        System.out.println(Arrays.toString(differenceArray(nums)));

    }
}
