import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i >= 1; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.println("found");
                break;
            }
        }

        sc.close();
    }
}
