import java.io.*;
import java.util.*;

public class Test {

    public static void practice(int[] num, int[] num1) {
        int n = num.length;
        int n2 = num1.length;

        List<Integer> common = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n2; j++) {
                if (num[i] == num1[j]) {
                    common.add(num[i]);
                }
            }
        }

        System.out.println(common);
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        // String str = sc.nextLine();
        // String str2 = sc.nextLine();
        int n = sc.nextInt();
        // int n2 = sc.nextInt();

        int[] arr = new int[n];
        int[] arr2 = new int[n];
        // String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            // str[i] = sc.next();
        }

        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
            // str[i] = sc.next();
        }

        // int n1 = 5;
        // int n2 = 5;
        practice(arr, arr2);
        // System.out.println(practice(arr));
        // System.out.println(practice(str));

        sc.close();

    }
}
