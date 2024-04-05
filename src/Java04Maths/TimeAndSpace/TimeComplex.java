package Java04Maths.TimeAndSpace;

public class TimeComplex {

    static void sum(int n) {
        int ans = 0;

        for (int i = 1; i <= n; i++) {
            ans += i;
        }
        System.out.println(ans);
    }

    static void sumOfN(int n) {
        int ans = 0;

        ans = (n * (n + 1)) / 2;

        System.out.println(ans);
    }

    public static void main(String[] args) {

        int n = 230;
        sum(n);
        sumOfN(n);

    }
}
