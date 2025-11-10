
import java.util.*;

public class WrapperCollections {
    public static void main(String[] args) {
        double[] prices = {10.5, 20.0, 35.75, 5.5};
        ArrayList<Double> list = new ArrayList<>();

        for (double p : prices) {
            list.add(p);
        }

        double max = Collections.max(list);
        double avg = list.stream().mapToDouble(Double::doubleValue).average().orElse(0);

        System.out.println("Highest Price: " + max);
        System.out.println("Average Price: " + avg);
    }
}
