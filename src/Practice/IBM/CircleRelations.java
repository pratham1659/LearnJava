package Practice.IBM;

import java.util.ArrayList;
import java.util.List;

public class CircleRelations {
    public static List<String> circles(List<String> circlePairs) {
        List<String> result = new ArrayList<>();

        for (String pair : circlePairs) {
            String[] coordinates = pair.split(" ");
            int xA = Integer.parseInt(coordinates[0]);
            int yA = Integer.parseInt(coordinates[1]);
            int rA = Integer.parseInt(coordinates[2]);
            int xB = Integer.parseInt(coordinates[3]);
            int yB = Integer.parseInt(coordinates[4]);
            int rB = Integer.parseInt(coordinates[5]);

            int distanceSquared = (xB - xA) * (xB - xA) + (yB - yA) * (yB - yA);

            if (distanceSquared == (rA + rB) * (rA + rB)) {
                result.add("Touching");
            } else if (distanceSquared == (rA - rB) * (rA - rB)) {
                result.add("Touching");
            } else if (distanceSquared == (rB - rA) * (rB - rA)) {
                result.add("Touching");
            } else if (distanceSquared < (rA + rB) * (rA + rB) && distanceSquared > (rA - rB) * (rA - rB)) {
                result.add("Intersecting");
            } else if (distanceSquared == 0 && rA == rB) {
                result.add("Concentric");
            } else if (distanceSquared < (rA - rB) * (rA - rB)) {
                result.add("Disjoint-Inside");
            } else if (distanceSquared > (rA + rB) * (rA + rB)) {
                result.add("Disjoint-Outside");
            }
        }

        return result;
    }

    public static void main(String[] args) {
//        List<String> circlePairs = List.of("12 0 21 14 0 23");
        List<String> circlePairs = List.of("0 45 8 0 94 9");
//        List<String> circlePairs = List.of("35 0 13 10 0 38");
//        List<String> circlePairs = List.of("5 0 13 10 0 38 3");
//        List<String> circlePairs = List.of("0 26 8 0 9 25");

        List<String> result = circles(circlePairs);

        System.out.println(result);

//        for (String relationship : result) {
//            System.out.println(relationship);
//        }
    }
}
