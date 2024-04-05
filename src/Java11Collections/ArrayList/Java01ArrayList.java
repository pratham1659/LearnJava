package Java11Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Java01ArrayList {
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

    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }

        // Iterating ArrayList using Iterator
        // Iterator iter = list.iterator();
        // while (iter.hasNext()) {
        // System.out.print(iter.next());
        // }

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

    }

}
