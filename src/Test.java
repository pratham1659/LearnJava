import java.io.*;
import java.util.*;

public class Test {

    public static void practice(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        // String str = sc.nextLine();
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        practice(arr);

        sc.close();

    }
}
