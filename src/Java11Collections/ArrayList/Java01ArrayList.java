package Java11Collections.ArrayList;

import java.util.*;
import java.util.stream.Collectors;

public class Java01ArrayList {

    // Basic Find Even Using ArrayList
    public static void evenArrayList() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }

        // Iterating ArrayList using Iterator
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        System.out.println();
    }

    // Basic String Input and Iteration in ArrayList
    public static void inputStringArrayList() {

        ArrayList<String> str = new ArrayList<>();
        str.add("Mango");
        str.add("Papaya");
        str.add("Apple");
        str.add("Banana");

        // Iterating Using Iterator
        Iterator<String> iter = str.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        System.out.println();
    }

    // Ques 1: Reverse ArrayList
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static void reverseArraylist(ArrayList<Integer> itr) {
        System.out.print("Reverse ArrayList: ");
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

    // Ques 2: Set in ArrayList
    public static void setArrayList() {
        System.out.print("Set and get in ArrayListClass: ");
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
        System.out.println("Sorting ArrayList: ");

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

        Collections.sort(str);
        System.out.println("Sorted String: " + str);

        Collections.reverse(list);
        System.out.println("Reverse Array: " + list);

        list.sort(Collections.reverseOrder());
        list.sort(Collections.reverseOrder());
        System.out.print("Descending Order: ");
        System.out.println(list);

    }

    public static void basicArrayListOperation() {

        System.out.println("Basic Array operation -> ");
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);

        System.out.println("Original ArrayList: " + arr);

        // get an element at index
        System.out.println("Array at Index 2: " + arr.get(2));

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

        // adding element at some index i
        arr.add(0, 100);
        System.out.println("List at index 0:" + arr);

        // modifying element at index i
        arr.set(0, 110);
        System.out.println("List at index 0:" + arr);

        // removing an element at index i
        arr.remove(0);
        System.out.println("List remove from index 0: " + arr);

        // removing an element X
        arr.remove(Integer.valueOf(9));
        System.out.println("Removed elements using value: " + arr);

        // if an element doesn't present in the array
        System.out.println("Elements present: " + arr.remove(Integer.valueOf(8)));

        // checking if an element exists
        System.out.println("Elements contains: " + arr.contains(7));

    }

    public static void objectsInArray() {
        ArrayList<Object> any = new ArrayList<Object>();

        any.add(2);
        any.add("Three");

        System.out.println(any);

    }

    public static void duplicatesInArrayUsingLinkedHashSet(ArrayList<Integer> numbers) {

        // 1 LinkedHasSet
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
        System.out.println("Additional Element: " + string1);
    }

    public static void findOutMissingElement(ArrayList<String> string1, ArrayList<String> string2) {

        // 3. find out the Missing elements
        string2.removeAll(string1);
        System.out.println("Missing Element: " + string2);
    }

    public static void findOutCommonElement(ArrayList<String> lang1, ArrayList<String> lang2) {

        lang1.retainAll(lang2);
        System.out.println("Common Element: " + lang1);
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(9);
        list.add(7);
        list.add(5);

        evenArrayList();
        inputStringArrayList();

        reverseArraylist(list);
        Collections.sort(list);
        System.out.println("Sorted Array : " + list);

        setArrayList();

        sortingArray();

        basicArrayListOperation();

        objectsInArray();

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 2, 3, 1, 4, 5, 6, 1, 7, 8, 9, 7));

        System.out.print("Remove Duplicate LinkedHash: ");
        duplicatesInArrayUsingLinkedHashSet(numbers);
        System.out.print("Remove Duplicate Stream: ");
        removeDuplicateUsingStream(numbers);

        // Compare Two ArrayList
        ArrayList<String> string1 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "F"));
        ArrayList<String> string2 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));

        System.out.println("Equal Elements or not: " + sortAndEqualElements(string1, string2));

        findOutAdditionalElement(string1, string2);

        findOutMissingElement(string1, string2);

        ArrayList<String> lang1 = new ArrayList<>(Arrays.asList("JAVA", "Python", "Ruby", "C#", "JS"));

        ArrayList<String> lang2 = new ArrayList<>(Arrays.asList("JAVA", "Python", "Ruby", "C#", "PHP"));

        findOutCommonElement(lang1, lang2);

    }

}
