package String.Problems;

public class String10Manipulation {

    public static void countNumber() {

        /*
         * Output numbers from 1...100
         * without using any numbers in your code.
         */

        int one = 'A' / 'A';
        String str = "..........";

        for (int i = one; i <= str.length() * str.length(); i++) {
            System.out.println(i);
        }
    }

    /*
     * //Print Hello World without using semi colon (;)
     */

    public static void printHelloWorld() {

        if (System.out.printf("Hello World" + "\n") == null) {

        }
    }

    public static void main(String[] args) {

        String str = "The rains have started early showup";
        String str1 = "The rains Have started early showup";

        System.out.println(str.length());

        System.out.println(str.charAt(5));

        System.out.println(str.indexOf('s')); // 1st occurrence

        System.out.println(str.indexOf('s', str.indexOf('s') + 1)); // 2nd occurrence

        System.out.println(str.indexOf("hello"));

        System.out.println("rains");

        // String Comparison
        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str1));

        // String Substring
        System.out.println(str.substring(0, 8));
        System.out.println(str.substring(8));

        // trim
        String strTrim = "    Hello   World   ";
        System.out.println(strTrim.trim());
        System.out.println(strTrim.trim().replace(" ", ""));

        String date = "01-01-1970";
        System.out.println(date.replace("-", "/"));

        // split string
        String test = "Hello_World_Test_Selenium";
        String testValue[] = test.split("_");
        for (int i = 0; i < testValue.length; i++) {
            System.out.print(testValue[i] + " ");
        }
        System.out.println();

        System.out.println(str.concat(strTrim));

        String x = "Hello";
        String y = "World";
        int a = 100;
        int b = 200;

        System.out.println(x + y);
        System.out.println(a + b);
        System.out.println(x + y + (a + b));
        System.out.println(x + y + a + b);

        countNumber();
        printHelloWorld();
        printHelloWorld();

    }
}
