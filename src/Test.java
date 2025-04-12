import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test {

    public static boolean pattern(int num) {

        char[] digit = Integer.toString(num).toCharArray();

        int start = 0;
        int end = digit.length - 1;

        while (start < end) {
            if (digit[start] != digit[end]) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static int checkArray(int[] arr) {

        int n = arr.length;
        if (n == 0 || n == 1) {
            return -1;
        }

        Arrays.sort(arr);

        int idx = 0; // index
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[idx++] = arr[i];
            }
        }

        arr[idx++] = arr[idx];
        return idx;
    }

    public static void checkPalin(int num) {

        int i = 0;
        int newNum = 0;
        int finalNum = num;
        while (i < num) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num = num / 10;
        }

        System.out.println(finalNum == newNum);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        // int n1 = Integer.parseInt(br.readLine());
        // int n2 = Integer.parseInt(br.readLine());
        // String str = br.readLine();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];

        // Populate the array
        for (int i = 0; i < n; i++) {
            if (st.hasMoreTokens()) {
                arr[i] = Integer.parseInt(st.nextToken());
            } else {
                System.out.println("Not enough elements provided.");
                return;
            }
        }

        // System.out.println(pattern(n));

        // checkPalin(n);

        // System.out.println(Arrays.toString(checkArray(arr)));

        // checkArray(arr);

        System.out.println(checkArray(arr));

        // System.out.println(pattern(arr));

        // System.out.println(Arrays.toString(pattern(str)));

        // System.out.println(Arrays.toString(checkArray(arr, n1)));
    }
}
