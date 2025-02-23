package Java04Maths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MathsPractice {

    //Swap two number without using Temp Variable
    public static void withoutTempSwap() {
        int a = 5;
        int b = 4;
        System.out.println("a: " + a + " b: " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a: " + a + " b: " + b);
    }

    //find prime number between 1 and 100
    public static void findPrime() {
        for (int i = 2; i < 100; i++) {
            boolean flag = true;
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
            }
        }
    }

    //check Palindrome
    public static void checkPalindrome() {
        int n = 12321, r, s = 0;
        int t = n;
        while (n > 0) {
            r = n % 10;
            s = (s * 10) + r;
            n = n / 10;
        }
        if (t == s) {
            System.out.println("palindrome number");
        } else {
            System.out.println("not a palindrome number");
        }
    }

    public static int[] moveAllNegativeNumbersInEnd(int[] arr, int n) {
        int[] tempAll = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                tempAll[j] = arr[i];
                j++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                tempAll[j] = arr[i];
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = tempAll[i];
        }

        return tempAll;
    }

    public static void swapNegative() {
        int[] arr = {3, -3, 45, 2, -19, -7, 56, 45};
        List<Integer> allNumber = new ArrayList<>();
        List<Integer> negativeNumber = new ArrayList<>();
        for (Integer data : arr) {
            if (data >= 0) {
                allNumber.add(data);
            } else {
                negativeNumber.add(data);
            }
        }
        allNumber.addAll(negativeNumber);
        System.out.println(allNumber);
    }

    //fibonacci series
    public static void fibonacci() {
        int a = 0, b = 1, count = 10;
        int k = 0;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < count; i++) {
            k = a + b;
            System.out.print(k + " ");
            a = b;
            b = k;
        }
    }

    public static void factorial(){
        int i, fact = 1;
        int number = 5;
        for(i = 1; i<=number; i++){
            fact = fact*i;
        }
        System.out.println("Factorial: "+fact);
    }

    public static void checkPrime(){
        int num = 27;
        boolean isPrime = true;
        for(int i = 2; i<num; i++){
            if(num%i == 0){
                isPrime = false;
                break;
            }

        }
        if(isPrime){
            System.out.println("The number is prime");
        }
        else{
            System.out.println("The number is not prime");
        }
    }

    public static void armstrong(){
        int n = 153;
        int temp = n;
        int r, sum = 0;
        while (n>0){
            r = n%10;
            n = n/10;
            sum = sum + (r*r*r);
        }
        if(temp == sum){
            System.out.println("it is an armstrong number");
        }
        else{
            System.out.println("it is not an armstrong number");
        }
    }

    public static void isAnagram(int n1, int n2){
        String ns1 = Integer.toString(n1);
        String ns2 = Integer.toString(n2);
        boolean status = true;
        if(ns1.length()!=ns2.length()){
            status = false;
        }
        else{
            char[] ns1Array = ns1.toCharArray();
            char[] ns2Array = ns2.toCharArray();
            Arrays.sort(ns1Array);
            Arrays.sort(ns2Array);
            status = Arrays.equals(ns1Array, ns2Array);
        }
        if(status){
            System.out.println("n1 and n2 are anagram");
        }
        else{
            System.out.println("n1 and n2 are not anagram");
        }
    }

    public static void main(String[] args) {

        int[] arr = {3, -3, 45, 2, -19, -7, 56, 45};
        int n = arr.length;
        int[] result = moveAllNegativeNumbersInEnd(arr, n);
        for (int i : result) {
            System.out.println(i + " ");
        }
    }
}
