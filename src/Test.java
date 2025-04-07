import java.io.*;
import java.util.StringTokenizer;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        long moves = 0;
        int prev = Integer.parseInt(st.nextToken()); 

        for (int i = 1; i < n; i++) {
            int current = Integer.parseInt(st.nextToken());

            if (current < prev) {
                moves += (prev - current); 
            } else {
                prev = current; 
            }
        }

        System.out.println(moves);
    }
}
