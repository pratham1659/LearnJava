import java.io.*;
import java.util.*;

public class Test {

    public static void practice(int n) {

        boolean ans = true;
        for (int i = 0; i <= Math.sqrt(n); i++) {
            if (n % 2 == 0) {
                ans = false;
            }
        }

        System.out.println(ans);

    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        // String str = sc.nextLine();
        // String str2 = sc.nextLine();
        int n1 = sc.nextInt();
        // int n2 = sc.nextInt();

        // int[] arr = new int[n];

        // for (int i = 0; i < n; i++) {
        // arr[i] = sc.nextInt();
        // }

        // int n1 = 5;
        // int n2 = 5;
        practice(n1);
        // System.out.println(practice(str));

        sc.close();

    }
}
