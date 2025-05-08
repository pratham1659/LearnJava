import java.io.*;
import java.util.*;

public class Test {

    public static void practice(int[] arr) {

        int index = 3;
        int value = 3;

        if (index >= 0 && index < arr.length) {

            int[] newArr = new int[arr.length + 1];
            for (int i = 0, j = 0; i < newArr.length; i++) {
                if (i == index) {
                    newArr[i] = value;
                } else {
                    newArr[i] = arr[j++];
                }
            }
            System.out.println(Arrays.toString(newArr));
        } else {
            System.out.println(Arrays.toString(arr));
        }
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
        // System.out.println(practice(arr, 3));
        // System.out.println(practice(str));

        sc.close();

    }
}
