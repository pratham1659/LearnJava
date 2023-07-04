package Java01Basic;

import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(String num){
        String newInput = num.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = newInput.length() - 1;

        while(left < right){
            if(newInput.charAt(left) != newInput.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Palindrome Number :");
        String input = sc.next();

        if(isPalindrome(input)){
            System.out.println("Is Palindrome");
        }else{
            System.out.println("Is Not Palindrome");
        }

    }
}
