import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
