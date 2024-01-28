package Java07String;

import java.util.Arrays;

public class StringBuildPractice {

    // Take an array of words and concatenate them into a single string using StringBuilder.
    public static void main(String[] args) {

        String[] arr = new String[] {"Java", "is" ,"the" ,"best" ,"programming" ,"Language"};

        StringBuilder sb = new StringBuilder();
        for(String str : arr){
            sb.append(str).append(" ");
        }

        System.out.println(sb);

    }
}
