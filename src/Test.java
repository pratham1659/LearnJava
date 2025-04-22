import java.io.*;
import java.util.*;

public class Test {

    // Given a Sorted Array find its mediun
    public static void practice(int[] nums, int target) {

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

    }

    public static void main(String[] args) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int target = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // System.out.println(Arrays.toString(practice(arr)));
        practice(arr, target);

        sc.close();

        // int n = Integer.parseInt(br.readLine());
        // String str = br.readLine();

        // StringTokenizer st = new StringTokenizer(br.readLine());

        // int[] arr = new int[n];

        // int i = 0;
        // while(true){
        // st.has
        // }
        // // Populate the array
        // for (int i = 0; i < n; i++) {
        // if (st.hasMoreTokens()) {
        // arr[i] = Integer.parseInt(st.nextToken());
        // } else {
        // System.out.println("Not enough elements provided.");
        // return;
        // }
        // }

        // System.out.println(substringPalindrom(n, arr));

    }
}
