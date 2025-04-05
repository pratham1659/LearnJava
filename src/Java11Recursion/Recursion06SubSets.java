package Java11Recursion;

import java.util.ArrayList;

public class Recursion06SubSets {

    // 1: Given a string, WAM to return all its subsequences in an arraylist. A
    // String is a
    // subsequence of a given String that is generated by deleting some character of
    // a given
    // string without changing its order.

    public static ArrayList<String> subSequence(String str) {

        ArrayList<String> ans = new ArrayList<>();
        // baseCase
        if (str.isEmpty()) {
            ans.add("");
            return ans;
        }

        // subCase
        char curr = str.charAt(0); // a

        ArrayList<String> smallAns = subSequence(str.substring(1));

        // smallAns = ["bc", "b", "c", ""];
        // ans = ["bc", "abc", "b", "ab", "c", "ac", "", "c"]
        for (String s : smallAns) {
            ans.add(s); // bc
            ans.add(curr + s); // abc
        }
        return ans;
    }

    // 2: Given a string, write a method to print all its subsequences.
    public static void printSubsequence(String str, String currAns) {

        if (str.length() == 0) {
            System.out.println(currAns);
            return;
        }
        char curr = str.charAt(0);

        String remString = str.substring(1);

        // Curr char → chooses to be a part of currAns
        printSubsequence(remString, currAns + curr); // add curr

        // curr char → does not choose to be a part of currAns
        printSubsequence(remString, currAns); // do not add curr

    }

    // Given an array of integers, print sums of all subsets in it. Output sums can
    // be printed in
    // any order.
    public static void printNumberSubs(int[] arr, int n, int idx, int sum) {

        if (idx >= n) {
            System.out.println(sum);
            return;
        }
        // curr Idx + sum
        printNumberSubs(arr, n, idx + 1, sum + arr[idx]); // include

        // curr ans
        printNumberSubs(arr, n, idx + 1, sum); // exclude

    }

    public static void main(String[] args) {

        // ArrayList<String> arrLst = subSequence("abc");
        //
        // for (String ss : arrLst) {
        // System.out.println(ss);
        // }

        System.out.println("Print Subsequence");
        printSubsequence("abc", "");

        int[] arr = { 2, 4, 5 };
        printNumberSubs(arr, arr.length, 0, 0);
    }
}
