import java.io.*;
import java.util.*;

public class Test {

    public static void practice(int n, int n2) {

        for (int i = 1; i <= n; i++) {

            // print space (row - i)
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            if (i == 1) {
                System.out.println(i);
            } else if (i == n) {
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print(i);
                }
                System.out.println();
            } else {
                System.out.print(i); // left edge
                for (int space = 1; space <= 2 * i - 3; space++) {
                    System.out.print(" ");
                }
                System.out.print(i); // right edge
                System.out.println();
            }
        }
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        // String str = sc.nextLine();
        // String str2 = sc.nextLine();
        // int n1 = sc.nextInt();
        // int n2 = sc.nextInt();

        // int[] arr = new int[n];

        // for (int i = 0; i < n; i++) {
        // arr[i] = sc.nextInt();
        // }

        int n1 = 5;
        int n2 = 5;
        practice(n1, n2);
        // System.out.println(practice(str));

        sc.close();

    }
}
