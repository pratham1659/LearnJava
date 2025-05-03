import java.io.*;
import java.util.*;

public class Test {

    public static void practice(int[] nums) {

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

        int two = n - (zero + one);

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

        System.out.println(Arrays.toString(nums));
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
        practice(arr);
        // System.out.println(practice(arr));
        // System.out.println(practice(str));

        sc.close();

    }
}
