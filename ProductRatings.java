
import java.util.*;
import java.util.stream.*;

public class ProductRatings {
    public static void main(String[] args) {
        int[] primitives = {4, 5, 3};
        ArrayList<Integer> ratings = new ArrayList<>(Arrays.asList(5, null, 4));

        for (int r : primitives) ratings.add(r);

        double avg = ratings.stream()
                            .filter(Objects::nonNull)
                            .mapToInt(Integer::intValue)
                            .average()
                            .orElse(0);
        System.out.println("Average Rating: " + avg);
    }
}
