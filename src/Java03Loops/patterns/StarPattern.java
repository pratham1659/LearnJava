package Java03Loops.patterns;

public class StarPattern {


    //Count the number of digits for a given number n
    static void countNum(){
        long num = 982436986L;
        Long digit = num;
        int ans = 0;

        while(num > 0){
            num = num/10;
            ans++;
        }
        System.out.println("CountDigit "+ digit + " " + ans);
    }

    static void sumOfDigit(){
        int num = 12345;
        int sumOfDigit = 0;

        while(num > 0) {
            sumOfDigit += num % 10;
            num = num / 10;
        }
        System.out.println(sumOfDigit);
    }

    static void reverseDigit(){
        int n = 837373;
        int ans = 0;

        while(n > 0){
            ans = ans * 10 + n % 10;
            n /= 10;
        }
        System.out.println(ans);
    }


//    find n in this series
//       S = 1-2 + 3-4 .. n

    static void  sumSeries(){

        int ans = 0;
        int i = 0;
        int n = 5;

        for(i = 1; i<=n; i++){
            if(i % 2 == 0){
                ans -= i;
            }else{
                ans  += i;
            }
        }
        System.out.println(ans);
    }


    static void facto(){
        int n = 5;
        int fact = 1;
        for(int i = 1; i<=n; i++){
            fact  = fact * i;
            System.out.println(i + "*" + fact + "=" + fact);
        }
        System.out.println(fact);
    }

    static void power(){
        int a = 2;
        int b = 5;
        int ans = 1;

        for(int i = 1; i<=b; i++){
            ans = ans * a;
        }
        System.out.println(ans);
    }


    public static void main(String[] args) {
        int rows = 4; // You can change this value to adjust the height of the pyramid

        // Print the top half of the pyramid
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Print the bottom half of the pyramid
        for (int i = rows - 2; i >= 0; i--) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
