import java.io.*;
// import java.util.StringTokenizer;

public class Test {

    public static void Operations(int num) {

        if (num <= 0) {
            System.out.println("invalid");
            return;
        }

        int firstTerm = 0;
        int secondTerm = 1;
        int nextTerm = 0;

        for (int i = 2; i <= num; i++) {
            nextTerm = firstTerm + secondTerm;

            System.out.print(nextTerm + " ");
            firstTerm = secondTerm;
            secondTerm = nextTerm;
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

        Operations(n);

    }
}
