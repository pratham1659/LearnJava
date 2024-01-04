package Java06String;

import java.util.*;

public class StringBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String str = sc.next();  //skip the word after space
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


        String str1 = "Pratham";
        String str2 = " Kumar";
//        System.out.println(str1.toUpperCase());
//        System.out.println(str1.toLowerCase());
        System.out.println(str1.concat(str2).toLowerCase());

//        String concatenation
//        String ans = str1 + str2;
//        System.out.println(ans);

        String str = "abc";
        str = str + "def";

        System.out.println(str);




    }
}
