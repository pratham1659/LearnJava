package Practice;
import java.util.Arrays;
import java.util.Arrays;

public class LargestPerimeterPolygon {
    public static long largestPerimeter(int[] nums) {
        int n = nums.length;
        long sum = 0;
        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }

        for (int i = n - 1; i >= 0; i--) {
            if (sum - nums[i] > nums[i])
                return sum;
            sum -= nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 5, 12, 50};
        int[] num2 = {5, 5, 20};
        System.out.println(largestPerimeter(nums));
    }
}
