package Java17Features;

import java.util.*;
import java.util.stream.Collectors;

class Country {
    String name;
    String continent;

    // Constructor
    Country(String name, String continent) {
        this.name = name;
        this.continent = continent;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }
}

public class JavaList {
    public static void main(String[] args) {
        // Creating a list of countries
        List<Country> countries = Arrays.asList(
                new Country("India", "Asia"),
                new Country("Germany", "Europe"),
                new Country("China", "Asia"),
                new Country("Brazil", "South America"),
                new Country("Japan", "Asia"),
                new Country("France", "Europe"),
                new Country("Australia", "Australia"));

        // Filtering countries in Asia using Streams
        List<String> asianCountries = countries.stream()
                .filter(c -> "Asia".equalsIgnoreCase(c.getContinent()))
                .map(Country::getName)
                .collect(Collectors.toList());

        // Output result
        System.out.println("Countries in Asia: " + asianCountries);
    }
}
