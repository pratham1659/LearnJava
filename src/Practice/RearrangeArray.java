package Practice;

import java.util.*;

public class RearrangeArray {

    public static int[] rearrangeArray(int[] nums) {
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();

        for (int num : nums) {
            (num > 0 ? positive : negative).add(num);
        }

        int[] result = new int[nums.length];
        int i = 0, j = 0;
        for (int k = 0; k < nums.length; k++) {
            if (k % 2 == 0 && i < positive.size())
                result[k] = positive.get(i++);
            else if (j < negative.size())
                result[k] = negative.get(j++);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();

        int[] rearrangedArray = rearrangeArray(nums);
        System.out.println(Arrays.toString(rearrangedArray));
    }
}
