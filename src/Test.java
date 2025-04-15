import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test {

    public static int pattern(String str) {

        StringBuilder num = new StringBuilder();
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                num.append(str.charAt(i));
            } else {
                if (!num.toString().isEmpty()) {
                    sum = sum + Integer.parseInt(num.toString());
                    num = new StringBuilder();
                }
            }
        }

        return sum;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // int n = Integer.parseInt(br.readLine());
        // int n1 = Integer.parseInt(br.readLine());
        // int n2 = Integer.parseInt(br.readLine());
        String str = br.readLine();

        // StringTokenizer st = new StringTokenizer(br.readLine());

        // int[] arr = new int[n];

        // // Populate the array
        // for (int i = 0; i < n; i++) {
        // if (st.hasMoreTokens()) {
        // arr[i] = Integer.parseInt(st.nextToken());
        // } else {
        // System.out.println("Not enough elements provided.");
        // return;
        // }
        // }

        // System.out.println(pattern(n));

        // checkPalin(n);

        // System.out.println(Arrays.toString(checkArray(arr)));

        // checkArray(arr);

        // pattern(str);

        System.out.println(pattern(str));

        // System.out.println(pattern(arr));

        // System.out.println(Arrays.toString(pattern(str)));

        // System.out.println(Arrays.toString(checkArray(arr, n1)));
    }
}
