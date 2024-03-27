package String.Problems;

public class String0Swap {

    public static void swapString(String s1, String s2) {

        System.out.println("Before Swapping");
        System.out.println("The value of a is " + s1);
        System.out.println("The value of a is " + s2);

        s1 = s1 + s2;

        s2 = s1.substring(0, s1.length() - s2.length());
        s1 = s1.substring(s2.length());

        System.out.println("First : " + s1 + " Second : " + s2);

    }

    public static void main(String[] args) {

        swapString("hello", "World");

    }
}
