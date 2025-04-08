import java.io.*;
import java.util.StringTokenizer;

public class Test {

    public static int checkArray(int[] arr) {

        int n = arr.length;
        int sumArr = 0;
        int totalSum = (n * (n + 1)) / 2;
        for (int i = 0; i < n; i++) {
            sumArr = sumArr + arr[i];
        }
        return totalSum - sumArr;

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

        System.out.println(checkArray(arr));

    }
}
