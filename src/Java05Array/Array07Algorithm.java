package Java05Array;

public class Array07Algorithm {

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

    // Ques 2. Maximum Sum possible for all the subarrays
    // Kadane`s Algorithm
    // Time and Space : O(N) and O(1)
    // Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    // Output: 6
    // Input: nums = [1]
    // Output: 1
    public static int maximumSumArray(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        int currentSum = nums[0];
        int maximumSum = nums[0];

        for (int i = 1; i < n; i++) {

            int option1 = nums[i];
            int option2 = nums[i] + currentSum;

            currentSum = Math.max(option1, option2);

            if (currentSum > maximumSum) {
                maximumSum = currentSum;
            }
        }

        return maximumSum;

    }

    public static void main(String[] args) {

    }

}
