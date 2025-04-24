package Java12HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMap01Basic {
    public static void main(String[] args) {

        /*
         * No order - no indexing
         * stores value - key value <Key, Value>
         * key cannot be duplicate
         * can store null Values but only one null key
         *
         * Searching
         * Insertion
         * Deletion
         * Contains
         *
         * Time Complexity O(1);
         */

        // 1. Creating a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // 2. put(key, value): Add elements
        map.put("Apple", 50);
        map.put("Banana", 30);
        map.put("Mango", 70);
        System.out.println("Initial Map: " + map);

        // 3. get(key): Get value by key
        System.out.println("Price of Mango: " + map.get("Mango"));

        // 4. containsKey(key)
        System.out.println("Has Apple? " + map.containsKey("Apple"));

        // 5. containsValue(value)
        System.out.println("Has price 30? " + map.containsValue(30));

        // 6. remove(key)
        map.remove("Banana");
        System.out.println("After removing Banana: " + map);

        // 7. size()
        System.out.println("Map Size: " + map.size());

        // 8. isEmpty()
        System.out.println("Is map empty? " + map.isEmpty());

        // 9. replace(key, newValue)
        map.replace("Mango", 80);
        System.out.println("After replacing Mango price: " + map);

        // 10. putIfAbsent(key, value)
        map.putIfAbsent("Orange", 60);
        System.out.println("After putIfAbsent: " + map);

        // 11. getOrDefault(key, defaultValue)
        System.out.println("Price of Grapes: " + map.getOrDefault("Orange", 0));

        // 12. keySet()
        System.out.println("Keys: " + map.keySet());

        // 13. values()
        System.out.println("Values: " + map.values());

        // 14. entrySet() - to loop through map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 15. clear()
        map.clear();
        System.out.println("After clear: " + map);

        // Use Cases and Benefits getOrDefault()
        // 1. 🔒 Avoid null values
        // Instead of checking with containsKey() and then calling get(), you can do it
        // all in one line.
        int value = map.getOrDefault("someKey", 0); // if key doesn't exist, return 0 instead of null

        System.out.println(value);

        // 2. 🧮 Frequency counting
        // When you're counting the number of times something occurs (like characters or
        // words), getOrDefault() is perfect.
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char c : "banana".toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        System.out.println(freq); // {a=3, b=1, n=2}

        // 3. 🧾 Default values for missing data
        // Say you're checking marks for a student who might not be in the list.
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Alice", 90);

        int bobMarks = marks.getOrDefault("Bob", -1); // returns -1 if Bob not found
        System.out.println("Bob's Marks: " + bobMarks);

        // 4. 🧼 Cleaner code Instead of this:

        int vaue;
        if (map.containsKey("key")) {
            vaue = map.get("key");
            System.out.println(vaue);
        } else {
            value = 0;
        }

        // You can just write:
        int vars = map.getOrDefault("key", 0);
        System.out.println(vars);

    }

}
