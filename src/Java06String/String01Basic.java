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

        // 1. Length of the string
        // Time: O(1), Space: O(1)
        System.out.println("Length: " + str.length());

        // 2. Accessing character at index
        // Time: O(1), Space: O(1)
        char ch = str.charAt(2);
        System.out.println("Character at index 2: " + ch);

        // 3. Index of a character or substring
        // Time: O(n), Space: O(1)
        System.out.println("Index of 'o': " + str.indexOf('o'));

        // 4. Comparing two strings
        // Time: O(n), Space: O(1)
        System.out.println("Compare with gtr: " + str.compareTo(gtr));

        // 5. Contains a substring
        // Time: O(n * m), Space: O(1)
        System.out.println("Contains 'llo': " + str.contains("llo"));

        // 6. Starts with a substring
        // Time: O(k), Space: O(1)
        System.out.println("Starts with 'He': " + str.startsWith("He"));

        // 7. Ends with a substring
        // Time: O(k), Space: O(1)
        System.out.println("Ends with 'lo': " + str.endsWith("lo"));

        // 8. Convert to lowercase
        // Time: O(n), Space: O(n)
        System.out.println("Lowercase: " + str.toLowerCase());

        // 9. Convert to uppercase
        // Time: O(n), Space: O(n)
        System.out.println("Uppercase: " + str.toUpperCase());

        // 10. Concatenate using concat()
        // Time: O(n + m), Space: O(n + m)
        System.out.println("Concatenated: " + str.concat(gtr));

        // 11. Concatenate using +
        // Time: O(n + m), Space: O(n + m)
        String joined = str + gtr;
        System.out.println("Joined with + : " + joined);

        // 12. Substring
        // Time: O(k), Space: O(k)
        System.out.println("Substring from 1 to 3: " + str.substring(1, 3));

        // 13. Replace characters
        // Time: O(n), Space: O(n)
        System.out.println("Replace 'l' with 'x': " + str.replace('l', 'x'));

        // 14. Trim whitespace
        // Time: O(n), Space: O(n)
        String spaced = "   Hello   ";
        System.out.println("Trimmed: '" + spaced.trim() + "'");

        // 15. Equals method
        // Time: O(n), Space: O(1)
        System.out.println("Equals 'Hello': " + str.equals("Hello"));

        // 16. Using StringBuilder for better performance in loops
        // Time: O(1) per append, Space: O(n)
        StringBuilder sb = new StringBuilder();
        sb.append("Java").append("Rocks");
        System.out.println("StringBuilder result: " + sb.toString());

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

    }

}
