import java.util.ArrayList;
import java.util.Iterator;

public class IteratorNames {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Blueberry");


        Iterator<String> iterator = fruits.iterator();


        System.out.println("Before: " + fruits);
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            if (fruit.startsWith("B")) {
                iterator.remove();
            }
        }
        System.out.println("After removing B fruits: " + fruits);
    }
}
