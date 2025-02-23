package Java11Collections.ArrayList;

import java.util.*;

public class Java03ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<Integer> ints = new ArrayList<>(Arrays.asList(23, 43, 34, 35, 56));

        System.out.println(ints);

        ArrayList<String> str = new ArrayList<>(Arrays.asList("Hello", "World", "Robot"));

        System.out.println(str);

        ArrayList<String> arr1 = new ArrayList<>();

        arr1.add("Java");
        arr1.add("Pythons");
        arr1.add("JavaScript");
        arr1.add("C++");

        System.out.println(arr1);

        ArrayList<String> arr2 = new ArrayList<>();

        arr2.add("testing");
        arr2.add("Selenium");
        arr2.add("Ruby");

        arr1.addAll(arr2);

        System.out.println(arr1);

        arr2.clear();

        System.out.println(arr1 + " " + arr2);

        // To check Element is available or not
        System.out.println(arr1.contains("Java"));

        System.out.println(arr1.indexOf("Pythons") > 0);

         System.out.println(arr1.lastIndexOf(arr2));

         ArrayList<String> cloneList = (ArrayList<String>) arr1.clone();

         System.out.println(cloneList);

    }
}
