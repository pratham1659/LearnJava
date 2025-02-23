package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Polygon {
    public long largestPerimeter(int[] nums) {
        // long sum = Arrays.stream(nums).asLongStream().sum();
        // // long sum = 0;
        // Arrays.sort(nums);

        // for (int i = nums.length - 1; i >= 2; i--) {
        // if (sum - nums[i] > nums[i])
        // return sum;
        // sum -= nums[i];
        // }
        // return -1;
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

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();

        Polygon polygonPerimeter = new Polygon();
        System.out.println(polygonPerimeter.largestPerimeter(nums));
    }
}
