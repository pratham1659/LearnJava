package Collections.ArrayList;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Java3ArrayList3 {
    public static void main(String[] args) {

        /*
         * Synchronize ArrayList in Java
         * What is the Thread Safe variant of ArrayList
         * answer : copyOnArrayList - class
         * answer : Collections.synchronizedList() - method
         */

        List<String> namesList = Collections.synchronizedList(new ArrayList<String>());

        namesList.add("Java");
        namesList.add("Python");
        namesList.add("Ruby");

        // add, remove - we dont need explicit synchronization
        // to fetch/traverse the values from this list —- we have to use explicit
        // synchronization

        synchronized (namesList) {
            Iterator<String> it = namesList.iterator();

            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }

        // 2. copyOnWriteArrayList —- its a class Thread Safe-synchronized already.
        CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<>();

        empList.add("Tomcat");
        empList.add("Steave");
        empList.add("Naveena");

        // I/we dont need explicit synchronization for any operation:
        // add/remove/traverse

        Iterator<String> iter = empList.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

    }
}