package Java08String;

import java.util.Scanner;

public class String01Basic {
    public static void main(String[] args) {

        /*
         * What is a string constant pool?
         * 
         * The memory space allocated in the heap memory to store the string literals is
         * called the string
         * constant pool.
         * 
         * No two string objects can have the same value in a string constant pool.
         *
         * Why is Java provided with String constant pool
         * 
         * as we can store the objects in heap memory?
         * String constant pool provides the facility of re-usability of the existing
         * string objects.
         * 
         * When a new string object is created using the string literals, then JVM first
         * checks in the pool if
         * this String already exists or not.
         * 
         * If it exists, then it will reference the existing String rather than creating
         * a new object.
         * 
         * This will help in the speeding up of the application and also helps in saving
         * the memory as no two
         * objects will have the same content.
         *
         * Why is string made immutable in JAVA?
         * 
         * Immutable means unmodifiable or unchangeable.
         * 
         * Security is the major reason why strings in Java are made to be immutable.
         * Strings in Java can be
         * used to access data sources like files, databases, or even objects found
         * across networks. Even
         * sometimes, strings store passwords and usernames, which can't be modified
         * once created.
         */

        String str = "Abllo";
        String gtr = "Aallo";

        char ch = str.charAt(2);

        System.out.println(ch);

        System.out.println(str.indexOf("o"));

        System.out.println(str.compareTo(gtr));

        System.out.println(str.contains("Abl"));

        System.out.println(str.startsWith("Abll"));

        System.out.println(str.endsWith("o"));

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        System.out.println(str.concat(gtr).toUpperCase());

        String st1 = "abc";
        str = str + st1;
        System.out.println(str);

        String str1 = "physics";

        // for (int i = 2; i < 4; i++) {
        // System.out.println(str1.substring(i));
        // }

        for (int i = 0; i <= str1.length() - 1; i++) {
            for (int j = i + 1; j <= str1.length(); j++) {
                System.out.print(str1.substring(i, j) + " ");
                System.out.println();
            }
        }

        // String str = "Hello";
        // // String gtr = "Hello";

        // str = str.substring(0, 2) + 'y' + str.substring(3);
        // System.out.println(str); // performance issue in this code

        Scanner sc = new Scanner(System.in);
        String str0 = sc.next();  //skip the word after space
//        String str1 = sc.nextLine(); //print as usual

//        System.out.println(str + str1);
//        String str = "Pratham Sharma";
//        int len = str.length(); //Print the length pf string.
//        System.out.println(len);
//        char ch = str.charAt(3);
//        System.out.println(str.charAt(3)); //Print character at specific string
//        System.out.println(ch);

//        System.out.println(str.indexOf(" ")); //find the index of the character

//        String str1 = "atr";
//        String str2 = "abr";
//
//        System.out.println(str1.compareTo(str2));
//         it basically checked the compare between two string.


//        String str1 = "Hello";
//        System.out.println(str1.endsWith("o")); it check the char ends character.

//        System.out.println(str1.contains("H")); It check the contains char in String


        String str2 = "Pratham";
        String str3 = " Kumar";
//        System.out.println(str1.toUpperCase());
//        System.out.println(str1.toLowerCase());
        System.out.println(str1.concat(str2).toLowerCase());

//        String concatenation
//        String ans = str1 + str2;
//        System.out.println(ans);

        String str4 = "abc";
        str = str + "def";

        System.out.println(str);


    }
}
