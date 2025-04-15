package Java11Collections.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashMap02Methods {

    public static void main(String[] args) {

        HashMap<Integer, String> map1 = new HashMap<Integer, String>();

        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");

        HashMap<Integer, String> map2 = new HashMap<Integer, String>();

        map2.put(3, "C");
        map2.put(1, "A");
        map2.put(2, "B");

        HashMap<Integer, String> map3 = new HashMap<Integer, String>();

        map3.put(3, "A");
        map3.put(1, "A");
        map3.put(2, "B");

        // 1. on the basis of key-value: use equals method:
        System.out.println(map1.equals(map2)); // True
        System.out.println(map1.equals(map3)); // False

        // 2. compare hashmaps for the same keys: keySet():
        System.out.println(map1.keySet().equals(map2.keySet())); // True
        System.out.println(map1.keySet().equals(map3.keySet())); // False

        // 3. find out the extra keys:
        HashMap<Integer, String> map4 = new HashMap<Integer, String>();

        map4.put(1, "A");
        map4.put(2, "B");
        map4.put(3, "C");
        map4.put(4, "D");

        // combine the keys from both the maps: using HashSet:

        HashSet<Integer> combineKeys = new HashSet<Integer>(map1.keySet());
        combineKeys.addAll(map4.keySet());
        combineKeys.removeAll(map1.keySet());
        System.out.println(combineKeys);

        // HashSet<String> combineValue = new HashSet<>(map1.)
        // 4. compare maps by values:
        HashMap<Integer, String> map5 = new HashMap<Integer, String>();
        map5.put(1, "A");
        map5.put(2, "B");
        map5.put(3, "C");

        HashMap<Integer, String> map6 = new HashMap<Integer, String>();
        map6.put(4, "A");
        map6.put(5, "B");
        map6.put(7, "C");

        HashMap<Integer, String> map7 = new HashMap<Integer, String>();
        map7.put(1, "A");
        map7.put(2, "B");
        map7.put(3, "C");
        map7.put(4, "C");

        // 1. duplicates are not allowed using ArrayList
        System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values()))); //
        System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map7.values())));

        // 2. duplicates are allowed using HashSet
        System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values())));
        System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map7.values())));

        HashMap<String, Integer> map = new HashMap<>();

        // HashMap  to store the following pairs(Person, Age)
        map.put("Akash", 21);
        map.put("Pratham", 23);
        map.put("Rohan", 12);
        map.put("Sonali", 23);

        //Get Values of HashMap
        System.out.println(map.get("Akash"));
        System.out.println(map.get("Rohan"));
        System.out.println(map.get("Roshan")); //doestn`t exist

        //Change the value of Data
        map.put("Akash", 25);
        System.out.println(map.get("Akash")); //data updated

        // Removing a pair from the HashMap
        System.out.println(map.remove("Akash"));
        System.out.println(map.remove("Roshan"));

        //Checking is Key is in the HashMap
        System.out.println(map.containsKey("Akash"));
        System.out.println(map.containsValue(23));

        // Adding a new entry only if the new key doesn't exist already
        map.putIfAbsent("Yash", 30);
        map.putIfAbsent("Akash", 32);

        //Get All the Keys in HashMap
        System.out.println(map.keySet());

        //Get All the Values in HashMap
        System.out.println(map.values());

        //Get All Entry in HashMap
        System.out.println(map.entrySet());

        //Traversing all entries of HashMap - multiple methods
        for(String key : map.keySet()){
            System.out.printf("Age of %s is %d\n", key, map.get(key));
        }

        System.out.println();
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }

        System.out.println();
        for(var e : map.entrySet()){
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }


    }

}
