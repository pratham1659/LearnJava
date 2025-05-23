package Java17Features;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class JavaStreams {

    public static void checkEven(int[] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];

            }
        }
        // System.out.println(sum);
    }

    public static void checkStream(int[] arr) {

        int sum = Arrays.stream(arr).filter(n -> n % 2 == 0).sum();

        // System.out.println(sum);
    }

    public static void listStream(List<Integer> list) {

        // Stream<String> myStream = list.stream();

        List<Integer> evenList = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

        List<Integer> newList = evenList.stream().map(x -> x / 2).collect(Collectors.toList());

        System.out.println(newList);

    }

    public static void main(String[] args) {

        int[] arr = { 1, 4, 5, 6, 7, 8, 9, 13, 18 };

        checkEven(arr);
        checkStream(arr);

        // List<String> list = Arrays.asList("Apple", "Banana", "Orange");
        // System.out.println(list);

        // List<Integer> intList = Arrays.asList(5, 6, 7, 78, 6, 34, 562, 23, 68, 89);
        // listStream(intList);

        // Stream<Integer> intStream = Stream.of(2, 3, 4, 5, 6, 7);
        // System.out.println(intStream);

        // Stream.iterate(0, n -> n + 1).limit(100);

        // Stream<Integer> limit1 = Stream.generate(() -> (int) Math.random() *
        // 100).limit(5);
        // System.out.println(limit1);

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Amanda");

        // Filter names starting with "A"
        List<String> aName = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
        System.out.println(aName);

        // Convert all names to uppercase
        List<String> upperName = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperName);

        // Counting Elements which length is greater than 4.
        long count = names.stream().filter(name -> name.length() > 4).count();
        System.out.println(count);

        // Sorting in Streams in alphabetical order
        List<String> sorted = names.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted);

        // distinct() – Remove duplicates
        List<Integer> listWithDuplicates = Arrays.asList(1, 1, 1, 2, 3, 3, 4, 2, 22, 4, 4, 5, 4, 3, 3, 3);
        List<Integer> distinct = listWithDuplicates.stream().distinct().collect(Collectors.toList());
        System.out.println(distinct);

        // limit() and skip()
        List<Integer> data = Arrays.asList(1, 2, 3, 4, 3, 4, 3, 5, 56, 7);
        List<Integer> limitData = data.stream().limit(3).collect(Collectors.toList());
        System.out.println(limitData);

        List<Integer> skipData = data.stream().skip(3).collect(Collectors.toList());
        System.out.println(skipData);

        // count(), min(), max()
        long countData = data.stream().count();
        System.out.println("CountData: " + countData);

        int min = data.stream().min(Integer::compare).orElse(-1);
        int max = data.stream().max(Integer::compare).orElse(-1);

        System.out.println("Max: " + max + " " + "Min: " + min);

        // reduce() – Accumulate values
        int sum = data.stream().reduce(0, Integer::sum);
        System.out.println(sum);

        // Using Streams with Custom Objects
        List<Employee> employess = Arrays.asList(
                new Employee("Alice", 5000),
                new Employee("Chris", 6000),
                new Employee("Rahul", 7000),
                new Employee("Piyush", 3000));

        List<String> richEmployee = employess.stream()
                .filter(e -> e.salary > 5000)
                .map(e -> e.name)
                .collect(Collectors.toList());

        System.out.println(richEmployee);

        // Sum and Average
        int totalSalary = employess.stream().mapToInt(e -> e.salary).sum();

        double averageSalary = employess.stream().mapToDouble(e -> e.salary).average().orElse(0.00);

        System.out.println("Total: " + totalSalary + ", Avg: " + averageSalary);

    }

}
