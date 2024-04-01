package Java04Array;

public class Array2Swap {

    public static void swapWithTemp(int a, int b) {

        int temp = a;
        a = b;
        b = temp;
        System.out.println("First swap: " + a + " Last swap: " + b);

    }

    /*
     * Swap two integers without using temp/third variable
     */

    public static void swapWithoutTemp(int a, int b) {

        // without using third var: using + operator
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("First swap: " + a + " Last swap: " + b);

        // without using third var: using * operator
        a = a * b;
        b = a / b;
        a = a / b;

        System.out.println("First swap: " + a + " Last swap: " + b);

        // without using third var: using zor(^) operator
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("First swap: " + a + " Last swap: " + b);

    }

    public static void main(String[] args) {

        swapWithTemp(23, 45);
        swapWithoutTemp(23, 45);
    }
}
