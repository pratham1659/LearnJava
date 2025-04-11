package Java06String;

import java.util.Scanner;

public class String01Basic {

    /*
     * What is a string constant pool ?
     *
     * The memory space allocated in the heap memory to store the string literals is
     * called the string constant pool.
     *
     * No two string objects can have the same value in a string constant pool.
     *
     * Why is Java provided with String constant pool ?
     *
     * as we can store the objects in heap memory String constant pool provides the
     * facility of re-usability of the existing string objects.
     *
     * When a new string object is created using the string literals, then JVM first
     * checks in the pool if this String already exists or not.
     *
     * If it exists, then it will reference the existing String rather than creating
     * a new object.
     *
     * This will help in the speeding up of the application and also helps in saving
     * the memory as no two objects will have the same content.
     *
     * Why is string made immutable in JAVA?
     *
     * Immutable means unmodifiable or unchangeable.
     *
     * Security is the major reason why strings in Java are made to be immutable.
     * Strings in Java can be used to access data sources like files, databases, or
     * even objects found
     * across networks. Even sometimes, strings store passwords and usernames, which
     * can't be modified
     * once created.
     */

    public static void stringBasic() {
        String str = "Hello";
        String gtr = "World";

        char ch = str.charAt(2);

        System.out.println("Char At index 2: " + ch);

        System.out.println("Index of o: " + str.indexOf("o"));

        System.out.println("Compare Two String: " + str.compareTo(gtr));

        System.out.println("str contains llo: " + str.contains("llo"));

        System.out.println("str start with rld: " + str.startsWith("rld"));

        System.out.println("str end with rld: " + str.endsWith("o"));

        System.out.println("lowercase str: " + str.toLowerCase());
        System.out.println("Uppercase str: " + str.toUpperCase());

        System.out.println("Concat String: " + str.concat(gtr).toUpperCase());

        String st1 = "abc";
        str = str + st1;
        System.out.println("str join with new str: " + str);

    }

    public static void StringSubstring() {

        String phy = "physics";

        for (int i = 0; i < phy.length(); i++) {
            System.out.print(phy.substring(i) + " ");
        }

        System.out.println();
        for (int i = 0; i <= phy.length() - 1; i++) {
            for (int j = i + 1; j <= phy.length(); j++) {
                System.out.print(phy.substring(i, j) + " ");
            }
        }

        String str = "Hello";
        @SuppressWarnings("unused")
        String gtr = "Hello";

        str = str.substring(0, 2) + 'y' + str.substring(3);
        System.out.println(str); // performance issue in this code
    }

    public static void stringInput() {
        Scanner sc = new Scanner(System.in);

        String str = sc.next(); // skip the word after space
        String str1 = sc.nextLine(); // print as usual

        System.out.println(str + str1);
        int len = str.length(); // Print the length pf string.
        System.out.println(len);
        char ch = str.charAt(3);
        System.out.println(str.charAt(3)); // Print character at specific string
        System.out.println(ch);

        System.out.println(str.indexOf(" ")); // find the index of the character
        sc.close();

    }

    public static void main(String[] args) {

        stringBasic();
        stringInput();
        StringSubstring();

    }
}
