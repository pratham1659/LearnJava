package Java17Features;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class JavaLambda {

    public static void Sum(int a, int b) {

    }

    interface Sum {
        int add(int a, int b);
    }

    interface Square {
        int calc(int x);
    }

    static Sum sumWithReturn = (a, b) -> {
        int result = a + b;
        return result;
    };

    public static void main(String[] args) {

        // Basic syntax
        Runnable r = () -> System.out.println("Hello This is Lambda");
        r.run();

        // Lambda with Parameters
        Sum sum = (a, b) -> a + b;
        System.out.println(sum.add(10, 20)); // Output: 30

        Square sq = x -> x * x;
        System.out.println(sq.calc(5));

        // Lambda with Block and Return
        System.out.println(sumWithReturn.add(23, 23));

        // Using Lambda with forEach loop
        List<String> names = List.of("India", "USA", "Canada");
        names.forEach(name -> System.out.println(name));

        // Using Lambda in Collections.sort()
        List<String> cities = new ArrayList<>(List.of("Tokyo", "Bejing", "Indore", "Delhi", "London", "New York"));
        cities.sort((a, b) -> a.compareToIgnoreCase(b));
        System.out.println(cities);

        // Using Lambda with Stream API
        List<Integer> nums = List.of(12, 23, 34, 45, 56, 67, 78, 89);
        List<Integer> even = nums.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(even);

        // Lambda for Custom Comparator
        List<String> list = new ArrayList<>(List.of("Java", "Python", "Cpp"));
        list.sort((a, b) -> a.length() - b.length());
        System.out.println(list);

        // Lambda with Map Iteration
        Map<String, Integer> map = Map.of("A", 1, "B", 2, "C", 3);
        map.forEach((k, v) -> System.out.println(k + " : " + v));

        // Lambda for Filtering and Collecting
        List<String> countries = List.of("India", "Indonesia", "Canada", "Iraq");
        List<String> filtered = countries.stream().filter(c -> c.startsWith("I")).collect(Collectors.toList());

        System.out.println(filtered);
    }

}
