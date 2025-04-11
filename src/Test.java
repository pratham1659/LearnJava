import java.io.*;
// import java.util.StringTokenizer;

public class Test {

    public static void pattern(int num) {

        int row = 1;

        while (row <= num) {
            int col = 1;

            while (col <= row) {
                char ch = (char) ('A' + row + col - 2);
                System.out.print(ch + " ");
                ch++;
                col++;
            }
            System.out.println();
            row++;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        // int n2 = Integer.parseInt(br.readLine());

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

        pattern(n);
    }
}
