
import java.util.*;

public class EmployeeData {
    public static void main(String[] args) {
        int[] ages = {25, 40, 30, 22, 50};
        ArrayList<Integer> list = new ArrayList<>();

        for (int age : ages) list.add(age);

        int min = Collections.min(list);
        int max = Collections.max(list);

        System.out.println("Youngest age: " + min);
        System.out.println("Oldest age: " + max);
    }
}
