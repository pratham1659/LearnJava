package Java12HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

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

        HashMap<String, String> capitalMap = new HashMap<String, String>();

        capitalMap.put("India", "New Delhi");
        capitalMap.put("India", "Patna");
        capitalMap.put("Pakistan", "Lahor");
        capitalMap.put("USA", "New York");
        capitalMap.put(null, "Berlin");
        capitalMap.put(null, "Los Angeles");
        capitalMap.put("France", null);
        capitalMap.remove("France");

        System.out.println(capitalMap.get("USA"));
        System.out.println(capitalMap.get(null));
        System.out.println(capitalMap.get("France"));

        // iterator: over the keys: by using keySet()

        for (String key : capitalMap.keySet()) {
            String value = capitalMap.get(key);
            System.out.println("Key: " + key + " Value: " + value);
        }

        // iterator: over the set(pair): by using
        Iterator<Entry<String, String>> it2 = capitalMap.entrySet().iterator();

        System.out.println("------------------------");
        while (it2.hasNext()) {
            Entry<String, String> entry = it2.next();
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());

        }

        System.out.println("------------------------");
        // literate HashMap using java 8 for each and lambda:
        capitalMap.forEach((k, v) -> System.out.println("key =" + k + "and value = " + v));

    }

}
