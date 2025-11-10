
import java.util.*;

public class AutoBoxingUnboxing {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i); // Autoboxing
        }

        int sum = 0;
        for (int num : list) { // Auto-unboxing
            sum += num;
        }
        System.out.println("Sum of numbers = " + sum);
    }
}
