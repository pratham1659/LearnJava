import java.util.Scanner;

public class Test {

    public static void practice(int n, int m) {

        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        practice(4, 6);

        sc.close();

    }
}
