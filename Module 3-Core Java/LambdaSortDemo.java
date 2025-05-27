import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaSortDemo {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grape");

        System.out.println("Before sorting: " + fruits);

        Collections.sort(fruits, (s1, s2) -> s1.compareToIgnoreCase(s2));

        System.out.println("After sorting: " + fruits);
    }
}