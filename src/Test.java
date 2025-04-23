import java.io.*;
import java.util.*;

public class Test {

    public static void practice(int[] nums) {

        int n = nums.length;

        int maxNumber = 0;

        for (int i = 0; i < n; i++) {
            maxNumber = Math.max(maxNumber, nums[i]);
        }

        int[] freq = new int[maxNumber + 1];

        for (int i = 0; i < n; i++) {
            freq[nums[i]]++;
        }

        int count = 0;
        for (int i = 0; i < maxNumber + 1; i++) {
            if (freq[i] >= 2) {
                count++;
            }
        }

        System.out.println(count);

    }

    public static void main(String[] args) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print array to verify input
        System.out.println("Array elements:");
        for (int val : arr) {
            System.out.print(val + " ");
        }

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
