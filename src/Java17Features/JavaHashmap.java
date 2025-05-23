package Java17Features;

import java.util.*;
import java.util.stream.Collectors;

public class JavaHashmap {

    public static void main(String[] args) {

        // Sample data: country -> continent
        Map<String, String> countryContinentMap = new HashMap<>();
        countryContinentMap.put("India", "Asia");
        countryContinentMap.put("China", "Asia");
        countryContinentMap.put("Germany", "Europe");
        countryContinentMap.put("Japan", "Asia");
        countryContinentMap.put("Brazil", "South America");
        countryContinentMap.put("Australia", "Australia");

        // Filter countries from Asia
        List<String> asianCountries = countryContinentMap.entrySet().stream()
                .filter(entry -> "Asia".equalsIgnoreCase(entry.getValue()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        // Output result
        System.out.println("Countries in Asia: " + asianCountries);
    }
}
