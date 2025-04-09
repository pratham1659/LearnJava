import java.io.*;
import java.util.StringTokenizer;

public class Test {

    public static void minOperations(int n) {

        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

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

        minOperations(n);

    }
}
