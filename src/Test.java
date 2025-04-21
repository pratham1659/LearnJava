import java.io.*;
import java.util.*;

public class Test {

    public static void practice(int[] nums, int target) {

        

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

        // int i = 0;
        // while (true) {
        // arr[i] = sc.nextInt();
        // i++;
        // if (i == n) {
        // break;
        // }
        // }

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
