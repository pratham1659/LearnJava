import java.io.*;
import java.util.*;

public class Test {

    public static int practice(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        int currentSum = nums[0];
        int maximumSum = nums[0];

        for (int i = 1; i < n; i++) {

            int option1 = nums[i];
            int option2 = nums[i] * currentSum;

            currentSum = Math.max(option1, option2);

            if (currentSum > maximumSum) {
                maximumSum = currentSum;
            }
        }

        return maximumSum;

    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        // String str = sc.nextLine();
        // String str2 = sc.nextLine();
        int n = sc.nextInt();
        // int n2 = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // int n1 = 5;
        // int n2 = 5;
        System.out.println(practice(arr));
        // System.out.println(practice(str));

        sc.close();

    }
}
