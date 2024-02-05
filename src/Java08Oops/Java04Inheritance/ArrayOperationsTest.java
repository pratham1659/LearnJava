package Java08Oops.Java04Inheritance;
import java.util.Arrays;

class ArrayOperations {
    // Static nested class
    static class Statistics {
        // Method to calculate the mean of an array
        public static double mean(int[] array) {
            if (array.length == 0) {
                return 0;
            }
            int sum = 0;
            for (int num : array) {
                sum += num;
            }
            return (double) sum / array.length;
        }

        // Method to calculate the median of an array
        public static double median(int[] array) {
            Arrays.sort(array);
            int length = array.length;
            if (length % 2 == 0) {
                // If the array length is even, take the average of the middle two elements
                return (array[length / 2 - 1] + array[length / 2]) / 2.0;
            } else {
                // If the array length is odd, take the middle element
                return array[length / 2];
            }
        }
    }

    // Other methods of ArrayOperations can be added here
}

// Example usage
public class ArrayOperationsTest {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 7, 4, 9, 1, 3, 6, 8};

        // Calculate mean
        double mean = ArrayOperations.Statistics.mean(numbers);
        System.out.println("Mean: " + mean);

        // Calculate median
        double median = ArrayOperations.Statistics.median(numbers);
        System.out.println("Median: " + median);
    }
}

