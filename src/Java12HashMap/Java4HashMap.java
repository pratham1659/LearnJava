package Java12HashMap;

import java.util.HashMap;
import java.util.Map;

public class Java4HashMap {

    /*
     * How HashMap works Internally
     */

    public static void hashCode(Map<String, Integer> marks) {

    }

    public static void main(String[] args) {

        Map<String, Integer> marks = new HashMap<String, Integer>();

        marks.put("Naveen", 100);
        marks.put("Pratham", 200);
        marks.put("Kunal", 300);
        marks.put("Peter", 500);
        marks.put(null, 500);

        System.out.println(marks.get("Naveen"));

    }

}
