package Java12HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMap04Problems {

    public static void main(String[] args) {

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
