import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test {

    public static boolean pattern(String str) {

        StringBuilder sb = new StringBuilder(str).reverse();

        return str.equals(sb.toString());
    }

    public static void substringPalindrom(String str) {

        StringBuilder ans = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                sb.append(ch);
            } else {
                sb.reverse();
                ans.append(sb);
                ans.append(" ");
                sb = new StringBuilder();
            }
        }
        sb.reverse();
        ans.append(sb);
        System.out.println(ans);
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

        // pattern(str);

        // System.out.println(pattern(str));

        substringPalindrom(str);

    }
}
