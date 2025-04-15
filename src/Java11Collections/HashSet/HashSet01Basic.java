package Java11Collections.HashSet;

import java.util.*;

public class HashSet01Basic {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        // Inserting
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        // Size
        System.out.println("Size of the Test: " + set.size());

        // Search
        if (set.contains(1)) {
            System.out.println("Set Contains");
        } else {
            System.out.println("Does Not Contains");
        }

        // Iterator
        @SuppressWarnings("rawtypes")
        Iterator it = set.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        // Remove
        set.remove(1);
        System.out.println(set);

        HashSet<String> hs = new HashSet<>();

        hs.add("James");
        hs.add("John");
        hs.add("James");
        hs.add("Ankita");

        System.out.println(hs);
        System.out.println(hs.contains("James"));
        System.out.println(hs.size());
        System.out.println(hs.remove("John"));

        System.out.println(hs);

        for (String s : hs) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
