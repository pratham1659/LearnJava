package Collections.ArrayList;

import java.util.*;
import java.util.stream.*;

public class Java1ArrayList {

    public static void reverseArraylist(ArrayList<Integer> itr) {

        System.out.println("reverseArraytClass: ");
        int i = 0, j = itr.size() - 1;

        while (i < j) {
            Integer temp = itr.get(i);
            itr.set(i, itr.get(j));
            itr.set(j, temp);
            i++;
            j--;
        }

        System.out.println(itr);

    }

    public static void setArrayList() {
        System.out.println("SetArrayListClass: ");
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }

        list.set(0, 2);
        list.set(2, 10);
        list.set(4, 24);

        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    public static void sortingArray() {
        System.out.println("SortingArrayClass: ");

        ArrayList<String> str = new ArrayList<>();

        str.add("Pratham");
        str.add("Papa");
        str.add("Isha");
        str.add("Mom");

        ArrayList<Integer> list = new ArrayList<>();
        list.add(21);
        list.add(11);
        list.add(51);
        list.add(1);

        Collections.sort(list);
        System.out.println("Sorted Array: " + list);

        Collections.reverse(list);
        System.out.println("Reverse Array: " + list);

        Collections.sort(list, Collections.reverseOrder());
        list.sort(Collections.reverseOrder());
        System.out.println("Descending Order :");
        System.out.println(list);

    }

    public static void basicArrayListOperation() {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);

        System.out.println("Original Array: " + arr);

        // get an element at index
        System.out.println("Array at Index 2: " + arr.get(2));

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

        // adding element at some index i
        arr.add(0, 100);
        System.out.println("Array at index 0:" + arr);

        // modifying element at index i
        arr.set(0, 110);
        System.out.println("Array at index 0:" + arr);

        // removing an element at index i
        arr.remove(0);
        System.out.println("List remove from index 0: " + arr);

        // removing an element X
        arr.remove(Integer.valueOf(9));
        System.out.println(arr);

        // if element not present in array
        System.out.println("Elemnets present: " + arr.remove(Integer.valueOf(8)));

        // checking if an element exists
        System.out.println("Elemnets contains: " + arr.contains(7));

    }

    public static void objectsInArray() {
        ArrayList<Object> any = new ArrayList<Object>();

        any.add(2);
        any.add("Three");

        System.out.println(any);

    }

    public static void duplicatesInArrayUsingLinkedHashSet(ArrayList<Integer> numbers) {

        // 1LinkedHasSet
        LinkedHashSet<Integer> hasSet = new LinkedHashSet<>(numbers);
        ArrayList<Integer> numListWithoutDuplicates = new ArrayList<Integer>(hasSet);
        System.out.println(numListWithoutDuplicates);

    }

    public static void removeDuplicateUsingStream(ArrayList<Integer> numbers) {

        // JDK 8 - Stream

        List<Integer> numListWithoutDuplicates = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(numListWithoutDuplicates);
    }

    public static boolean sortAndEqualElements(ArrayList<String> string1, ArrayList<String> string2) {

        // 1. sort and then equals:
        Collections.sort(string1);
        Collections.sort(string2);

        return string1.equals(string2);

    }

    public static void findOutAdditionalElement(ArrayList<String> string1, ArrayList<String> string2) {

        // 2. compare two list - find out the additional elements:
        string1.removeAll(string2);
        System.out.println(string1);
    }

    public static void findOutMissingElement(ArrayList<String> string1, ArrayList<String> string2) {

        // 3. find out the Missing elements
        string2.removeAll(string1);
        System.out.println(string2);
    }

    public static void findOutCommonElement(ArrayList<String> lang1, ArrayList<String> lang2) {

        lang1.retainAll(lang2);
        System.out.println(lang1);
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }

        /*
         * Iterating ArrayList using Iterator
         * while (iter.hasNext()) {
         * System.out.print(iter.next());
         * }
         */

        reverseArraylist(list);
        Collections.sort(list);

        System.out.println("Sorted Array : " + list);

        ArrayList<String> str = new ArrayList<>();

        str.add("Mango");
        str.add("Papaya");
        str.add("Mango");
        str.add("Apple");

        // Iterating ArrayList using For-each loop
        for (String fruit : str) {
            System.out.println(fruit);
        }

        // Get and Set ArrayList
        setArrayList();

        sortingArray();

        basicArrayListOperation();

        objectsInArray();

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 2, 3, 1, 4, 5, 6, 1, 7, 8, 9, 7));

        duplicatesInArrayUsingLinkedHashSet(numbers);
        removeDuplicateUsingStream(numbers);

        // Compare Two ArrayList
        ArrayList<String> string1 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "F"));
        ArrayList<String> string2 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));

        sortAndEqualElements(string1, string2);

        findOutAdditionalElement(string1, string2);

        findOutMissingElement(string1, string2);

        ArrayList<String> lang1 = new ArrayList<>(Arrays.asList("JAVA", "Python", "Ruby", "C#", "JS"));

        ArrayList<String> lang2 = new ArrayList<>(Arrays.asList("JAVA", "Python", "Ruby", "C#", "PHP"));

        findOutCommonElement(lang1, lang2);

    }

}
