package Practice.IBM;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class StringCompressor {

    public static String compressString(String input) {
        // Create a map to store character frequencies
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Iterate through the input string to calculate frequencies
        for (int i = 0; i < input.length(); i += 2) {
            char character = input.charAt(i);
            int frequency = Integer.parseInt(String.valueOf(input.charAt(i + 1)));

            // Update frequency in the map
            frequencyMap.put(character, frequencyMap.getOrDefault(character, 0) + frequency);
        }

        // Create a TreeMap to sort characters in alphabetical order
        Map<Character, Integer> sortedMap = new TreeMap<>(frequencyMap);

        // Build the compressed string
        StringBuilder compressedString = new StringBuilder();

        // Append characters and their frequencies to the compressed string
        for (Map.Entry<Character, Integer> entry : sortedMap.entrySet()) {
            compressedString.append(entry.getKey()).append(entry.getValue());
        }

        return compressedString.toString();
    }

    public static void main(String[] args) {
        // Example usage
        String uncompressedString = "a2b1c3a1";
        String compressedString = compressString(uncompressedString);
        System.out.println("Compressed String: " + compressedString);
    }
}
