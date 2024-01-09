package Java07String;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

//        String Substring
        String str = "abc";
        str += "r";
        str += 10;
//        System.out.println(str);
        System.out.println("abc" + "r" + 10);
        System.out.println("abc" + 10 + 20);//ans  abc1020
        System.out.println("abc" + (10 + 20)); //ans abc30
        System.out.println(10 + 20); //ans 30






    }
}
