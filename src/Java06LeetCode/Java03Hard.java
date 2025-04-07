package Java06LeetCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java03Hard {

    // Ques 1 : Check Number Spiral program
    // https://cses.fi/problemset/task/1071
    public static void NumberSpiral() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long y = Long.parseLong(st.nextToken());
            long x = Long.parseLong(st.nextToken());
            long value;

            long maxCoord = Math.max(y, x);
            long square = maxCoord * maxCoord;

            if (maxCoord % 2 == 0) { // even row/column
                if (y < maxCoord) {
                    value = square - (maxCoord - 1) * 2 + (y - 1);
                } else {
                    value = square - (x - 1);
                }
            } else { // odd row/column
                if (x < maxCoord) {
                    value = square - (maxCoord - 1) * 2 + (x - 1);
                } else {
                    value = square - (y - 1);
                }
            }

            sb.append(value).append("\n");
        }

        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        {
            NumberSpiral();
        }
    }

}
