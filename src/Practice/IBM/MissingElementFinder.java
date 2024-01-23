package Practice.IBM;
public class MissingElementFinder {

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, 3, 7, 8}; // Example array with a missing element
        int missingElement = findMissingElement(array);
        System.out.println("The missing element is: " + missingElement);
    }

    public static int findMissingElement(int[] array) {
        int n = array.length + 1; // Size of the array should be one more than the range
        int expectedSum = (n * (n + 1)) / 2; // Sum of first n natural numbers

        int actualSum = 0;
        for (int num : array) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}
