import java.io.*;
import java.util.*;

public class Test {

    public static void practice(String[] nums) {
        int n = nums.length;

        List<String> substring = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (!nums[i].equalsIgnoreCase(nums[j])) {
                    if (nums[j].contains(nums[i])) {
                        substring.add(nums[i]);
                    }
                }
            }

        }
        System.out.println(substring);

    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        // String str = sc.nextLine();
        // String str2 = sc.nextLine();
        int n = sc.nextInt();
        // int n2 = sc.nextInt();

        // int[] arr = new int[n];
        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            // arr[i] = sc.nextInt();
            str[i] = sc.next();
        }

        // int n1 = 5;
        // int n2 = 5;
        practice(str);
        // System.out.println(practice(arr));
        // System.out.println(practice(str));

        sc.close();

    }
}
