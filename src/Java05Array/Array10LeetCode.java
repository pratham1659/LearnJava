package Java05Array;

import java.util.PriorityQueue;

public class Array10LeetCode {

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

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3 };
        System.out.println("Minimum time: " + minimumTime(arr, 5));

        int[] arr2 = { 1, 2, 3 };
        int[] arr3 = { 3, 2, 1 };
        int[] arr4 = { 1, 1, 5 };
        nextPermutation(arr2);
        nextPermutation(arr3);
        nextPermutation(arr4);

        int[] minHeap = { 3, 2, 1, 5, 6, 4 };
        int k = 2;
        System.out.println("Kth Largest Element: " + findKthLargest(minHeap, k));
    }
}

